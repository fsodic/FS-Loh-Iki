package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import org.cocos2dx.lib.BuildConfig;

public final class Zma extends AbstractC2092rca<Zma, a> implements AbstractC1131dda {
    private static final Zma zzcax;
    private static volatile AbstractC1750mda<Zma> zzel;
    private String zzcap = BuildConfig.FLAVOR;
    private C1701lna zzcaq;
    private int zzcar;
    private C1770mna zzcas;
    private int zzcat;
    private int zzcau = 1000;
    private int zzcav = 1000;
    private int zzcaw = 1000;
    private int zzdw;

    public static final class a extends AbstractC2092rca.b<Zma, a> implements AbstractC1131dda {
        private a() {
            super(Zma.zzcax);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }

        public final a a(C1770mna mna) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((Zma) this.f5428b).a((Zma) mna);
            return this;
        }

        public final a a(String str) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((Zma) this.f5428b).a((Zma) str);
            return this;
        }
    }

    static {
        Zma zma = new Zma();
        zzcax = zma;
        AbstractC2092rca.a(Zma.class, zma);
    }

    private Zma() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(C1770mna mna) {
        mna.getClass();
        this.zzcas = mna;
        this.zzdw |= 8;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        str.getClass();
        this.zzdw |= 1;
        this.zzcap = str;
    }

    public static Zma n() {
        return zzcax;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new Zma();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzcax, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zzdw", "zzcap", "zzcaq", "zzcar", "zzcas", "zzcat", "zzcau", Cna.b(), "zzcav", Cna.b(), "zzcaw", Cna.b()});
            case 4:
                return zzcax;
            case 5:
                AbstractC1750mda<Zma> mda = zzel;
                if (mda == null) {
                    synchronized (Zma.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcax);
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
