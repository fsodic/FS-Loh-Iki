package org.cocos2dx.lib;

class L implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6301a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ O f6302b;

    L(O o, int i) {
        this.f6302b = o;
        this.f6301a = i;
    }

    public void run() {
        Cocos2dxEngineDataManager.nativeOnChangeExpectedFps(this.f6301a);
    }
}
