package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.haa  reason: case insensitive filesystem */
public final class C1400haa extends AbstractC2092rca<C1400haa, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C1400haa> zzel;
    private static final C1400haa zzhvx;
    private int zzhrx;
    private C1606kaa zzhvw;

    /* renamed from: com.google.android.gms.internal.ads.haa$a */
    public static final class a extends AbstractC2092rca.b<C1400haa, a> implements AbstractC1131dda {
        private a() {
            super(C1400haa.zzhvx);
        }

        /* synthetic */ a(C1469iaa iaa) {
            this();
        }

        public final a a(int i) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1400haa) this.f5428b).b(0);
            return this;
        }

        public final a a(C1606kaa kaa) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1400haa) this.f5428b).a((C1400haa) kaa);
            return this;
        }
    }

    static {
        C1400haa haa = new C1400haa();
        zzhvx = haa;
        AbstractC2092rca.a(C1400haa.class, haa);
    }

    private C1400haa() {
    }

    public static C1400haa a(Iba iba, C1197eca eca) {
        return (C1400haa) AbstractC2092rca.a(zzhvx, iba, eca);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(C1606kaa kaa) {
        kaa.getClass();
        this.zzhvw = kaa;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhrx = i;
    }

    public static a p() {
        return (a) zzhvx.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1469iaa.f4574a[i - 1]) {
            case 1:
                return new C1400haa();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhvx, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhrx", "zzhvw"});
            case 4:
                return zzhvx;
            case 5:
                AbstractC1750mda<C1400haa> mda = zzel;
                if (mda == null) {
                    synchronized (C1400haa.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhvx);
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

    public final C1606kaa o() {
        C1606kaa kaa = this.zzhvw;
        return kaa == null ? C1606kaa.o() : kaa;
    }
}
