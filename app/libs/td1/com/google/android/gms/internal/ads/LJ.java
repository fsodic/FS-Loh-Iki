package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.e;
import java.util.concurrent.atomic.AtomicBoolean;

public final class LJ implements e {

    /* renamed from: a  reason: collision with root package name */
    private final C0494Lu f2474a;

    /* renamed from: b  reason: collision with root package name */
    private final C1160dv f2475b;

    /* renamed from: c  reason: collision with root package name */
    private final C0627Qx f2476c;
    private final C0601Px d;
    private final C2120rr e;
    private AtomicBoolean f = new AtomicBoolean(false);

    LJ(C0494Lu lu, C1160dv dvVar, C0627Qx qx, C0601Px px, C2120rr rrVar) {
        this.f2474a = lu;
        this.f2475b = dvVar;
        this.f2476c = qx;
        this.d = px;
        this.e = rrVar;
    }

    @Override // com.google.android.gms.ads.internal.e
    public final void a() {
        if (this.f.get()) {
            this.f2474a.e();
        }
    }

    @Override // com.google.android.gms.ads.internal.e
    public final synchronized void a(View view) {
        if (this.f.compareAndSet(false, true)) {
            this.e.b();
            this.d.a(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.e
    public final void b() {
        if (this.f.get()) {
            this.f2475b.b();
            this.f2476c.Q();
        }
    }
}
