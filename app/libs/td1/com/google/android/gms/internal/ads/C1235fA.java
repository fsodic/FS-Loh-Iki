package com.google.android.gms.internal.ads;

import a.c.g;

/* renamed from: com.google.android.gms.internal.ads.fA  reason: case insensitive filesystem */
public final class C1235fA {

    /* renamed from: a  reason: collision with root package name */
    AbstractC2503xb f4267a;

    /* renamed from: b  reason: collision with root package name */
    AbstractC2434wb f4268b;

    /* renamed from: c  reason: collision with root package name */
    AbstractC0501Mb f4269c;
    AbstractC0475Lb d;
    AbstractC2438wd e;
    final g<String, AbstractC0293Eb> f = new g<>();
    final g<String, AbstractC0241Cb> g = new g<>();

    public final C1098dA a() {
        return new C1098dA(this);
    }

    public final C1235fA a(AbstractC0475Lb lb) {
        this.d = lb;
        return this;
    }

    public final C1235fA a(AbstractC0501Mb mb) {
        this.f4269c = mb;
        return this;
    }

    public final C1235fA a(AbstractC2434wb wbVar) {
        this.f4268b = wbVar;
        return this;
    }

    public final C1235fA a(AbstractC2438wd wdVar) {
        this.e = wdVar;
        return this;
    }

    public final C1235fA a(AbstractC2503xb xbVar) {
        this.f4267a = xbVar;
        return this;
    }

    public final C1235fA a(String str, AbstractC0293Eb eb, AbstractC0241Cb cb) {
        this.f.put(str, eb);
        this.g.put(str, cb);
        return this;
    }
}
