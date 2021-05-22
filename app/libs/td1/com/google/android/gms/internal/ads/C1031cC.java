package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.cC  reason: case insensitive filesystem */
public final class C1031cC implements Sea<BinderC0893aC> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f3965a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0707Tz> f3966b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C1924pA> f3967c;
    private final _ea<C0525Mz> d;

    private C1031cC(_ea<Context> _ea, _ea<C0707Tz> _ea2, _ea<C1924pA> _ea3, _ea<C0525Mz> _ea4) {
        this.f3965a = _ea;
        this.f3966b = _ea2;
        this.f3967c = _ea3;
        this.d = _ea4;
    }

    public static C1031cC a(_ea<Context> _ea, _ea<C0707Tz> _ea2, _ea<C1924pA> _ea3, _ea<C0525Mz> _ea4) {
        return new C1031cC(_ea, _ea2, _ea3, _ea4);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new BinderC0893aC(this.f3965a.get(), this.f3966b.get(), this.f3967c.get(), this.d.get());
    }
}
