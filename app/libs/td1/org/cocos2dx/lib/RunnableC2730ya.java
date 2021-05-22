package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.ya  reason: case insensitive filesystem */
class RunnableC2730ya implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6438a;

    RunnableC2730ya(int i) {
        this.f6438a = i;
    }

    public void run() {
        Cocos2dxWebView cocos2dxWebView = (Cocos2dxWebView) Cocos2dxWebViewHelper.webViews.get(this.f6438a);
        if (cocos2dxWebView != null) {
            cocos2dxWebView.stopLoading();
        }
    }
}
