package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import org.cocos2dx.lib.BuildConfig;

public final class _ma extends AbstractC2092rca<_ma, b> implements AbstractC1131dda {
    private static final _ma zzcbc;
    private static volatile AbstractC1750mda<_ma> zzel;
    private int zzcay;
    private C1770mna zzcaz;
    private String zzcba = BuildConfig.FLAVOR;
    private String zzcbb = BuildConfig.FLAVOR;
    private int zzdw;

    public enum a implements AbstractC2437wca {
        PLATFORM_UNSPECIFIED(0),
        IOS(1),
        ANDROID(2);
        
        private static final AbstractC2368vca<a> d = new Ana();
        private final int f;

        private a(int i) {
            this.f = i;
        }

        public static a a(int i) {
            if (i == 0) {
                return PLATFORM_UNSPECIFIED;
            }
            if (i == 1) {
                return IOS;
            }
            if (i != 2) {
                return null;
            }
            return ANDROID;
        }

        public static AbstractC2575yca a() {
            return C2666zna.f6211a;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f + " name=" + name() + '>';
        }
    }

    public static final class b extends AbstractC2092rca.b<_ma, b> implements AbstractC1131dda {
        private b() {
            super(_ma.zzcbc);
        }

        /* synthetic */ b(Nma nma) {
            this();
        }
    }

    static {
        _ma _ma = new _ma();
        zzcbc = _ma;
        AbstractC2092rca.a(_ma.class, _ma);
    }

    private _ma() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new _ma();
            case 2:
                return new b(null);
            case 3:
                return AbstractC2092rca.a(zzcbc, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzdw", "zzcay", a.a(), "zzcaz", "zzcba", "zzcbb"});
            case 4:
                return zzcbc;
            case 5:
                AbstractC1750mda<_ma> mda = zzel;
                if (mda == null) {
                    synchronized (_ma.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcbc);
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
