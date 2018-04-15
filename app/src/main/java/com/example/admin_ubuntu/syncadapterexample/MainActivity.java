package com.example.admin_ubuntu.syncadapterexample;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    public static final String AUTORIDADE = "com.example.admin_ubuntu.syncadapterexample";
    public static final String TIPO_DE_CONTA = "com.example.admin";
    public static final String CONTA = "admin";
    private Account minhaConta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minhaConta = CreateSyncAccount(this);

    }

    private static Account CreateSyncAccount(Context context){
        Account conta = new Account(CONTA,TIPO_DE_CONTA);
        AccountManager accountManager = (AccountManager) context.getSystemService(ACCOUNT_SERVICE);

        if(accountManager.addAccountExplicitly(conta,null,null)){

        }else{

        }

    }
}
