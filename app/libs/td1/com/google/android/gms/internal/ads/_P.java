package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class _P<R> implements RS {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC2077rQ<R> f3715a;

    /* renamed from: b  reason: collision with root package name */
    public final C2284uQ f3716b;

    /* renamed from: c  reason: collision with root package name */
    public final Zna f3717c;
    public final String d;
    public final Executor e;
    public final C1496ioa f;
    private final BS g;

    public _P(AbstractC2077rQ<R> rQVar, C2284uQ uQVar, Zna zna, String str, Executor executor, C1496ioa ioa, BS bs) {
        this.f3715a = rQVar;
        this.f3716b = uQVar;
        this.f3717c = zna;
        this.d = str;
        this.e = executor;
        this.f = ioa;
        this.g = bs;
    }

    @Override // com.google.android.gms.internal.ads.RS
    public final Executor a() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.RS
    public final BS b() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.RS
    public final RS c() {
        return new _P(this.f3715a, this.f3716b, this.f3717c, this.d, this.e, this.f, this.g);
    }
}
