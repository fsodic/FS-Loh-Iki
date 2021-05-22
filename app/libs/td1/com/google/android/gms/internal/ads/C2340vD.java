package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.C1770mna;
import com.google.android.gms.internal.ads.Oma;

/* renamed from: com.google.android.gms.internal.ads.vD  reason: case insensitive filesystem */
public final class C2340vD implements Sea<Dma> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f5783a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<String> f5784b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C0823Yl> f5785c;
    private final _ea<Oma.a> d;
    private final _ea<String> e;

    private C2340vD(_ea<Context> _ea, _ea<String> _ea2, _ea<C0823Yl> _ea3, _ea<Oma.a> _ea4, _ea<String> _ea5) {
        this.f5783a = _ea;
        this.f5784b = _ea2;
        this.f5785c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
    }

    public static C2340vD a(_ea<Context> _ea, _ea<String> _ea2, _ea<C0823Yl> _ea3, _ea<Oma.a> _ea4, _ea<String> _ea5) {
        return new C2340vD(_ea, _ea2, _ea3, _ea4, _ea5);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        String str = this.f5784b.get();
        C0823Yl yl = this.f5785c.get();
        Oma.a aVar = this.d.get();
        String str2 = this.e.get();
        Dma dma = new Dma(new Hma(this.f5783a.get()));
        C1770mna.a n = C1770mna.n();
        n.a(yl.f3588b);
        n.b(yl.f3589c);
        n.c(yl.d ? 0 : 2);
        dma.a(new C2409wD(aVar, str, (C1770mna) n.j(), str2));
        Xea.a(dma, "Cannot return null from a non-@Nullable @Provides method");
        return dma;
    }
}
