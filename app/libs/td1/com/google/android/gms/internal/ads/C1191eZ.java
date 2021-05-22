package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.eZ  reason: case insensitive filesystem */
public final class C1191eZ extends AbstractC2092rca<C1191eZ, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C1191eZ> zzel;
    private static final C1191eZ zzhsp;
    private int zzhso;

    /* renamed from: com.google.android.gms.internal.ads.eZ$a */
    public static final class a extends AbstractC2092rca.b<C1191eZ, a> implements AbstractC1131dda {
        private a() {
            super(C1191eZ.zzhsp);
        }

        /* synthetic */ a(C1260fZ fZVar) {
            this();
        }
    }

    static {
        C1191eZ eZVar = new C1191eZ();
        zzhsp = eZVar;
        AbstractC2092rca.a(C1191eZ.class, eZVar);
    }

    private C1191eZ() {
    }

    public static C1191eZ o() {
        return zzhsp;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1260fZ.f4298a[i - 1]) {
            case 1:
                return new C1191eZ();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhsp, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhso"});
            case 4:
                return zzhsp;
            case 5:
                AbstractC1750mda<C1191eZ> mda = zzel;
                if (mda == null) {
                    synchronized (C1191eZ.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhsp);
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
        return this.zzhso;
    }
}
