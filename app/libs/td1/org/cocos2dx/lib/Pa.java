package org.cocos2dx.lib;

import android.util.Log;
import b.d.a.a.g;
import c.a.a.a.AbstractC0121e;

class Pa extends g {
    int j;
    private Cocos2dxDownloader k;
    private long l = 0;

    public Pa(Cocos2dxDownloader cocos2dxDownloader, int i) {
        super(new String[]{".*"});
        this.k = cocos2dxDownloader;
        this.j = i;
    }

    @Override // b.d.a.a.f
    public void a(int i, AbstractC0121e[] eVarArr, byte[] bArr) {
        a("onSuccess(i:" + i + " headers:" + eVarArr);
        this.k.onFinish(this.j, 0, null, bArr);
    }

    @Override // b.d.a.a.f
    public void a(long j2, long j3) {
        this.k.onProgress(this.j, j2 - this.l, j2, j3);
        this.l = j2;
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        Log.d("Cocos2dxDownloader", str);
    }

    @Override // b.d.a.a.f
    public void b(int i, AbstractC0121e[] eVarArr, byte[] bArr, Throwable th) {
        a("onFailure(i:" + i + " headers:" + eVarArr + " throwable:" + th);
        this.k.onFinish(this.j, i, th != null ? th.toString() : BuildConfig.FLAVOR, null);
    }

    @Override // b.d.a.a.f
    public void h() {
        this.k.runNextTaskIfExists();
    }

    @Override // b.d.a.a.f
    public void i() {
        this.k.onStart(this.j);
    }
}
