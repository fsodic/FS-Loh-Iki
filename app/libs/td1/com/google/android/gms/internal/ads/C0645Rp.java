package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Rp  reason: case insensitive filesystem */
public final class C0645Rp implements Sea<AbstractC1483ii> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f3045a;

    public C0645Rp(_ea<Context> _ea) {
        this.f3045a = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Context context = this.f3045a.get();
        C1277fi fiVar = new C1277fi(context, new C1552ji(context).a());
        Xea.a(fiVar, "Cannot return null from a non-@Nullable @Provides method");
        return fiVar;
    }
}
