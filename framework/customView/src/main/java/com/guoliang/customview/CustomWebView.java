package com.guoliang.customview;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.WebView;

/**
 * @Description:
 * @Author: zhangguoliang
 * @CreateTime: 2020/8/18 15:03
 */
public class CustomWebView extends WebView {
    public CustomWebView(Context context) {
        super(getFixedContext(context));
    }

    public CustomWebView(Context context, AttributeSet attrs) {
        super(getFixedContext(context), attrs);
    }

    public CustomWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(getFixedContext(context), attrs, defStyleAttr);
    }

    public static Context getFixedContext(Context context) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            return context.createConfigurationContext(new Configuration());
        } else {
            return context;
        }
    }

}
