package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.yr  reason: case insensitive filesystem */
public final class C2603yr implements Sea<C1490ila> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1941pR> f6139a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0823Yl> f6140b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<JSONObject> f6141c;
    private final _ea<String> d;

    private C2603yr(_ea<C1941pR> _ea, _ea<C0823Yl> _ea2, _ea<JSONObject> _ea3, _ea<String> _ea4) {
        this.f6139a = _ea;
        this.f6140b = _ea2;
        this.f6141c = _ea3;
        this.d = _ea4;
    }

    public static C2603yr a(_ea<C1941pR> _ea, _ea<C0823Yl> _ea2, _ea<JSONObject> _ea3, _ea<String> _ea4) {
        return new C2603yr(_ea, _ea2, _ea3, _ea4);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        this.f6139a.get();
        C0823Yl yl = this.f6140b.get();
        JSONObject jSONObject = this.f6141c.get();
        String str = this.d.get();
        boolean equals = "native".equals(str);
        q.c();
        C1490ila ila = new C1490ila(C2452wk.a(), yl, str, jSONObject, false, equals);
        Xea.a(ila, "Cannot return null from a non-@Nullable @Provides method");
        return ila;
    }
}
