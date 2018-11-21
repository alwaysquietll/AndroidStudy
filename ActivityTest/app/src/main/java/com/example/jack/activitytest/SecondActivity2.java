package com.example.jack.activitytest;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by jack on 2018/11/20.
 */

public class SecondActivity2 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("tag","onCreate");
        //初始化button
        Button mButton = findViewById(R.id.btn);
        //设置点击事件监听
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //响应点击事件，启动MainActivity
                Intent intent = new Intent(SecondActivity2.this,MainActivity.class);
                //隐氏intent
                //Intent intent = new Intent();
                //intent.setAction("com.example.filter");
                intent.putExtra("data","data from second activity");
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG", "onStart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "onDestroy: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG", "onPause: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG", "onRestart: ");
    }
}
