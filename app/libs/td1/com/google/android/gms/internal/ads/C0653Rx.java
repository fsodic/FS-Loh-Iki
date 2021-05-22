package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Rx  reason: case insensitive filesystem */
public final class C0653Rx implements Sea<C0601Px> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f3052a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Set<C0523Mx<AbstractC1835nla>>> f3053b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C1941pR> f3054c;

    private C0653Rx(_ea<Context> _ea, _ea<Set<C0523Mx<AbstractC1835nla>>> _ea2, _ea<C1941pR> _ea3) {
        this.f3052a = _ea;
        this.f3053b = _ea2;
        this.f3054c = _ea3;
    }

    public static C0653Rx a(_ea<Context> _ea, _ea<Set<C0523Mx<AbstractC1835nla>>> _ea2, _ea<C1941pR> _ea3) {
        return new C0653Rx(_ea, _ea2, _ea3);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0601Px(this.f3052a.get(), this.f3053b.get(), this.f3054c.get());
    }
}
