package com.example.liushengjie.sharedpreferencestest;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liushengjie on 2017/7/27.
 */
public class ActivityCollector {

    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    public static void finishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
        activities.clear();
    }
}

