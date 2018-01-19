package com.clj.module.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.clj.lib.common.base.BaseActivity;


public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.news_button).setOnClickListener(this);
        findViewById(R.id.girls_button).setOnClickListener(this);
        findViewById(R.id.fragment_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.news_button) {
            //跳转到NewsCenterActivity
            ARouter.getInstance().build("/news/center").navigation();
        } else if (view.getId() == R.id.girls_button) {
            //跳转到GirlsActivity
            ARouter.getInstance().build("/girls/list").navigation();
        } else if (view.getId() == R.id.fragment_button) {
            startActivity(new Intent(this, BottomNavigationActivity.class));
        }
    }

}
