package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Rs  reason: case insensitive filesystem */
public final class C0648Rs implements AbstractC0261Cv, AbstractC1835nla {

    /* renamed from: a  reason: collision with root package name */
    private final C1941pR f3047a;

    /* renamed from: b  reason: collision with root package name */
    private final C1160dv f3048b;

    /* renamed from: c  reason: collision with root package name */
    private final C0365Gv f3049c;
    private final AtomicBoolean d = new AtomicBoolean();
    private final AtomicBoolean e = new AtomicBoolean();

    public C0648Rs(C1941pR pRVar, C1160dv dvVar, C0365Gv gv) {
        this.f3047a = pRVar;
        this.f3048b = dvVar;
        this.f3049c = gv;
    }

    private final void b() {
        if (this.d.compareAndSet(false, true)) {
            this.f3048b.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0261Cv
    public final synchronized void a() {
        if (this.f3047a.e != 1) {
            b();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835nla
    public final void a(C1904ola ola) {
        if (this.f3047a.e == 1 && ola.m) {
            b();
        }
        if (ola.m && this.e.compareAndSet(false, true)) {
            this.f3049c.Rb();
        }
    }
}
