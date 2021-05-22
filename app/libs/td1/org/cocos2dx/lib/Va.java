package org.cocos2dx.lib;

class Va implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f6342a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f6343b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f6344c;
    final /* synthetic */ float d;
    final /* synthetic */ boolean e;

    Va(String str, int i, int i2, float f, boolean z) {
        this.f6342a = str;
        this.f6343b = i;
        this.f6344c = i2;
        this.d = f;
        this.e = z;
    }

    public void run() {
        GameControllerAdapter.access$300(this.f6342a, this.f6343b, this.f6344c, this.d, this.e);
    }
}
