package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

public final class WY extends AbstractC2092rca<WY, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<WY> zzel;
    private static final WY zzhse;
    private int zzhsd;

    public static final class a extends AbstractC2092rca.b<WY, a> implements AbstractC1131dda {
        private a() {
            super(WY.zzhse);
        }

        /* synthetic */ a(VY vy) {
            this();
        }
    }

    static {
        WY wy = new WY();
        zzhse = wy;
        AbstractC2092rca.a(WY.class, wy);
    }

    private WY() {
    }

    public static WY o() {
        return zzhse;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (VY.f3343a[i - 1]) {
            case 1:
                return new WY();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhse, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhsd"});
            case 4:
                return zzhse;
            case 5:
                AbstractC1750mda<WY> mda = zzel;
                if (mda == null) {
                    synchronized (WY.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhse);
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
        return this.zzhsd;
    }
}
