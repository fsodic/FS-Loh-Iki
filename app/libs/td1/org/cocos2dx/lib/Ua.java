package org.cocos2dx.lib;

class Ua implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f6337a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f6338b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f6339c;
    final /* synthetic */ boolean d;
    final /* synthetic */ float e;
    final /* synthetic */ boolean f;

    Ua(String str, int i, int i2, boolean z, float f2, boolean z2) {
        this.f6337a = str;
        this.f6338b = i;
        this.f6339c = i2;
        this.d = z;
        this.e = f2;
        this.f = z2;
    }

    public void run() {
        GameControllerAdapter.access$200(this.f6337a, this.f6338b, this.f6339c, this.d, this.e, this.f);
    }
}
