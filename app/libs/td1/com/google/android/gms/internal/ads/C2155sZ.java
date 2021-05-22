package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.sZ  reason: case insensitive filesystem */
public final class C2155sZ extends AbstractC2092rca<C2155sZ, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C2155sZ> zzel;
    private static final C2155sZ zzhsw;
    private int zzhrx;
    private Iba zzhry = Iba.f2236a;

    /* renamed from: com.google.android.gms.internal.ads.sZ$a */
    public static final class a extends AbstractC2092rca.b<C2155sZ, a> implements AbstractC1131dda {
        private a() {
            super(C2155sZ.zzhsw);
        }

        /* synthetic */ a(C2224tZ tZVar) {
            this();
        }

        public final a a(int i) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C2155sZ) this.f5428b).b(0);
            return this;
        }

        public final a a(Iba iba) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C2155sZ) this.f5428b).a((C2155sZ) iba);
            return this;
        }
    }

    static {
        C2155sZ sZVar = new C2155sZ();
        zzhsw = sZVar;
        AbstractC2092rca.a(C2155sZ.class, sZVar);
    }

    private C2155sZ() {
    }

    public static C2155sZ a(Iba iba, C1197eca eca) {
        return (C2155sZ) AbstractC2092rca.a(zzhsw, iba, eca);
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
        return (a) zzhsw.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2224tZ.f5617a[i - 1]) {
            case 1:
                return new C2155sZ();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhsw, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzhrx", "zzhry"});
            case 4:
                return zzhsw;
            case 5:
                AbstractC1750mda<C2155sZ> mda = zzel;
                if (mda == null) {
                    synchronized (C2155sZ.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhsw);
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
