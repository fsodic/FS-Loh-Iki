package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import com.google.android.gms.internal.ads.Xma;

public final class Oma extends AbstractC2092rca<Oma, b> implements AbstractC1131dda {
    private static final Oma zzbyt;
    private static volatile AbstractC1750mda<Oma> zzel;
    private int zzbyi;
    private int zzbyj = 1000;
    private Wma zzbyk;
    private Xma zzbyl;
    private Cca<Vma> zzbym = AbstractC2092rca.m();
    private Yma zzbyn;
    private C1426hna zzbyo;
    private C1288fna zzbyp;
    private C1082cna zzbyq;
    private C1151dna zzbyr;
    private Cca<C1839nna> zzbys = AbstractC2092rca.m();
    private int zzdw;

    public enum a implements AbstractC2437wca {
        AD_INITIATER_UNSPECIFIED(0),
        BANNER(1),
        DFP_BANNER(2),
        INTERSTITIAL(3),
        DFP_INTERSTITIAL(4),
        NATIVE_EXPRESS(5),
        AD_LOADER(6),
        REWARD_BASED_VIDEO_AD(7),
        BANNER_SEARCH_ADS(8),
        GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
        APP_OPEN(10);
        
        private static final AbstractC2368vca<a> l = new C2321una();
        private final int n;

        private a(int i) {
            this.n = i;
        }

        public static a a(int i) {
            switch (i) {
                case 0:
                    return AD_INITIATER_UNSPECIFIED;
                case 1:
                    return BANNER;
                case 2:
                    return DFP_BANNER;
                case 3:
                    return INTERSTITIAL;
                case 4:
                    return DFP_INTERSTITIAL;
                case 5:
                    return NATIVE_EXPRESS;
                case 6:
                    return AD_LOADER;
                case 7:
                    return REWARD_BASED_VIDEO_AD;
                case 8:
                    return BANNER_SEARCH_ADS;
                case 9:
                    return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                case 10:
                    return APP_OPEN;
                default:
                    return null;
            }
        }

        public static AbstractC2575yca b() {
            return C2183sna.f5551a;
        }

        public final int a() {
            return this.n;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.n + " name=" + name() + '>';
        }
    }

    public static final class b extends AbstractC2092rca.b<Oma, b> implements AbstractC1131dda {
        private b() {
            super(Oma.zzbyt);
        }

        /* synthetic */ b(Nma nma) {
            this();
        }

        public final b a(a aVar) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((Oma) this.f5428b).a((Oma) aVar);
            return this;
        }

        public final b a(Xma.a aVar) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((Oma) this.f5428b).a((Oma) ((Xma) aVar.j()));
            return this;
        }
    }

    static {
        Oma oma = new Oma();
        zzbyt = oma;
        AbstractC2092rca.a(Oma.class, oma);
    }

    private Oma() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(a aVar) {
        this.zzbyi = aVar.a();
        this.zzdw |= 1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Xma xma) {
        xma.getClass();
        this.zzbyl = xma;
        this.zzdw |= 8;
    }

    public static Oma o() {
        return zzbyt;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new Oma();
            case 2:
                return new b(null);
            case 3:
                return AbstractC2092rca.a(zzbyt, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzdw", "zzbyi", a.b(), "zzbyj", Cna.b(), "zzbyk", "zzbyl", "zzbym", Vma.class, "zzbyn", "zzbyo", "zzbyp", "zzbyq", "zzbyr", "zzbys", C1839nna.class});
            case 4:
                return zzbyt;
            case 5:
                AbstractC1750mda<Oma> mda = zzel;
                if (mda == null) {
                    synchronized (Oma.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzbyt);
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

    public final Xma n() {
        Xma xma = this.zzbyl;
        return xma == null ? Xma.n() : xma;
    }
}
