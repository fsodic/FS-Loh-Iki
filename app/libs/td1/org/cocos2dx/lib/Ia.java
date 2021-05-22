package org.cocos2dx.lib;

class Ia implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6290a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f6291b;

    Ia(int i, boolean z) {
        this.f6290a = i;
        this.f6291b = z;
    }

    public void run() {
        Cocos2dxWebView cocos2dxWebView = (Cocos2dxWebView) Cocos2dxWebViewHelper.webViews.get(this.f6290a);
        if (cocos2dxWebView != null) {
            cocos2dxWebView.setVisibility(this.f6291b ? 0 : 8);
        }
    }
}
