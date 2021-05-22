package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.iq  reason: case insensitive filesystem */
final class C1499iq implements KP {

    /* renamed from: a  reason: collision with root package name */
    private _ea<Context> f4612a;

    /* renamed from: b  reason: collision with root package name */
    private _ea<String> f4613b;

    /* renamed from: c  reason: collision with root package name */
    private _ea<AbstractC1940pQ<AbstractC0569Or, C0725Ur>> f4614c;
    private _ea<MP> d;
    private _ea<C2283uP> e;
    private _ea<EP> f;
    private final /* synthetic */ C0749Vp g;

    private C1499iq(C0749Vp vp, Context context, String str) {
        this.g = vp;
        this.f4612a = Qea.a(context);
        this.f4613b = Qea.a(str);
        this.f4614c = new C2215tQ(this.f4612a, this.g.aa, this.g.ba);
        this.d = Oea.a(new PP(this.g.aa));
        this.e = Oea.a(new AP(this.f4612a, this.g.d, this.g.y, this.f4614c, this.d, HR.a()));
        this.f = Oea.a(new HP(this.g.y, this.f4612a, this.f4613b, this.e, this.d, this.g.l));
    }

    @Override // com.google.android.gms.internal.ads.KP
    public final EP a() {
        return this.f.get();
    }
}
