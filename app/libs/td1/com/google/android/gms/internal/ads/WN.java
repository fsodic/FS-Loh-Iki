package com.google.android.gms.internal.ads;

public final class WN implements Sea<UN> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C2353vQ> f3410a;

    private WN(_ea<C2353vQ> _ea) {
        this.f3410a = _ea;
    }

    public static UN a(C2353vQ vQVar) {
        return new UN(vQVar);
    }

    public static WN a(_ea<C2353vQ> _ea) {
        return new WN(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f3410a.get());
    }
}
