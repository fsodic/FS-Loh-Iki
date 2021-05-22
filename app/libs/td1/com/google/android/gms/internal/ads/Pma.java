package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

public final class Pma extends AbstractC2092rca<Pma, a> implements AbstractC1131dda {
    private static final Pma zzcgd;
    private static volatile AbstractC1750mda<Pma> zzel;
    private int zzcce = 1000;
    private C1977pna zzcfp;
    private C1701lna zzcfq;
    private int zzdw;

    public static final class a extends AbstractC2092rca.b<Pma, a> implements AbstractC1131dda {
        private a() {
            super(Pma.zzcgd);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }
    }

    static {
        Pma pma = new Pma();
        zzcgd = pma;
        AbstractC2092rca.a(Pma.class, pma);
    }

    private Pma() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new Pma();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzcgd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzdw", "zzcce", Cna.b(), "zzcfp", "zzcfq"});
            case 4:
                return zzcgd;
            case 5:
                AbstractC1750mda<Pma> mda = zzel;
                if (mda == null) {
                    synchronized (Pma.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcgd);
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
