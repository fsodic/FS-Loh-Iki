package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.pq  reason: case insensitive filesystem */
final class C1982pq implements AbstractC1321gR {

    /* renamed from: a  reason: collision with root package name */
    private Context f5279a;

    /* renamed from: b  reason: collision with root package name */
    private String f5280b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C0749Vp f5281c;

    private C1982pq(C0749Vp vp) {
        this.f5281c = vp;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1321gR
    public final /* synthetic */ AbstractC1321gR a(Context context) {
        Xea.a(context);
        this.f5279a = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1321gR
    public final /* synthetic */ AbstractC1321gR a(String str) {
        this.f5280b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1321gR
    public final AbstractC1390hR a() {
        Xea.a(this.f5279a, Context.class);
        return new C2188sq(this.f5281c, this.f5279a, this.f5280b);
    }
}
