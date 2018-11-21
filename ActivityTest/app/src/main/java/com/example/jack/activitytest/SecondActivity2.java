package com.example.jack.activitytest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
}
