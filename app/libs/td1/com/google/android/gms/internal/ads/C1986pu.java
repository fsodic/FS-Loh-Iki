package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pu  reason: case insensitive filesystem */
public final class C1986pu implements Sea<C0729Uv> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0729Uv> f5289a;

    private C1986pu(_ea<C0729Uv> _ea) {
        this.f5289a = _ea;
    }

    public static C1986pu a(_ea<C0729Uv> _ea) {
        return new C1986pu(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0729Uv uv = this.f5289a.get();
        Xea.a(uv, "Cannot return null from a non-@Nullable @Provides method");
        return uv;
    }
}
