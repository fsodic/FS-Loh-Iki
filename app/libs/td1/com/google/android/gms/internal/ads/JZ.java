package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

public final class JZ extends AbstractC2092rca<JZ, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<JZ> zzel;
    private static final JZ zzhtu;
    private int zzhtr;
    private int zzhts;
    private Iba zzhtt = Iba.f2236a;

    public static final class a extends AbstractC2092rca.b<JZ, a> implements AbstractC1131dda {
        private a() {
            super(JZ.zzhtu);
        }

        /* synthetic */ a(IZ iz) {
            this();
        }
    }

    static {
        JZ jz = new JZ();
        zzhtu = jz;
        AbstractC2092rca.a(JZ.class, jz);
    }

    private JZ() {
    }

    public static JZ q() {
        return zzhtu;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (IZ.f2232a[i - 1]) {
            case 1:
                return new JZ();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhtu, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzhtr", "zzhts", "zzhtt"});
            case 4:
                return zzhtu;
            case 5:
                AbstractC1750mda<JZ> mda = zzel;
                if (mda == null) {
                    synchronized (JZ.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhtu);
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

    public final KZ n() {
        KZ a2 = KZ.a(this.zzhtr);
        return a2 == null ? KZ.UNRECOGNIZED : a2;
    }

    public final LZ o() {
        LZ a2 = LZ.a(this.zzhts);
        return a2 == null ? LZ.UNRECOGNIZED : a2;
    }

    public final Iba p() {
        return this.zzhtt;
    }
}
