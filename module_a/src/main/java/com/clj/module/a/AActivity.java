package com.clj.module.a;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.clj.lib.common.base.BaseActivity;


@Route(path = "/a/main")
public class AActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_a);
    }


}
