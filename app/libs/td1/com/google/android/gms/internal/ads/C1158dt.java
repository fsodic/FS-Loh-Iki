package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dt  reason: case insensitive filesystem */
public final class C1158dt<AdT> implements Sea<C1227et<AdT>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Map<String, AbstractC1793nH<AdT>>> f4157a;

    private C1158dt(_ea<Map<String, AbstractC1793nH<AdT>>> _ea) {
        this.f4157a = _ea;
    }

    public static <AdT> C1158dt<AdT> a(_ea<Map<String, AbstractC1793nH<AdT>>> _ea) {
        return new C1158dt<>(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1227et(this.f4157a.get());
    }
}
