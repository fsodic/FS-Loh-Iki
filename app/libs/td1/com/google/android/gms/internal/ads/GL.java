package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class GL implements Sea<FL> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<SW<String>> f2027a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f2028b;

    private GL(_ea<SW<String>> _ea, _ea<Executor> _ea2) {
        this.f2027a = _ea;
        this.f2028b = _ea2;
    }

    public static GL a(_ea<SW<String>> _ea, _ea<Executor> _ea2) {
        return new GL(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new FL(this.f2027a.get(), this.f2028b.get());
    }
}
