package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.lB  reason: case insensitive filesystem */
public final class C1649lB extends AbstractC2092rca<C1649lB, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C1649lB> zzel;
    private static final C1649lB zzlk;
    private int zzdw;
    private Iba zzlg;
    private Iba zzlh;
    private Iba zzli;
    private Iba zzlj;

    /* renamed from: com.google.android.gms.internal.ads.lB$a */
    public static final class a extends AbstractC2092rca.b<C1649lB, a> implements AbstractC1131dda {
        private a() {
            super(C1649lB.zzlk);
        }

        /* synthetic */ a(JA ja) {
            this();
        }

        public final a a(Iba iba) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1649lB) this.f5428b).a((C1649lB) iba);
            return this;
        }

        public final a b(Iba iba) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1649lB) this.f5428b).b(iba);
            return this;
        }

        public final a c(Iba iba) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1649lB) this.f5428b).c(iba);
            return this;
        }

        public final a d(Iba iba) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1649lB) this.f5428b).d(iba);
            return this;
        }
    }

    static {
        C1649lB lBVar = new C1649lB();
        zzlk = lBVar;
        AbstractC2092rca.a(C1649lB.class, lBVar);
    }

    private C1649lB() {
        Iba iba = Iba.f2236a;
        this.zzlg = iba;
        this.zzlh = iba;
        this.zzli = iba;
        this.zzlj = iba;
    }

    public static C1649lB a(byte[] bArr, C1197eca eca) {
        return (C1649lB) AbstractC2092rca.a(zzlk, bArr, eca);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Iba iba) {
        iba.getClass();
        this.zzdw |= 1;
        this.zzlg = iba;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(Iba iba) {
        iba.getClass();
        this.zzdw |= 2;
        this.zzlh = iba;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void c(Iba iba) {
        iba.getClass();
        this.zzdw |= 4;
        this.zzli = iba;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void d(Iba iba) {
        iba.getClass();
        this.zzdw |= 8;
        this.zzlj = iba;
    }

    public static a r() {
        return (a) zzlk.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (JA.f2296a[i - 1]) {
            case 1:
                return new C1649lB();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzlk, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzdw", "zzlg", "zzlh", "zzli", "zzlj"});
            case 4:
                return zzlk;
            case 5:
                AbstractC1750mda<C1649lB> mda = zzel;
                if (mda == null) {
                    synchronized (C1649lB.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzlk);
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

    public final Iba n() {
        return this.zzlg;
    }

    public final Iba o() {
        return this.zzlh;
    }

    public final Iba p() {
        return this.zzli;
    }

    public final Iba q() {
        return this.zzlj;
    }
}
