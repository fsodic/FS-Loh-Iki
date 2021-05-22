package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2537xu;

/* renamed from: com.google.android.gms.internal.ads.Eu  reason: case insensitive filesystem */
public final class C0312Eu implements Sea<C2537xu.a> {

    /* renamed from: a  reason: collision with root package name */
    private final C2537xu f1919a;

    private C0312Eu(C2537xu xuVar) {
        this.f1919a = xuVar;
    }

    public static C0312Eu a(C2537xu xuVar) {
        return new C0312Eu(xuVar);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C2537xu.a a2 = this.f1919a.a();
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
