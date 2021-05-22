package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tt  reason: case insensitive filesystem */
public final class C2260tt implements Sea<C2329ut> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1780mv> f5671a;

    private C2260tt(_ea<C1780mv> _ea) {
        this.f5671a = _ea;
    }

    public static C2260tt a(_ea<C1780mv> _ea) {
        return new C2260tt(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C2329ut(this.f5671a.get());
    }
}
