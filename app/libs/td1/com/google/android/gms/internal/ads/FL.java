package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class FL implements AbstractC1180eO<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final SW<String> f1947a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f1948b;

    public FL(SW<String> sw, Executor executor) {
        this.f1947a = sw;
        this.f1948b = executor;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<Object> a() {
        return JW.a(this.f1947a, EL.f1855a, this.f1948b);
    }
}
