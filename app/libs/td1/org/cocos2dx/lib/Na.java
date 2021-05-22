package org.cocos2dx.lib;

class Na implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6311a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f6312b;

    Na(int i, String str) {
        this.f6311a = i;
        this.f6312b = str;
    }

    public void run() {
        Cocos2dxWebView cocos2dxWebView = (Cocos2dxWebView) Cocos2dxWebViewHelper.webViews.get(this.f6311a);
        if (cocos2dxWebView != null) {
            cocos2dxWebView.setJavascriptInterfaceScheme(this.f6312b);
        }
    }
}
