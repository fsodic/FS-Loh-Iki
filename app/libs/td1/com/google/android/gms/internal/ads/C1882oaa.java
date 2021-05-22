package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.oaa  reason: case insensitive filesystem */
public final class C1882oaa extends AbstractC2092rca<C1882oaa, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C1882oaa> zzel;
    private static final C1882oaa zzhwe;
    private String zzhwc = BuildConfig.FLAVOR;
    private ZZ zzhwd;

    /* renamed from: com.google.android.gms.internal.ads.oaa$a */
    public static final class a extends AbstractC2092rca.b<C1882oaa, a> implements AbstractC1131dda {
        private a() {
            super(C1882oaa.zzhwe);
        }

        /* synthetic */ a(C1813naa naa) {
            this();
        }
    }

    static {
        C1882oaa oaa = new C1882oaa();
        zzhwe = oaa;
        AbstractC2092rca.a(C1882oaa.class, oaa);
    }

    private C1882oaa() {
    }

    public static C1882oaa a(Iba iba, C1197eca eca) {
        return (C1882oaa) AbstractC2092rca.a(zzhwe, iba, eca);
    }

    public static C1882oaa p() {
        return zzhwe;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1813naa.f5054a[i - 1]) {
            case 1:
                return new C1882oaa();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhwe, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzhwc", "zzhwd"});
            case 4:
                return zzhwe;
            case 5:
                AbstractC1750mda<C1882oaa> mda = zzel;
                if (mda == null) {
                    synchronized (C1882oaa.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhwe);
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
        return this.zzhwc;
    }

    public final ZZ o() {
        ZZ zz = this.zzhwd;
        return zz == null ? ZZ.p() : zz;
    }
}
