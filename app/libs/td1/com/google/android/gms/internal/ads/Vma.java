package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

public final class Vma extends AbstractC2092rca<Vma, b> implements AbstractC1131dda {
    private static final Vma zzbzx;
    private static volatile AbstractC1750mda<Vma> zzel;
    private int zzbzv;
    private C1563jna zzbzw;
    private int zzdw;

    public enum a implements AbstractC2437wca {
        AD_FORMAT_TYPE_UNSPECIFIED(0),
        BANNER(1),
        INTERSTITIAL(2),
        NATIVE_EXPRESS(3),
        NATIVE_CONTENT(4),
        NATIVE_APP_INSTALL(5),
        NATIVE_CUSTOM_TEMPLATE(6),
        DFP_BANNER(7),
        DFP_INTERSTITIAL(8),
        REWARD_BASED_VIDEO_AD(9),
        BANNER_SEARCH_ADS(10);
        
        private static final AbstractC2368vca<a> l = new C2597yna();
        private final int n;

        private a(int i) {
            this.n = i;
        }

        public static a a(int i) {
            switch (i) {
                case 0:
                    return AD_FORMAT_TYPE_UNSPECIFIED;
                case 1:
                    return BANNER;
                case 2:
                    return INTERSTITIAL;
                case 3:
                    return NATIVE_EXPRESS;
                case 4:
                    return NATIVE_CONTENT;
                case 5:
                    return NATIVE_APP_INSTALL;
                case 6:
                    return NATIVE_CUSTOM_TEMPLATE;
                case 7:
                    return DFP_BANNER;
                case 8:
                    return DFP_INTERSTITIAL;
                case 9:
                    return REWARD_BASED_VIDEO_AD;
                case 10:
                    return BANNER_SEARCH_ADS;
                default:
                    return null;
            }
        }

        public static AbstractC2575yca b() {
            return C2528xna.f6027a;
        }

        public final int a() {
            return this.n;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.n + " name=" + name() + '>';
        }
    }

    public static final class b extends AbstractC2092rca.b<Vma, b> implements AbstractC1131dda {
        private b() {
            super(Vma.zzbzx);
        }

        /* synthetic */ b(Nma nma) {
            this();
        }
    }

    static {
        Vma vma = new Vma();
        zzbzx = vma;
        AbstractC2092rca.a(Vma.class, vma);
    }

    private Vma() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new Vma();
            case 2:
                return new b(null);
            case 3:
                return AbstractC2092rca.a(zzbzx, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzdw", "zzbzv", a.b(), "zzbzw"});
            case 4:
                return zzbzx;
            case 5:
                AbstractC1750mda<Vma> mda = zzel;
                if (mda == null) {
                    synchronized (Vma.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzbzx);
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
