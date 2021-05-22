package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.hZ  reason: case insensitive filesystem */
public final class C1398hZ extends AbstractC2092rca<C1398hZ, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C1398hZ> zzel;
    private static final C1398hZ zzhsr;
    private int zzhrx;
    private Iba zzhry = Iba.f2236a;
    private C1673lZ zzhsq;

    /* renamed from: com.google.android.gms.internal.ads.hZ$a */
    public static final class a extends AbstractC2092rca.b<C1398hZ, a> implements AbstractC1131dda {
        private a() {
            super(C1398hZ.zzhsr);
        }

        /* synthetic */ a(C1329gZ gZVar) {
            this();
        }

        public final a a(int i) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1398hZ) this.f5428b).b(0);
            return this;
        }

        public final a a(Iba iba) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1398hZ) this.f5428b).a((C1398hZ) iba);
            return this;
        }

        public final a a(C1673lZ lZVar) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1398hZ) this.f5428b).a((C1398hZ) lZVar);
            return this;
        }
    }

    static {
        C1398hZ hZVar = new C1398hZ();
        zzhsr = hZVar;
        AbstractC2092rca.a(C1398hZ.class, hZVar);
    }

    private C1398hZ() {
    }

    public static C1398hZ a(Iba iba, C1197eca eca) {
        return (C1398hZ) AbstractC2092rca.a(zzhsr, iba, eca);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Iba iba) {
        iba.getClass();
        this.zzhry = iba;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(C1673lZ lZVar) {
        lZVar.getClass();
        this.zzhsq = lZVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhrx = i;
    }

    public static a q() {
        return (a) zzhsr.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1329gZ.f4396a[i - 1]) {
            case 1:
                return new C1398hZ();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhsr, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhrx", "zzhsq", "zzhry"});
            case 4:
                return zzhsr;
            case 5:
                AbstractC1750mda<C1398hZ> mda = zzel;
                if (mda == null) {
                    synchronized (C1398hZ.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhsr);
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

    public final C1673lZ p() {
        C1673lZ lZVar = this.zzhsq;
        return lZVar == null ? C1673lZ.o() : lZVar;
    }
}
