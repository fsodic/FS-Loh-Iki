package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

public final class TZ extends AbstractC2092rca<TZ, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<TZ> zzel;
    private static final TZ zzhun;
    private int zzhsd;
    private int zzhum;

    public static final class a extends AbstractC2092rca.b<TZ, a> implements AbstractC1131dda {
        private a() {
            super(TZ.zzhun);
        }

        /* synthetic */ a(UZ uz) {
            this();
        }
    }

    static {
        TZ tz = new TZ();
        zzhun = tz;
        AbstractC2092rca.a(TZ.class, tz);
    }

    private TZ() {
    }

    public static TZ p() {
        return zzhun;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (UZ.f3251a[i - 1]) {
            case 1:
                return new TZ();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhun, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzhum", "zzhsd"});
            case 4:
                return zzhun;
            case 5:
                AbstractC1750mda<TZ> mda = zzel;
                if (mda == null) {
                    synchronized (TZ.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhun);
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

    public final LZ o() {
        LZ a2 = LZ.a(this.zzhum);
        return a2 == null ? LZ.UNRECOGNIZED : a2;
    }
}
