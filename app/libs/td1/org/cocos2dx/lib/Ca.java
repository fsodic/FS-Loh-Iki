package org.cocos2dx.lib;

class Ca implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6256a;

    Ca(int i) {
        this.f6256a = i;
    }

    public void run() {
        Cocos2dxWebView cocos2dxWebView = (Cocos2dxWebView) Cocos2dxWebViewHelper.webViews.get(this.f6256a);
        if (cocos2dxWebView != null) {
            cocos2dxWebView.goBack();
        }
    }
}
