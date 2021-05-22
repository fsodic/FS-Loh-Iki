package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.daa  reason: case insensitive filesystem */
public final class C1125daa extends AbstractC2092rca<C1125daa, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C1125daa> zzel;
    private static final C1125daa zzhvo;
    private int zzhvm;
    private Cca<b> zzhvn = AbstractC2092rca.m();

    /* renamed from: com.google.android.gms.internal.ads.daa$a */
    public static final class a extends AbstractC2092rca.b<C1125daa, a> implements AbstractC1131dda {
        private a() {
            super(C1125daa.zzhvo);
        }

        /* synthetic */ a(C1193eaa eaa) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.daa$b */
    public static final class b extends AbstractC2092rca<b, a> implements AbstractC1131dda {
        private static volatile AbstractC1750mda<b> zzel;
        private static final b zzhvs;
        private int zzhvf;
        private WZ zzhvp;
        private int zzhvq;
        private int zzhvr;

        /* renamed from: com.google.android.gms.internal.ads.daa$b$a */
        public static final class a extends AbstractC2092rca.b<b, a> implements AbstractC1131dda {
            private a() {
                super(b.zzhvs);
            }

            /* synthetic */ a(C1193eaa eaa) {
                this();
            }
        }

        static {
            b bVar = new b();
            zzhvs = bVar;
            AbstractC2092rca.a(b.class, bVar);
        }

        private b() {
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.AbstractC2092rca
        public final Object a(int i, Object obj, Object obj2) {
            switch (C1193eaa.f4216a[i - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(null);
                case 3:
                    return AbstractC2092rca.a(zzhvs, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzhvp", "zzhvq", "zzhvr", "zzhvf"});
                case 4:
                    return zzhvs;
                case 5:
                    AbstractC1750mda<b> mda = zzel;
                    if (mda == null) {
                        synchronized (b.class) {
                            mda = zzel;
                            if (mda == null) {
                                mda = new AbstractC2092rca.a<>(zzhvs);
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

        public final XZ n() {
            XZ a2 = XZ.a(this.zzhvq);
            return a2 == null ? XZ.UNRECOGNIZED : a2;
        }

        public final EnumC1951paa o() {
            EnumC1951paa a2 = EnumC1951paa.a(this.zzhvf);
            return a2 == null ? EnumC1951paa.UNRECOGNIZED : a2;
        }

        public final boolean p() {
            return this.zzhvp != null;
        }

        public final WZ q() {
            WZ wz = this.zzhvp;
            return wz == null ? WZ.r() : wz;
        }

        public final int r() {
            return this.zzhvr;
        }
    }

    static {
        C1125daa daa = new C1125daa();
        zzhvo = daa;
        AbstractC2092rca.a(C1125daa.class, daa);
    }

    private C1125daa() {
    }

    public static C1125daa a(byte[] bArr, C1197eca eca) {
        return (C1125daa) AbstractC2092rca.a(zzhvo, bArr, eca);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1193eaa.f4216a[i - 1]) {
            case 1:
                return new C1125daa();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhvo, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzhvm", "zzhvn", b.class});
            case 4:
                return zzhvo;
            case 5:
                AbstractC1750mda<C1125daa> mda = zzel;
                if (mda == null) {
                    synchronized (C1125daa.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhvo);
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
        return this.zzhvm;
    }

    public final List<b> o() {
        return this.zzhvn;
    }

    public final int p() {
        return this.zzhvn.size();
    }
}
