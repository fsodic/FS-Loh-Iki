package org.cocos2dx.lib;

import java.util.concurrent.Callable;

class Aa implements Callable<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6250a;

    Aa(int i) {
        this.f6250a = i;
    }

    @Override // java.util.concurrent.Callable
    public Boolean call() {
        Cocos2dxWebView cocos2dxWebView = (Cocos2dxWebView) Cocos2dxWebViewHelper.webViews.get(this.f6250a);
        return Boolean.valueOf(cocos2dxWebView != null && cocos2dxWebView.canGoBack());
    }
}
