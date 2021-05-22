package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.nB  reason: case insensitive filesystem */
public final class C1787nB extends AbstractC2092rca<C1787nB, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C1787nB> zzel;
    private static final C1787nB zzmf;
    private int zzdw;
    private String zzfl = BuildConfig.FLAVOR;

    /* renamed from: com.google.android.gms.internal.ads.nB$a */
    public static final class a extends AbstractC2092rca.b<C1787nB, a> implements AbstractC1131dda {
        private a() {
            super(C1787nB.zzmf);
        }

        /* synthetic */ a(JA ja) {
            this();
        }
    }

    static {
        C1787nB nBVar = new C1787nB();
        zzmf = nBVar;
        AbstractC2092rca.a(C1787nB.class, nBVar);
    }

    private C1787nB() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (JA.f2296a[i - 1]) {
            case 1:
                return new C1787nB();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzmf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzdw", "zzfl"});
            case 4:
                return zzmf;
            case 5:
                AbstractC1750mda<C1787nB> mda = zzel;
                if (mda == null) {
                    synchronized (C1787nB.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzmf);
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
