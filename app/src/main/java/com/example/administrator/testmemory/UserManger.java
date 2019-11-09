package com.example.administrator.testmemory;

import android.content.Context;

/**
 * Created by Administrator on 2018/2/25 0025.
 */

public class UserManger {
    private static UserManger instance;

    private Context context;

    private UserManger(Context context) {
        this.context = context;
    }

    public static UserManger getInstance(Context context) {
        if (instance == null) {
            instance = new UserManger(context);
        }
        return instance;
    }

}
