package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.d  reason: case insensitive filesystem */
class RunnableC2687d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C2691f f6366a;

    RunnableC2687d(C2691f fVar) {
        this.f6366a = fVar;
    }

    public void run() {
        Cocos2dxAudioFocusManager.nativeOnAudioFocusChange(3);
        Cocos2dxHelper.setAudioFocus(false);
    }
}
