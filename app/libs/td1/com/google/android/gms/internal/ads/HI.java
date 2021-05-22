package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.C2537xu;

public final class HI extends JI<C1365gt> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0229Bp f2113a;

    /* renamed from: b  reason: collision with root package name */
    private final C1302fz f2114b;

    /* renamed from: c  reason: collision with root package name */
    private final C2537xu.a f2115c;
    private final C1162dx d;

    public HI(AbstractC0229Bp bp, C1302fz fzVar, C2537xu.a aVar, C1162dx dxVar) {
        this.f2113a = bp;
        this.f2114b = fzVar;
        this.f2115c = aVar;
        this.d = dxVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.JI
    public final SW<C1365gt> a(GR gr, Bundle bundle) {
        AbstractC1853nz l = this.f2113a.l();
        C2537xu.a aVar = this.f2115c;
        aVar.a(gr);
        aVar.a(bundle);
        l.b(aVar.a());
        l.b(this.d);
        l.b(this.f2114b);
        return l.c().a().b();
    }
}
