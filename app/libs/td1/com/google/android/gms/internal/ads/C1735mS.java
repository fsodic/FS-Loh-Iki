package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.mS  reason: case insensitive filesystem */
public final class C1735mS implements Sea<Context> {

    /* renamed from: a  reason: collision with root package name */
    private final C1391hS f4948a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1184eS> f4949b;

    private C1735mS(C1391hS hSVar, _ea<C1184eS> _ea) {
        this.f4948a = hSVar;
        this.f4949b = _ea;
    }

    public static Context a(C1391hS hSVar, C1184eS eSVar) {
        Context context = eSVar.f4211a;
        Xea.a(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }

    public static C1735mS a(C1391hS hSVar, _ea<C1184eS> _ea) {
        return new C1735mS(hSVar, _ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f4948a, this.f4949b.get());
    }
}
