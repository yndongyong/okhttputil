package org.yndongyong.okhttp.utils;

import android.util.Log;

/**
 * Created by zhy on 15/11/6.
 */
public class L
{
    private static boolean debug = false;

    public static void e(String msg)
    {
        if (debug)
        {
            Log.e("OkHttp", msg);
        }
    }
    public static void d(String msg)
    {
        if (debug)
        {
            Log.d("OkHttp", msg);
        }
    }

}

