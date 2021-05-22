package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.nna  reason: case insensitive filesystem */
public final class C1839nna extends AbstractC2092rca<C1839nna, a> implements AbstractC1131dda {
    private static final C1839nna zzcfo;
    private static volatile AbstractC1750mda<C1839nna> zzel;
    private C2114rna zzcey;
    private Qma zzcez;
    private Rma zzcfa;
    private Sma zzcfb;
    private C1908ona zzcfc;
    private Pma zzcfd;
    private C2046qna zzcfe;
    private int zzcff;
    private int zzcfg;
    private C1701lna zzcfh;
    private int zzcfi;
    private int zzcfj;
    private int zzcfk;
    private int zzcfl;
    private int zzcfm;
    private long zzcfn;
    private int zzdw;

    /* renamed from: com.google.android.gms.internal.ads.nna$a */
    public static final class a extends AbstractC2092rca.b<C1839nna, a> implements AbstractC1131dda {
        private a() {
            super(C1839nna.zzcfo);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }
    }

    static {
        C1839nna nna = new C1839nna();
        zzcfo = nna;
        AbstractC2092rca.a(C1839nna.class, nna);
    }

    private C1839nna() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new C1839nna();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzcfo, "\u0001\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzdw", "zzcey", "zzcez", "zzcfa", "zzcfb", "zzcfc", "zzcfd", "zzcfe", "zzcff", "zzcfg", "zzcfh", "zzcfi", "zzcfj", "zzcfk", "zzcfl", "zzcfm", "zzcfn"});
            case 4:
                return zzcfo;
            case 5:
                AbstractC1750mda<C1839nna> mda = zzel;
                if (mda == null) {
                    synchronized (C1839nna.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcfo);
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
