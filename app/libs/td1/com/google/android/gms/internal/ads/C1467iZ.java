package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.iZ  reason: case insensitive filesystem */
public final class C1467iZ extends AbstractC2092rca<C1467iZ, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C1467iZ> zzel;
    private static final C1467iZ zzhss;
    private int zzhsb;
    private C1673lZ zzhsq;

    /* renamed from: com.google.android.gms.internal.ads.iZ$a */
    public static final class a extends AbstractC2092rca.b<C1467iZ, a> implements AbstractC1131dda {
        private a() {
            super(C1467iZ.zzhss);
        }

        /* synthetic */ a(C1535jZ jZVar) {
            this();
        }
    }

    static {
        C1467iZ iZVar = new C1467iZ();
        zzhss = iZVar;
        AbstractC2092rca.a(C1467iZ.class, iZVar);
    }

    private C1467iZ() {
    }

    public static C1467iZ a(Iba iba, C1197eca eca) {
        return (C1467iZ) AbstractC2092rca.a(zzhss, iba, eca);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1535jZ.f4682a[i - 1]) {
            case 1:
                return new C1467iZ();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhss, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzhsq", "zzhsb"});
            case 4:
                return zzhss;
            case 5:
                AbstractC1750mda<C1467iZ> mda = zzel;
                if (mda == null) {
                    synchronized (C1467iZ.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhss);
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

    public final C1673lZ o() {
        C1673lZ lZVar = this.zzhsq;
        return lZVar == null ? C1673lZ.o() : lZVar;
    }
}
