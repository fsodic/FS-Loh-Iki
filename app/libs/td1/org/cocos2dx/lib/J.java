package org.cocos2dx.lib;

class J implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6292a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f6293b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ O f6294c;

    J(O o, int i, int i2) {
        this.f6294c = o;
        this.f6292a = i;
        this.f6293b = i2;
    }

    public void run() {
        Cocos2dxEngineDataManager.nativeOnChangeContinuousFrameLostConfig(this.f6292a, this.f6293b);
    }
}
