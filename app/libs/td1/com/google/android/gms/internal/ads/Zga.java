package com.google.android.gms.internal.ads;

import android.os.Handler;

public final class Zga {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f3653a;

    /* renamed from: b  reason: collision with root package name */
    private final _ga f3654b;

    public Zga(Handler handler, _ga _ga) {
        Handler handler2;
        if (_ga != null) {
            C2453wka.a(handler);
            handler2 = handler;
        } else {
            handler2 = null;
        }
        this.f3653a = handler2;
        this.f3654b = _ga;
    }

    public final void a(int i) {
        if (this.f3654b != null) {
            this.f3653a.post(new RunnableC1207eha(this, i));
        }
    }

    public final void a(int i, long j, long j2) {
        if (this.f3654b != null) {
            this.f3653a.post(new RunnableC1070cha(this, i, j, j2));
        }
    }

    public final void a(Bha bha) {
        if (this.f3654b != null) {
            this.f3653a.post(new RunnableC1001bha(this, bha));
        }
    }

    public final void a(Hga hga) {
        if (this.f3654b != null) {
            this.f3653a.post(new RunnableC1139dha(this, hga));
        }
    }

    public final void a(String str, long j, long j2) {
        if (this.f3654b != null) {
            this.f3653a.post(new RunnableC0932aha(this, str, j, j2));
        }
    }

    public final void b(Bha bha) {
        if (this.f3654b != null) {
            this.f3653a.post(new RunnableC1276fha(this, bha));
        }
    }
}
