package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.wa  reason: case insensitive filesystem */
class RunnableC2726wa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6429a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f6430b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f6431c;

    RunnableC2726wa(int i, boolean z, String str) {
        this.f6429a = i;
        this.f6430b = z;
        this.f6431c = str;
    }

    public void run() {
        Cocos2dxWebView cocos2dxWebView = (Cocos2dxWebView) Cocos2dxWebViewHelper.webViews.get(this.f6429a);
        if (cocos2dxWebView != null) {
            cocos2dxWebView.getSettings().setCacheMode(this.f6430b ? 2 : -1);
            cocos2dxWebView.loadUrl(this.f6431c);
        }
    }
}
