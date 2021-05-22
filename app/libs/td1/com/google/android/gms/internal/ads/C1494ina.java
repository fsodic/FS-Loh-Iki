package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.ina  reason: case insensitive filesystem */
public final class C1494ina extends AbstractC2092rca<C1494ina, a> implements AbstractC1131dda {
    private static final C1494ina zzcem;
    private static volatile AbstractC1750mda<C1494ina> zzel;
    private int zzcek;
    private int zzcel;
    private int zzdw;

    /* renamed from: com.google.android.gms.internal.ads.ina$a */
    public static final class a extends AbstractC2092rca.b<C1494ina, a> implements AbstractC1131dda {
        private a() {
            super(C1494ina.zzcem);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }
    }

    static {
        C1494ina ina = new C1494ina();
        zzcem = ina;
        AbstractC2092rca.a(C1494ina.class, ina);
    }

    private C1494ina() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new C1494ina();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzcem, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzdw", "zzcek", "zzcel"});
            case 4:
                return zzcem;
            case 5:
                AbstractC1750mda<C1494ina> mda = zzel;
                if (mda == null) {
                    synchronized (C1494ina.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcem);
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
