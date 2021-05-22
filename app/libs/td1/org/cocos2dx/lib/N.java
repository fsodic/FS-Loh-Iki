package org.cocos2dx.lib;

class N implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f6309a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ O f6310b;

    N(O o, boolean z) {
        this.f6310b = o;
        this.f6309a = z;
    }

    public void run() {
        Cocos2dxEngineDataManager.nativeOnChangeMuteEnabled(this.f6309a);
    }
}
