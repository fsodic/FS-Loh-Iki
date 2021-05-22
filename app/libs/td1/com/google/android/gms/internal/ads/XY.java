package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

public final class XY extends AbstractC2092rca<XY, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<XY> zzel;
    private static final XY zzhsh;
    private int zzhrx;
    private C0916aZ zzhsf;
    private NZ zzhsg;

    public static final class a extends AbstractC2092rca.b<XY, a> implements AbstractC1131dda {
        private a() {
            super(XY.zzhsh);
        }

        /* synthetic */ a(YY yy) {
            this();
        }

        public final a a(int i) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((XY) this.f5428b).b(i);
            return this;
        }

        public final a a(NZ nz) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((XY) this.f5428b).a((XY) nz);
            return this;
        }

        public final a a(C0916aZ aZVar) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((XY) this.f5428b).a((XY) aZVar);
            return this;
        }
    }

    static {
        XY xy = new XY();
        zzhsh = xy;
        AbstractC2092rca.a(XY.class, xy);
    }

    private XY() {
    }

    public static XY a(Iba iba, C1197eca eca) {
        return (XY) AbstractC2092rca.a(zzhsh, iba, eca);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(NZ nz) {
        nz.getClass();
        this.zzhsg = nz;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(C0916aZ aZVar) {
        aZVar.getClass();
        this.zzhsf = aZVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhrx = i;
    }

    public static a q() {
        return (a) zzhsh.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (YY.f3567a[i - 1]) {
            case 1:
                return new XY();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhsh, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzhrx", "zzhsf", "zzhsg"});
            case 4:
                return zzhsh;
            case 5:
                AbstractC1750mda<XY> mda = zzel;
                if (mda == null) {
                    synchronized (XY.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhsh);
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

    public final int n() {
        return this.zzhrx;
    }

    public final C0916aZ o() {
        C0916aZ aZVar = this.zzhsf;
        return aZVar == null ? C0916aZ.r() : aZVar;
    }

    public final NZ p() {
        NZ nz = this.zzhsg;
        return nz == null ? NZ.r() : nz;
    }
}
