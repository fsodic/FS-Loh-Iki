package org.cocos2dx.lib;

import android.util.Log;
import b.d.a.a.f;
import c.a.a.a.AbstractC0121e;

class Wa extends f {
    int i;
    String j;
    String k;
    String l;
    private Cocos2dxDownloader m;

    public Wa(Cocos2dxDownloader cocos2dxDownloader, int i2, String str, String str2, String str3) {
        this.m = cocos2dxDownloader;
        this.i = i2;
        this.j = str;
        this.k = str2;
        this.l = str3;
    }

    @Override // b.d.a.a.f
    public void a(int i2, AbstractC0121e[] eVarArr, byte[] bArr) {
        int i3 = 0;
        boolean z = false;
        while (true) {
            if (i3 >= eVarArr.length) {
                break;
            }
            AbstractC0121e eVar = eVarArr[i3];
            if (eVar.getName().equals("Accept-Ranges")) {
                z = Boolean.valueOf(eVar.getValue().equals("bytes"));
                break;
            }
            i3++;
        }
        Cocos2dxDownloader.setResumingSupport(this.j, z);
        Cocos2dxDownloader.createTask(this.m, this.i, this.k, this.l);
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        Log.d("Cocos2dxDownloader", str);
    }

    @Override // b.d.a.a.f
    public void b(int i2, AbstractC0121e[] eVarArr, byte[] bArr, Throwable th) {
        a("onFailure(code:" + i2 + " headers:" + eVarArr + " throwable:" + th + " id:" + this.i);
        this.m.onFinish(this.i, i2, th != null ? th.toString() : BuildConfig.FLAVOR, null);
    }

    @Override // b.d.a.a.f
    public void h() {
        this.m.runNextTaskIfExists();
    }
}
