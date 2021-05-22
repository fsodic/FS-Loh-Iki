package org.cocos2dx.lib;

class Oa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6314a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f6315b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f6316c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;

    Oa(int i, String str, String str2, String str3, String str4) {
        this.f6314a = i;
        this.f6315b = str;
        this.f6316c = str2;
        this.d = str3;
        this.e = str4;
    }

    public void run() {
        Cocos2dxWebView cocos2dxWebView = (Cocos2dxWebView) Cocos2dxWebViewHelper.webViews.get(this.f6314a);
        if (cocos2dxWebView != null) {
            cocos2dxWebView.loadDataWithBaseURL(this.f6315b, this.f6316c, this.d, this.e, null);
        }
    }
}
