package org.cocos2dx.lib;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import java.net.URI;
import java.util.concurrent.CountDownLatch;

public class Cocos2dxWebView extends WebView {
    private static final String TAG = Cocos2dxWebViewHelper.class.getSimpleName();
    private String mJSScheme;
    private int mViewTag;

    class a extends WebViewClient {
        a() {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            ((Cocos2dxActivity) Cocos2dxWebView.this.getContext()).runOnGLThread(new RunnableC2720ta(this, str));
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            ((Cocos2dxActivity) Cocos2dxWebView.this.getContext()).runOnGLThread(new RunnableC2722ua(this, str2));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Cocos2dxActivity cocos2dxActivity = (Cocos2dxActivity) Cocos2dxWebView.this.getContext();
            try {
                URI create = URI.create(str);
                if (create != null && create.getScheme().equals(Cocos2dxWebView.this.mJSScheme)) {
                    cocos2dxActivity.runOnGLThread(new RunnableC2718sa(this, str));
                    return true;
                }
            } catch (Exception unused) {
                Log.d(Cocos2dxWebView.TAG, "Failed to create URI from url");
            }
            boolean[] zArr = {true};
            CountDownLatch countDownLatch = new CountDownLatch(1);
            cocos2dxActivity.runOnGLThread(new Ya(countDownLatch, zArr, Cocos2dxWebView.this.mViewTag, str));
            try {
                countDownLatch.await();
            } catch (InterruptedException unused2) {
                Log.d(Cocos2dxWebView.TAG, "'shouldOverrideUrlLoading' failed");
            }
            return zArr[0];
        }
    }

    public Cocos2dxWebView(Context context) {
        this(context, -1);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public Cocos2dxWebView(Context context, int i) {
        super(context);
        this.mViewTag = i;
        this.mJSScheme = BuildConfig.FLAVOR;
        setFocusable(true);
        setFocusableInTouchMode(true);
        getSettings().setSupportZoom(false);
        getSettings().setDomStorageEnabled(true);
        getSettings().setJavaScriptEnabled(true);
        try {
            getClass().getMethod("removeJavascriptInterface", String.class).invoke(this, "searchBoxJavaBridge_");
        } catch (Exception unused) {
            Log.d(TAG, "This API level do not support `removeJavascriptInterface`");
        }
        setWebViewClient(new a());
        setWebChromeClient(new WebChromeClient());
    }

    public void setJavascriptInterfaceScheme(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        this.mJSScheme = str;
    }

    public void setScalesPageToFit(boolean z) {
        getSettings().setSupportZoom(z);
    }

    public void setWebViewRect(int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        layoutParams.width = i3;
        layoutParams.height = i4;
        layoutParams.gravity = 51;
        setLayoutParams(layoutParams);
    }
}
