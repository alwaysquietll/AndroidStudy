package com.example.jack.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by jack on 2018/11/27.
 */

public class mBroadcastReceiver extends BroadcastReceiver{
    //接收到广播后自动调用该方法
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"音量发生改变！",Toast.LENGTH_SHORT).show();
    }
}
