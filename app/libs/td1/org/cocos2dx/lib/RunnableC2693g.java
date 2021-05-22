package org.cocos2dx.lib;

/* access modifiers changed from: package-private */
/* renamed from: org.cocos2dx.lib.g  reason: case insensitive filesystem */
public class RunnableC2693g implements Runnable {
    RunnableC2693g() {
    }

    public void run() {
        Cocos2dxHelper.setAudioFocus(true);
        Cocos2dxAudioFocusManager.nativeOnAudioFocusChange(0);
    }
}
