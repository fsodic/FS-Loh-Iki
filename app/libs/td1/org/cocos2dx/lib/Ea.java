package org.cocos2dx.lib;

class Ea implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6275a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f6276b;

    Ea(int i, String str) {
        this.f6275a = i;
        this.f6276b = str;
    }

    public void run() {
        Cocos2dxWebView cocos2dxWebView = (Cocos2dxWebView) Cocos2dxWebViewHelper.webViews.get(this.f6275a);
        if (cocos2dxWebView != null) {
            cocos2dxWebView.loadUrl("javascript:" + this.f6276b);
        }
    }
}
