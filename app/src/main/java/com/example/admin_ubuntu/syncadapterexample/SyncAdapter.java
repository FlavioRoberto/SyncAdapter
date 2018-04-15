package com.example.admin_ubuntu.syncadapterexample;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;

public class SyncAdapter extends AbstractThreadedSyncAdapter {

    private ContentResolver contentResolver;

    public SyncAdapter(Context context, boolean autoInicializavel){
        super(context,autoInicializavel);
        contentResolver = context.getContentResolver();
    }

    public SyncAdapter(Context context, boolean autoInicializavel,
                       boolean permiteSincronismoParalelo){
        super(context,autoInicializavel,permiteSincronismoParalelo);
        contentResolver = context.getContentResolver();

    }

    @Override
    public void onPerformSync(Account account, Bundle extras, String authority, ContentProviderClient provider, SyncResult syncResult) {

    }
}
