package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Bu  reason: case insensitive filesystem */
public final class C0234Bu implements Sea<Context> {

    /* renamed from: a  reason: collision with root package name */
    private final C2537xu f1662a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f1663b;

    private C0234Bu(C2537xu xuVar, _ea<Context> _ea) {
        this.f1662a = xuVar;
        this.f1663b = _ea;
    }

    public static C0234Bu a(C2537xu xuVar, _ea<Context> _ea) {
        return new C0234Bu(xuVar, _ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Context a2 = this.f1662a.a(this.f1663b.get());
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
