package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.Ex  reason: case insensitive filesystem */
public final class C0315Ex extends AbstractC2092rca<C0315Ex, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C0315Ex> zzel;
    private static final C0315Ex zzez;
    private int zzdw;
    private int zzey = 2;

    /* renamed from: com.google.android.gms.internal.ads.Ex$a */
    public static final class a extends AbstractC2092rca.b<C0315Ex, a> implements AbstractC1131dda {
        private a() {
            super(C0315Ex.zzez);
        }

        /* synthetic */ a(C0394Hy hy) {
            this();
        }
    }

    static {
        C0315Ex ex = new C0315Ex();
        zzez = ex;
        AbstractC2092rca.a(C0315Ex.class, ex);
    }

    private C0315Ex() {
    }

    public static C0315Ex o() {
        return zzez;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0394Hy.f2189a[i - 1]) {
            case 1:
                return new C0315Ex();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzez, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zzdw", "zzey", EnumC1440hz.a()});
            case 4:
                return zzez;
            case 5:
                AbstractC1750mda<C0315Ex> mda = zzel;
                if (mda == null) {
                    synchronized (C0315Ex.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzez);
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

    public final EnumC1440hz n() {
        EnumC1440hz a2 = EnumC1440hz.a(this.zzey);
        return a2 == null ? EnumC1440hz.ENUM_SIGNAL_SOURCE_ADSHIELD : a2;
    }
}
