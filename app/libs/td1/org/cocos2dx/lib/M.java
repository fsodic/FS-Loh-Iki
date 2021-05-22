package org.cocos2dx.lib;

class M implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6304a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ O f6305b;

    M(O o, int i) {
        this.f6305b = o;
        this.f6304a = i;
    }

    public void run() {
        Cocos2dxEngineDataManager.nativeOnChangeSpecialEffectLevel(this.f6304a);
    }
}
