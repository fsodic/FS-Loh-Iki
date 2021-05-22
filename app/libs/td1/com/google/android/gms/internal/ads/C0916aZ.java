package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.aZ  reason: case insensitive filesystem */
public final class C0916aZ extends AbstractC2092rca<C0916aZ, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C0916aZ> zzel;
    private static final C0916aZ zzhsm;
    private int zzhrx;
    private Iba zzhry = Iba.f2236a;
    private C1191eZ zzhsl;

    /* renamed from: com.google.android.gms.internal.ads.aZ$a */
    public static final class a extends AbstractC2092rca.b<C0916aZ, a> implements AbstractC1131dda {
        private a() {
            super(C0916aZ.zzhsm);
        }

        /* synthetic */ a(C0985bZ bZVar) {
            this();
        }

        public final a a(int i) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C0916aZ) this.f5428b).b(0);
            return this;
        }

        public final a a(Iba iba) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C0916aZ) this.f5428b).a((C0916aZ) iba);
            return this;
        }

        public final a a(C1191eZ eZVar) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C0916aZ) this.f5428b).a((C0916aZ) eZVar);
            return this;
        }
    }

    static {
        C0916aZ aZVar = new C0916aZ();
        zzhsm = aZVar;
        AbstractC2092rca.a(C0916aZ.class, aZVar);
    }

    private C0916aZ() {
    }

    public static C0916aZ a(Iba iba, C1197eca eca) {
        return (C0916aZ) AbstractC2092rca.a(zzhsm, iba, eca);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Iba iba) {
        iba.getClass();
        this.zzhry = iba;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(C1191eZ eZVar) {
        eZVar.getClass();
        this.zzhsl = eZVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhrx = i;
    }

    public static a q() {
        return (a) zzhsm.i();
    }

    public static C0916aZ r() {
        return zzhsm;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0985bZ.f3903a[i - 1]) {
            case 1:
                return new C0916aZ();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhsm, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhrx", "zzhsl", "zzhry"});
            case 4:
                return zzhsm;
            case 5:
                AbstractC1750mda<C0916aZ> mda = zzel;
                if (mda == null) {
                    synchronized (C0916aZ.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhsm);
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

    public final C1191eZ p() {
        C1191eZ eZVar = this.zzhsl;
        return eZVar == null ? C1191eZ.o() : eZVar;
    }
}
