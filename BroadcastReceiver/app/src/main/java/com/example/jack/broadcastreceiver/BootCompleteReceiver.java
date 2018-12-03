package com.example.jack.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by jack on 2018/12/3.
 */

public class BootCompleteReceiver extends BroadcastReceiver{
    private String ACTION_BOOT = "android.intent.action.BOOT_COMPLETED";
    @Override
    public void onReceive(Context context, Intent intent){
        if(ACTION_BOOT == intent.getAction()){
            Toast.makeText(context,"开机完毕~",Toast.LENGTH_LONG).show();
        }
    }
}
