package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wC  reason: case insensitive filesystem */
public final class C2408wC implements Sea<C2477xC> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1780mv> f5865a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1941pR> f5866b;

    public C2408wC(_ea<C1780mv> _ea, _ea<C1941pR> _ea2) {
        this.f5865a = _ea;
        this.f5866b = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C2477xC(this.f5865a.get(), this.f5866b.get());
    }
}
