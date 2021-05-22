package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Iu  reason: case insensitive filesystem */
public final class C0416Iu implements Sea<AbstractC1761mj> {

    /* renamed from: a  reason: collision with root package name */
    private final C0442Ju f2286a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f2287b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C0823Yl> f2288c;
    private final _ea<C1941pR> d;
    private final _ea<AbstractC1899oj> e;

    private C0416Iu(C0442Ju ju, _ea<Context> _ea, _ea<C0823Yl> _ea2, _ea<C1941pR> _ea3, _ea<AbstractC1899oj> _ea4) {
        this.f2286a = ju;
        this.f2287b = _ea;
        this.f2288c = _ea2;
        this.d = _ea3;
        this.e = _ea4;
    }

    public static C0416Iu a(C0442Ju ju, _ea<Context> _ea, _ea<C0823Yl> _ea2, _ea<C1941pR> _ea3, _ea<AbstractC1899oj> _ea4) {
        return new C0416Iu(ju, _ea, _ea2, _ea3, _ea4);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Context context = this.f2287b.get();
        C0823Yl yl = this.f2288c.get();
        C1941pR pRVar = this.d.get();
        AbstractC1899oj ojVar = this.e.get();
        C1692lj ljVar = pRVar.x;
        if (ljVar != null) {
            return new C1142dj(context, yl, ljVar, pRVar.p.f5610b, ojVar);
        }
        return null;
    }
}
