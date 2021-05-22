package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;

/* renamed from: com.google.android.gms.internal.ads.zM  reason: case insensitive filesystem */
public final class C2625zM implements Sea<C2556yM<C1387hO>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1593kO> f6172a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<d> f6173b;

    public C2625zM(_ea<C1593kO> _ea, _ea<d> _ea2) {
        this.f6172a = _ea;
        this.f6173b = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C2556yM yMVar = new C2556yM(this.f6172a.get(), C1468ia.f4573a.a().longValue(), this.f6173b.get());
        Xea.a(yMVar, "Cannot return null from a non-@Nullable @Provides method");
        return yMVar;
    }
}
