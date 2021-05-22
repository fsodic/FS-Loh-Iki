package org.cocos2dx.lib;

import android.media.AudioManager;
import android.util.Log;

/* renamed from: org.cocos2dx.lib.f  reason: case insensitive filesystem */
class C2691f implements AudioManager.OnAudioFocusChangeListener {
    C2691f() {
    }

    public void onAudioFocusChange(int i) {
        Runnable eVar;
        Log.d("AudioFocusManager", "onAudioFocusChange: " + i + ", thread: " + Thread.currentThread().getName());
        if (i == -1) {
            Log.d("AudioFocusManager", "Pause music by AUDIOFOCUS_LOSS");
            eVar = new RunnableC2683b(this);
        } else if (i == -2) {
            Log.d("AudioFocusManager", "Pause music by AUDIOFOCUS_LOSS_TRANSILENT");
            eVar = new RunnableC2685c(this);
        } else if (i == -3) {
            Log.d("AudioFocusManager", "Lower the volume, keep playing by AUDIOFOCUS_LOSS_TRANSILENT_CAN_DUCK");
            eVar = new RunnableC2687d(this);
        } else if (i == 1) {
            Log.d("AudioFocusManager", "Resume music by AUDIOFOCUS_GAIN");
            eVar = new RunnableC2689e(this);
        } else {
            return;
        }
        Cocos2dxHelper.runOnGLThread(eVar);
    }
}
