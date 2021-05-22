package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.tF  reason: case insensitive filesystem */
public final class C2204tF implements Sea<PF> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f5587a;

    private C2204tF(_ea<Context> _ea) {
        this.f5587a = _ea;
    }

    public static PF a(Context context) {
        PF pf = new PF(context);
        Xea.a(pf, "Cannot return null from a non-@Nullable @Provides method");
        return pf;
    }

    public static C2204tF a(_ea<Context> _ea) {
        return new C2204tF(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f5587a.get());
    }
}
