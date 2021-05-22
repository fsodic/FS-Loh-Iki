package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

public final class Rma extends AbstractC2092rca<Rma, a> implements AbstractC1131dda {
    private static final Rma zzcgg;
    private static volatile AbstractC1750mda<Rma> zzel;
    private int zzcce = 1000;
    private C1977pna zzcfp;
    private C1701lna zzcfq;
    private int zzdw;

    public static final class a extends AbstractC2092rca.b<Rma, a> implements AbstractC1131dda {
        private a() {
            super(Rma.zzcgg);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }
    }

    static {
        Rma rma = new Rma();
        zzcgg = rma;
        AbstractC2092rca.a(Rma.class, rma);
    }

    private Rma() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new Rma();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzcgg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzdw", "zzcce", Cna.b(), "zzcfp", "zzcfq"});
            case 4:
                return zzcgg;
            case 5:
                AbstractC1750mda<Rma> mda = zzel;
                if (mda == null) {
                    synchronized (Rma.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcgg);
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
