package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.qna  reason: case insensitive filesystem */
public final class C2046qna extends AbstractC2092rca<C2046qna, a> implements AbstractC1131dda {
    private static final C2046qna zzcga;
    private static volatile AbstractC1750mda<C2046qna> zzel;
    private int zzcce = 1000;
    private C1977pna zzcfp;
    private C1701lna zzcfq;
    private C1770mna zzcfz;
    private int zzdw;

    /* renamed from: com.google.android.gms.internal.ads.qna$a */
    public static final class a extends AbstractC2092rca.b<C2046qna, a> implements AbstractC1131dda {
        private a() {
            super(C2046qna.zzcga);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }
    }

    static {
        C2046qna qna = new C2046qna();
        zzcga = qna;
        AbstractC2092rca.a(C2046qna.class, qna);
    }

    private C2046qna() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new C2046qna();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzcga, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzdw", "zzcfz", "zzcce", Cna.b(), "zzcfp", "zzcfq"});
            case 4:
                return zzcga;
            case 5:
                AbstractC1750mda<C2046qna> mda = zzel;
                if (mda == null) {
                    synchronized (C2046qna.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcga);
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
