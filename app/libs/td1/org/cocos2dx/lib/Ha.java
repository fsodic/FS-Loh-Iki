package org.cocos2dx.lib;

class Ha implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6287a;

    Ha(int i) {
        this.f6287a = i;
    }

    public void run() {
        Cocos2dxWebView cocos2dxWebView = (Cocos2dxWebView) Cocos2dxWebViewHelper.webViews.get(this.f6287a);
        if (cocos2dxWebView != null) {
            Cocos2dxWebViewHelper.webViews.remove(this.f6287a);
            Cocos2dxWebViewHelper.sLayout.removeView(cocos2dxWebView);
        }
    }
}
