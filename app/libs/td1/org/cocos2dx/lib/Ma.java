package org.cocos2dx.lib;

class Ma implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6306a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f6307b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f6308c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    Ma(int i, int i2, int i3, int i4, int i5) {
        this.f6306a = i;
        this.f6307b = i2;
        this.f6308c = i3;
        this.d = i4;
        this.e = i5;
    }

    public void run() {
        Cocos2dxWebView cocos2dxWebView = (Cocos2dxWebView) Cocos2dxWebViewHelper.webViews.get(this.f6306a);
        if (cocos2dxWebView != null) {
            cocos2dxWebView.setWebViewRect(this.f6307b, this.f6308c, this.d, this.e);
        }
    }
}
