package org.cocos2dx.lib;

import java.util.concurrent.Callable;

class La implements Callable<Float> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6303a;

    La(int i) {
        this.f6303a = i;
    }

    @Override // java.util.concurrent.Callable
    public Float call() {
        Object obj;
        Cocos2dxWebView cocos2dxWebView = (Cocos2dxWebView) Cocos2dxWebViewHelper.webViews.get(this.f6303a);
        if (cocos2dxWebView != null) {
            try {
                obj = cocos2dxWebView.getClass().getMethod("getAlpha", new Class[0]).invoke(cocos2dxWebView, new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return (Float) obj;
        }
        obj = null;
        return (Float) obj;
    }
}
