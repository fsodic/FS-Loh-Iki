package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.kB  reason: case insensitive filesystem */
public final class C1580kB extends AbstractC2092rca<C1580kB, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C1580kB> zzel;
    private static final C1580kB zzlf;
    private int zzdw;
    private long zzla;
    private int zzlb;
    private boolean zzlc;
    private AbstractC2506xca zzld = AbstractC2092rca.k();
    private long zzle;

    /* renamed from: com.google.android.gms.internal.ads.kB$a */
    public static final class a extends AbstractC2092rca.b<C1580kB, a> implements AbstractC1131dda {
        private a() {
            super(C1580kB.zzlf);
        }

        /* synthetic */ a(JA ja) {
            this();
        }
    }

    static {
        C1580kB kBVar = new C1580kB();
        zzlf = kBVar;
        AbstractC2092rca.a(C1580kB.class, kBVar);
    }

    private C1580kB() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (JA.f2296a[i - 1]) {
            case 1:
                return new C1580kB();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzlf, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzdw", "zzla", "zzlb", "zzlc", "zzld", "zzle"});
            case 4:
                return zzlf;
            case 5:
                AbstractC1750mda<C1580kB> mda = zzel;
                if (mda == null) {
                    synchronized (C1580kB.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzlf);
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
