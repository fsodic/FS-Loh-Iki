package org.cocos2dx.lib;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.widget.FrameLayout;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Cocos2dxWebViewHelper {
    private static final String TAG = "Cocos2dxWebViewHelper";
    private static Cocos2dxActivity sCocos2dxActivity;
    private static Handler sHandler;
    private static FrameLayout sLayout;
    private static int viewTag;
    private static SparseArray<Cocos2dxWebView> webViews;

    public Cocos2dxWebViewHelper(FrameLayout frameLayout) {
        sLayout = frameLayout;
        sHandler = new Handler(Looper.myLooper());
        sCocos2dxActivity = (Cocos2dxActivity) Cocos2dxActivity.getContext();
        webViews = new SparseArray<>();
    }

    public static void _didFailLoading(int i, String str) {
        didFailLoading(i, str);
    }

    public static void _didFinishLoading(int i, String str) {
        didFinishLoading(i, str);
    }

    public static void _onJsCallback(int i, String str) {
        onJsCallback(i, str);
    }

    public static boolean _shouldStartLoading(int i, String str) {
        return !shouldStartLoading(i, str);
    }

    public static <T> T callInMainThread(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        sHandler.post(futureTask);
        return (T) futureTask.get();
    }

    public static boolean canGoBack(int i) {
        try {
            return ((Boolean) callInMainThread(new Aa(i))).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            return false;
        }
    }

    public static boolean canGoForward(int i) {
        try {
            return ((Boolean) callInMainThread(new Ba(i))).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            return false;
        }
    }

    public static int createWebView() {
        sCocos2dxActivity.runOnUiThread(new Fa(viewTag));
        int i = viewTag;
        viewTag = i + 1;
        return i;
    }

    private static native void didFailLoading(int i, String str);

    private static native void didFinishLoading(int i, String str);

    public static void evaluateJS(int i, String str) {
        sCocos2dxActivity.runOnUiThread(new Ea(i, str));
    }

    public static float getOpacityWebView(int i) {
        if (Build.VERSION.SDK_INT <= 10) {
            return 1.0f;
        }
        FutureTask futureTask = new FutureTask(new La(i));
        sCocos2dxActivity.runOnUiThread(futureTask);
        try {
            return ((Float) futureTask.get()).floatValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 1.0f;
        }
    }

    public static void goBack(int i) {
        sCocos2dxActivity.runOnUiThread(new Ca(i));
    }

    public static void goForward(int i) {
        sCocos2dxActivity.runOnUiThread(new Da(i));
    }

    public static void loadData(int i, String str, String str2, String str3, String str4) {
        sCocos2dxActivity.runOnUiThread(new Oa(i, str4, str, str2, str3));
    }

    public static void loadFile(int i, String str) {
        sCocos2dxActivity.runOnUiThread(new RunnableC2728xa(i, str));
    }

    public static void loadHTMLString(int i, String str, String str2) {
        sCocos2dxActivity.runOnUiThread(new RunnableC2724va(i, str2, str));
    }

    public static void loadUrl(int i, String str, boolean z) {
        sCocos2dxActivity.runOnUiThread(new RunnableC2726wa(i, z, str));
    }

    private static native void onJsCallback(int i, String str);

    public static void reload(int i) {
        sCocos2dxActivity.runOnUiThread(new za(i));
    }

    public static void removeWebView(int i) {
        sCocos2dxActivity.runOnUiThread(new Ha(i));
    }

    public static void setBackgroundTransparent(int i) {
        if (Build.VERSION.SDK_INT > 10) {
            sCocos2dxActivity.runOnUiThread(new Ja(i));
        }
    }

    public static void setJavascriptInterfaceScheme(int i, String str) {
        sCocos2dxActivity.runOnUiThread(new Na(i, str));
    }

    public static void setOpacityWebView(int i, float f) {
        if (Build.VERSION.SDK_INT > 10) {
            sCocos2dxActivity.runOnUiThread(new Ka(i, f));
        }
    }

    public static void setScalesPageToFit(int i, boolean z) {
        sCocos2dxActivity.runOnUiThread(new Ga(i, z));
    }

    public static void setVisible(int i, boolean z) {
        sCocos2dxActivity.runOnUiThread(new Ia(i, z));
    }

    public static void setWebViewRect(int i, int i2, int i3, int i4, int i5) {
        sCocos2dxActivity.runOnUiThread(new Ma(i, i2, i3, i4, i5));
    }

    private static native boolean shouldStartLoading(int i, String str);

    public static void stopLoading(int i) {
        sCocos2dxActivity.runOnUiThread(new RunnableC2730ya(i));
    }
}
