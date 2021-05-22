package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.c;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.bD  reason: case insensitive filesystem */
public final class C0963bD implements Sea<OC> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0494Lu> f3870a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1780mv> f3871b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C0209Av> f3872c;
    private final _ea<C0469Kv> d;
    private final _ea<C0522Mw> e;
    private final _ea<Executor> f;
    private final _ea<C0601Px> g;
    private final _ea<C2120rr> h;
    private final _ea<c> i;
    private final _ea<C1367gv> j;
    private final _ea<AbstractC1761mj> k;
    private final _ea<C1955pca> l;
    private final _ea<C0340Fw> m;

    private C0963bD(_ea<C0494Lu> _ea, _ea<C1780mv> _ea2, _ea<C0209Av> _ea3, _ea<C0469Kv> _ea4, _ea<C0522Mw> _ea5, _ea<Executor> _ea6, _ea<C0601Px> _ea7, _ea<C2120rr> _ea8, _ea<c> _ea9, _ea<C1367gv> _ea10, _ea<AbstractC1761mj> _ea11, _ea<C1955pca> _ea12, _ea<C0340Fw> _ea13) {
        this.f3870a = _ea;
        this.f3871b = _ea2;
        this.f3872c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
        this.f = _ea6;
        this.g = _ea7;
        this.h = _ea8;
        this.i = _ea9;
        this.j = _ea10;
        this.k = _ea11;
        this.l = _ea12;
        this.m = _ea13;
    }

    public static C0963bD a(_ea<C0494Lu> _ea, _ea<C1780mv> _ea2, _ea<C0209Av> _ea3, _ea<C0469Kv> _ea4, _ea<C0522Mw> _ea5, _ea<Executor> _ea6, _ea<C0601Px> _ea7, _ea<C2120rr> _ea8, _ea<c> _ea9, _ea<C1367gv> _ea10, _ea<AbstractC1761mj> _ea11, _ea<C1955pca> _ea12, _ea<C0340Fw> _ea13) {
        return new C0963bD(_ea, _ea2, _ea3, _ea4, _ea5, _ea6, _ea7, _ea8, _ea9, _ea10, _ea11, _ea12, _ea13);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new OC(this.f3870a.get(), this.f3871b.get(), this.f3872c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get());
    }
}
