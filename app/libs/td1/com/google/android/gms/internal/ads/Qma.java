package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

public final class Qma extends AbstractC2092rca<Qma, a> implements AbstractC1131dda {
    private static final Qma zzcgf;
    private static volatile AbstractC1750mda<Qma> zzel;
    private int zzcce = 1000;
    private int zzcff;
    private int zzcfg;
    private C1977pna zzcfp;
    private int zzcgb;
    private long zzcge;
    private int zzdw;

    public static final class a extends AbstractC2092rca.b<Qma, a> implements AbstractC1131dda {
        private a() {
            super(Qma.zzcgf);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }
    }

    static {
        Qma qma = new Qma();
        zzcgf = qma;
        AbstractC2092rca.a(Qma.class, qma);
    }

    private Qma() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new Qma();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzcgf, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzdw", "zzcce", Cna.b(), "zzcfp", "zzcff", "zzcfg", "zzcgb", "zzcge"});
            case 4:
                return zzcgf;
            case 5:
                AbstractC1750mda<Qma> mda = zzel;
                if (mda == null) {
                    synchronized (Qma.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcgf);
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
