package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.dZ  reason: case insensitive filesystem */
public final class C1123dZ extends AbstractC2092rca<C1123dZ, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C1123dZ> zzel;
    private static final C1123dZ zzhsn;
    private int zzhsb;
    private C1191eZ zzhsl;

    /* renamed from: com.google.android.gms.internal.ads.dZ$a */
    public static final class a extends AbstractC2092rca.b<C1123dZ, a> implements AbstractC1131dda {
        private a() {
            super(C1123dZ.zzhsn);
        }

        /* synthetic */ a(C1054cZ cZVar) {
            this();
        }
    }

    static {
        C1123dZ dZVar = new C1123dZ();
        zzhsn = dZVar;
        AbstractC2092rca.a(C1123dZ.class, dZVar);
    }

    private C1123dZ() {
    }

    public static C1123dZ a(Iba iba, C1197eca eca) {
        return (C1123dZ) AbstractC2092rca.a(zzhsn, iba, eca);
    }

    public static C1123dZ p() {
        return zzhsn;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1054cZ.f4001a[i - 1]) {
            case 1:
                return new C1123dZ();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhsn, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzhsl", "zzhsb"});
            case 4:
                return zzhsn;
            case 5:
                AbstractC1750mda<C1123dZ> mda = zzel;
                if (mda == null) {
                    synchronized (C1123dZ.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhsn);
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

    public final C1191eZ o() {
        C1191eZ eZVar = this.zzhsl;
        return eZVar == null ? C1191eZ.o() : eZVar;
    }
}
