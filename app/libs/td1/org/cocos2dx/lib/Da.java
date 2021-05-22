package org.cocos2dx.lib;

class Da implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6272a;

    Da(int i) {
        this.f6272a = i;
    }

    public void run() {
        Cocos2dxWebView cocos2dxWebView = (Cocos2dxWebView) Cocos2dxWebViewHelper.webViews.get(this.f6272a);
        if (cocos2dxWebView != null) {
            cocos2dxWebView.goForward();
        }
    }
}
