package org.cocos2dx.lib;

import android.widget.FrameLayout;

class Fa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6280a;

    Fa(int i) {
        this.f6280a = i;
    }

    public void run() {
        Cocos2dxWebView cocos2dxWebView = new Cocos2dxWebView(Cocos2dxWebViewHelper.sCocos2dxActivity, this.f6280a);
        Cocos2dxWebViewHelper.sLayout.addView(cocos2dxWebView, new FrameLayout.LayoutParams(-2, -2));
        Cocos2dxWebViewHelper.webViews.put(this.f6280a, cocos2dxWebView);
    }
}
