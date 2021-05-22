package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import com.google.android.gms.internal.ads.Vma;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.gna  reason: case insensitive filesystem */
public final class C1357gna extends AbstractC2092rca<C1357gna, b> implements AbstractC1131dda {
    private static final C1357gna zzcdc;
    private static volatile AbstractC1750mda<C1357gna> zzel;
    private Cca<a> zzbyu = AbstractC2092rca.m();
    private int zzccx;
    private int zzccy;
    private long zzccz;
    private String zzcda = BuildConfig.FLAVOR;
    private long zzcdb;
    private int zzdw;
    private String zzdx = BuildConfig.FLAVOR;

    /* renamed from: com.google.android.gms.internal.ads.gna$a */
    public static final class a extends AbstractC2092rca<a, C0037a> implements AbstractC1131dda {
        private static final Aca<Integer, Vma.a> zzcdi = new Ina();
        private static final a zzcdq;
        private static volatile AbstractC1750mda<a> zzel;
        private long zzcdd;
        private int zzcde;
        private long zzcdf;
        private long zzcdg;
        private AbstractC2506xca zzcdh = AbstractC2092rca.k();
        private C1219ena zzcdj;
        private int zzcdk;
        private int zzcdl;
        private int zzcdm;
        private int zzcdn;
        private int zzcdo;
        private int zzcdp;
        private int zzdw;

        /* renamed from: com.google.android.gms.internal.ads.gna$a$a  reason: collision with other inner class name */
        public static final class C0037a extends AbstractC2092rca.b<a, C0037a> implements AbstractC1131dda {
            private C0037a() {
                super(a.zzcdq);
            }

            /* synthetic */ C0037a(Nma nma) {
                this();
            }

            public final C0037a a(int i) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((a) this.f5428b).b((a) i);
                return this;
            }

            public final C0037a a(long j) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((a) this.f5428b).a((a) j);
                return this;
            }

