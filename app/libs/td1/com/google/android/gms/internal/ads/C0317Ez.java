package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ez  reason: case insensitive filesystem */
public final class C0317Ez implements Sea<C1490ila> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0823Yl> f1924a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<String> f1925b;

    public C0317Ez(_ea<C0823Yl> _ea, _ea<String> _ea2) {
        this.f1924a = _ea;
        this.f1925b = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        q.c();
        C1490ila ila = new C1490ila(C2452wk.a(), this.f1924a.get(), this.f1925b.get(), new JSONObject(), false, true);
        Xea.a(ila, "Cannot return null from a non-@Nullable @Provides method");
        return ila;
    }
}
