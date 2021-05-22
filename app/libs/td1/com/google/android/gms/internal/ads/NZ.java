package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

public final class NZ extends AbstractC2092rca<NZ, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<NZ> zzel;
    private static final NZ zzhuk;
    private int zzhrx;
    private Iba zzhry = Iba.f2236a;
    private TZ zzhuj;

    public static final class a extends AbstractC2092rca.b<NZ, a> implements AbstractC1131dda {
        private a() {
            super(NZ.zzhuk);
        }

        /* synthetic */ a(PZ pz) {
            this();
        }

        public final a a(int i) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((NZ) this.f5428b).b(0);
            return this;
        }

        public final a a(Iba iba) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((NZ) this.f5428b).a((NZ) iba);
            return this;
        }

        public final a a(TZ tz) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((NZ) this.f5428b).a((NZ) tz);
            return this;
        }
    }

    static {
        NZ nz = new NZ();
        zzhuk = nz;
        AbstractC2092rca.a(NZ.class, nz);
    }

    private NZ() {
    }

    public static NZ a(Iba iba, C1197eca eca) {
        return (NZ) AbstractC2092rca.a(zzhuk, iba, eca);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Iba iba) {
        iba.getClass();
        this.zzhry = iba;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(TZ tz) {
        tz.getClass();
        this.zzhuj = tz;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhrx = i;
    }

    public static a q() {
        return (a) zzhuk.i();
    }

    public static NZ r() {
        return zzhuk;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (PZ.f2840a[i - 1]) {
            case 1:
                return new NZ();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhuk, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhrx", "zzhuj", "zzhry"});
            case 4:
                return zzhuk;
            case 5:
                AbstractC1750mda<NZ> mda = zzel;
                if (mda == null) {
                    synchronized (NZ.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhuk);
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

    public final Iba o() {
        return this.zzhry;
    }

    public final TZ p() {
        TZ tz = this.zzhuj;
        return tz == null ? TZ.p() : tz;
    }
}
