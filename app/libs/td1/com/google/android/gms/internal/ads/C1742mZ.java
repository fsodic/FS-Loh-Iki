package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.mZ  reason: case insensitive filesystem */
public final class C1742mZ extends AbstractC2092rca<C1742mZ, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C1742mZ> zzel;
    private static final C1742mZ zzhsu;
    private int zzhrx;
    private Iba zzhry = Iba.f2236a;

    /* renamed from: com.google.android.gms.internal.ads.mZ$a */
    public static final class a extends AbstractC2092rca.b<C1742mZ, a> implements AbstractC1131dda {
        private a() {
            super(C1742mZ.zzhsu);
        }

        /* synthetic */ a(C1811nZ nZVar) {
            this();
        }

        public final a a(int i) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1742mZ) this.f5428b).b(0);
            return this;
        }

        public final a a(Iba iba) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1742mZ) this.f5428b).a((C1742mZ) iba);
            return this;
        }
    }

    static {
        C1742mZ mZVar = new C1742mZ();
        zzhsu = mZVar;
        AbstractC2092rca.a(C1742mZ.class, mZVar);
    }

    private C1742mZ() {
    }

    public static C1742mZ a(Iba iba, C1197eca eca) {
        return (C1742mZ) AbstractC2092rca.a(zzhsu, iba, eca);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Iba iba) {
        iba.getClass();
        this.zzhry = iba;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhrx = i;
    }

    public static a p() {
        return (a) zzhsu.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1811nZ.f5050a[i - 1]) {
            case 1:
                return new C1742mZ();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhsu, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzhrx", "zzhry"});
            case 4:
                return zzhsu;
            case 5:
                AbstractC1750mda<C1742mZ> mda = zzel;
                if (mda == null) {
                    synchronized (C1742mZ.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhsu);
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
        return this.zzhrx;
    }

    public final Iba o() {
        return this.zzhry;
    }
}
