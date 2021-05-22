package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.lZ  reason: case insensitive filesystem */
public final class C1673lZ extends AbstractC2092rca<C1673lZ, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C1673lZ> zzel;
    private static final C1673lZ zzhst;
    private int zzhso;

    /* renamed from: com.google.android.gms.internal.ads.lZ$a */
    public static final class a extends AbstractC2092rca.b<C1673lZ, a> implements AbstractC1131dda {
        private a() {
            super(C1673lZ.zzhst);
        }

        /* synthetic */ a(C1604kZ kZVar) {
            this();
        }
    }

    static {
        C1673lZ lZVar = new C1673lZ();
        zzhst = lZVar;
        AbstractC2092rca.a(C1673lZ.class, lZVar);
    }

    private C1673lZ() {
    }

    public static C1673lZ o() {
        return zzhst;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1604kZ.f4779a[i - 1]) {
            case 1:
                return new C1673lZ();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhst, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhso"});
            case 4:
                return zzhst;
            case 5:
                AbstractC1750mda<C1673lZ> mda = zzel;
                if (mda == null) {
                    synchronized (C1673lZ.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhst);
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
