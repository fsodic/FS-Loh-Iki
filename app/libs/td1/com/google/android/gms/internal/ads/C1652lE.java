package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lE  reason: case insensitive filesystem */
public final class C1652lE implements Sea<C1721mE> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C2272uE> f4830a;

    private C1652lE(_ea<C2272uE> _ea) {
        this.f4830a = _ea;
    }

    public static C1652lE a(_ea<C2272uE> _ea) {
        return new C1652lE(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1721mE(this.f4830a.get());
    }
}
