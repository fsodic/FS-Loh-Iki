package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.j  reason: case insensitive filesystem */
class RunnableC2699j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f6384a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ RunnableC2701k f6385b;

    RunnableC2699j(RunnableC2701k kVar, String str) {
        this.f6385b = kVar;
        this.f6384a = str;
    }

    public void run() {
        Cocos2dxDownloader cocos2dxDownloader = this.f6385b.f6388b;
        cocos2dxDownloader.nativeOnFinish(cocos2dxDownloader._id, this.f6385b.f6389c, 0, this.f6384a, null);
    }
}
