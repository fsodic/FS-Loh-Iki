package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import com.google.android.gms.internal.ads.AbstractC0905aO;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.yM  reason: case insensitive filesystem */
public final class C2556yM<S extends AbstractC0905aO<?>> implements AbstractC1180eO<S> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<C2487xM<S>> f6071a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    private final d f6072b;

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC1180eO<S> f6073c;
    private final long d;

    public C2556yM(AbstractC1180eO<S> eOVar, long j, d dVar) {
        this.f6072b = dVar;
        this.f6073c = eOVar;
        this.d = j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<S> a() {
        C2487xM<S> xMVar = this.f6071a.get();
        if (xMVar == null || xMVar.a()) {
            xMVar = new C2487xM<>(this.f6073c.a(), this.d, this.f6072b);
            this.f6071a.set(xMVar);
        }
        return xMVar.f5973a;
    }
}
