package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.h  reason: case insensitive filesystem */
class RunnableC2695h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6378a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f6379b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f6380c;
    final /* synthetic */ long d;
    final /* synthetic */ Cocos2dxDownloader e;

    RunnableC2695h(Cocos2dxDownloader cocos2dxDownloader, int i, long j, long j2, long j3) {
        this.e = cocos2dxDownloader;
        this.f6378a = i;
        this.f6379b = j;
        this.f6380c = j2;
        this.d = j3;
    }

    public void run() {
        Cocos2dxDownloader cocos2dxDownloader = this.e;
        cocos2dxDownloader.nativeOnProgress(Cocos2dxDownloader.access$000(cocos2dxDownloader), this.f6378a, this.f6379b, this.f6380c, this.d);
    }
}
