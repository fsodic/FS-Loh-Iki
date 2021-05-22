package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.mna  reason: case insensitive filesystem */
public final class C1770mna extends AbstractC2092rca<C1770mna, a> implements AbstractC1131dda {
    private static final C1770mna zzcex;
    private static volatile AbstractC1750mda<C1770mna> zzel;
    private int zzceu;
    private int zzcev;
    private int zzcew;
    private int zzdw;

    /* renamed from: com.google.android.gms.internal.ads.mna$a */
    public static final class a extends AbstractC2092rca.b<C1770mna, a> implements AbstractC1131dda {
        private a() {
            super(C1770mna.zzcex);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }

        public final a a(int i) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1770mna) this.f5428b).b(i);
            return this;
        }

        public final a b(int i) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1770mna) this.f5428b).c(i);
            return this;
        }

        public final a c(int i) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1770mna) this.f5428b).d(i);
            return this;
        }
    }

    static {
        C1770mna mna = new C1770mna();
        zzcex = mna;
        AbstractC2092rca.a(C1770mna.class, mna);
    }

    private C1770mna() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzdw |= 1;
        this.zzceu = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void c(int i) {
        this.zzdw |= 2;
        this.zzcev = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void d(int i) {
        this.zzdw |= 4;
        this.zzcew = i;
    }

    public static a n() {
        return (a) zzcex.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new C1770mna();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzcex, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzdw", "zzceu", "zzcev", "zzcew"});
            case 4:
                return zzcex;
            case 5:
                AbstractC1750mda<C1770mna> mda = zzel;
                if (mda == null) {
                    synchronized (C1770mna.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcex);
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
