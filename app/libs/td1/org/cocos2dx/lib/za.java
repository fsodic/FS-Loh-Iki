package org.cocos2dx.lib;

class za implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6440a;

    za(int i) {
        this.f6440a = i;
    }

    public void run() {
        Cocos2dxWebView cocos2dxWebView = (Cocos2dxWebView) Cocos2dxWebViewHelper.webViews.get(this.f6440a);
        if (cocos2dxWebView != null) {
            cocos2dxWebView.reload();
        }
    }
}
