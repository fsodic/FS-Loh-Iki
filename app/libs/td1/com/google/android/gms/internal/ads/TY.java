package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

public final class TY extends AbstractC2092rca<TY, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<TY> zzel;
    private static final TY zzhsc;
    private WY zzhrz;
    private int zzhsb;

    public static final class a extends AbstractC2092rca.b<TY, a> implements AbstractC1131dda {
        private a() {
            super(TY.zzhsc);
        }

        /* synthetic */ a(UY uy) {
            this();
        }
    }

    static {
        TY ty = new TY();
        zzhsc = ty;
        AbstractC2092rca.a(TY.class, ty);
    }

    private TY() {
    }

    public static TY a(Iba iba, C1197eca eca) {
        return (TY) AbstractC2092rca.a(zzhsc, iba, eca);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (UY.f3250a[i - 1]) {
            case 1:
                return new TY();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhsc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhsb", "zzhrz"});
            case 4:
                return zzhsc;
            case 5:
                AbstractC1750mda<TY> mda = zzel;
                if (mda == null) {
                    synchronized (TY.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhsc);
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
        return this.zzhsb;
    }

    public final WY o() {
        WY wy = this.zzhrz;
        return wy == null ? WY.o() : wy;
    }
}
