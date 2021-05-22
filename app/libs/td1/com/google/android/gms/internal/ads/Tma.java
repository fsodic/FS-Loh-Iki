package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

public final class Tma extends AbstractC2092rca<Tma, a> implements AbstractC1131dda {
    private static final Tma zzcgk;
    private static volatile AbstractC1750mda<Tma> zzel;
    private boolean zzcgi;
    private int zzcgj;
    private int zzdw;

    public static final class a extends AbstractC2092rca.b<Tma, a> implements AbstractC1131dda {
        private a() {
            super(Tma.zzcgk);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }

        public final a a(int i) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((Tma) this.f5428b).b(i);
            return this;
        }

        public final a a(boolean z) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((Tma) this.f5428b).a((Tma) z);
            return this;
        }

        public final boolean k() {
            return ((Tma) this.f5428b).n();
        }
    }

    static {
        Tma tma = new Tma();
        zzcgk = tma;
        AbstractC2092rca.a(Tma.class, tma);
    }

    private Tma() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(boolean z) {
        this.zzdw |= 1;
        this.zzcgi = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzdw |= 2;
        this.zzcgj = i;
    }

    public static a o() {
        return (a) zzcgk.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new Tma();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzcgk, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzdw", "zzcgi", "zzcgj"});
            case 4:
                return zzcgk;
            case 5:
                AbstractC1750mda<Tma> mda = zzel;
                if (mda == null) {
                    synchronized (Tma.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcgk);
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
        return this.zzcgi;
    }
}
