package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;

/* renamed from: com.google.android.gms.internal.ads.yx  reason: case insensitive filesystem */
public final class C2609yx implements Sea<OI> {

    /* renamed from: a  reason: collision with root package name */
    private final C1162dx f6150a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<d> f6151b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<QI> f6152c;

    private C2609yx(C1162dx dxVar, _ea<d> _ea, _ea<QI> _ea2) {
        this.f6150a = dxVar;
        this.f6151b = _ea;
        this.f6152c = _ea2;
    }

    public static C2609yx a(C1162dx dxVar, _ea<d> _ea, _ea<QI> _ea2) {
        return new C2609yx(dxVar, _ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        OI a2 = this.f6150a.a(this.f6151b.get(), this.f6152c.get());
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
