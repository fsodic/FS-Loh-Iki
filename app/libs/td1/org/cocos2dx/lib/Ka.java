package org.cocos2dx.lib;

class Ka implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6299a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f6300b;

    Ka(int i, float f) {
        this.f6299a = i;
        this.f6300b = f;
    }

    public void run() {
        Cocos2dxWebView cocos2dxWebView = (Cocos2dxWebView) Cocos2dxWebViewHelper.webViews.get(this.f6299a);
        if (cocos2dxWebView != null) {
            try {
                cocos2dxWebView.getClass().getMethod("setAlpha", Float.TYPE).invoke(cocos2dxWebView, Float.valueOf(this.f6300b));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
