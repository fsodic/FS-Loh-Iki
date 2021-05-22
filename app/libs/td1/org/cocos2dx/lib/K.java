package org.cocos2dx.lib;

class K implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6296a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f6297b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ O f6298c;

    K(O o, int i, float f) {
        this.f6298c = o;
        this.f6296a = i;
        this.f6297b = f;
    }

    public void run() {
        Cocos2dxEngineDataManager.nativeOnChangeLowFpsConfig(this.f6296a, this.f6297b);
    }
}
