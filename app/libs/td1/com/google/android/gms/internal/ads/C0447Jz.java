package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jz  reason: case insensitive filesystem */
public final class C0447Jz implements Sea<BinderC0473Kz> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0707Tz> f2371a;

    private C0447Jz(_ea<C0707Tz> _ea) {
        this.f2371a = _ea;
    }

    public static C0447Jz a(_ea<C0707Tz> _ea) {
        return new C0447Jz(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new BinderC0473Kz(this.f2371a.get());
    }
}
