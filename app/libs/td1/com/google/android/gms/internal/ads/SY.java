package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

public final class SY extends AbstractC2092rca<SY, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<SY> zzel;
    private static final SY zzhsa;
    private int zzhrx;
    private Iba zzhry = Iba.f2236a;
    private WY zzhrz;

    public static final class a extends AbstractC2092rca.b<SY, a> implements AbstractC1131dda {
        private a() {
            super(SY.zzhsa);
        }

        /* synthetic */ a(RY ry) {
            this();
        }

        public final a a(int i) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((SY) this.f5428b).b(0);
            return this;
        }

        public final a a(Iba iba) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((SY) this.f5428b).a((SY) iba);
            return this;
        }

        public final a a(WY wy) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((SY) this.f5428b).a((SY) wy);
            return this;
        }
    }

    static {
        SY sy = new SY();
        zzhsa = sy;
        AbstractC2092rca.a(SY.class, sy);
    }

    private SY() {
    }

    public static SY a(Iba iba, C1197eca eca) {
        return (SY) AbstractC2092rca.a(zzhsa, iba, eca);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Iba iba) {
        iba.getClass();
        this.zzhry = iba;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(WY wy) {
        wy.getClass();
        this.zzhrz = wy;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhrx = i;
    }

    public static a q() {
        return (a) zzhsa.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (RY.f3021a[i - 1]) {
            case 1:
                return new SY();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhsa, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzhrx", "zzhry", "zzhrz"});
            case 4:
                return zzhsa;
            case 5:
                AbstractC1750mda<SY> mda = zzel;
                if (mda == null) {
                    synchronized (SY.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhsa);
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

    public final WY p() {
        WY wy = this.zzhrz;
        return wy == null ? WY.o() : wy;
    }
}
