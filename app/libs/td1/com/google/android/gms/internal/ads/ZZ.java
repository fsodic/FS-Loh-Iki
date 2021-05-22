package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import org.cocos2dx.lib.BuildConfig;

public final class ZZ extends AbstractC2092rca<ZZ, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<ZZ> zzel;
    private static final ZZ zzhvg;
    private String zzhuo = BuildConfig.FLAVOR;
    private Iba zzhup = Iba.f2236a;
    private int zzhvf;

    public static final class a extends AbstractC2092rca.b<ZZ, a> implements AbstractC1131dda {
        private a() {
            super(ZZ.zzhvg);
        }

        /* synthetic */ a(C0918aaa aaa) {
            this();
        }
    }

    static {
        ZZ zz = new ZZ();
        zzhvg = zz;
        AbstractC2092rca.a(ZZ.class, zz);
    }

    private ZZ() {
    }

    public static ZZ p() {
        return zzhvg;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0918aaa.f3818a[i - 1]) {
            case 1:
                return new ZZ();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhvg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzhuo", "zzhup", "zzhvf"});
            case 4:
                return zzhvg;
            case 5:
                AbstractC1750mda<ZZ> mda = zzel;
                if (mda == null) {
                    synchronized (ZZ.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhvg);
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

    public final String n() {
        return this.zzhuo;
    }

    public final Iba o() {
        return this.zzhup;
    }
}
