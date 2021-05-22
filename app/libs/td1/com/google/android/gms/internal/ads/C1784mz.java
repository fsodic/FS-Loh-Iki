package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.mz  reason: case insensitive filesystem */
public final class C1784mz implements Sea<Set<String>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1098dA> f5015a;

    public C1784mz(_ea<C1098dA> _ea) {
        this.f5015a = _ea;
    }

    public static Set<String> a(C1098dA dAVar) {
        Set<String> singleton = dAVar.d() != null ? Collections.singleton("banner") : Collections.emptySet();
        Xea.a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f5015a.get());
    }
}
