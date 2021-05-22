package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.dna  reason: case insensitive filesystem */
public final class C1151dna extends AbstractC2092rca<C1151dna, a> implements AbstractC1131dda {
    private static final C1151dna zzcci;
    private static volatile AbstractC1750mda<C1151dna> zzel;
    private C1701lna zzccc;
    private int zzcce;
    private C1013bna zzccg;
    private Cca<C1632kna> zzcch = AbstractC2092rca.m();
    private int zzdw;

    /* renamed from: com.google.android.gms.internal.ads.dna$a */
    public static final class a extends AbstractC2092rca.b<C1151dna, a> implements AbstractC1131dda {
        private a() {
            super(C1151dna.zzcci);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }
    }

    static {
        C1151dna dna = new C1151dna();
        zzcci = dna;
        AbstractC2092rca.a(C1151dna.class, dna);
    }

    private C1151dna() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new C1151dna();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzcci, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဉ\u0002", new Object[]{"zzdw", "zzccg", "zzcch", C1632kna.class, "zzcce", Cna.b(), "zzccc"});
            case 4:
                return zzcci;
            case 5:
                AbstractC1750mda<C1151dna> mda = zzel;
                if (mda == null) {
                    synchronized (C1151dna.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcci);
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
