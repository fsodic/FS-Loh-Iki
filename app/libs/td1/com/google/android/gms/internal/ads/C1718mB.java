package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.mB  reason: case insensitive filesystem */
public final class C1718mB extends AbstractC2092rca<C1718mB, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C1718mB> zzel;
    private static final C1718mB zzme;
    private int zzdw;
    private long zzla;
    private String zzmc = BuildConfig.FLAVOR;
    private Iba zzmd = Iba.f2236a;

    /* renamed from: com.google.android.gms.internal.ads.mB$a */
    public static final class a extends AbstractC2092rca.b<C1718mB, a> implements AbstractC1131dda {
        private a() {
            super(C1718mB.zzme);
        }

        /* synthetic */ a(JA ja) {
            this();
        }
    }

    static {
        C1718mB mBVar = new C1718mB();
        zzme = mBVar;
        AbstractC2092rca.a(C1718mB.class, mBVar);
    }

    private C1718mB() {
    }

    public static C1718mB p() {
        return zzme;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (JA.f2296a[i - 1]) {
            case 1:
                return new C1718mB();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzme, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzdw", "zzla", "zzmc", "zzmd"});
            case 4:
                return zzme;
            case 5:
                AbstractC1750mda<C1718mB> mda = zzel;
                if (mda == null) {
                    synchronized (C1718mB.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzme);
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

    public final boolean n() {
        return (this.zzdw & 1) != 0;
    }

    public final long o() {
        return this.zzla;
    }
}
