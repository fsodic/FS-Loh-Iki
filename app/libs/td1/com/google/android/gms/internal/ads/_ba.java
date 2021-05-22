package com.google.android.gms.internal.ads;

import java.util.List;

/* access modifiers changed from: package-private */
public final class _ba implements AbstractC2026qda {

    /* renamed from: a  reason: collision with root package name */
    private final Uba f3727a;

    /* renamed from: b  reason: collision with root package name */
    private int f3728b;

    /* renamed from: c  reason: collision with root package name */
    private int f3729c;
    private int d = 0;

    private _ba(Uba uba) {
        C2230tca.a((Object) uba, "input");
        this.f3727a = uba;
        this.f3727a.d = this;
    }

    public static _ba a(Uba uba) {
        _ba _ba = uba.d;
        return _ba != null ? _ba : new _ba(uba);
    }

    private final void a(int i) {
        if ((this.f3728b & 7) != i) {
            throw Bca.f();
        }
    }

    private final void a(List<String> list, boolean z) {
        int d2;
        int d3;
        if ((this.f3728b & 7) != 2) {
            throw Bca.f();
        } else if (!(list instanceof Mca) || z) {
            do {
                list.add(z ? a() : readString());
                if (!this.f3727a.s()) {
                    d2 = this.f3727a.d();
                } else {
                    return;
                }
            } while (d2 == this.f3728b);
            this.d = d2;
        } else {
            Mca mca = (Mca) list;
            do {
                mca.a(b());
                if (!this.f3727a.s()) {
                    d3 = this.f3727a.d();
                } else {
                    return;
                }
            } while (d3 == this.f3728b);
            this.d = d3;
        }
    }

    private static void b(int i) {
        if ((i & 7) != 0) {
            throw Bca.h();
        }
    }

