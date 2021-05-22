package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eD  reason: case insensitive filesystem */
public final class C1169eD implements Sea<C1238fD> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<AbstractC1564jo> f4180a;

    private C1169eD(_ea<AbstractC1564jo> _ea) {
        this.f4180a = _ea;
    }

    public static C1169eD a(_ea<AbstractC1564jo> _ea) {
        return new C1169eD(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1238fD(this.f4180a.get());
    }
}
