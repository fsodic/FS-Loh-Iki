package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.C2537xu;

public final class MI extends JI<C2615zC> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0229Bp f2571a;

    /* renamed from: b  reason: collision with root package name */
    private final C2537xu.a f2572b;

    /* renamed from: c  reason: collision with root package name */
    private final C1162dx f2573c;

    public MI(AbstractC0229Bp bp, C2537xu.a aVar, C1162dx dxVar) {
        this.f2571a = bp;
        this.f2572b = aVar;
        this.f2573c = dxVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.JI
    public final SW<C2615zC> a(GR gr, Bundle bundle) {
        FC m = this.f2571a.m();
        C2537xu.a aVar = this.f2572b;
        aVar.a(gr);
        aVar.a(bundle);
        m.d(aVar.a());
        m.c(this.f2573c);
        return m.d().a().b();
    }
}
