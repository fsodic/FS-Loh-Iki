package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Gr  reason: case insensitive filesystem */
public final class C0361Gr implements Sea<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1941pR> f2082a;

    private C0361Gr(_ea<C1941pR> _ea) {
        this.f2082a = _ea;
    }

    public static C0361Gr a(_ea<C1941pR> _ea) {
        return new C0361Gr(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return C0387Hr.a(this.f2082a.get());
    }
}
