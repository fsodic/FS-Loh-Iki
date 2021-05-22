package org.cocos2dx.lib;

class Ga implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6283a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f6284b;

    Ga(int i, boolean z) {
        this.f6283a = i;
        this.f6284b = z;
    }

    public void run() {
        Cocos2dxWebView cocos2dxWebView = (Cocos2dxWebView) Cocos2dxWebViewHelper.webViews.get(this.f6283a);
        if (cocos2dxWebView != null) {
            cocos2dxWebView.setScalesPageToFit(this.f6284b);
        }
    }
}
