package com.example.jack.fragmentsample;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by jack on 2018/11/21.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    /*@Override
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
    }*/
    private Button mAddBtn = null;
    private Button mRemoveBtn = null;
    private Button mReplaceBtn = null;
    private Button mHideBtn = null;
    private Button mShowBtn = null;
    private Button mDetachBtn = null;
    private Button mAttachBtn = null;
    private Fragment mSecondFragment = null;
    private Fragment mThirdFragment = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAddBtn = (Button) findViewById(R.id.add_btn);
        mRemoveBtn = (Button) findViewById(R.id.remove_btn);
        mReplaceBtn = (Button) findViewById(R.id.replace_btn);
        mHideBtn = (Button) findViewById(R.id.hide_btn);
        mShowBtn = (Button) findViewById(R.id.show_btn);
        mAttachBtn = (Button) findViewById(R.id.attach_btn);
        mDetachBtn = (Button) findViewById(R.id.detach_btn);

        //获取FragmentManager对象
        FragmentManager fragmentManager = getFragmentManager();

        //创建和获取Fragment实例
        mSecondFragment = new SecondFragment();
        mThirdFragment = new ThirdFragment();

        //设置监听事件
        mAddBtn.setOnClickListener(this);
        mRemoveBtn.setOnClickListener(this);
        mReplaceBtn.setOnClickListener(this);
        mHideBtn.setOnClickListener(this);
        mShowBtn.setOnClickListener(this);
        mAttachBtn.setOnClickListener(this);
        mDetachBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //获取FragmentManager对象
        FragmentManager fragmentManager = getFragmentManager();
        //开启一个事务
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //Fragment操作
        switch (v.getId()) {
            case R.id.add_btn:
                // 向容器内加入Fragment
                if (!mSecondFragment.isAdded()
                        && null == fragmentManager.findFragmentById(R.id.fragment_container1)) {
                    fragmentTransaction.add(R.id.fragment_container1, mSecondFragment);
                }
                if (!mThirdFragment.isAdded()
                        && null == fragmentManager.findFragmentById(R.id.fragment_container2)) {
                    fragmentTransaction.add(R.id.fragment_container2, mThirdFragment);
                }
                break;
            case R.id.remove_btn:
                // 从容器类移除Fragment
                fragmentTransaction.remove(mSecondFragment);
                break;
            case R.id.replace_btn:
                if (!mSecondFragment.isAdded()) {
                    fragmentTransaction.replace(R.id.fragment_container2, mSecondFragment);
                }
                break;
            case R.id.hide_btn:
                if (!mSecondFragment.isHidden()) {
                    fragmentTransaction.hide(mSecondFragment);
                }
                break;
            case R.id.show_btn:
                if (mSecondFragment.isHidden()) {
                    fragmentTransaction.show(mSecondFragment);
                }
                break;
            case R.id.attach_btn:
                if (mSecondFragment.isDetached()) {
                    fragmentTransaction.attach(mSecondFragment);
                }
                break;
            case R.id.detach_btn:
                if (!mSecondFragment.isDetached()) {
                    fragmentTransaction.detach(mSecondFragment);
                }
                break;
            default:
                break;
        }

        //将事务加到Back栈
        fragmentTransaction.addToBackStack(null);
        //提交事务
        fragmentTransaction.commit();
    }
}