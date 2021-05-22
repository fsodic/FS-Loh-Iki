package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

public final class BZ extends AbstractC2092rca<BZ, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<BZ> zzel;
    private static final BZ zzhth;
    private CZ zzhtg;

    public static final class a extends AbstractC2092rca.b<BZ, a> implements AbstractC1131dda {
        private a() {
            super(BZ.zzhth);
        }

        /* synthetic */ a(AZ az) {
            this();
        }
    }

    static {
        BZ bz = new BZ();
        zzhth = bz;
        AbstractC2092rca.a(BZ.class, bz);
    }

    private BZ() {
    }

    public static BZ a(Iba iba, C1197eca eca) {
        return (BZ) AbstractC2092rca.a(zzhth, iba, eca);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (AZ.f1519a[i - 1]) {
            case 1:
                return new BZ();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhth, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzhtg"});
            case 4:
                return zzhth;
            case 5:
                AbstractC1750mda<BZ> mda = zzel;
                if (mda == null) {
                    synchronized (BZ.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhth);
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

    public final CZ n() {
        CZ cz = this.zzhtg;
        return cz == null ? CZ.q() : cz;
    }
}
