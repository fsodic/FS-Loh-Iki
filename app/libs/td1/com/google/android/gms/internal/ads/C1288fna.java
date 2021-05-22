package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.fna  reason: case insensitive filesystem */
public final class C1288fna extends AbstractC2092rca<C1288fna, a> implements AbstractC1131dda {
    private static final C1288fna zzccw;
    private static volatile AbstractC1750mda<C1288fna> zzel;
    private int zzccu;
    private C1701lna zzccv;
    private int zzdw;

    /* renamed from: com.google.android.gms.internal.ads.fna$a */
    public static final class a extends AbstractC2092rca.b<C1288fna, a> implements AbstractC1131dda {
        private a() {
            super(C1288fna.zzccw);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }
    }

    static {
        C1288fna fna = new C1288fna();
        zzccw = fna;
        AbstractC2092rca.a(C1288fna.class, fna);
    }

    private C1288fna() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new C1288fna();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzccw, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzdw", "zzccu", Cna.b(), "zzccv"});
            case 4:
                return zzccw;
            case 5:
                AbstractC1750mda<C1288fna> mda = zzel;
                if (mda == null) {
                    synchronized (C1288fna.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzccw);
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
