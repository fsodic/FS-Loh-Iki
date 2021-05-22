package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.sq  reason: case insensitive filesystem */
final class C2188sq implements AbstractC1390hR {

    /* renamed from: a  reason: collision with root package name */
    private _ea<Context> f5555a;

    /* renamed from: b  reason: collision with root package name */
    private _ea<AbstractC1940pQ<CC, C2615zC>> f5556b;

    /* renamed from: c  reason: collision with root package name */
    private _ea<C2560yQ> f5557c;
    private _ea<AR> d;
    private _ea<VQ> e;
    private _ea<BinderC1527jR> f;
    private _ea<String> g;
    private _ea<BinderC1046cR> h;
    private final /* synthetic */ C0749Vp i;

    private C2188sq(C0749Vp vp, Context context, String str) {
        this.i = vp;
        this.f5555a = Qea.a(context);
        this.f5556b = new C2422wQ(this.f5555a, this.i.aa, this.i.ba);
        this.f5557c = Oea.a(new TQ(this.i.aa));
        this.d = Oea.a(DR.a());
        this.e = Oea.a(new _Q(this.f5555a, this.i.d, this.i.y, this.f5556b, this.f5557c, HR.a(), this.d));
        this.f = Oea.a(new C1596kR(this.e, this.f5557c, this.d));
        this.g = Qea.b(str);
        this.h = Oea.a(new C1115dR(this.g, this.e, this.f5555a, this.f5557c, this.d));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1390hR
    public final BinderC1046cR a() {
        return this.h.get();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1390hR
    public final BinderC1527jR b() {
        return this.f.get();
    }
}
