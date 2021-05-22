package org.cocos2dx.lib;

import android.graphics.Paint;

class Ja implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6295a;

    Ja(int i) {
        this.f6295a = i;
    }

    public void run() {
        Cocos2dxWebView cocos2dxWebView = (Cocos2dxWebView) Cocos2dxWebViewHelper.webViews.get(this.f6295a);
        if (cocos2dxWebView != null) {
            cocos2dxWebView.setBackgroundColor(0);
            try {
                cocos2dxWebView.getClass().getMethod("setLayerType", Integer.TYPE, Paint.class).invoke(cocos2dxWebView, 1, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
