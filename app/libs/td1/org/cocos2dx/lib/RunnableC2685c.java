package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.c  reason: case insensitive filesystem */
class RunnableC2685c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C2691f f6362a;

    RunnableC2685c(C2691f fVar) {
        this.f6362a = fVar;
    }

    public void run() {
        Cocos2dxAudioFocusManager.nativeOnAudioFocusChange(2);
        Cocos2dxHelper.setAudioFocus(false);
    }
}
