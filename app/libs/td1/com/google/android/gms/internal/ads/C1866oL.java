package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Oma;

/* renamed from: com.google.android.gms.internal.ads.oL  reason: case insensitive filesystem */
public final class C1866oL implements Sea<Oma.a> {

    /* renamed from: a  reason: collision with root package name */
    private final C1590kL f5113a;

    public C1866oL(C1590kL kLVar) {
        this.f5113a = kLVar;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Oma.a c2 = this.f5113a.c();
        Xea.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }
}
