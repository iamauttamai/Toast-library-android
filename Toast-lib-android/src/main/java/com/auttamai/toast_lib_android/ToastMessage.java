package com.auttamai.toast_lib_android;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by AuttaphonL. on 25,August,2022
 */
public class ToastMessage {
    public void toast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
