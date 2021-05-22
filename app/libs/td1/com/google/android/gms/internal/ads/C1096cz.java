package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cz  reason: case insensitive filesystem */
public final class C1096cz implements Sea<C0888_y> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1367gv> f4042a;

    private C1096cz(_ea<C1367gv> _ea) {
        this.f4042a = _ea;
    }

    public static C1096cz a(_ea<C1367gv> _ea) {
        return new C1096cz(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0888_y(this.f4042a.get());
    }
}