            public final C0037a a(Cna cna) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((a) this.f5428b).a((a) cna);
                return this;
            }

            public final C0037a a(C1219ena ena) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((a) this.f5428b).a((a) ena);
                return this;
            }

            public final C0037a a(c cVar) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((a) this.f5428b).a((a) cVar);
                return this;
            }

            public final C0037a a(Iterable<? extends Vma.a> iterable) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((a) this.f5428b).a((a) iterable);
                return this;
            }

            public final C0037a b(long j) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((a) this.f5428b).b((a) j);
                return this;
            }

            public final C0037a b(Cna cna) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((a) this.f5428b).b((a) cna);
                return this;
            }

            public final C0037a c(long j) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((a) this.f5428b).c((a) j);
                return this;
            }

            public final C0037a c(Cna cna) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((a) this.f5428b).c((a) cna);
                return this;
            }

            public final C0037a d(Cna cna) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((a) this.f5428b).d(cna);
                return this;
            }

            public final C0037a e(Cna cna) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((a) this.f5428b).e(cna);
                return this;
            }
        }

        static {
            a aVar = new a();
            zzcdq = aVar;
            AbstractC2092rca.a(a.class, aVar);
        }

        private a() {
        }

        public static a a(byte[] bArr) {
            return (a) AbstractC2092rca.a(zzcdq, bArr);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(long j) {
            this.zzdw |= 1;
            this.zzcdd = j;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(Cna cna) {
            this.zzcde = cna.a();
            this.zzdw |= 2;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(C1219ena ena) {
            ena.getClass();
            this.zzcdj = ena;
            this.zzdw |= 16;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(c cVar) {
            this.zzcdp = cVar.a();
            this.zzdw |= 1024;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(Iterable<? extends Vma.a> iterable) {
            if (!this.zzcdh.d()) {
                this.zzcdh = AbstractC2092rca.a(this.zzcdh);
            }
            for (Vma.a aVar : iterable) {
                this.zzcdh.d(aVar.a());
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(int i) {
            this.zzdw |= 256;
            this.zzcdn = i;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(long j) {
            this.zzdw |= 4;
            this.zzcdf = j;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(Cna cna) {
            this.zzcdk = cna.a();
            this.zzdw |= 32;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void c(long j) {
            this.zzdw |= 8;
            this.zzcdg = j;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void c(Cna cna) {
            this.zzcdl = cna.a();
            this.zzdw |= 64;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void d(Cna cna) {
            this.zzcdm = cna.a();
            this.zzdw |= 128;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void e(Cna cna) {
            this.zzcdo = cna.a();
            this.zzdw |= 512;
        }

        public static C0037a p() {
            return (C0037a) zzcdq.i();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.AbstractC2092rca
        public final Object a(int i, Object obj, Object obj2) {
            switch (Nma.f2699a[i - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0037a(null);
                case 3:
                    return AbstractC2092rca.a(zzcdq, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n", new Object[]{"zzdw", "zzcdd", "zzcde", Cna.b(), "zzcdf", "zzcdg", "zzcdh", Vma.a.b(), "zzcdj", "zzcdk", Cna.b(), "zzcdl", Cna.b(), "zzcdm", Cna.b(), "zzcdn", "zzcdo", Cna.b(), "zzcdp", c.b()});
                case 4:
                    return zzcdq;
                case 5:
                    AbstractC1750mda<a> mda = zzel;
                    if (mda == null) {
                        synchronized (a.class) {
                            mda = zzel;
                            if (mda == null) {
                                mda = new AbstractC2092rca.a<>(zzcdq);
                                zzel = mda;
                            }
                        }
                    }
                    return mda;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final long n() {
            return this.zzcdd;
        }

        public final Cna o() {
            Cna a2 = Cna.a(this.zzcde);
            return a2 == null ? Cna.ENUM_FALSE : a2;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.gna$b */
    public static final class b extends AbstractC2092rca.b<C1357gna, b> implements AbstractC1131dda {
        private b() {
            super(C1357gna.zzcdc);
        }

        /* synthetic */ b(Nma nma) {
            this();
        }

        public final b a(int i) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1357gna) this.f5428b).b((C1357gna) i);
            return this;
        }

        public final b a(long j) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1357gna) this.f5428b).a((C1357gna) j);
            return this;
        }

        public final b a(Iterable<? extends a> iterable) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1357gna) this.f5428b).a((C1357gna) iterable);
            return this;
        }

        public final b a(String str) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1357gna) this.f5428b).b((C1357gna) str);
            return this;
        }

        public final b b(int i) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1357gna) this.f5428b).c(i);
            return this;
        }

        public final b b(long j) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1357gna) this.f5428b).b((C1357gna) j);
            return this;
        }

        public final b b(String str) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1357gna) this.f5428b).a((C1357gna) str);
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.gna$c */
    public enum c implements AbstractC2437wca {
        UNSPECIFIED(0),
        CONNECTING(1),
        CONNECTED(2),
        DISCONNECTING(3),
        DISCONNECTED(4),
        SUSPENDED(5);
        
        private static final AbstractC2368vca<c> g = new Jna();
        private final int i;

        private c(int i2) {
            this.i = i2;
        }

        public static c a(int i2) {
            if (i2 == 0) {
                return UNSPECIFIED;
            }
            if (i2 == 1) {
                return CONNECTING;
            }
            if (i2 == 2) {
                return CONNECTED;
            }
            if (i2 == 3) {
                return DISCONNECTING;
            }
            if (i2 == 4) {
                return DISCONNECTED;
            }
            if (i2 != 5) {
                return null;
            }
            return SUSPENDED;
        }

        public static AbstractC2575yca b() {
            return Kna.f2435a;
        }

        public final int a() {
            return this.i;
        }

        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.i + " name=" + name() + '>';
        }
    }

    static {
        C1357gna gna = new C1357gna();
        zzcdc = gna;
        AbstractC2092rca.a(C1357gna.class, gna);
    }

    private C1357gna() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(long j) {
        this.zzdw |= 4;
        this.zzccz = j;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Iterable<? extends a> iterable) {
        if (!this.zzbyu.d()) {
            this.zzbyu = AbstractC2092rca.a(this.zzbyu);
        }
        AbstractC2642zba.a(iterable, this.zzbyu);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        str.getClass();
        this.zzdw |= 16;
        this.zzcda = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzdw |= 1;
        this.zzccx = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(long j) {
        this.zzdw |= 32;
        this.zzcdb = j;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(String str) {
        str.getClass();
        this.zzdw |= 8;
        this.zzdx = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void c(int i) {
        this.zzdw |= 2;
        this.zzccy = i;
    }

    public static b n() {
        return (b) zzcdc.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new C1357gna();
            case 2:
                return new b(null);
            case 3:
                return AbstractC2092rca.a(zzcdc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"zzdw", "zzbyu", a.class, "zzccx", "zzccy", "zzccz", "zzdx", "zzcda", "zzcdb"});
            case 4:
                return zzcdc;
            case 5:
                AbstractC1750mda<C1357gna> mda = zzel;
                if (mda == null) {
                    synchronized (C1357gna.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcdc);
                            zzel = mda;
                        }
                    }
                }
                return mda;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
