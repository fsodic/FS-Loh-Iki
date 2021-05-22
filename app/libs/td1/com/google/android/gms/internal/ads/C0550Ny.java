package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ny  reason: case insensitive filesystem */
public final class C0550Ny implements Sea<C0472Ky> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0469Kv> f2713a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0419Ix> f2714b;

    private C0550Ny(_ea<C0469Kv> _ea, _ea<C0419Ix> _ea2) {
        this.f2713a = _ea;
        this.f2714b = _ea2;
    }

    public static C0550Ny a(_ea<C0469Kv> _ea, _ea<C0419Ix> _ea2) {
        return new C0550Ny(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0472Ky(this.f2713a.get(), this.f2714b.get());
    }
}
