package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vM  reason: case insensitive filesystem */
public final class C2349vM implements Sea<C2211tM> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<ZP> f5801a;

    private C2349vM(_ea<ZP> _ea) {
        this.f5801a = _ea;
    }

    public static C2211tM a(ZP zp) {
        return new C2211tM(zp);
    }

    public static C2349vM a(_ea<ZP> _ea) {
        return new C2349vM(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f5801a.get());
    }
}
