package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.jna  reason: case insensitive filesystem */
public final class C1563jna extends AbstractC2092rca<C1563jna, a> implements AbstractC1131dda {
    private static final C1563jna zzcep;
    private static volatile AbstractC1750mda<C1563jna> zzel;
    private int zzcen;
    private int zzceo;
    private int zzdw;

    /* renamed from: com.google.android.gms.internal.ads.jna$a */
    public static final class a extends AbstractC2092rca.b<C1563jna, a> implements AbstractC1131dda {
        private a() {
            super(C1563jna.zzcep);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }
    }

    static {
        C1563jna jna = new C1563jna();
        zzcep = jna;
        AbstractC2092rca.a(C1563jna.class, jna);
    }

    private C1563jna() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new C1563jna();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzcep, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzdw", "zzcen", "zzceo"});
            case 4:
                return zzcep;
            case 5:
                AbstractC1750mda<C1563jna> mda = zzel;
                if (mda == null) {
                    synchronized (C1563jna.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcep);
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
