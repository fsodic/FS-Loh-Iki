package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.rna  reason: case insensitive filesystem */
public final class C2114rna extends AbstractC2092rca<C2114rna, a> implements AbstractC1131dda {
    private static final C2114rna zzcgc;
    private static volatile AbstractC1750mda<C2114rna> zzel;
    private int zzcce = 1000;
    private int zzcff;
    private int zzcfg;
    private C1977pna zzcfp;
    private int zzcgb;
    private int zzdw;

    /* renamed from: com.google.android.gms.internal.ads.rna$a */
    public static final class a extends AbstractC2092rca.b<C2114rna, a> implements AbstractC1131dda {
        private a() {
            super(C2114rna.zzcgc);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }
    }

    static {
        C2114rna rna = new C2114rna();
        zzcgc = rna;
        AbstractC2092rca.a(C2114rna.class, rna);
    }

    private C2114rna() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new C2114rna();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzcgc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzdw", "zzcce", Cna.b(), "zzcfp", "zzcff", "zzcfg", "zzcgb"});
            case 4:
                return zzcgc;
            case 5:
                AbstractC1750mda<C2114rna> mda = zzel;
                if (mda == null) {
                    synchronized (C2114rna.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcgc);
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
