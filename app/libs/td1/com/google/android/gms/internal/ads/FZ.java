package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

public final class FZ extends AbstractC2092rca<FZ, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<FZ> zzel;
    private static final FZ zzhtn;
    private int zzhrx;
    private Iba zzhry = Iba.f2236a;
    private GZ zzhtm;

    public static final class a extends AbstractC2092rca.b<FZ, a> implements AbstractC1131dda {
        private a() {
            super(FZ.zzhtn);
        }

        /* synthetic */ a(EZ ez) {
            this();
        }

        public final a a(int i) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((FZ) this.f5428b).b(0);
            return this;
        }

        public final a a(GZ gz) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((FZ) this.f5428b).a((FZ) gz);
            return this;
        }

        public final a a(Iba iba) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((FZ) this.f5428b).a((FZ) iba);
            return this;
        }
    }

    static {
        FZ fz = new FZ();
        zzhtn = fz;
        AbstractC2092rca.a(FZ.class, fz);
    }

    private FZ() {
    }

    public static FZ a(Iba iba, C1197eca eca) {
        return (FZ) AbstractC2092rca.a(zzhtn, iba, eca);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(GZ gz) {
        gz.getClass();
        this.zzhtm = gz;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Iba iba) {
        iba.getClass();
        this.zzhry = iba;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhrx = i;
    }

    public static a q() {
        return (a) zzhtn.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (EZ.f1872a[i - 1]) {
            case 1:
                return new FZ();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhtn, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhrx", "zzhtm", "zzhry"});
            case 4:
                return zzhtn;
            case 5:
                AbstractC1750mda<FZ> mda = zzel;
                if (mda == null) {
                    synchronized (FZ.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhtn);
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

    public final GZ p() {
        GZ gz = this.zzhtm;
        return gz == null ? GZ.s() : gz;
    }
}
