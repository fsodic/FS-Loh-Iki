package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.waa  reason: case insensitive filesystem */
public final class C2433waa extends AbstractC2092rca<C2433waa, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C2433waa> zzel;
    private static final C2433waa zzhwq;

    /* renamed from: com.google.android.gms.internal.ads.waa$a */
    public static final class a extends AbstractC2092rca.b<C2433waa, a> implements AbstractC1131dda {
        private a() {
            super(C2433waa.zzhwq);
        }

        /* synthetic */ a(C2502xaa xaa) {
            this();
        }
    }

    static {
        C2433waa waa = new C2433waa();
        zzhwq = waa;
        AbstractC2092rca.a(C2433waa.class, waa);
    }

    private C2433waa() {
    }

    public static C2433waa a(Iba iba, C1197eca eca) {
        return (C2433waa) AbstractC2092rca.a(zzhwq, iba, eca);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2502xaa.f5993a[i - 1]) {
            case 1:
                return new C2433waa();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhwq, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzhwq;
            case 5:
                AbstractC1750mda<C2433waa> mda = zzel;
                if (mda == null) {
                    synchronized (C2433waa.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhwq);
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
