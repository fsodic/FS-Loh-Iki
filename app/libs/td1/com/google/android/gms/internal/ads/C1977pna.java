package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.pna  reason: case insensitive filesystem */
public final class C1977pna extends AbstractC2092rca<C1977pna, b> implements AbstractC1131dda {
    private static final C1977pna zzcft;
    private static volatile AbstractC1750mda<C1977pna> zzel;
    private int zzcfs;
    private int zzdw;

    /* renamed from: com.google.android.gms.internal.ads.pna$a */
    public enum a implements AbstractC2437wca {
        VIDEO_ERROR_CODE_UNSPECIFIED(0),
        OPENGL_RENDERING_FAILED(1),
        CACHE_LOAD_FAILED(2),
        ANDROID_TARGET_API_TOO_LOW(3);
        
        private static final AbstractC2368vca<a> e = new Mna();
        private final int g;

        private a(int i) {
            this.g = i;
        }

        public static a a(int i) {
            if (i == 0) {
                return VIDEO_ERROR_CODE_UNSPECIFIED;
            }
            if (i == 1) {
                return OPENGL_RENDERING_FAILED;
            }
            if (i == 2) {
                return CACHE_LOAD_FAILED;
            }
            if (i != 3) {
                return null;
            }
            return ANDROID_TARGET_API_TOO_LOW;
        }

        public static AbstractC2575yca a() {
            return Lna.f2537a;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.g + " name=" + name() + '>';
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.pna$b */
    public static final class b extends AbstractC2092rca.b<C1977pna, b> implements AbstractC1131dda {
        private b() {
            super(C1977pna.zzcft);
        }

        /* synthetic */ b(Nma nma) {
            this();
        }
    }

    static {
        C1977pna pna = new C1977pna();
        zzcft = pna;
        AbstractC2092rca.a(C1977pna.class, pna);
    }

    private C1977pna() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new C1977pna();
            case 2:
                return new b(null);
            case 3:
                return AbstractC2092rca.a(zzcft, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzdw", "zzcfs", a.a()});
            case 4:
                return zzcft;
            case 5:
                AbstractC1750mda<C1977pna> mda = zzel;
                if (mda == null) {
                    synchronized (C1977pna.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcft);
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
