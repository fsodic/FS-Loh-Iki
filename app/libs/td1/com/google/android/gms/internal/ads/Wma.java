package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import org.cocos2dx.lib.BuildConfig;

public final class Wma extends AbstractC2092rca<Wma, a> implements AbstractC1131dda {
    private static final Wma zzcab;
    private static volatile AbstractC1750mda<Wma> zzel;
    private String zzbzy = BuildConfig.FLAVOR;
    private Cca<Vma> zzbzz = AbstractC2092rca.m();
    private int zzcaa;
    private int zzdw;

    public static final class a extends AbstractC2092rca.b<Wma, a> implements AbstractC1131dda {
        private a() {
            super(Wma.zzcab);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }
    }

    static {
        Wma wma = new Wma();
        zzcab = wma;
        AbstractC2092rca.a(Wma.class, wma);
    }

    private Wma() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new Wma();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzcab, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"zzdw", "zzbzy", "zzbzz", Vma.class, "zzcaa", Cna.b()});
            case 4:
                return zzcab;
            case 5:
                AbstractC1750mda<Wma> mda = zzel;
                if (mda == null) {
                    synchronized (Wma.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcab);
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
