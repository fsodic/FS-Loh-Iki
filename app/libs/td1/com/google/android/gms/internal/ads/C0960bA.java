package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bA  reason: case insensitive filesystem */
public final class C0960bA implements Sea<C0889_z> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1941pR> f3862a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<JSONObject> f3863b;

    public C0960bA(_ea<C1941pR> _ea, _ea<JSONObject> _ea2) {
        this.f3862a = _ea;
        this.f3863b = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0889_z(this.f3862a.get(), this.f3863b.get());
    }
}
