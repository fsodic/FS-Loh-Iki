package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

public final class GZ extends AbstractC2092rca<GZ, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<GZ> zzel;
    private static final GZ zzhtq;
    private int zzhrx;
    private CZ zzhtg;
    private Iba zzhto;
    private Iba zzhtp;

    public static final class a extends AbstractC2092rca.b<GZ, a> implements AbstractC1131dda {
        private a() {
            super(GZ.zzhtq);
        }

        /* synthetic */ a(HZ hz) {
            this();
        }

        public final a a(int i) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((GZ) this.f5428b).b((GZ) 0);
            return this;
        }

        public final a a(CZ cz) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((GZ) this.f5428b).a((GZ) cz);
            return this;
        }

        public final a a(Iba iba) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((GZ) this.f5428b).a((GZ) iba);
            return this;
        }

        public final a b(Iba iba) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((GZ) this.f5428b).b((GZ) iba);
            return this;
        }
    }

    static {
        GZ gz = new GZ();
        zzhtq = gz;
        AbstractC2092rca.a(GZ.class, gz);
    }

    private GZ() {
        Iba iba = Iba.f2236a;
        this.zzhto = iba;
        this.zzhtp = iba;
    }

    public static GZ a(Iba iba, C1197eca eca) {
        return (GZ) AbstractC2092rca.a(zzhtq, iba, eca);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(CZ cz) {
        cz.getClass();
        this.zzhtg = cz;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Iba iba) {
        iba.getClass();
        this.zzhto = iba;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhrx = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(Iba iba) {
        iba.getClass();
        this.zzhtp = iba;
    }

    public static a r() {
        return (a) zzhtq.i();
    }

    public static GZ s() {
        return zzhtq;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (HZ.f2144a[i - 1]) {
            case 1:
                return new GZ();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhtq, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzhrx", "zzhtg", "zzhto", "zzhtp"});
            case 4:
                return zzhtq;
            case 5:
                AbstractC1750mda<GZ> mda = zzel;
                if (mda == null) {
                    synchronized (GZ.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhtq);
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

    public final int n() {
        return this.zzhrx;
    }

    public final CZ o() {
        CZ cz = this.zzhtg;
        return cz == null ? CZ.q() : cz;
    }

    public final Iba p() {
        return this.zzhto;
    }

    public final Iba q() {
        return this.zzhtp;
    }
}
