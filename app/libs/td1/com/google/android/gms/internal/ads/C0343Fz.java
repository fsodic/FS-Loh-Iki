package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.Fz  reason: case insensitive filesystem */
public final class C0343Fz implements Sea<C0601Px> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f2005a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1941pR> f2006b;

    public C0343Fz(_ea<Context> _ea, _ea<C1941pR> _ea2) {
        this.f2005a = _ea;
        this.f2006b = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0601Px px = new C0601Px(this.f2005a.get(), new HashSet(), this.f2006b.get());
        Xea.a(px, "Cannot return null from a non-@Nullable @Provides method");
        return px;
    }
}
