package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;

public final class _ka {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f3753a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0940ala f3754b;

    public _ka(Handler handler, AbstractC0940ala ala) {
        Handler handler2;
        if (ala != null) {
            C2453wka.a(handler);
            handler2 = handler;
        } else {
            handler2 = null;
        }
        this.f3753a = handler2;
        this.f3754b = ala;
    }

    public final void a(int i, int i2, int i3, float f) {
        if (this.f3754b != null) {
            this.f3753a.post(new RunnableC1353gla(this, i, i2, i3, f));
        }
    }

    public final void a(int i, long j) {
        if (this.f3754b != null) {
            this.f3753a.post(new RunnableC1147dla(this, i, j));
        }
    }

    public final void a(Surface surface) {
        if (this.f3754b != null) {
            this.f3753a.post(new RunnableC1284fla(this, surface));
        }
    }

    public final void a(Bha bha) {
        if (this.f3754b != null) {
            this.f3753a.post(new RunnableC1078cla(this, bha));
        }
    }

    public final void a(Hga hga) {
        if (this.f3754b != null) {
            this.f3753a.post(new RunnableC1215ela(this, hga));
        }
    }

    public final void a(String str, long j, long j2) {
        if (this.f3754b != null) {
            this.f3753a.post(new RunnableC1009bla(this, str, j, j2));
        }
    }

    public final void b(Bha bha) {
        if (this.f3754b != null) {
            this.f3753a.post(new RunnableC1422hla(this, bha));
        }
    }
}
