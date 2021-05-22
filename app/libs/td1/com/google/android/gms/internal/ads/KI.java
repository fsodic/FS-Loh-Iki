package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.C2537xu;

public final class KI extends JI<C1990py> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0229Bp f2387a;

    /* renamed from: b  reason: collision with root package name */
    private final C2537xu.a f2388b;

    /* renamed from: c  reason: collision with root package name */
    private final TJ f2389c;
    private final C1162dx d;

    public KI(AbstractC0229Bp bp, C2537xu.a aVar, TJ tj, C1162dx dxVar) {
        this.f2387a = bp;
        this.f2388b = aVar;
        this.f2389c = tj;
        this.d = dxVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.JI
    public final SW<C1990py> a(GR gr, Bundle bundle) {
        AbstractC0602Py k = this.f2387a.k();
        C2537xu.a aVar = this.f2388b;
        aVar.a(gr);
        aVar.a(bundle);
        k.e(aVar.a());
        k.d(this.d);
        k.b(this.f2389c);
        return k.f().a().b();
    }
}
