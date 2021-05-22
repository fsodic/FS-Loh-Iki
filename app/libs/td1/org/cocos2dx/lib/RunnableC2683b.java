package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.b  reason: case insensitive filesystem */
class RunnableC2683b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C2691f f6358a;

    RunnableC2683b(C2691f fVar) {
        this.f6358a = fVar;
    }

    public void run() {
        Cocos2dxAudioFocusManager.nativeOnAudioFocusChange(1);
        Cocos2dxHelper.setAudioFocus(false);
    }
}
