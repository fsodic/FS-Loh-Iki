package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.ona  reason: case insensitive filesystem */
public final class C1908ona extends AbstractC2092rca<C1908ona, a> implements AbstractC1131dda {
    private static final C1908ona zzcfr;
    private static volatile AbstractC1750mda<C1908ona> zzel;
    private int zzcce = 1000;
    private C1977pna zzcfp;
    private C1701lna zzcfq;
    private int zzdw;

    /* renamed from: com.google.android.gms.internal.ads.ona$a */
    public static final class a extends AbstractC2092rca.b<C1908ona, a> implements AbstractC1131dda {
        private a() {
            super(C1908ona.zzcfr);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }
    }

    static {
        C1908ona ona = new C1908ona();
        zzcfr = ona;
        AbstractC2092rca.a(C1908ona.class, ona);
    }

    private C1908ona() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new C1908ona();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzcfr, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzdw", "zzcce", Cna.b(), "zzcfp", "zzcfq"});
            case 4:
                return zzcfr;
            case 5:
                AbstractC1750mda<C1908ona> mda = zzel;
                if (mda == null) {
                    synchronized (C1908ona.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcfr);
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
