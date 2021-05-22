package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.pN  reason: case insensitive filesystem */
public final class C1937pN implements Sea<C1799nN> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<VW> f5223a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f5224b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Set<String>> f5225c;

    private C1937pN(_ea<VW> _ea, _ea<Context> _ea2, _ea<Set<String>> _ea3) {
        this.f5223a = _ea;
        this.f5224b = _ea2;
        this.f5225c = _ea3;
    }

    public static C1937pN a(_ea<VW> _ea, _ea<Context> _ea2, _ea<Set<String>> _ea3) {
        return new C1937pN(_ea, _ea2, _ea3);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1799nN(this.f5223a.get(), this.f5224b.get(), this.f5225c.get());
    }
}
