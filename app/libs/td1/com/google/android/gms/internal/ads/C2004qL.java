package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.qL  reason: case insensitive filesystem */
public final class C2004qL implements Sea<Set<String>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1590kL f5307a;

    public C2004qL(C1590kL kLVar) {
        this.f5307a = kLVar;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set<String> a2 = this.f5307a.a();
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
