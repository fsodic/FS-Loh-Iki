package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import java.util.List;
import org.cocos2dx.lib.BuildConfig;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.raa  reason: case insensitive filesystem */
public final class C2088raa extends AbstractC2092rca<C2088raa, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C2088raa> zzel;
    private static final C2088raa zzhwo;
    private String zzhwm = BuildConfig.FLAVOR;
    private Cca<C1056caa> zzhwn = AbstractC2092rca.m();

    /* renamed from: com.google.android.gms.internal.ads.raa$a */
    public static final class a extends AbstractC2092rca.b<C2088raa, a> implements AbstractC1131dda {
        private a() {
            super(C2088raa.zzhwo);
        }

        /* synthetic */ a(C2226taa taa) {
            this();
        }
    }

    static {
        C2088raa raa = new C2088raa();
        zzhwo = raa;
        AbstractC2092rca.a(C2088raa.class, raa);
    }

    private C2088raa() {
    }

    public static C2088raa o() {
        return zzhwo;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2226taa.f5620a[i - 1]) {
            case 1:
                return new C2088raa();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhwo, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzhwm", "zzhwn", C1056caa.class});
            case 4:
                return zzhwo;
            case 5:
                AbstractC1750mda<C2088raa> mda = zzel;
                if (mda == null) {
                    synchronized (C2088raa.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhwo);
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

    public final List<C1056caa> n() {
        return this.zzhwn;
    }
}
