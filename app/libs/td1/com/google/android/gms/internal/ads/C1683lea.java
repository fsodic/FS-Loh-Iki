package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import java.util.Collections;
import java.util.List;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.lea  reason: case insensitive filesystem */
public final class C1683lea extends AbstractC2092rca<C1683lea, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C1683lea> zzel;
    private static final C1683lea zzimn;
    private int zzbzv;
    private int zzdw;
    private Iba zzilh = Iba.f2236a;
    private byte zzill = 2;
    private String zzilo = BuildConfig.FLAVOR;
    private int zzily;
    private String zzilz = BuildConfig.FLAVOR;
    private String zzima = BuildConfig.FLAVOR;
    private b zzimb;
    private Cca<h> zzimc = AbstractC2092rca.m();
    private String zzimd = BuildConfig.FLAVOR;
    private f zzime;
    private boolean zzimf;
    private Cca<String> zzimg = AbstractC2092rca.m();
    private String zzimh = BuildConfig.FLAVOR;
    private boolean zzimi;
    private boolean zzimj;
    private i zzimk;
    private Cca<String> zziml = AbstractC2092rca.m();
    private Cca<String> zzimm = AbstractC2092rca.m();

    /* renamed from: com.google.android.gms.internal.ads.lea$a */
    public static final class a extends AbstractC2092rca.b<C1683lea, a> implements AbstractC1131dda {
        private a() {
            super(C1683lea.zzimn);
        }

        /* synthetic */ a(C1821nea nea) {
            this();
        }

        public final a a(b bVar) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1683lea) this.f5428b).a((C1683lea) bVar);
            return this;
        }

        public final a a(f fVar) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1683lea) this.f5428b).a((C1683lea) fVar);
            return this;
        }

        public final a a(g gVar) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1683lea) this.f5428b).a((C1683lea) gVar);
            return this;
        }

        public final a a(h hVar) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1683lea) this.f5428b).a((C1683lea) hVar);
            return this;
        }

        public final a a(i iVar) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1683lea) this.f5428b).a((C1683lea) iVar);
            return this;
        }

        public final a a(Iterable<String> iterable) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1683lea) this.f5428b).a((C1683lea) iterable);
            return this;
        }

        public final a a(String str) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1683lea) this.f5428b).a((C1683lea) str);
            return this;
        }

        public final a b(Iterable<String> iterable) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1683lea) this.f5428b).b((C1683lea) iterable);
            return this;
        }

        public final a b(String str) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1683lea) this.f5428b).c(str);
            return this;
        }

        public final a c(String str) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1683lea) this.f5428b).b((C1683lea) str);
            return this;
        }

        public final String k() {
            return ((C1683lea) this.f5428b).n();
        }

        public final List<h> l() {
            return Collections.unmodifiableList(((C1683lea) this.f5428b).o());
        }

        public final String m() {
            return ((C1683lea) this.f5428b).p();
        }

        public final a n() {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1683lea) this.f5428b).s();
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.lea$b */
    public static final class b extends AbstractC2092rca<b, a> implements AbstractC1131dda {
        private static volatile AbstractC1750mda<b> zzel;
        private static final b zzimp;
        private int zzdw;
        private String zzimo = BuildConfig.FLAVOR;

        /* renamed from: com.google.android.gms.internal.ads.lea$b$a */
        public static final class a extends AbstractC2092rca.b<b, a> implements AbstractC1131dda {
            private a() {
                super(b.zzimp);
            }

            /* synthetic */ a(C1821nea nea) {
                this();
            }

            public final a a(String str) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((b) this.f5428b).a((b) str);
                return this;
            }
        }

        static {
            b bVar = new b();
            zzimp = bVar;
            AbstractC2092rca.a(b.class, bVar);
        }

        private b() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(String str) {
            str.getClass();
            this.zzdw |= 1;
            this.zzimo = str;
        }

        public static a n() {
            return (a) zzimp.i();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.AbstractC2092rca
        public final Object a(int i, Object obj, Object obj2) {
            switch (C1821nea.f5062a[i - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(null);
                case 3:
                    return AbstractC2092rca.a(zzimp, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzdw", "zzimo"});
                case 4:
                    return zzimp;
                case 5:
                    AbstractC1750mda<b> mda = zzel;
                    if (mda == null) {
                        synchronized (b.class) {
                            mda = zzel;
                            if (mda == null) {
                                mda = new AbstractC2092rca.a<>(zzimp);
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

    /* renamed from: com.google.android.gms.internal.ads.lea$c */
    public static final class c extends AbstractC2092rca<c, a> implements AbstractC1131dda {
        private static volatile AbstractC1750mda<c> zzel;
        private static final c zzimr;
        private int zzdw;
        private Iba zzhup;
        private byte zzill = 2;
        private Iba zzimq;

        /* renamed from: com.google.android.gms.internal.ads.lea$c$a */
        public static final class a extends AbstractC2092rca.b<c, a> implements AbstractC1131dda {
            private a() {
                super(c.zzimr);
            }

            /* synthetic */ a(C1821nea nea) {
                this();
            }

            public final a a(Iba iba) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((c) this.f5428b).b(iba);
                return this;
            }

            public final a b(Iba iba) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((c) this.f5428b).a((c) iba);
                return this;
            }
        }

        static {
            c cVar = new c();
            zzimr = cVar;
            AbstractC2092rca.a(c.class, cVar);
        }

        private c() {
            Iba iba = Iba.f2236a;
            this.zzimq = iba;
            this.zzhup = iba;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(Iba iba) {
            iba.getClass();
            this.zzdw |= 2;
            this.zzhup = iba;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(Iba iba) {
            iba.getClass();
            this.zzdw |= 1;
            this.zzimq = iba;
        }

        public static a n() {
            return (a) zzimr.i();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.AbstractC2092rca
        public final Object a(int i, Object obj, Object obj2) {
            int i2 = 0;
            switch (C1821nea.f5062a[i - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a(null);
                case 3:
                    return AbstractC2092rca.a(zzimr, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzdw", "zzimq", "zzhup"});
                case 4:
                    return zzimr;
                case 5:
                    AbstractC1750mda<c> mda = zzel;
                    if (mda == null) {
                        synchronized (c.class) {
                            mda = zzel;
                            if (mda == null) {
                                mda = new AbstractC2092rca.a<>(zzimr);
                                zzel = mda;
                            }
                        }
                    }
                    return mda;
                case 6:
                    return Byte.valueOf(this.zzill);
                case 7:
                    if (obj != null) {
                        i2 = 1;
                    }
                    this.zzill = (byte) i2;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.lea$d */
    public static final class d extends AbstractC2092rca<d, a> implements AbstractC1131dda {
        private static volatile AbstractC1750mda<d> zzel;
        private static final d zzimx;
        private int zzdw;
        private byte zzill = 2;
        private b zzims;
        private Cca<c> zzimt = AbstractC2092rca.m();
        private Iba zzimu;
        private Iba zzimv;
        private int zzimw;

        /* renamed from: com.google.android.gms.internal.ads.lea$d$a */
        public static final class a extends AbstractC2092rca.b<d, a> implements AbstractC1131dda {
            private a() {
                super(d.zzimx);
            }

            /* synthetic */ a(C1821nea nea) {
                this();
            }

            public final a a(c cVar) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((d) this.f5428b).a((d) cVar);
                return this;
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.lea$d$b */
        public static final class b extends AbstractC2092rca<b, a> implements AbstractC1131dda {
            private static volatile AbstractC1750mda<b> zzel;
            private static final b zzinb;
            private int zzdw;
            private Iba zzimy;
            private Iba zzimz;
            private Iba zzina;

            /* renamed from: com.google.android.gms.internal.ads.lea$d$b$a */
            public static final class a extends AbstractC2092rca.b<b, a> implements AbstractC1131dda {
                private a() {
                    super(b.zzinb);
                }

                /* synthetic */ a(C1821nea nea) {
                    this();
                }
            }

            static {
                b bVar = new b();
                zzinb = bVar;
                AbstractC2092rca.a(b.class, bVar);
            }

            private b() {
                Iba iba = Iba.f2236a;
                this.zzimy = iba;
                this.zzimz = iba;
                this.zzina = iba;
            }

            /* access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.AbstractC2092rca
            public final Object a(int i, Object obj, Object obj2) {
                switch (C1821nea.f5062a[i - 1]) {
                    case 1:
                        return new b();
                    case 2:
                        return new a(null);
                    case 3:
                        return AbstractC2092rca.a(zzinb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzdw", "zzimy", "zzimz", "zzina"});
                    case 4:
                        return zzinb;
                    case 5:
                        AbstractC1750mda<b> mda = zzel;
                        if (mda == null) {
                            synchronized (b.class) {
                                mda = zzel;
                                if (mda == null) {
                                    mda = new AbstractC2092rca.a<>(zzinb);
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
            d dVar = new d();
            zzimx = dVar;
            AbstractC2092rca.a(d.class, dVar);
        }

        private d() {
            Iba iba = Iba.f2236a;
            this.zzimu = iba;
            this.zzimv = iba;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(c cVar) {
            cVar.getClass();
            if (!this.zzimt.d()) {
                this.zzimt = AbstractC2092rca.a(this.zzimt);
            }
            this.zzimt.add(cVar);
        }

        public static a n() {
            return (a) zzimx.i();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.AbstractC2092rca
        public final Object a(int i, Object obj, Object obj2) {
            int i2 = 0;
            switch (C1821nea.f5062a[i - 1]) {
                case 1:
                    return new d();
                case 2:
                    return new a(null);
                case 3:
                    return AbstractC2092rca.a(zzimx, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzdw", "zzims", "zzimt", c.class, "zzimu", "zzimv", "zzimw"});
                case 4:
                    return zzimx;
                case 5:
                    AbstractC1750mda<d> mda = zzel;
                    if (mda == null) {
                        synchronized (d.class) {
                            mda = zzel;
                            if (mda == null) {
                                mda = new AbstractC2092rca.a<>(zzimx);
                                zzel = mda;
                            }
                        }
                    }
                    return mda;
                case 6:
                    return Byte.valueOf(this.zzill);
                case 7:
                    if (obj != null) {
                        i2 = 1;
                    }
                    this.zzill = (byte) i2;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.lea$e */
    public static final class e extends AbstractC2092rca<e, a> implements AbstractC1131dda {
        private static volatile AbstractC1750mda<e> zzel;
        private static final e zzine;
        private int zzdw;
        private byte zzill = 2;
        private Cca<c> zzimt = AbstractC2092rca.m();
        private Iba zzimu;
        private Iba zzimv;
        private int zzimw;
        private b zzinc;
        private Iba zzind;

        /* renamed from: com.google.android.gms.internal.ads.lea$e$a */
        public static final class a extends AbstractC2092rca.b<e, a> implements AbstractC1131dda {
            private a() {
                super(e.zzine);
            }

            /* synthetic */ a(C1821nea nea) {
                this();
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.lea$e$b */
        public static final class b extends AbstractC2092rca<b, a> implements AbstractC1131dda {
            private static volatile AbstractC1750mda<b> zzel;
            private static final b zzinh;
            private int zzdw;
            private Iba zzina;
            private int zzinf;
            private Iba zzing;

            /* renamed from: com.google.android.gms.internal.ads.lea$e$b$a */
            public static final class a extends AbstractC2092rca.b<b, a> implements AbstractC1131dda {
                private a() {
                    super(b.zzinh);
                }

                /* synthetic */ a(C1821nea nea) {
                    this();
                }
            }

            static {
                b bVar = new b();
                zzinh = bVar;
                AbstractC2092rca.a(b.class, bVar);
            }

            private b() {
                Iba iba = Iba.f2236a;
                this.zzing = iba;
                this.zzina = iba;
            }

            /* access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.AbstractC2092rca
            public final Object a(int i, Object obj, Object obj2) {
                switch (C1821nea.f5062a[i - 1]) {
                    case 1:
                        return new b();
                    case 2:
                        return new a(null);
                    case 3:
                        return AbstractC2092rca.a(zzinh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzdw", "zzinf", "zzing", "zzina"});
                    case 4:
                        return zzinh;
                    case 5:
                        AbstractC1750mda<b> mda = zzel;
                        if (mda == null) {
                            synchronized (b.class) {
                                mda = zzel;
                                if (mda == null) {
                                    mda = new AbstractC2092rca.a<>(zzinh);
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
            e eVar = new e();
            zzine = eVar;
            AbstractC2092rca.a(e.class, eVar);
        }

        private e() {
            Iba iba = Iba.f2236a;
            this.zzimu = iba;
            this.zzimv = iba;
            this.zzind = iba;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.AbstractC2092rca
        public final Object a(int i, Object obj, Object obj2) {
            int i2 = 0;
            switch (C1821nea.f5062a[i - 1]) {
                case 1:
                    return new e();
                case 2:
                    return new a(null);
                case 3:
                    return AbstractC2092rca.a(zzine, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzdw", "zzinc", "zzimt", c.class, "zzimu", "zzimv", "zzimw", "zzind"});
                case 4:
                    return zzine;
                case 5:
                    AbstractC1750mda<e> mda = zzel;
                    if (mda == null) {
                        synchronized (e.class) {
                            mda = zzel;
                            if (mda == null) {
                                mda = new AbstractC2092rca.a<>(zzine);
                                zzel = mda;
                            }
                        }
                    }
                    return mda;
                case 6:
                    return Byte.valueOf(this.zzill);
                case 7:
                    if (obj != null) {
                        i2 = 1;
                    }
                    this.zzill = (byte) i2;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.lea$f */
    public static final class f extends AbstractC2092rca<f, a> implements AbstractC1131dda {
        private static volatile AbstractC1750mda<f> zzel;
        private static final f zzink;
        private int zzbzv;
        private int zzdw;
        private String zzini = BuildConfig.FLAVOR;
        private Iba zzinj = Iba.f2236a;

        /* renamed from: com.google.android.gms.internal.ads.lea$f$a */
        public static final class a extends AbstractC2092rca.b<f, a> implements AbstractC1131dda {
            private a() {
                super(f.zzink);
            }

            /* synthetic */ a(C1821nea nea) {
                this();
            }

            public final a a(Iba iba) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((f) this.f5428b).a((f) iba);
                return this;
            }

            public final a a(b bVar) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((f) this.f5428b).a((f) bVar);
                return this;
            }

            public final a a(String str) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((f) this.f5428b).a((f) str);
                return this;
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.lea$f$b */
        public enum b implements AbstractC2437wca {
            TYPE_UNKNOWN(0),
            TYPE_CREATIVE(1);
            

            /* renamed from: c  reason: collision with root package name */
            private static final AbstractC2368vca<b> f4876c = new C2096rea();
            private final int e;

            private b(int i) {
                this.e = i;
            }

            public static b a(int i) {
                if (i == 0) {
                    return TYPE_UNKNOWN;
                }
                if (i != 1) {
                    return null;
                }
                return TYPE_CREATIVE;
            }

            public static AbstractC2575yca b() {
                return C2165sea.f5531a;
            }

            public final int a() {
                return this.e;
            }

            public final String toString() {
                return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.e + " name=" + name() + '>';
            }
        }

        static {
            f fVar = new f();
            zzink = fVar;
            AbstractC2092rca.a(f.class, fVar);
        }

        private f() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(Iba iba) {
            iba.getClass();
            this.zzdw |= 4;
            this.zzinj = iba;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(b bVar) {
            this.zzbzv = bVar.a();
            this.zzdw |= 1;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(String str) {
            str.getClass();
            this.zzdw |= 2;
            this.zzini = str;
        }

        public static a n() {
            return (a) zzink.i();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.AbstractC2092rca
        public final Object a(int i, Object obj, Object obj2) {
            switch (C1821nea.f5062a[i - 1]) {
                case 1:
                    return new f();
                case 2:
                    return new a(null);
                case 3:
                    return AbstractC2092rca.a(zzink, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"zzdw", "zzbzv", b.b(), "zzini", "zzinj"});
                case 4:
                    return zzink;
                case 5:
                    AbstractC1750mda<f> mda = zzel;
                    if (mda == null) {
                        synchronized (f.class) {
                            mda = zzel;
                            if (mda == null) {
                                mda = new AbstractC2092rca.a<>(zzink);
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

    /* renamed from: com.google.android.gms.internal.ads.lea$g */
    public enum g implements AbstractC2437wca {
        UNKNOWN(0),
        URL_PHISHING(1),
        URL_MALWARE(2),
        URL_UNWANTED(3),
        CLIENT_SIDE_PHISHING_URL(4),
        CLIENT_SIDE_MALWARE_URL(5),
        DANGEROUS_DOWNLOAD_RECOVERY(6),
        DANGEROUS_DOWNLOAD_WARNING(7),
        OCTAGON_AD(8),
        OCTAGON_AD_SB_MATCH(9);
        
        private static final AbstractC2368vca<g> k = new C2303uea();
        private final int m;

        private g(int i) {
            this.m = i;
        }

        public static g a(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return URL_PHISHING;
                case 2:
                    return URL_MALWARE;
                case 3:
                    return URL_UNWANTED;
                case 4:
                    return CLIENT_SIDE_PHISHING_URL;
                case 5:
                    return CLIENT_SIDE_MALWARE_URL;
                case 6:
                    return DANGEROUS_DOWNLOAD_RECOVERY;
                case 7:
                    return DANGEROUS_DOWNLOAD_WARNING;
                case 8:
                    return OCTAGON_AD;
                case 9:
                    return OCTAGON_AD_SB_MATCH;
                default:
                    return null;
            }
        }

        public static AbstractC2575yca b() {
            return C2234tea.f5629a;
        }

        public final int a() {
            return this.m;
        }

        public final String toString() {
            return "<" + g.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.m + " name=" + name() + '>';
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.lea$h */
    public static final class h extends AbstractC2092rca<h, b> implements AbstractC1131dda {
        private static volatile AbstractC1750mda<h> zzel;
        private static final h zziom;
        private int zzdw;
        private byte zzill = 2;
        private String zzilo = BuildConfig.FLAVOR;
        private int zzioe;
        private d zziof;
        private e zziog;
        private int zzioh;
        private AbstractC2506xca zzioi = AbstractC2092rca.k();
        private String zzioj = BuildConfig.FLAVOR;
        private int zziok;
        private Cca<String> zziol = AbstractC2092rca.m();

        /* renamed from: com.google.android.gms.internal.ads.lea$h$a */
        public enum a implements AbstractC2437wca {
            AD_RESOURCE_UNKNOWN(0),
            AD_RESOURCE_CREATIVE(1),
            AD_RESOURCE_POST_CLICK(2),
            AD_RESOURCE_AUTO_CLICK_DESTINATION(3);
            
            private static final AbstractC2368vca<a> e = new C2441wea();
            private final int g;

            private a(int i) {
                this.g = i;
            }

            public static a a(int i) {
                if (i == 0) {
                    return AD_RESOURCE_UNKNOWN;
                }
                if (i == 1) {
                    return AD_RESOURCE_CREATIVE;
                }
                if (i == 2) {
                    return AD_RESOURCE_POST_CLICK;
                }
                if (i != 3) {
                    return null;
                }
                return AD_RESOURCE_AUTO_CLICK_DESTINATION;
            }

            public static AbstractC2575yca b() {
                return C2372vea.f5819a;
            }

            public final int a() {
                return this.g;
            }

            public final String toString() {
                return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.g + " name=" + name() + '>';
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.lea$h$b */
        public static final class b extends AbstractC2092rca.b<h, b> implements AbstractC1131dda {
            private b() {
                super(h.zziom);
            }

            /* synthetic */ b(C1821nea nea) {
                this();
            }

            public final b a(int i) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((h) this.f5428b).b((h) i);
                return this;
            }

            public final b a(d dVar) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((h) this.f5428b).a((h) dVar);
                return this;
            }

            public final b a(a aVar) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((h) this.f5428b).a((h) aVar);
                return this;
            }

            public final b a(String str) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((h) this.f5428b).a((h) str);
                return this;
            }

            public final b b(String str) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((h) this.f5428b).b((h) str);
                return this;
            }
        }

        static {
            h hVar = new h();
            zziom = hVar;
            AbstractC2092rca.a(h.class, hVar);
        }

        private h() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(d dVar) {
            dVar.getClass();
            this.zziof = dVar;
            this.zzdw |= 4;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(a aVar) {
            this.zziok = aVar.a();
            this.zzdw |= 64;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(String str) {
            str.getClass();
            this.zzdw |= 2;
            this.zzilo = str;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(int i) {
            this.zzdw |= 1;
            this.zzioe = i;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(String str) {
            str.getClass();
            if (!this.zziol.d()) {
                this.zziol = AbstractC2092rca.a(this.zziol);
            }
            this.zziol.add(str);
        }

        public static b p() {
            return (b) zziom.i();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.AbstractC2092rca
        public final Object a(int i, Object obj, Object obj2) {
            int i2 = 0;
            switch (C1821nea.f5062a[i - 1]) {
                case 1:
                    return new h();
                case 2:
                    return new b(null);
                case 3:
                    return AbstractC2092rca.a(zziom, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zzdw", "zzioe", "zzilo", "zziof", "zziog", "zzioh", "zzioi", "zzioj", "zziok", a.b(), "zziol"});
                case 4:
                    return zziom;
                case 5:
                    AbstractC1750mda<h> mda = zzel;
                    if (mda == null) {
                        synchronized (h.class) {
                            mda = zzel;
                            if (mda == null) {
                                mda = new AbstractC2092rca.a<>(zziom);
                                zzel = mda;
                            }
                        }
                    }
                    return mda;
                case 6:
                    return Byte.valueOf(this.zzill);
                case 7:
                    if (obj != null) {
                        i2 = 1;
                    }
                    this.zzill = (byte) i2;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final String n() {
            return this.zzilo;
        }

        public final int o() {
            return this.zziol.size();
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.lea$i */
    public static final class i extends AbstractC2092rca<i, a> implements AbstractC1131dda {
        private static volatile AbstractC1750mda<i> zzel;
        private static final i zzioq;
        private int zzdw;
        private String zzion = BuildConfig.FLAVOR;
        private long zzioo;
        private boolean zziop;

        /* renamed from: com.google.android.gms.internal.ads.lea$i$a */
        public static final class a extends AbstractC2092rca.b<i, a> implements AbstractC1131dda {
            private a() {
                super(i.zzioq);
            }

            /* synthetic */ a(C1821nea nea) {
                this();
            }

            public final a a(long j) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((i) this.f5428b).a((i) j);
                return this;
            }

            public final a a(String str) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((i) this.f5428b).a((i) str);
                return this;
            }

            public final a a(boolean z) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((i) this.f5428b).a((i) z);
                return this;
            }
        }

        static {
            i iVar = new i();
            zzioq = iVar;
            AbstractC2092rca.a(i.class, iVar);
        }

        private i() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(long j) {
            this.zzdw |= 2;
            this.zzioo = j;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(String str) {
            str.getClass();
            this.zzdw |= 1;
            this.zzion = str;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(boolean z) {
            this.zzdw |= 4;
            this.zziop = z;
        }

        public static a n() {
            return (a) zzioq.i();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.AbstractC2092rca
        public final Object a(int i, Object obj, Object obj2) {
            switch (C1821nea.f5062a[i - 1]) {
                case 1:
                    return new i();
                case 2:
                    return new a(null);
                case 3:
                    return AbstractC2092rca.a(zzioq, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"zzdw", "zzion", "zzioo", "zziop"});
                case 4:
                    return zzioq;
                case 5:
                    AbstractC1750mda<i> mda = zzel;
                    if (mda == null) {
                        synchronized (i.class) {
                            mda = zzel;
                            if (mda == null) {
                                mda = new AbstractC2092rca.a<>(zzioq);
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
        C1683lea lea = new C1683lea();
        zzimn = lea;
        AbstractC2092rca.a(C1683lea.class, lea);
    }

    private C1683lea() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(b bVar) {
        bVar.getClass();
        this.zzimb = bVar;
        this.zzdw |= 32;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(f fVar) {
        fVar.getClass();
        this.zzime = fVar;
        this.zzdw |= 128;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(g gVar) {
        this.zzbzv = gVar.a();
        this.zzdw |= 1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(h hVar) {
        hVar.getClass();
        if (!this.zzimc.d()) {
            this.zzimc = AbstractC2092rca.a(this.zzimc);
        }
        this.zzimc.add(hVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(i iVar) {
        iVar.getClass();
        this.zzimk = iVar;
        this.zzdw |= 8192;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Iterable<String> iterable) {
        if (!this.zziml.d()) {
            this.zziml = AbstractC2092rca.a(this.zziml);
        }
        AbstractC2642zba.a(iterable, this.zziml);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        str.getClass();
        this.zzdw |= 4;
        this.zzilo = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(Iterable<String> iterable) {
        if (!this.zzimm.d()) {
            this.zzimm = AbstractC2092rca.a(this.zzimm);
        }
        AbstractC2642zba.a(iterable, this.zzimm);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(String str) {
        str.getClass();
        this.zzdw |= 64;
        this.zzimd = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void c(String str) {
        str.getClass();
        this.zzdw |= 8;
        this.zzilz = str;
    }

    public static a q() {
        return (a) zzimn.i();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void s() {
        this.zzdw &= -65;
        this.zzimd = zzimn.zzimd;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i2, Object obj, Object obj2) {
        int i3 = 0;
        switch (C1821nea.f5062a[i2 - 1]) {
            case 1:
                return new C1683lea();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzimn, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0011ဉ\r\u0014\u001a\u0015\u001a", new Object[]{"zzdw", "zzilo", "zzilz", "zzima", "zzimc", h.class, "zzimf", "zzimg", "zzimh", "zzimi", "zzimj", "zzbzv", g.b(), "zzily", EnumC1614kea.a(), "zzimb", "zzimd", "zzime", "zzilh", "zzimk", "zziml", "zzimm"});
            case 4:
                return zzimn;
            case 5:
                AbstractC1750mda<C1683lea> mda = zzel;
                if (mda == null) {
                    synchronized (C1683lea.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzimn);
                            zzel = mda;
                        }
                    }
                }
                return mda;
            case 6:
                return Byte.valueOf(this.zzill);
            case 7:
                if (obj != null) {
                    i3 = 1;
                }
                this.zzill = (byte) i3;
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final String n() {
        return this.zzilo;
    }

    public final List<h> o() {
        return this.zzimc;
    }

    public final String p() {
        return this.zzimd;
    }
}
