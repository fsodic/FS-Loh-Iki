package org.cocos2dx.lib;

import android.content.Context;
import android.media.AudioManager;
import android.util.Log;

/* access modifiers changed from: package-private */
public class Cocos2dxAudioFocusManager {

    /* renamed from: a  reason: collision with root package name */
    private static AudioManager.OnAudioFocusChangeListener f6260a = new C2691f();

    static boolean a(Context context) {
        if (((AudioManager) context.getSystemService("audio")).requestAudioFocus(f6260a, 3, 1) == 1) {
            Log.d("AudioFocusManager", "requestAudioFocus succeed");
            return true;
        }
        Log.e("AudioFocusManager", "requestAudioFocus failed!");
        return false;
    }

    static void b(Context context) {
        if (((AudioManager) context.getSystemService("audio")).abandonAudioFocus(f6260a) == 1) {
            Log.d("AudioFocusManager", "abandonAudioFocus succeed!");
        } else {
            Log.e("AudioFocusManager", "abandonAudioFocus failed!");
        }
        Cocos2dxHelper.runOnGLThread(new RunnableC2693g());
    }

    /* access modifiers changed from: private */
    public static native void nativeOnAudioFocusChange(int i);
}
