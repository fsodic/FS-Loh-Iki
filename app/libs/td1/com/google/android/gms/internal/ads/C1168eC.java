package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eC  reason: case insensitive filesystem */
public final class C1168eC implements Sea<BinderC0962bC> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<String> f4177a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0525Mz> f4178b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C0707Tz> f4179c;

    private C1168eC(_ea<String> _ea, _ea<C0525Mz> _ea2, _ea<C0707Tz> _ea3) {
        this.f4177a = _ea;
        this.f4178b = _ea2;
        this.f4179c = _ea3;
    }

    public static C1168eC a(_ea<String> _ea, _ea<C0525Mz> _ea2, _ea<C0707Tz> _ea3) {
        return new C1168eC(_ea, _ea2, _ea3);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new BinderC0962bC(this.f4177a.get(), this.f4178b.get(), this.f4179c.get());
    }
}
