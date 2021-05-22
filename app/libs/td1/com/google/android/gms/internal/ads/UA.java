package com.google.android.gms.internal.ads;

public final class UA implements Sea<AbstractC0891aA> {

    /* renamed from: a  reason: collision with root package name */
    private final VA f3222a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<TA> f3223b;

    public UA(VA va, _ea<TA> _ea) {
        this.f3222a = va;
        this.f3223b = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        TA ta = this.f3223b.get();
        Xea.a(ta, "Cannot return null from a non-@Nullable @Provides method");
        return ta;
    }
}
