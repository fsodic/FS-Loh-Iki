package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.vZ  reason: case insensitive filesystem */
public final class C2362vZ extends AbstractC2092rca<C2362vZ, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C2362vZ> zzel;
    private static final C2362vZ zzhsx;

    /* renamed from: com.google.android.gms.internal.ads.vZ$a */
    public static final class a extends AbstractC2092rca.b<C2362vZ, a> implements AbstractC1131dda {
        private a() {
            super(C2362vZ.zzhsx);
        }

        /* synthetic */ a(C2293uZ uZVar) {
            this();
        }
    }

    static {
        C2362vZ vZVar = new C2362vZ();
        zzhsx = vZVar;
        AbstractC2092rca.a(C2362vZ.class, vZVar);
    }

    private C2362vZ() {
    }

    public static C2362vZ a(Iba iba, C1197eca eca) {
        return (C2362vZ) AbstractC2092rca.a(zzhsx, iba, eca);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2293uZ.f5730a[i - 1]) {
            case 1:
                return new C2362vZ();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhsx, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzhsx;
            case 5:
                AbstractC1750mda<C2362vZ> mda = zzel;
                if (mda == null) {
                    synchronized (C2362vZ.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhsx);
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
