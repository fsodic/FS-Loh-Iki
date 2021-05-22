package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Rz  reason: case insensitive filesystem */
public final class C0655Rz implements Sea<C0681Sz> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<BinderC0473Kz> f3055a;

    private C0655Rz(_ea<BinderC0473Kz> _ea) {
        this.f3055a = _ea;
    }

    public static C0655Rz a(_ea<BinderC0473Kz> _ea) {
        return new C0655Rz(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0681Sz(this.f3055a.get());
    }
}
