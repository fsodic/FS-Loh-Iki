package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import org.cocos2dx.lib.BuildConfig;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.caa  reason: case insensitive filesystem */
public final class C1056caa extends AbstractC2092rca<C1056caa, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C1056caa> zzel;
    private static final C1056caa zzhvl;
    private String zzhuo = BuildConfig.FLAVOR;
    private String zzhvh = BuildConfig.FLAVOR;
    private int zzhvi;
    private boolean zzhvj;
    private String zzhvk = BuildConfig.FLAVOR;

    /* renamed from: com.google.android.gms.internal.ads.caa$a */
    public static final class a extends AbstractC2092rca.b<C1056caa, a> implements AbstractC1131dda {
        private a() {
            super(C1056caa.zzhvl);
        }

        /* synthetic */ a(C0987baa baa) {
            this();
        }
    }

    static {
        C1056caa caa = new C1056caa();
        zzhvl = caa;
        AbstractC2092rca.a(C1056caa.class, caa);
    }

    private C1056caa() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0987baa.f3907a[i - 1]) {
            case 1:
                return new C1056caa();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhvl, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzhvh", "zzhuo", "zzhvi", "zzhvj", "zzhvk"});
            case 4:
                return zzhvl;
            case 5:
                AbstractC1750mda<C1056caa> mda = zzel;
                if (mda == null) {
                    synchronized (C1056caa.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhvl);
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

    public final String o() {
        return this.zzhvh;
    }

    public final int p() {
        return this.zzhvi;
    }

    public final boolean q() {
        return this.zzhvj;
    }

    public final String r() {
        return this.zzhvk;
    }
}
