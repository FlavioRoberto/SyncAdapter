package com.example.admin_ubuntu.syncadapterexample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class ServicoDeSincronizacao extends Service {

    private static SyncAdapter syncAdapter = null;
    private static final Object syncAdapterLock = new Object();

    @Override
    public void onCreate() {
        super.onCreate();
        synchronized (syncAdapterLock){
           if(syncAdapter == null)
               syncAdapter = new SyncAdapter(getApplicationContext(),true);
        }

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return syncAdapter.getSyncAdapterBinder();
    }


}
