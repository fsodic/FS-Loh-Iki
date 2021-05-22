package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.gaa  reason: case insensitive filesystem */
public final class C1331gaa extends AbstractC2092rca<C1331gaa, b> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C1331gaa> zzel;
    private static final C1331gaa zzhvu;
    private int zzhvm;
    private Cca<a> zzhvt = AbstractC2092rca.m();

    /* renamed from: com.google.android.gms.internal.ads.gaa$a */
    public static final class a extends AbstractC2092rca<a, C0036a> implements AbstractC1131dda {
        private static volatile AbstractC1750mda<a> zzel;
        private static final a zzhvv;
        private String zzhuo = BuildConfig.FLAVOR;
        private int zzhvf;
        private int zzhvq;
        private int zzhvr;

        /* renamed from: com.google.android.gms.internal.ads.gaa$a$a  reason: collision with other inner class name */
        public static final class C0036a extends AbstractC2092rca.b<a, C0036a> implements AbstractC1131dda {
            private C0036a() {
                super(a.zzhvv);
            }

            /* synthetic */ C0036a(C1262faa faa) {
                this();
            }

            public final C0036a a(int i) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((a) this.f5428b).b(i);
                return this;
            }

            public final C0036a a(XZ xz) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((a) this.f5428b).a((a) xz);
                return this;
            }

            public final C0036a a(EnumC1951paa paa) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((a) this.f5428b).a((a) paa);
                return this;
            }

            public final C0036a a(String str) {
                if (this.f5429c) {
                    g();
                    this.f5429c = false;
                }
                ((a) this.f5428b).a((a) str);
                return this;
            }
        }

        static {
            a aVar = new a();
            zzhvv = aVar;
            AbstractC2092rca.a(a.class, aVar);
        }

        private a() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(XZ xz) {
            this.zzhvq = xz.a();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(EnumC1951paa paa) {
            this.zzhvf = paa.a();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(String str) {
            str.getClass();
            this.zzhuo = str;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(int i) {
            this.zzhvr = i;
        }

        public static C0036a n() {
            return (C0036a) zzhvv.i();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.AbstractC2092rca
        public final Object a(int i, Object obj, Object obj2) {
            switch (C1262faa.f4301a[i - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0036a(null);
                case 3:
                    return AbstractC2092rca.a(zzhvv, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzhuo", "zzhvq", "zzhvr", "zzhvf"});
                case 4:
                    return zzhvv;
                case 5:
                    AbstractC1750mda<a> mda = zzel;
                    if (mda == null) {
                        synchronized (a.class) {
                            mda = zzel;
                            if (mda == null) {
                                mda = new AbstractC2092rca.a<>(zzhvv);
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

    /* renamed from: com.google.android.gms.internal.ads.gaa$b */
    public static final class b extends AbstractC2092rca.b<C1331gaa, b> implements AbstractC1131dda {
        private b() {
            super(C1331gaa.zzhvu);
        }

        /* synthetic */ b(C1262faa faa) {
            this();
        }

        public final b a(int i) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1331gaa) this.f5428b).b(i);
            return this;
        }

        public final b a(a aVar) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1331gaa) this.f5428b).a((C1331gaa) aVar);
            return this;
        }
    }

    static {
        C1331gaa gaa = new C1331gaa();
        zzhvu = gaa;
        AbstractC2092rca.a(C1331gaa.class, gaa);
    }

    private C1331gaa() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(a aVar) {
        aVar.getClass();
        if (!this.zzhvt.d()) {
            this.zzhvt = AbstractC2092rca.a(this.zzhvt);
        }
        this.zzhvt.add(aVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhvm = i;
    }

    public static b n() {
        return (b) zzhvu.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1262faa.f4301a[i - 1]) {
            case 1:
                return new C1331gaa();
            case 2:
                return new b(null);
            case 3:
                return AbstractC2092rca.a(zzhvu, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzhvm", "zzhvt", a.class});
            case 4:
                return zzhvu;
            case 5:
                AbstractC1750mda<C1331gaa> mda = zzel;
                if (mda == null) {
                    synchronized (C1331gaa.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhvu);
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