    private final <T> T c(AbstractC2439wda<T> wda, C1197eca eca) {
        int m = this.f3727a.m();
        Uba uba = this.f3727a;
        if (uba.f3252a < uba.f3253b) {
            int c2 = uba.c(m);
            T a2 = wda.a();
            this.f3727a.f3252a++;
            wda.a(a2, this, eca);
            wda.c(a2);
            this.f3727a.a(0);
            Uba uba2 = this.f3727a;
            uba2.f3252a--;
            uba2.d(c2);
            return a2;
        }
        throw new Bca("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private static void c(int i) {
        if ((i & 3) != 0) {
            throw Bca.h();
        }
    }

    private final <T> T d(AbstractC2439wda<T> wda, C1197eca eca) {
        int i = this.f3729c;
        this.f3729c = ((this.f3728b >>> 3) << 3) | 4;
        try {
            T a2 = wda.a();
            wda.a(a2, this, eca);
            wda.c(a2);
            if (this.f3728b == this.f3729c) {
                return a2;
            }
            throw Bca.h();
        } finally {
            this.f3729c = i;
        }
    }

    private final void d(int i) {
        if (this.f3727a.t() != i) {
            throw Bca.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final <T> T a(AbstractC2439wda<T> wda, C1197eca eca) {
        a(2);
        return (T) c(wda, eca);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final String a() {
        a(2);
        return this.f3727a.k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final void a(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof C2299uca) {
            C2299uca uca = (C2299uca) list;
            int i = this.f3728b & 7;
            if (i == 0) {
                do {
                    uca.d(this.f3727a.q());
                    if (!this.f3727a.s()) {
                        d3 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f3728b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.f3727a.t() + this.f3727a.m();
                do {
                    uca.d(this.f3727a.q());
                } while (this.f3727a.t() < t);
                d(t);
            } else {
                throw Bca.f();
            }
        } else {
            int i2 = this.f3728b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f3727a.q()));
                    if (!this.f3727a.s()) {
                        d2 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f3728b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.f3727a.t() + this.f3727a.m();
                do {
                    list.add(Integer.valueOf(this.f3727a.q()));
                } while (this.f3727a.t() < t2);
                d(t2);
            } else {
                throw Bca.f();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final <T> void a(List<T> list, AbstractC2439wda<T> wda, C1197eca eca) {
        int d2;
        int i = this.f3728b;
        if ((i & 7) == 2) {
            do {
                list.add(c(wda, eca));
                if (!this.f3727a.s() && this.d == 0) {
                    d2 = this.f3727a.d();
                } else {
                    return;
                }
            } while (d2 == i);
            this.d = d2;
            return;
        }
        throw Bca.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final Iba b() {
        a(2);
        return this.f3727a.l();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final <T> T b(AbstractC2439wda<T> wda, C1197eca eca) {
        a(3);
        return (T) d(wda, eca);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final void b(List<Long> list) {
        int d2;
        int d3;
        if (list instanceof Pca) {
            Pca pca = (Pca) list;
            int i = this.f3728b & 7;
            if (i == 1) {
                do {
                    pca.a(this.f3727a.h());
                    if (!this.f3727a.s()) {
                        d3 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f3728b);
                this.d = d3;
            } else if (i == 2) {
                int m = this.f3727a.m();
                b(m);
                int t = this.f3727a.t() + m;
                do {
                    pca.a(this.f3727a.h());
                } while (this.f3727a.t() < t);
            } else {
                throw Bca.f();
            }
        } else {
            int i2 = this.f3728b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f3727a.h()));
                    if (!this.f3727a.s()) {
                        d2 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f3728b);
                this.d = d2;
            } else if (i2 == 2) {
                int m2 = this.f3727a.m();
                b(m2);
                int t2 = this.f3727a.t() + m2;
                do {
                    list.add(Long.valueOf(this.f3727a.h()));
                } while (this.f3727a.t() < t2);
            } else {
                throw Bca.f();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final <T> void b(List<T> list, AbstractC2439wda<T> wda, C1197eca eca) {
        int d2;
        int i = this.f3728b;
        if ((i & 7) == 3) {
            do {
                list.add(d(wda, eca));
                if (!this.f3727a.s() && this.d == 0) {
                    d2 = this.f3727a.d();
                } else {
                    return;
                }
            } while (d2 == i);
            this.d = d2;
            return;
        }
        throw Bca.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final long c() {
        a(0);
        return this.f3727a.e();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final void c(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof C2299uca) {
            C2299uca uca = (C2299uca) list;
            int i = this.f3728b & 7;
            if (i == 0) {
                do {
                    uca.d(this.f3727a.g());
                    if (!this.f3727a.s()) {
                        d3 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f3728b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.f3727a.t() + this.f3727a.m();
                do {
                    uca.d(this.f3727a.g());
                } while (this.f3727a.t() < t);
                d(t);
            } else {
                throw Bca.f();
            }
        } else {
            int i2 = this.f3728b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f3727a.g()));
                    if (!this.f3727a.s()) {
                        d2 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f3728b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.f3727a.t() + this.f3727a.m();
                do {
                    list.add(Integer.valueOf(this.f3727a.g()));
                } while (this.f3727a.t() < t2);
                d(t2);
            } else {
                throw Bca.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final int d() {
        a(0);
        return this.f3727a.m();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final void d(List<Long> list) {
        int d2;
        int d3;
        if (list instanceof Pca) {
            Pca pca = (Pca) list;
            int i = this.f3728b & 7;
            if (i == 1) {
                do {
                    pca.a(this.f3727a.p());
                    if (!this.f3727a.s()) {
                        d3 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f3728b);
                this.d = d3;
            } else if (i == 2) {
                int m = this.f3727a.m();
                b(m);
                int t = this.f3727a.t() + m;
                do {
                    pca.a(this.f3727a.p());
                } while (this.f3727a.t() < t);
            } else {
                throw Bca.f();
            }
        } else {
            int i2 = this.f3728b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f3727a.p()));
                    if (!this.f3727a.s()) {
                        d2 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f3728b);
                this.d = d2;
            } else if (i2 == 2) {
                int m2 = this.f3727a.m();
                b(m2);
                int t2 = this.f3727a.t() + m2;
                do {
                    list.add(Long.valueOf(this.f3727a.p()));
                } while (this.f3727a.t() < t2);
            } else {
                throw Bca.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final long e() {
        a(0);
        return this.f3727a.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final void e(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof C2299uca) {
            C2299uca uca = (C2299uca) list;
            int i = this.f3728b & 7;
            if (i == 2) {
                int m = this.f3727a.m();
                c(m);
                int t = this.f3727a.t() + m;
                do {
                    uca.d(this.f3727a.o());
                } while (this.f3727a.t() < t);
            } else if (i == 5) {
                do {
                    uca.d(this.f3727a.o());
                    if (!this.f3727a.s()) {
                        d3 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f3728b);
                this.d = d3;
            } else {
                throw Bca.f();
            }
        } else {
            int i2 = this.f3728b & 7;
            if (i2 == 2) {
                int m2 = this.f3727a.m();
                c(m2);
                int t2 = this.f3727a.t() + m2;
                do {
                    list.add(Integer.valueOf(this.f3727a.o()));
                } while (this.f3727a.t() < t2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f3727a.o()));
                    if (!this.f3727a.s()) {
                        d2 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f3728b);
                this.d = d2;
            } else {
                throw Bca.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final long f() {
        a(0);
        return this.f3727a.r();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final void f(List<Boolean> list) {
        int d2;
        int d3;
        if (list instanceof Gba) {
            Gba gba = (Gba) list;
            int i = this.f3728b & 7;
            if (i == 0) {
                do {
                    gba.a(this.f3727a.j());
                    if (!this.f3727a.s()) {
                        d3 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f3728b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.f3727a.t() + this.f3727a.m();
                do {
                    gba.a(this.f3727a.j());
                } while (this.f3727a.t() < t);
                d(t);
            } else {
                throw Bca.f();
            }
        } else {
            int i2 = this.f3728b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f3727a.j()));
                    if (!this.f3727a.s()) {
                        d2 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f3728b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.f3727a.t() + this.f3727a.m();
                do {
                    list.add(Boolean.valueOf(this.f3727a.j()));
                } while (this.f3727a.t() < t2);
                d(t2);
            } else {
                throw Bca.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final int g() {
        a(0);
        return this.f3727a.n();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final void g(List<Long> list) {
        int d2;
        int d3;
        if (list instanceof Pca) {
            Pca pca = (Pca) list;
            int i = this.f3728b & 7;
            if (i == 0) {
                do {
                    pca.a(this.f3727a.r());
                    if (!this.f3727a.s()) {
                        d3 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f3728b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.f3727a.t() + this.f3727a.m();
                do {
                    pca.a(this.f3727a.r());
                } while (this.f3727a.t() < t);
                d(t);
            } else {
                throw Bca.f();
            }
        } else {
            int i2 = this.f3728b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f3727a.r()));
                    if (!this.f3727a.s()) {
                        d2 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f3728b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.f3727a.t() + this.f3727a.m();
                do {
                    list.add(Long.valueOf(this.f3727a.r()));
                } while (this.f3727a.t() < t2);
                d(t2);
            } else {
                throw Bca.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final int getTag() {
        return this.f3728b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final int h() {
        a(0);
        return this.f3727a.g();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final void h(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof C2299uca) {
            C2299uca uca = (C2299uca) list;
            int i = this.f3728b & 7;
            if (i == 2) {
                int m = this.f3727a.m();
                c(m);
                int t = this.f3727a.t() + m;
                do {
                    uca.d(this.f3727a.i());
                } while (this.f3727a.t() < t);
            } else if (i == 5) {
                do {
                    uca.d(this.f3727a.i());
                    if (!this.f3727a.s()) {
                        d3 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f3728b);
                this.d = d3;
            } else {
                throw Bca.f();
            }
        } else {
            int i2 = this.f3728b & 7;
            if (i2 == 2) {
                int m2 = this.f3727a.m();
                c(m2);
                int t2 = this.f3727a.t() + m2;
                do {
                    list.add(Integer.valueOf(this.f3727a.i()));
                } while (this.f3727a.t() < t2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f3727a.i()));
                    if (!this.f3727a.s()) {
                        d2 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f3728b);
                this.d = d2;
            } else {
                throw Bca.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final int i() {
        a(5);
        return this.f3727a.o();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final void i(List<Float> list) {
        int d2;
        int d3;
        if (list instanceof C2024qca) {
            C2024qca qca = (C2024qca) list;
            int i = this.f3728b & 7;
            if (i == 2) {
                int m = this.f3727a.m();
                c(m);
                int t = this.f3727a.t() + m;
                do {
                    qca.a(this.f3727a.b());
                } while (this.f3727a.t() < t);
            } else if (i == 5) {
                do {
                    qca.a(this.f3727a.b());
                    if (!this.f3727a.s()) {
                        d3 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f3728b);
                this.d = d3;
            } else {
                throw Bca.f();
            }
        } else {
            int i2 = this.f3728b & 7;
            if (i2 == 2) {
                int m2 = this.f3727a.m();
                c(m2);
                int t2 = this.f3727a.t() + m2;
                do {
                    list.add(Float.valueOf(this.f3727a.b()));
                } while (this.f3727a.t() < t2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f3727a.b()));
                    if (!this.f3727a.s()) {
                        d2 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f3728b);
                this.d = d2;
            } else {
                throw Bca.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final long j() {
        a(1);
        return this.f3727a.h();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final void j(List<Iba> list) {
        int d2;
        if ((this.f3728b & 7) == 2) {
            do {
                list.add(b());
                if (!this.f3727a.s()) {
                    d2 = this.f3727a.d();
                } else {
                    return;
                }
            } while (d2 == this.f3728b);
            this.d = d2;
            return;
        }
        throw Bca.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final int k() {
        int i = this.d;
        if (i != 0) {
            this.f3728b = i;
            this.d = 0;
        } else {
            this.f3728b = this.f3727a.d();
        }
        int i2 = this.f3728b;
        if (i2 == 0 || i2 == this.f3729c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final void k(List<Double> list) {
        int d2;
        int d3;
        if (list instanceof C1060cca) {
            C1060cca cca = (C1060cca) list;
            int i = this.f3728b & 7;
            if (i == 1) {
                do {
                    cca.a(this.f3727a.a());
                    if (!this.f3727a.s()) {
                        d3 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f3728b);
                this.d = d3;
            } else if (i == 2) {
                int m = this.f3727a.m();
                b(m);
                int t = this.f3727a.t() + m;
                do {
                    cca.a(this.f3727a.a());
                } while (this.f3727a.t() < t);
            } else {
                throw Bca.f();
            }
        } else {
            int i2 = this.f3728b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f3727a.a()));
                    if (!this.f3727a.s()) {
                        d2 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f3728b);
                this.d = d2;
            } else if (i2 == 2) {
                int m2 = this.f3727a.m();
                b(m2);
                int t2 = this.f3727a.t() + m2;
                do {
                    list.add(Double.valueOf(this.f3727a.a()));
                } while (this.f3727a.t() < t2);
            } else {
                throw Bca.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final long l() {
        a(1);
        return this.f3727a.p();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final void l(List<String> list) {
        a(list, true);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final int m() {
        a(5);
        return this.f3727a.i();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final void m(List<String> list) {
        a(list, false);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final int n() {
        a(0);
        return this.f3727a.q();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final void n(List<Long> list) {
        int d2;
        int d3;
        if (list instanceof Pca) {
            Pca pca = (Pca) list;
            int i = this.f3728b & 7;
            if (i == 0) {
                do {
                    pca.a(this.f3727a.f());
                    if (!this.f3727a.s()) {
                        d3 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f3728b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.f3727a.t() + this.f3727a.m();
                do {
                    pca.a(this.f3727a.f());
                } while (this.f3727a.t() < t);
                d(t);
            } else {
                throw Bca.f();
            }
        } else {
            int i2 = this.f3728b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f3727a.f()));
                    if (!this.f3727a.s()) {
                        d2 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f3728b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.f3727a.t() + this.f3727a.m();
                do {
                    list.add(Long.valueOf(this.f3727a.f()));
                } while (this.f3727a.t() < t2);
                d(t2);
            } else {
                throw Bca.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final void o(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof C2299uca) {
            C2299uca uca = (C2299uca) list;
            int i = this.f3728b & 7;
            if (i == 0) {
                do {
                    uca.d(this.f3727a.n());
                    if (!this.f3727a.s()) {
                        d3 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f3728b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.f3727a.t() + this.f3727a.m();
                do {
                    uca.d(this.f3727a.n());
                } while (this.f3727a.t() < t);
                d(t);
            } else {
                throw Bca.f();
            }
        } else {
            int i2 = this.f3728b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f3727a.n()));
                    if (!this.f3727a.s()) {
                        d2 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f3728b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.f3727a.t() + this.f3727a.m();
                do {
                    list.add(Integer.valueOf(this.f3727a.n()));
                } while (this.f3727a.t() < t2);
                d(t2);
            } else {
                throw Bca.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final boolean o() {
        int i;
        if (this.f3727a.s() || (i = this.f3728b) == this.f3729c) {
            return false;
        }
        return this.f3727a.b(i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final void p(List<Long> list) {
        int d2;
        int d3;
        if (list instanceof Pca) {
            Pca pca = (Pca) list;
            int i = this.f3728b & 7;
            if (i == 0) {
                do {
                    pca.a(this.f3727a.e());
                    if (!this.f3727a.s()) {
                        d3 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f3728b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.f3727a.t() + this.f3727a.m();
                do {
                    pca.a(this.f3727a.e());
                } while (this.f3727a.t() < t);
                d(t);
            } else {
                throw Bca.f();
            }
        } else {
            int i2 = this.f3728b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f3727a.e()));
                    if (!this.f3727a.s()) {
                        d2 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f3728b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.f3727a.t() + this.f3727a.m();
                do {
                    list.add(Long.valueOf(this.f3727a.e()));
                } while (this.f3727a.t() < t2);
                d(t2);
            } else {
                throw Bca.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final boolean p() {
        a(0);
        return this.f3727a.j();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final void q(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof C2299uca) {
            C2299uca uca = (C2299uca) list;
            int i = this.f3728b & 7;
            if (i == 0) {
                do {
                    uca.d(this.f3727a.m());
                    if (!this.f3727a.s()) {
                        d3 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f3728b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.f3727a.t() + this.f3727a.m();
                do {
                    uca.d(this.f3727a.m());
                } while (this.f3727a.t() < t);
                d(t);
            } else {
                throw Bca.f();
            }
        } else {
            int i2 = this.f3728b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f3727a.m()));
                    if (!this.f3727a.s()) {
                        d2 = this.f3727a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f3728b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.f3727a.t() + this.f3727a.m();
                do {
                    list.add(Integer.valueOf(this.f3727a.m()));
                } while (this.f3727a.t() < t2);
                d(t2);
            } else {
                throw Bca.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final double readDouble() {
        a(1);
        return this.f3727a.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final float readFloat() {
        a(5);
        return this.f3727a.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2026qda
    public final String readString() {
        a(2);
        return this.f3727a.c();
    }
}
