package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@TargetApi(14)
/* renamed from: com.google.android.gms.internal.ads.bn  reason: case insensitive filesystem */
public final class C1012bn implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final AudioManager f3936a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0943an f3937b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3938c;
    private boolean d;
    private boolean e;
    private float f = 1.0f;

    public C1012bn(Context context, AbstractC0943an anVar) {
        this.f3936a = (AudioManager) context.getSystemService("audio");
        this.f3937b = anVar;
    }

    private final void d() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        boolean z4 = this.d && !this.e && this.f > 0.0f;
        if (z4 && !(z2 = this.f3938c)) {
            AudioManager audioManager = this.f3936a;
            if (audioManager != null && !z2) {
                if (audioManager.requestAudioFocus(this, 3, 2) == 1) {
                    z3 = true;
                }
                this.f3938c = z3;
            }
            this.f3937b.a();
        } else if (!z4 && (z = this.f3938c)) {
            AudioManager audioManager2 = this.f3936a;
            if (audioManager2 != null && z) {
                if (audioManager2.abandonAudioFocus(this) == 0) {
                    z3 = true;
                }
                this.f3938c = z3;
            }
            this.f3937b.a();
        }
    }

    public final float a() {
        float f2 = this.e ? 0.0f : this.f;
        if (this.f3938c) {
            return f2;
        }
        return 0.0f;
    }

    public final void a(float f2) {
        this.f = f2;
        d();
    }

    public final void a(boolean z) {
        this.e = z;
        d();
    }

    public final void b() {
        this.d = true;
        d();
    }

    public final void c() {
        this.d = false;
        d();
    }

    public final void onAudioFocusChange(int i) {
        this.f3938c = i > 0;
        this.f3937b.a();
    }
}
