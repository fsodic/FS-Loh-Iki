package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.i  reason: case insensitive filesystem */
class RunnableC2697i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6381a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f6382b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f6383c;
    final /* synthetic */ byte[] d;
    final /* synthetic */ Cocos2dxDownloader e;

    RunnableC2697i(Cocos2dxDownloader cocos2dxDownloader, int i, int i2, String str, byte[] bArr) {
        this.e = cocos2dxDownloader;
        this.f6381a = i;
        this.f6382b = i2;
        this.f6383c = str;
        this.d = bArr;
    }

    public void run() {
        Cocos2dxDownloader cocos2dxDownloader = this.e;
        cocos2dxDownloader.nativeOnFinish(Cocos2dxDownloader.access$000(cocos2dxDownloader), this.f6381a, this.f6382b, this.f6383c, this.d);
    }
}
