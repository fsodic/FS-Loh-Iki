package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

public final class Yma extends AbstractC2092rca<Yma, a> implements AbstractC1131dda {
    private static final Yma zzcao;
    private static volatile AbstractC1750mda<Yma> zzel;
    private int zzcai;
    private C1701lna zzcaj;
    private C1701lna zzcak;
    private C1701lna zzcal;
    private Cca<C1701lna> zzcam = AbstractC2092rca.m();
    private int zzcan;
    private int zzdw;

    public static final class a extends AbstractC2092rca.b<Yma, a> implements AbstractC1131dda {
        private a() {
            super(Yma.zzcao);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }
    }

    static {
        Yma yma = new Yma();
        zzcao = yma;
        AbstractC2092rca.a(Yma.class, yma);
    }

    private Yma() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new Yma();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzcao, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzdw", "zzcai", "zzcaj", "zzcak", "zzcal", "zzcam", C1701lna.class, "zzcan"});
            case 4:
                return zzcao;
            case 5:
                AbstractC1750mda<Yma> mda = zzel;
                if (mda == null) {
                    synchronized (Yma.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcao);
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
