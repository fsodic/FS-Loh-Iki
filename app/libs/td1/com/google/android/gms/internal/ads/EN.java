package com.google.android.gms.internal.ads;

import android.content.Context;

public final class EN implements Sea<CN> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f1857a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<String> f1858b;

    private EN(_ea<Context> _ea, _ea<String> _ea2) {
        this.f1857a = _ea;
        this.f1858b = _ea2;
    }

    public static CN a(Context context, String str) {
        return new CN(context, str);
    }

    public static EN a(_ea<Context> _ea, _ea<String> _ea2) {
        return new EN(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f1857a.get(), this.f1858b.get());
    }
}
