package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.lna  reason: case insensitive filesystem */
public final class C1701lna extends AbstractC2092rca<C1701lna, a> implements AbstractC1131dda {
    private static final C1701lna zzcet;
    private static volatile AbstractC1750mda<C1701lna> zzel;
    private int zzcer;
    private int zzces;
    private int zzdw;

    /* renamed from: com.google.android.gms.internal.ads.lna$a */
    public static final class a extends AbstractC2092rca.b<C1701lna, a> implements AbstractC1131dda {
        private a() {
            super(C1701lna.zzcet);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }
    }

    static {
        C1701lna lna = new C1701lna();
        zzcet = lna;
        AbstractC2092rca.a(C1701lna.class, lna);
    }

    private C1701lna() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new C1701lna();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzcet, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzdw", "zzcer", "zzces"});
            case 4:
                return zzcet;
            case 5:
                AbstractC1750mda<C1701lna> mda = zzel;
                if (mda == null) {
                    synchronized (C1701lna.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcet);
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
