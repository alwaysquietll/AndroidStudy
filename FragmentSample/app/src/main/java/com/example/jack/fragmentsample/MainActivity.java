package com.example.jack.fragmentsample;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by jack on 2018/11/21.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. 获取到FragmentManager对象
        FragmentManager fragmentManager = getFragmentManager();
        // 2. 开启一个事务
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // 3. 向容器内加入Fragment
        FirstFragment  firstFragment = new FirstFragment ();
        fragmentTransaction.add(R.id.fragment_container, firstFragment);
        // 4. 提交事务
        fragmentTransaction.commit();
    }
}