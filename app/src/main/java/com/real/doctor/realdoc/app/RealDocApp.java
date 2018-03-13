package com.real.doctor.realdoc.app;

import android.app.Application;
import android.content.Context;

/**
 * @author zhujiabin
 * @package com.real.doctor.realdoc.app
 * @fileName ${Name}
 * @Date 2018-3-7 0007
 * @describe TODO
 * @email zhujiabindragon@163.com
 */

public class RealDocApp extends Application {


    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this.getApplicationContext();
        initAutoLayout();
    }

    /**
     * 配置AutoLayout
     */
    private void initAutoLayout() {
        //默认使用的高度是设备的可用高度，也就是不包括状态栏和底部的操作栏的，以下配置可以拿到设备的物理高度进行百分比
//        AutoLayoutConifg.getInstance().useDeviceSize();
    }

    public static Context getmContext() {
        return mContext;
    }

}
