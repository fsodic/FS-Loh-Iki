package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.xa  reason: case insensitive filesystem */
class RunnableC2728xa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6435a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f6436b;

    RunnableC2728xa(int i, String str) {
        this.f6435a = i;
        this.f6436b = str;
    }

    public void run() {
        Cocos2dxWebView cocos2dxWebView = (Cocos2dxWebView) Cocos2dxWebViewHelper.webViews.get(this.f6435a);
        if (cocos2dxWebView != null) {
            cocos2dxWebView.loadUrl(this.f6436b);
        }
    }
}
