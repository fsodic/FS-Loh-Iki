package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.kna  reason: case insensitive filesystem */
public final class C1632kna extends AbstractC2092rca<C1632kna, a> implements AbstractC1131dda {
    private static final C1632kna zzceq;
    private static volatile AbstractC1750mda<C1632kna> zzel;
    private String zzcbz = BuildConfig.FLAVOR;
    private int zzcca;
    private C1701lna zzccc;
    private int zzdw;

    /* renamed from: com.google.android.gms.internal.ads.kna$a */
    public static final class a extends AbstractC2092rca.b<C1632kna, a> implements AbstractC1131dda {
        private a() {
            super(C1632kna.zzceq);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }
    }

    static {
        C1632kna kna = new C1632kna();
        zzceq = kna;
        AbstractC2092rca.a(C1632kna.class, kna);
    }

    private C1632kna() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new C1632kna();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzceq, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zzdw", "zzcbz", "zzcca", Cna.b(), "zzccc"});
            case 4:
                return zzceq;
            case 5:
                AbstractC1750mda<C1632kna> mda = zzel;
                if (mda == null) {
                    synchronized (C1632kna.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzceq);
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
