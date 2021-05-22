package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.cna  reason: case insensitive filesystem */
public final class C1082cna extends AbstractC2092rca<C1082cna, a> implements AbstractC1131dda {
    private static final C1082cna zzccf;
    private static volatile AbstractC1750mda<C1082cna> zzel;
    private AbstractC2506xca zzccb = AbstractC2092rca.k();
    private int zzcce;
    private int zzdw;

    /* renamed from: com.google.android.gms.internal.ads.cna$a */
    public static final class a extends AbstractC2092rca.b<C1082cna, a> implements AbstractC1131dda {
        private a() {
            super(C1082cna.zzccf);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }
    }

    static {
        C1082cna cna = new C1082cna();
        zzccf = cna;
        AbstractC2092rca.a(C1082cna.class, cna);
    }

    private C1082cna() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new C1082cna();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzccf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"zzdw", "zzcce", Cna.b(), "zzccb"});
            case 4:
                return zzccf;
            case 5:
                AbstractC1750mda<C1082cna> mda = zzel;
                if (mda == null) {
                    synchronized (C1082cna.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzccf);
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
