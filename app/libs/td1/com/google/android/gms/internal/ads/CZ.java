package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

public final class CZ extends AbstractC2092rca<CZ, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<CZ> zzel;
    private static final CZ zzhtl;
    private JZ zzhti;
    private C2500xZ zzhtj;
    private int zzhtk;

    public static final class a extends AbstractC2092rca.b<CZ, a> implements AbstractC1131dda {
        private a() {
            super(CZ.zzhtl);
        }

        /* synthetic */ a(DZ dz) {
            this();
        }
    }

    static {
        CZ cz = new CZ();
        zzhtl = cz;
        AbstractC2092rca.a(CZ.class, cz);
    }

    private CZ() {
    }

    public static CZ q() {
        return zzhtl;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (DZ.f1777a[i - 1]) {
            case 1:
                return new CZ();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhtl, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzhti", "zzhtj", "zzhtk"});
            case 4:
                return zzhtl;
            case 5:
                AbstractC1750mda<CZ> mda = zzel;
                if (mda == null) {
                    synchronized (CZ.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhtl);
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

    public final JZ n() {
        JZ jz = this.zzhti;
        return jz == null ? JZ.q() : jz;
    }

    public final C2500xZ o() {
        C2500xZ xZVar = this.zzhtj;
        return xZVar == null ? C2500xZ.o() : xZVar;
    }

    public final EnumC2431wZ p() {
        EnumC2431wZ a2 = EnumC2431wZ.a(this.zzhtk);
        return a2 == null ? EnumC2431wZ.UNRECOGNIZED : a2;
    }
}
