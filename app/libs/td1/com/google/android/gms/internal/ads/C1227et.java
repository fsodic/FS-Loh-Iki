package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.et  reason: case insensitive filesystem */
public final class C1227et<AdT> implements AbstractC1021bt<AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, AbstractC1793nH<AdT>> f4257a;

    C1227et(Map<String, AbstractC1793nH<AdT>> map) {
        this.f4257a = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1021bt
    public final AbstractC1793nH<AdT> a(int i, String str) {
        return this.f4257a.get(str);
    }
}
