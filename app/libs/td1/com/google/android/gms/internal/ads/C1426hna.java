package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.hna  reason: case insensitive filesystem */
public final class C1426hna extends AbstractC2092rca<C1426hna, a> implements AbstractC1131dda {
    private static final C1426hna zzcej;
    private static volatile AbstractC1750mda<C1426hna> zzel;
    private int zzcdy = 1000;
    private int zzcdz = 1000;
    private int zzcea;
    private int zzceb;
    private int zzcec;
    private int zzced;
    private int zzcee;
    private int zzcef;
    private int zzceg;
    private int zzceh;
    private C1494ina zzcei;
    private int zzdw;

    /* renamed from: com.google.android.gms.internal.ads.hna$a */
    public static final class a extends AbstractC2092rca.b<C1426hna, a> implements AbstractC1131dda {
        private a() {
            super(C1426hna.zzcej);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }
    }

    static {
        C1426hna hna = new C1426hna();
        zzcej = hna;
        AbstractC2092rca.a(C1426hna.class, hna);
    }

    private C1426hna() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new C1426hna();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzcej, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzdw", "zzcdy", Cna.b(), "zzcdz", Cna.b(), "zzcea", "zzceb", "zzcec", "zzced", "zzcee", "zzcef", "zzceg", "zzceh", "zzcei"});
            case 4:
                return zzcej;
            case 5:
                AbstractC1750mda<C1426hna> mda = zzel;
                if (mda == null) {
                    synchronized (C1426hna.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcej);
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
