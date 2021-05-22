package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.kaa  reason: case insensitive filesystem */
public final class C1606kaa extends AbstractC2092rca<C1606kaa, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C1606kaa> zzel;
    private static final C1606kaa zzhvz;
    private String zzhvy = BuildConfig.FLAVOR;

    /* renamed from: com.google.android.gms.internal.ads.kaa$a */
    public static final class a extends AbstractC2092rca.b<C1606kaa, a> implements AbstractC1131dda {
        private a() {
            super(C1606kaa.zzhvz);
        }

        /* synthetic */ a(C1537jaa jaa) {
            this();
        }
    }

    static {
        C1606kaa kaa = new C1606kaa();
        zzhvz = kaa;
        AbstractC2092rca.a(C1606kaa.class, kaa);
    }

    private C1606kaa() {
    }

    public static C1606kaa a(Iba iba, C1197eca eca) {
        return (C1606kaa) AbstractC2092rca.a(zzhvz, iba, eca);
    }

    public static C1606kaa o() {
        return zzhvz;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1537jaa.f4686a[i - 1]) {
            case 1:
                return new C1606kaa();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhvz, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzhvy"});
            case 4:
                return zzhvz;
            case 5:
                AbstractC1750mda<C1606kaa> mda = zzel;
                if (mda == null) {
                    synchronized (C1606kaa.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhvz);
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
        return this.zzhvy;
    }
}
