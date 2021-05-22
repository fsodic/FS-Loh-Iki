package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;

/* renamed from: com.google.android.gms.internal.ads.Kq  reason: case insensitive filesystem */
public final class C0464Kq implements Sea<C1186eU> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f2440a;

    public C0464Kq(_ea<Context> _ea) {
        this.f2440a = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C1186eU eUVar = new C1186eU(this.f2440a.get(), q.q().b());
        Xea.a(eUVar, "Cannot return null from a non-@Nullable @Provides method");
        return eUVar;
    }
}
