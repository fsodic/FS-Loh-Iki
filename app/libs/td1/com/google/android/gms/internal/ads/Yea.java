package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;

public final class Yea<T> {

    /* renamed from: a  reason: collision with root package name */
    private final List<_ea<T>> f3575a;

    /* renamed from: b  reason: collision with root package name */
    private final List<_ea<Collection<T>>> f3576b;

    private Yea(int i, int i2) {
        this.f3575a = Mea.a(i);
        this.f3576b = Mea.a(i2);
    }

    public final Wea<T> a() {
        return new Wea<>(this.f3575a, this.f3576b);
    }

    public final Yea<T> a(_ea<? extends T> _ea) {
        this.f3575a.add(_ea);
        return this;
    }

    public final Yea<T> b(_ea<? extends Collection<? extends T>> _ea) {
        this.f3576b.add(_ea);
        return this;
    }
}
