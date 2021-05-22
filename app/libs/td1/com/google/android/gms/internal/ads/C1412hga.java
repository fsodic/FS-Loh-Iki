package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.hga  reason: case insensitive filesystem */
public final class C1412hga extends AbstractC2092rca<C1412hga, a> implements AbstractC1131dda {
    private static final C1412hga zzaca;
    private static volatile AbstractC1750mda<C1412hga> zzel;
    private C1480iga zzabx;
    private Iba zzaby;
    private Iba zzabz;
    private int zzdw;

    /* renamed from: com.google.android.gms.internal.ads.hga$a */
    public static final class a extends AbstractC2092rca.b<C1412hga, a> implements AbstractC1131dda {
        private a() {
            super(C1412hga.zzaca);
        }

        /* synthetic */ a(C1343gga gga) {
            this();
        }
    }

    static {
        C1412hga hga = new C1412hga();
        zzaca = hga;
        AbstractC2092rca.a(C1412hga.class, hga);
    }

    private C1412hga() {
        Iba iba = Iba.f2236a;
        this.zzaby = iba;
        this.zzabz = iba;
    }

    public static C1412hga a(Iba iba, C1197eca eca) {
        return (C1412hga) AbstractC2092rca.a(zzaca, iba, eca);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1343gga.f4407a[i - 1]) {
            case 1:
                return new C1412hga();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzaca, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzdw", "zzabx", "zzaby", "zzabz"});
            case 4:
                return zzaca;
            case 5:
                AbstractC1750mda<C1412hga> mda = zzel;
                if (mda == null) {
                    synchronized (C1412hga.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzaca);
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

    public final C1480iga n() {
        C1480iga iga = this.zzabx;
        return iga == null ? C1480iga.t() : iga;
    }

    public final Iba o() {
        return this.zzaby;
    }

    public final Iba p() {
        return this.zzabz;
    }
}
