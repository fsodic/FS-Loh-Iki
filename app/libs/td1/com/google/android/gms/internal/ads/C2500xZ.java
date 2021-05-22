package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.xZ  reason: case insensitive filesystem */
public final class C2500xZ extends AbstractC2092rca<C2500xZ, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C2500xZ> zzel;
    private static final C2500xZ zzhtf;
    private ZZ zzhte;

    /* renamed from: com.google.android.gms.internal.ads.xZ$a */
    public static final class a extends AbstractC2092rca.b<C2500xZ, a> implements AbstractC1131dda {
        private a() {
            super(C2500xZ.zzhtf);
        }

        /* synthetic */ a(C2638zZ zZVar) {
            this();
        }
    }

    static {
        C2500xZ xZVar = new C2500xZ();
        zzhtf = xZVar;
        AbstractC2092rca.a(C2500xZ.class, xZVar);
    }

    private C2500xZ() {
    }

    public static C2500xZ o() {
        return zzhtf;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2638zZ.f6188a[i - 1]) {
            case 1:
                return new C2500xZ();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhtf, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzhte"});
            case 4:
                return zzhtf;
            case 5:
                AbstractC1750mda<C2500xZ> mda = zzel;
                if (mda == null) {
                    synchronized (C2500xZ.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhtf);
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

    public final ZZ n() {
        ZZ zz = this.zzhte;
        return zz == null ? ZZ.p() : zz;
    }
}
