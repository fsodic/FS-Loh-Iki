package org.cocos2dx.lib;

import org.cocos2dx.lib.Cocos2dxWebView;

/* renamed from: org.cocos2dx.lib.ua  reason: case insensitive filesystem */
class RunnableC2722ua implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f6420a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Cocos2dxWebView.a f6421b;

    RunnableC2722ua(Cocos2dxWebView.a aVar, String str) {
        this.f6421b = aVar;
        this.f6420a = str;
    }

    public void run() {
        Cocos2dxWebViewHelper._didFailLoading(Cocos2dxWebView.this.mViewTag, this.f6420a);
    }
}
