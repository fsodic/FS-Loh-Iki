package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.Dx  reason: case insensitive filesystem */
public final class C0289Dx extends AbstractC2092rca<C0289Dx, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C0289Dx> zzel;
    private static final C0289Dx zzex;
    private int zzdw;
    private C0315Ex zzev;
    private C0341Fx zzew;

    /* renamed from: com.google.android.gms.internal.ads.Dx$a */
    public static final class a extends AbstractC2092rca.b<C0289Dx, a> implements AbstractC1131dda {
        private a() {
            super(C0289Dx.zzex);
        }

        /* synthetic */ a(C0394Hy hy) {
            this();
        }
    }

    static {
        C0289Dx dx = new C0289Dx();
        zzex = dx;
        AbstractC2092rca.a(C0289Dx.class, dx);
    }

    private C0289Dx() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0394Hy.f2189a[i - 1]) {
            case 1:
                return new C0289Dx();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzex, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzdw", "zzev", "zzew"});
            case 4:
                return zzex;
            case 5:
                AbstractC1750mda<C0289Dx> mda = zzel;
                if (mda == null) {
                    synchronized (C0289Dx.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzex);
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

    public final boolean n() {
        return (this.zzdw & 2) != 0;
    }

    public final C0341Fx o() {
        C0341Fx fx = this.zzew;
        return fx == null ? C0341Fx.o() : fx;
    }

    public final boolean q() {
        return (this.zzdw & 1) != 0;
    }

    public final C0315Ex r() {
        C0315Ex ex = this.zzev;
        return ex == null ? C0315Ex.o() : ex;
    }
}
