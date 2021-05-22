package org.cocos2dx.lib;

import org.cocos2dx.lib.Cocos2dxWebView;

/* renamed from: org.cocos2dx.lib.ta  reason: case insensitive filesystem */
class RunnableC2720ta implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f6416a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Cocos2dxWebView.a f6417b;

    RunnableC2720ta(Cocos2dxWebView.a aVar, String str) {
        this.f6417b = aVar;
        this.f6416a = str;
    }

    public void run() {
        Cocos2dxWebViewHelper._didFinishLoading(Cocos2dxWebView.this.mViewTag, this.f6416a);
    }
}
