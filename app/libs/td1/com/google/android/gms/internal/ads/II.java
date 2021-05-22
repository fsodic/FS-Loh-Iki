package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.C2537xu;

public final class II extends JI<AbstractC0951as> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0229Bp f2207a;

    /* renamed from: b  reason: collision with root package name */
    private final C2537xu.a f2208b;

    /* renamed from: c  reason: collision with root package name */
    private final TJ f2209c;
    private final C1162dx d;
    private final C1302fz e;
    private final C0729Uv f;
    private final ViewGroup g;

    public II(AbstractC0229Bp bp, C2537xu.a aVar, TJ tj, C1162dx dxVar, C1302fz fzVar, C0729Uv uv, ViewGroup viewGroup) {
        this.f2207a = bp;
        this.f2208b = aVar;
        this.f2209c = tj;
        this.d = dxVar;
        this.e = fzVar;
        this.f = uv;
        this.g = viewGroup;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.JI
    public final SW<AbstractC0951as> a(GR gr, Bundle bundle) {
        AbstractC0206As h = this.f2207a.h();
        C2537xu.a aVar = this.f2208b;
        aVar.a(gr);
        aVar.a(bundle);
        h.a(aVar.a());
        h.e(this.d);
        h.a(this.f2209c);
        h.a(this.e);
        h.a(new C0700Ts(this.f));
        h.b(new C0881_r(this.g));
        return h.e().a().b();
    }
}
