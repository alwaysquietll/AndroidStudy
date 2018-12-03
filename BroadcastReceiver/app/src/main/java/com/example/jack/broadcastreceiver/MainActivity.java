package com.example.jack.broadcastreceiver;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private mBroadcastReceiver mBroadcastReceiver1 = new mBroadcastReceiver();
    private BootCompleteReceiver bootCompleteReceiver = new BootCompleteReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(mBroadcastReceiver1,intentFilter);
    }
    //别忘了将广播取消
    @Override
    protected void onDestroy() {
        super.onDestroy();
        //try{
            unregisterReceiver(mBroadcastReceiver1);
        /*}catch (IllegalArgumentException e){
            if (e.getMessage().contains("Receiver not registered")){
                //Ignore this exception.This is exactly what is desired
            }else{
                //unexpected,re-throw
                throw e;
            }
        }*/

    }
}
