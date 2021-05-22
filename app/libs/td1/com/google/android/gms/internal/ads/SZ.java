package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

public final class SZ extends AbstractC2092rca<SZ, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<SZ> zzel;
    private static final SZ zzhul;
    private int zzhrx;
    private int zzhsb;
    private TZ zzhuj;

    public static final class a extends AbstractC2092rca.b<SZ, a> implements AbstractC1131dda {
        private a() {
            super(SZ.zzhul);
        }

        /* synthetic */ a(RZ rz) {
            this();
        }
    }

    static {
        SZ sz = new SZ();
        zzhul = sz;
        AbstractC2092rca.a(SZ.class, sz);
    }

    private SZ() {
    }

    public static SZ a(Iba iba, C1197eca eca) {
        return (SZ) AbstractC2092rca.a(zzhul, iba, eca);
    }

    public static SZ p() {
        return zzhul;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (RZ.f3022a[i - 1]) {
            case 1:
                return new SZ();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhul, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzhuj", "zzhsb", "zzhrx"});
            case 4:
                return zzhul;
            case 5:
                AbstractC1750mda<SZ> mda = zzel;
                if (mda == null) {
                    synchronized (SZ.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhul);
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

    public final int n() {
        return this.zzhsb;
    }

    public final TZ o() {
        TZ tz = this.zzhuj;
        return tz == null ? TZ.p() : tz;
    }
}
