package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Qv  reason: case insensitive filesystem */
public final class C0625Qv extends C0834Yw<AbstractC0651Rv> implements AbstractC1229ev, AbstractC0391Hv {

    /* renamed from: b  reason: collision with root package name */
    private final C1941pR f2980b;

    /* renamed from: c  reason: collision with root package name */
    private AtomicBoolean f2981c = new AtomicBoolean();

    public C0625Qv(Set<C0523Mx<AbstractC0651Rv>> set, C1941pR pRVar) {
        super(set);
        this.f2980b = pRVar;
    }

    private final void Q() {
        C1152doa doa;
        if (((Boolean) C2392voa.e().a(C2474x.Oe)).booleanValue() && this.f2981c.compareAndSet(false, true) && (doa = this.f2980b.X) != null && doa.f4146a == 3) {
            a(new C0599Pv(this));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0391Hv
    public final void Rb() {
        if (this.f2980b.f5230b == 1) {
            Q();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(AbstractC0651Rv rv) {
        rv.a(this.f2980b.X);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229ev
    public final void b() {
        int i = this.f2980b.f5230b;
        if (i == 2 || i == 5 || i == 4) {
            Q();
        }
    }
}
