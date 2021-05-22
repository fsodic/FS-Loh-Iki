package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.mO  reason: case insensitive filesystem */
public final class C1731mO implements Sea<C1593kO> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<VW> f4942a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f4943b;

    public C1731mO(_ea<VW> _ea, _ea<Context> _ea2) {
        this.f4942a = _ea;
        this.f4943b = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1593kO(this.f4942a.get(), this.f4943b.get());
    }
}
