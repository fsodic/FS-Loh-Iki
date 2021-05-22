package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

public final class Sma extends AbstractC2092rca<Sma, a> implements AbstractC1131dda {
    private static final Sma zzcgh;
    private static volatile AbstractC1750mda<Sma> zzel;
    private int zzcce = 1000;
    private C1977pna zzcfp;
    private int zzdw;

    public static final class a extends AbstractC2092rca.b<Sma, a> implements AbstractC1131dda {
        private a() {
            super(Sma.zzcgh);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }
    }

    static {
        Sma sma = new Sma();
        zzcgh = sma;
        AbstractC2092rca.a(Sma.class, sma);
    }

    private Sma() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new Sma();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzcgh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzdw", "zzcce", Cna.b(), "zzcfp"});
            case 4:
                return zzcgh;
            case 5:
                AbstractC1750mda<Sma> mda = zzel;
                if (mda == null) {
                    synchronized (Sma.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcgh);
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
