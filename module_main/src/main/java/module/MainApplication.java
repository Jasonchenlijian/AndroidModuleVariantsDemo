package module;

import com.alibaba.android.arouter.launcher.ARouter;
import com.clj.lib.common.base.BaseApplication;
import com.clj.lib.common.utils.Utils;


public class MainApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        login();
        if (Utils.isAppDebug()) {
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }

    private void login() {

    }
}
