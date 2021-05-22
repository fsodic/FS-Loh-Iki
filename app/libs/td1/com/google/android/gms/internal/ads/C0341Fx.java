package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.Fx  reason: case insensitive filesystem */
public final class C0341Fx extends AbstractC2092rca<C0341Fx, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C0341Fx> zzel;
    private static final C0341Fx zzfm;
    private int zzdw;
    private String zzfg = BuildConfig.FLAVOR;
    private String zzfh = BuildConfig.FLAVOR;
    private String zzfi = BuildConfig.FLAVOR;
    private String zzfj = BuildConfig.FLAVOR;
    private String zzfk = BuildConfig.FLAVOR;
    private String zzfl = BuildConfig.FLAVOR;

    /* renamed from: com.google.android.gms.internal.ads.Fx$a */
    public static final class a extends AbstractC2092rca.b<C0341Fx, a> implements AbstractC1131dda {
        private a() {
            super(C0341Fx.zzfm);
        }

        /* synthetic */ a(C0394Hy hy) {
            this();
        }
    }

    static {
        C0341Fx fx = new C0341Fx();
        zzfm = fx;
        AbstractC2092rca.a(C0341Fx.class, fx);
    }

    private C0341Fx() {
    }

    public static C0341Fx o() {
        return zzfm;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0394Hy.f2189a[i - 1]) {
            case 1:
                return new C0341Fx();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzfm, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzdw", "zzfg", "zzfh", "zzfi", "zzfj", "zzfk", "zzfl"});
            case 4:
                return zzfm;
            case 5:
                AbstractC1750mda<C0341Fx> mda = zzel;
                if (mda == null) {
                    synchronized (C0341Fx.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzfm);
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
        return this.zzfg;
    }
}
