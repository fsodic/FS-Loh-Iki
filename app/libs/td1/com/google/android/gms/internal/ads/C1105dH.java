package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dH  reason: case insensitive filesystem */
public final class C1105dH implements Sea<C0898aH> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<_G> f4061a;

    private C1105dH(_ea<_G> _ea) {
        this.f4061a = _ea;
    }

    public static C1105dH a(_ea<_G> _ea) {
        return new C1105dH(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0898aH(this.f4061a.get());
    }
}
