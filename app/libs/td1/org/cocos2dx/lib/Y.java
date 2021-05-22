package org.cocos2dx.lib;

/* access modifiers changed from: package-private */
public class Y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f6348a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f6349b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f6350c;
    final /* synthetic */ long d;

    Y(float f, float f2, float f3, long j) {
        this.f6348a = f;
        this.f6349b = f2;
        this.f6350c = f3;
        this.d = j;
    }

    public void run() {
        Cocos2dxAccelerometer.onSensorChanged(this.f6348a, this.f6349b, this.f6350c, this.d);
    }
}
