package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import org.cocos2dx.lib.BuildConfig;

public final class Xma extends AbstractC2092rca<Xma, a> implements AbstractC1131dda {
    private static final Xma zzcah;
    private static volatile AbstractC1750mda<Xma> zzel;
    private String zzcac = BuildConfig.FLAVOR;
    private Cca<Vma> zzcad = AbstractC2092rca.m();
    private int zzcae = 1000;
    private int zzcaf = 1000;
    private int zzcag = 1000;
    private int zzdw;

    public static final class a extends AbstractC2092rca.b<Xma, a> implements AbstractC1131dda {
        private a() {
            super(Xma.zzcah);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }

        public final a a(String str) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((Xma) this.f5428b).a((Xma) str);
            return this;
        }
    }

    static {
        Xma xma = new Xma();
        zzcah = xma;
        AbstractC2092rca.a(Xma.class, xma);
    }

    private Xma() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        str.getClass();
        this.zzdw |= 1;
        this.zzcac = str;
    }

    public static Xma n() {
        return zzcah;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new Xma();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzcah, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zzdw", "zzcac", "zzcad", Vma.class, "zzcae", Cna.b(), "zzcaf", Cna.b(), "zzcag", Cna.b()});
            case 4:
                return zzcah;
            case 5:
                AbstractC1750mda<Xma> mda = zzel;
                if (mda == null) {
                    synchronized (Xma.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcah);
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
