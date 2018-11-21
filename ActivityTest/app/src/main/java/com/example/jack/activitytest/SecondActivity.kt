package com.example.jack.activitytest

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

/**
 * Created by jack on 2018/11/20.
 */
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        //初始化button
        //val mButton = findViewById<Button>(R.id.btn);
        //设置点击事件监听
        /*mButton.setOnClickListener(View.OnClickListener {
            //响应点击事件,启动MainActivity
            val intent = Intent(this@SecondActivity, MainActivity::class.java)
            startActivity(intent)
        })*/
    }
}