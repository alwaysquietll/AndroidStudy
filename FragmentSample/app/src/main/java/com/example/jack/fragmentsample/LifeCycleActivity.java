package com.example.jack.fragmentsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by jack on 2018/11/22.
 */

public class LifeCycleActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_lifecycle);
    }
}
