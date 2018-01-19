package com.clj.modulevariants;

import com.alibaba.android.arouter.launcher.ARouter;
import com.clj.lib.common.base.BaseApplication;
import com.clj.lib.common.utils.Utils;

public class MyApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        if (Utils.isAppDebug()) {
            //开启InstantRun之后，一定要在ARouter.init之前调用openDebug
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }


}
