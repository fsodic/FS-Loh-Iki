package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.fq  reason: case insensitive filesystem */
final class C1293fq implements JP {

    /* renamed from: a  reason: collision with root package name */
    private Context f4344a;

    /* renamed from: b  reason: collision with root package name */
    private String f4345b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C0749Vp f4346c;

    private C1293fq(C0749Vp vp) {
        this.f4346c = vp;
    }

    @Override // com.google.android.gms.internal.ads.JP
    public final /* synthetic */ JP a(Context context) {
        Xea.a(context);
        this.f4344a = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.JP
    public final /* synthetic */ JP a(String str) {
        Xea.a(str);
        this.f4345b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.JP
    public final KP a() {
        Xea.a(this.f4344a, Context.class);
        Xea.a(this.f4345b, String.class);
        return new C1499iq(this.f4346c, this.f4344a, this.f4345b);
    }
}
