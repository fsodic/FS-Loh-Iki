package org.cocos2dx.lib;

import android.util.Log;
import b.d.a.a.h;
import c.a.a.a.AbstractC0121e;
import java.io.File;

class Ra extends h {
    int m;
    File n;
    private long o = k().length();
    private long p = 0;
    private Cocos2dxDownloader q;

    public Ra(Cocos2dxDownloader cocos2dxDownloader, int i, File file, File file2) {
        super(file, true);
        this.n = file2;
        this.q = cocos2dxDownloader;
        this.m = i;
    }

    @Override // b.d.a.a.h
    public void a(int i, AbstractC0121e[] eVarArr, File file) {
        String str;
        StringBuilder sb;
        String str2;
        a("onSuccess(i:" + i + " headers:" + eVarArr + " file:" + file);
        if (this.n.exists()) {
            if (this.n.isDirectory()) {
                sb = new StringBuilder();
                str2 = "Dest file is directory:";
            } else if (!this.n.delete()) {
                sb = new StringBuilder();
                str2 = "Can't remove old file:";
            }
            sb.append(str2);
            sb.append(this.n.getAbsolutePath());
            str = sb.toString();
            this.q.onFinish(this.m, 0, str, null);
        }
        k().renameTo(this.n);
        str = null;
        this.q.onFinish(this.m, 0, str, null);
    }

    @Override // b.d.a.a.h
    public void a(int i, AbstractC0121e[] eVarArr, Throwable th, File file) {
        a("onFailure(i:" + i + " headers:" + eVarArr + " throwable:" + th + " file:" + file);
        this.q.onFinish(this.m, i, th != null ? th.toString() : BuildConfig.FLAVOR, null);
    }

    @Override // b.d.a.a.f
    public void a(long j, long j2) {
        long j3 = j - this.p;
        long j4 = this.o;
        this.q.onProgress(this.m, j3, j + j4, j2 + j4);
        this.p = j;
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        Log.d("Cocos2dxDownloader", str);
    }

    @Override // b.d.a.a.f
    public void h() {
        this.q.runNextTaskIfExists();
    }

    @Override // b.d.a.a.f
    public void i() {
        this.q.onStart(this.m);
    }
}
