package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.laa  reason: case insensitive filesystem */
public final class C1675laa extends AbstractC2092rca<C1675laa, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C1675laa> zzel;
    private static final C1675laa zzhwb;
    private int zzhrx;
    private C1882oaa zzhwa;

    /* renamed from: com.google.android.gms.internal.ads.laa$a */
    public static final class a extends AbstractC2092rca.b<C1675laa, a> implements AbstractC1131dda {
        private a() {
            super(C1675laa.zzhwb);
        }

        /* synthetic */ a(C1744maa maa) {
            this();
        }

        public final a a(int i) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1675laa) this.f5428b).b(0);
            return this;
        }

        public final a a(C1882oaa oaa) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1675laa) this.f5428b).a((C1675laa) oaa);
            return this;
        }
    }

    static {
        C1675laa laa = new C1675laa();
        zzhwb = laa;
        AbstractC2092rca.a(C1675laa.class, laa);
    }

    private C1675laa() {
    }

    public static C1675laa a(Iba iba, C1197eca eca) {
        return (C1675laa) AbstractC2092rca.a(zzhwb, iba, eca);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(C1882oaa oaa) {
        oaa.getClass();
        this.zzhwa = oaa;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhrx = i;
    }

    public static a p() {
        return (a) zzhwb.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1744maa.f4960a[i - 1]) {
            case 1:
                return new C1675laa();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhwb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhrx", "zzhwa"});
            case 4:
                return zzhwb;
            case 5:
                AbstractC1750mda<C1675laa> mda = zzel;
                if (mda == null) {
                    synchronized (C1675laa.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhwb);
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

    public final C1882oaa o() {
        C1882oaa oaa = this.zzhwa;
        return oaa == null ? C1882oaa.p() : oaa;
    }
}
