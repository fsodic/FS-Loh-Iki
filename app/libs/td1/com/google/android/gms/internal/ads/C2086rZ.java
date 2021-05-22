package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.rZ  reason: case insensitive filesystem */
public final class C2086rZ extends AbstractC2092rca<C2086rZ, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C2086rZ> zzel;
    private static final C2086rZ zzhsv;
    private int zzhrx;
    private int zzhsb;

    /* renamed from: com.google.android.gms.internal.ads.rZ$a */
    public static final class a extends AbstractC2092rca.b<C2086rZ, a> implements AbstractC1131dda {
        private a() {
            super(C2086rZ.zzhsv);
        }

        /* synthetic */ a(C2018qZ qZVar) {
            this();
        }
    }

    static {
        C2086rZ rZVar = new C2086rZ();
        zzhsv = rZVar;
        AbstractC2092rca.a(C2086rZ.class, rZVar);
    }

    private C2086rZ() {
    }

    public static C2086rZ a(Iba iba, C1197eca eca) {
        return (C2086rZ) AbstractC2092rca.a(zzhsv, iba, eca);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2018qZ.f5322a[i - 1]) {
            case 1:
                return new C2086rZ();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhsv, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzhsb", "zzhrx"});
            case 4:
                return zzhsv;
            case 5:
                AbstractC1750mda<C2086rZ> mda = zzel;
                if (mda == null) {
                    synchronized (C2086rZ.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhsv);
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
}
