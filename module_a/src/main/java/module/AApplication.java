package module;

import com.alibaba.android.arouter.launcher.ARouter;
import com.clj.lib.common.base.BaseApplication;
import com.clj.lib.common.utils.Utils;


public class AApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        if (Utils.isAppDebug()) {
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
        login();
    }

    private void login() {

    }
}
