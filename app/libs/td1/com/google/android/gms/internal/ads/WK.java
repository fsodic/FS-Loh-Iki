package com.google.android.gms.internal.ads;

import b.c.b.a.c.a;
import java.util.List;
import java.util.concurrent.Callable;

final /* synthetic */ class WK implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final XK f3404a;

    /* renamed from: b  reason: collision with root package name */
    private final List f3405b;

    /* renamed from: c  reason: collision with root package name */
    private final a f3406c;

    WK(XK xk, List list, a aVar) {
        this.f3404a = xk;
        this.f3405b = list;
        this.f3406c = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f3404a.a(this.f3405b, this.f3406c);
    }
}
