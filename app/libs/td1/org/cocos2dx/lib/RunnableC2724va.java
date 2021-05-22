package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.va  reason: case insensitive filesystem */
class RunnableC2724va implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6424a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f6425b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f6426c;

    RunnableC2724va(int i, String str, String str2) {
        this.f6424a = i;
        this.f6425b = str;
        this.f6426c = str2;
    }

    public void run() {
        Cocos2dxWebView cocos2dxWebView = (Cocos2dxWebView) Cocos2dxWebViewHelper.webViews.get(this.f6424a);
        if (cocos2dxWebView != null) {
            cocos2dxWebView.loadDataWithBaseURL(this.f6425b, this.f6426c, null, null, null);
        }
    }
}
