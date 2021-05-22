package org.cocos2dx.lib;

import org.cocos2dx.lib.Cocos2dxWebView;

/* renamed from: org.cocos2dx.lib.sa  reason: case insensitive filesystem */
class RunnableC2718sa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f6412a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Cocos2dxWebView.a f6413b;

    RunnableC2718sa(Cocos2dxWebView.a aVar, String str) {
        this.f6413b = aVar;
        this.f6412a = str;
    }

    public void run() {
        Cocos2dxWebViewHelper._onJsCallback(Cocos2dxWebView.this.mViewTag, this.f6412a);
    }
}
