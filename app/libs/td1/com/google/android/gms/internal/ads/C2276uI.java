package com.google.android.gms.internal.ads;

import org.json.JSONArray;

/* renamed from: com.google.android.gms.internal.ads.uI  reason: case insensitive filesystem */
final /* synthetic */ class C2276uI implements AbstractC2221tW {

    /* renamed from: a  reason: collision with root package name */
    private final C2138sI f5699a;

    /* renamed from: b  reason: collision with root package name */
    private final BR f5700b;

    /* renamed from: c  reason: collision with root package name */
    private final C1941pR f5701c;

    C2276uI(C2138sI sIVar, BR br, C1941pR pRVar) {
        this.f5699a = sIVar;
        this.f5700b = br;
        this.f5701c = pRVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final SW b(Object obj) {
        return this.f5699a.a(this.f5700b, this.f5701c, (JSONArray) obj);
    }
}
