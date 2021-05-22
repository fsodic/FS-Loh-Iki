package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.bna  reason: case insensitive filesystem */
public final class C1013bna extends AbstractC2092rca<C1013bna, a> implements AbstractC1131dda {
    private static final C1013bna zzccd;
    private static volatile AbstractC1750mda<C1013bna> zzel;
    private String zzcbz = BuildConfig.FLAVOR;
    private int zzcca;
    private AbstractC2506xca zzccb = AbstractC2092rca.k();
    private C1701lna zzccc;
    private int zzdw;

    /* renamed from: com.google.android.gms.internal.ads.bna$a */
    public static final class a extends AbstractC2092rca.b<C1013bna, a> implements AbstractC1131dda {
        private a() {
            super(C1013bna.zzccd);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }
    }

    static {
        C1013bna bna = new C1013bna();
        zzccd = bna;
        AbstractC2092rca.a(C1013bna.class, bna);
    }

    private C1013bna() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new C1013bna();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzccd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzdw", "zzcbz", "zzcca", Cna.b(), "zzccb", "zzccc"});
            case 4:
                return zzccd;
            case 5:
                AbstractC1750mda<C1013bna> mda = zzel;
                if (mda == null) {
                    synchronized (C1013bna.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzccd);
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
