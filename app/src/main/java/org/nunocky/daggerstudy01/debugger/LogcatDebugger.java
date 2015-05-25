package org.nunocky.daggerstudy01.debugger;

import android.util.Log;

public class LogcatDebugger implements Debugger {
    private static final String TAG = "LogcatDebugger";

    @Override
    public void show(String text) {
        Log.v(TAG, text);
    }
}
