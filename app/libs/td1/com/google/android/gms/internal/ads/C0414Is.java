package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Is  reason: case insensitive filesystem */
public final class C0414Is implements Sea<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<GR> f2285a;

    public C0414Is(_ea<GR> _ea) {
        this.f2285a = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((Boolean) C2392voa.e().a(this.f2285a.get().a() != null ? C2474x.Ka : C2474x.yd)).booleanValue());
    }
}
