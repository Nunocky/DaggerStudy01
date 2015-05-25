package org.nunocky.daggerstudy01.debugger;

import android.content.Context;
import android.widget.Toast;

public class ToastDebugger implements Debugger {
    private Context mContext;

    public ToastDebugger(Context context) {
        mContext = context;
    }

    @Override
    public void show(String text) {
        Toast.makeText(mContext, text, Toast.LENGTH_SHORT).show();
    }
}
