package com.clj.module.main;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.clj.lib.common.base.BaseActivity;


public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_a).setOnClickListener(this);
        findViewById(R.id.btn_b).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_a) {
            ARouter.getInstance().build("/a/main").navigation();
        } else if (view.getId() == R.id.btn_b) {
            ARouter.getInstance().build("/b/main").navigation();
        }
    }

}
