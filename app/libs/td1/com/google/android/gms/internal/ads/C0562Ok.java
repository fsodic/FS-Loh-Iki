package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: com.google.android.gms.internal.ads.Ok  reason: case insensitive filesystem */
public final class C0562Ok {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2777a = false;

    /* renamed from: b  reason: collision with root package name */
    private float f2778b = 1.0f;

    public static float a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return ((float) streamVolume) / ((float) streamMaxVolume);
    }

    private final synchronized boolean c() {
        return this.f2778b >= 0.0f;
    }

    public final synchronized float a() {
        if (!c()) {
            return 1.0f;
        }
        return this.f2778b;
    }

    public final synchronized void a(float f) {
        this.f2778b = f;
    }

    public final synchronized void a(boolean z) {
        this.f2777a = z;
    }

    public final synchronized boolean b() {
        return this.f2777a;
    }
}
