package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.tT  reason: case insensitive filesystem */
public final class C2218tT<O> {

    /* renamed from: a  reason: collision with root package name */
    private final E f5613a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5614b;

    /* renamed from: c  reason: collision with root package name */
    private final SW<?> f5615c;
    private final List<SW<?>> d;
    private final SW<O> e;
    final /* synthetic */ AbstractC1805nT f;

    private C2218tT(AbstractC1805nT nTVar, E e2, String str, SW<?> sw, List<SW<?>> list, SW<O> sw2) {
        this.f = nTVar;
        this.f5613a = e2;
        this.f5614b = str;
        this.f5615c = sw;
        this.d = list;
        this.e = sw2;
    }

    private final <O2> C2218tT<O2> a(AbstractC2221tW<O, O2> tWVar, Executor executor) {
        return new C2218tT<>(this.f, this.f5613a, this.f5614b, this.f5615c, this.d, JW.a(this.e, tWVar, executor));
    }

    public final C1598kT<E, O> a() {
        E e2 = this.f5613a;
        String str = this.f5614b;
        if (str == null) {
            str = this.f.b((Object) e2);
        }
        C1598kT<E, O> kTVar = new C1598kT<>(e2, str, this.e);
        this.f.d.a(kTVar);
        this.f5615c.a(new RunnableC2494xT(this, kTVar), C0875_l.f);
        JW.a(kTVar, new C2425wT(this, kTVar), C0875_l.f);
        return kTVar;
    }

    public final C2218tT<O> a(long j, TimeUnit timeUnit) {
        AbstractC1805nT nTVar = this.f;
        return new C2218tT<>(nTVar, this.f5613a, this.f5614b, this.f5615c, this.d, JW.a(this.e, j, timeUnit, nTVar.f5046c));
    }

    public final <O2> C2218tT<O2> a(SW<O2> sw) {
        return a(new C2356vT(sw), C0875_l.f);
    }

    public final <O2> C2218tT<O2> a(AbstractC1461iT<O, O2> iTVar) {
        return a((AbstractC2221tW) new C2149sT(iTVar));
    }

    public final <O2> C2218tT<O2> a(AbstractC2221tW<O, O2> tWVar) {
        return a(tWVar, this.f.f5045b);
    }

    public final <T extends Throwable> C2218tT<O> a(Class<T> cls, AbstractC1461iT<T, O> iTVar) {
        return a(cls, new C2287uT(iTVar));
    }

    public final <T extends Throwable> C2218tT<O> a(Class<T> cls, AbstractC2221tW<T, O> tWVar) {
        AbstractC1805nT nTVar = this.f;
        return new C2218tT<>(nTVar, this.f5613a, this.f5614b, this.f5615c, this.d, JW.a(this.e, cls, tWVar, nTVar.f5045b));
    }

    public final C2218tT<O> a(E e2) {
        return this.f.a(e2, a());
    }

    public final C2218tT<O> a(String str) {
        return new C2218tT<>(this.f, this.f5613a, str, this.f5615c, this.d, this.e);
    }
}
