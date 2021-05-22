package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.e  reason: case insensitive filesystem */
class RunnableC2689e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C2691f f6370a;

    RunnableC2689e(C2691f fVar) {
        this.f6370a = fVar;
    }

    public void run() {
        Cocos2dxAudioFocusManager.nativeOnAudioFocusChange(0);
        Cocos2dxHelper.setAudioFocus(true);
    }
}
