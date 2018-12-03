package com.example.jack.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by jack on 2018/12/3.
 */

public class MyBroadcastReceiver extends BroadcastReceiver{
    private String ACTION_BOOT = "com.example.jack.broadcastreceiver.MY_BROADCAST";
    @Override
    public void onReceive(Context context, Intent intent){
        if(ACTION_BOOT == intent.getAction())
            Toast.makeText(context,"收到告白啦！",Toast.LENGTH_SHORT).show();
    }
}
