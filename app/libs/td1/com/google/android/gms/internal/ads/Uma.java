package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

public final class Uma extends AbstractC2092rca<Uma, c> implements AbstractC1131dda {
    private static final Uma zzbyv;
    private static volatile AbstractC1750mda<Uma> zzel;
    private Cca<a> zzbyu = AbstractC2092rca.m();

    public static final class a extends AbstractC2092rca<a, C0035a> implements AbstractC1131dda {
        private static final a zzbyz;
        private static volatile AbstractC1750mda<a> zzel;
        private int zzbyw;
        private d zzbyx;
        private e zzbyy;
        private int zzdw;

        /* renamed from: com.google.android.gms.internal.ads.Uma$a$a  reason: collision with other inner class name */
        public static final class C0035a extends AbstractC2092rca.b<a, C0035a> implements AbstractC1131dda {
            private C0035a() {
                super(a.zzbyz);
            }

            /* synthetic */ C0035a(Nma nma) {
                this();
            }

            public final C0035a a(b bVar) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((a) this.f5428b).a((a) bVar);
                return this;
            }

            public final C0035a a(d.a aVar) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((a) this.f5428b).a((a) ((d) aVar.j()));
                return this;
            }

            public final C0035a a(e.a aVar) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((a) this.f5428b).a((a) ((e) aVar.j()));
                return this;
            }
        }

        static {
            a aVar = new a();
            zzbyz = aVar;
            AbstractC2092rca.a(a.class, aVar);
        }

        private a() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(b bVar) {
            this.zzbyw = bVar.a();
            this.zzdw |= 1;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(d dVar) {
            dVar.getClass();
            this.zzbyx = dVar;
            this.zzdw |= 2;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(e eVar) {
            eVar.getClass();
            this.zzbyy = eVar;
            this.zzdw |= 4;
        }

        public static C0035a n() {
            return (C0035a) zzbyz.i();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.AbstractC2092rca
        public final Object a(int i, Object obj, Object obj2) {
            switch (Nma.f2699a[i - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0035a(null);
                case 3:
                    return AbstractC2092rca.a(zzbyz, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzdw", "zzbyw", b.b(), "zzbyx", "zzbyy"});
                case 4:
                    return zzbyz;
                case 5:
                    AbstractC1750mda<a> mda = zzel;
                    if (mda == null) {
                        synchronized (a.class) {
                            mda = zzel;
                            if (mda == null) {
                                mda = new AbstractC2092rca.a<>(zzbyz);
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

    public enum b implements AbstractC2437wca {
        UNSPECIFIED(0),
        IN_MEMORY(1);
        

        /* renamed from: c  reason: collision with root package name */
        private static final AbstractC2368vca<b> f3289c = new C2459wna();
        private final int e;

        private b(int i) {
            this.e = i;
        }

        public static b a(int i) {
            if (i == 0) {
                return UNSPECIFIED;
            }
            if (i != 1) {
                return null;
            }
            return IN_MEMORY;
        }

        public static AbstractC2575yca b() {
            return C2390vna.f5839a;
        }

        public final int a() {
            return this.e;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.e + " name=" + name() + '>';
        }
    }

    public static final class c extends AbstractC2092rca.b<Uma, c> implements AbstractC1131dda {
        private c() {
            super(Uma.zzbyv);
        }

        /* synthetic */ c(Nma nma) {
            this();
        }

        public final c a(a.C0035a aVar) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((Uma) this.f5428b).a((Uma) ((a) aVar.j()));
            return this;
        }
    }

    public static final class d extends AbstractC2092rca<d, a> implements AbstractC1131dda {
        private static final d zzbzf;
        private static volatile AbstractC1750mda<d> zzel;
        private boolean zzbzd;
        private int zzbze;
        private int zzdw;

        public static final class a extends AbstractC2092rca.b<d, a> implements AbstractC1131dda {
            private a() {
                super(d.zzbzf);
            }

            /* synthetic */ a(Nma nma) {
                this();
            }

            public final a a(int i) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((d) this.f5428b).b(i);
                return this;
            }

            public final a a(boolean z) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((d) this.f5428b).a((d) z);
                return this;
            }
        }

        static {
            d dVar = new d();
            zzbzf = dVar;
            AbstractC2092rca.a(d.class, dVar);
        }

        private d() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(boolean z) {
            this.zzdw |= 1;
            this.zzbzd = z;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(int i) {
            this.zzdw |= 2;
            this.zzbze = i;
        }

        public static a n() {
            return (a) zzbzf.i();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.AbstractC2092rca
        public final Object a(int i, Object obj, Object obj2) {
            switch (Nma.f2699a[i - 1]) {
                case 1:
                    return new d();
                case 2:
                    return new a(null);
                case 3:
                    return AbstractC2092rca.a(zzbzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzdw", "zzbzd", "zzbze"});
                case 4:
                    return zzbzf;
                case 5:
                    AbstractC1750mda<d> mda = zzel;
                    if (mda == null) {
                        synchronized (d.class) {
                            mda = zzel;
                            if (mda == null) {
                                mda = new AbstractC2092rca.a<>(zzbzf);
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

    public static final class e extends AbstractC2092rca<e, a> implements AbstractC1131dda {
        private static final e zzbzi;
        private static volatile AbstractC1750mda<e> zzel;
        private int zzbze;
        private boolean zzbzg;
        private boolean zzbzh;
        private int zzdw;

        public static final class a extends AbstractC2092rca.b<e, a> implements AbstractC1131dda {
            private a() {
                super(e.zzbzi);
            }

            /* synthetic */ a(Nma nma) {
                this();
            }

            public final a a(int i) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((e) this.f5428b).b((e) i);
                return this;
            }

            public final a a(boolean z) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((e) this.f5428b).a((e) z);
                return this;
            }

            public final a b(boolean z) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((e) this.f5428b).b((e) z);
                return this;
            }
        }

        static {
            e eVar = new e();
            zzbzi = eVar;
            AbstractC2092rca.a(e.class, eVar);
        }

        private e() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(boolean z) {
            this.zzdw |= 1;
            this.zzbzg = z;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(int i) {
            this.zzdw |= 4;
            this.zzbze = i;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(boolean z) {
            this.zzdw |= 2;
            this.zzbzh = z;
        }

        public static a n() {
            return (a) zzbzi.i();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.AbstractC2092rca
        public final Object a(int i, Object obj, Object obj2) {
            switch (Nma.f2699a[i - 1]) {
                case 1:
                    return new e();
                case 2:
                    return new a(null);
                case 3:
                    return AbstractC2092rca.a(zzbzi, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzdw", "zzbzg", "zzbzh", "zzbze"});
                case 4:
                    return zzbzi;
                case 5:
                    AbstractC1750mda<e> mda = zzel;
                    if (mda == null) {
                        synchronized (e.class) {
                            mda = zzel;
                            if (mda == null) {
                                mda = new AbstractC2092rca.a<>(zzbzi);
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

    static {
        Uma uma = new Uma();
        zzbyv = uma;
        AbstractC2092rca.a(Uma.class, uma);
    }

    private Uma() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(a aVar) {
        aVar.getClass();
        if (!this.zzbyu.d()) {
            this.zzbyu = AbstractC2092rca.a(this.zzbyu);
        }
        this.zzbyu.add(aVar);
    }

    public static c n() {
        return (c) zzbyv.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new Uma();
            case 2:
                return new c(null);
            case 3:
                return AbstractC2092rca.a(zzbyv, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbyu", a.class});
            case 4:
                return zzbyv;
            case 5:
                AbstractC1750mda<Uma> mda = zzel;
                if (mda == null) {
                    synchronized (Uma.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzbyv);
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
