package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

public final class _Y extends AbstractC2092rca<_Y, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<_Y> zzel;
    private static final _Y zzhsk;
    private C1123dZ zzhsi;
    private SZ zzhsj;

    public static final class a extends AbstractC2092rca.b<_Y, a> implements AbstractC1131dda {
        private a() {
            super(_Y.zzhsk);
        }

        /* synthetic */ a(ZY zy) {
            this();
        }
    }

    static {
        _Y _y = new _Y();
        zzhsk = _y;
        AbstractC2092rca.a(_Y.class, _y);
    }

    private _Y() {
    }

    public static _Y a(Iba iba, C1197eca eca) {
        return (_Y) AbstractC2092rca.a(zzhsk, iba, eca);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (ZY.f3642a[i - 1]) {
            case 1:
                return new _Y();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhsk, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzhsi", "zzhsj"});
            case 4:
                return zzhsk;
            case 5:
                AbstractC1750mda<_Y> mda = zzel;
                if (mda == null) {
                    synchronized (_Y.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhsk);
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

    public final C1123dZ n() {
        C1123dZ dZVar = this.zzhsi;
        return dZVar == null ? C1123dZ.p() : dZVar;
    }

    public final SZ o() {
        SZ sz = this.zzhsj;
        return sz == null ? SZ.p() : sz;
    }
}
