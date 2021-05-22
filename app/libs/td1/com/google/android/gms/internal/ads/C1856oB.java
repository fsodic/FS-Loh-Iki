package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.oB  reason: case insensitive filesystem */
public final class C1856oB extends AbstractC2092rca<C1856oB, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C1856oB> zzel;
    private static final C1856oB zzmh;
    private int zzdw;
    private int zzhv = 1;
    private int zzhw = 1;
    private Iba zzlh = Iba.f2236a;
    private Cca<Iba> zzmg = AbstractC2092rca.m();

    /* renamed from: com.google.android.gms.internal.ads.oB$a */
    public static final class a extends AbstractC2092rca.b<C1856oB, a> implements AbstractC1131dda {
        private a() {
            super(C1856oB.zzmh);
        }

        /* synthetic */ a(JA ja) {
            this();
        }

        public final a a(Iba iba) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1856oB) this.f5428b).b(iba);
            return this;
        }

        public final a a(SE se) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1856oB) this.f5428b).a((C1856oB) se);
            return this;
        }

        public final a b(Iba iba) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1856oB) this.f5428b).a((C1856oB) iba);
            return this;
        }
    }

    static {
        C1856oB oBVar = new C1856oB();
        zzmh = oBVar;
        AbstractC2092rca.a(C1856oB.class, oBVar);
    }

    private C1856oB() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Iba iba) {
        iba.getClass();
        this.zzdw |= 1;
        this.zzlh = iba;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(SE se) {
        this.zzhv = se.a();
        this.zzdw |= 4;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(Iba iba) {
        iba.getClass();
        if (!this.zzmg.d()) {
            this.zzmg = AbstractC2092rca.a(this.zzmg);
        }
        this.zzmg.add(iba);
    }

    public static a n() {
        return (a) zzmh.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (JA.f2296a[i - 1]) {
            case 1:
                return new C1856oB();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzmh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zzdw", "zzmg", "zzlh", "zzhw", VH.a(), "zzhv", SE.b()});
            case 4:
                return zzmh;
            case 5:
                AbstractC1750mda<C1856oB> mda = zzel;
                if (mda == null) {
                    synchronized (C1856oB.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzmh);
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
