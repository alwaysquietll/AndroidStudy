package com.example.jack.broadcastreceiver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by jack on 2018/12/3.
 */

public class SecondActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button btn_send = findViewById(R.id.btn_send);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("com.example.jack.broadcastreceiver.MY_BROADCAST");
                intent.putExtra("test","发送广播");
                sendBroadcast(intent);
            }
        });
    }
}
