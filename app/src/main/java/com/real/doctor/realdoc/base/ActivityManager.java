package com.real.doctor.realdoc.base;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhujiabin
 * @package com.example.administrator.ruiyi.basecls
 * @fileName ${Name}
 * @Date 2018-1-4 0004
 * @describe TODO
 * @email zhujiabindragon@163.com
 */

public class ActivityManager {
    public static List<Activity> list = new ArrayList<Activity>();

    public static void addActivity(Activity activity) {
        list.add(activity);
    }

    public static void removeActivity(Activity activity) {
        list.remove(activity);
    }

    public static void finish() {
        for (Activity activity : list) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
