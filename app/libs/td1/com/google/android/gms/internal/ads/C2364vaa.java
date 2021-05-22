package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.vaa  reason: case insensitive filesystem */
public final class C2364vaa extends AbstractC2092rca<C2364vaa, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C2364vaa> zzel;
    private static final C2364vaa zzhwp;
    private int zzhrx;
    private Iba zzhry = Iba.f2236a;

    /* renamed from: com.google.android.gms.internal.ads.vaa$a */
    public static final class a extends AbstractC2092rca.b<C2364vaa, a> implements AbstractC1131dda {
        private a() {
            super(C2364vaa.zzhwp);
        }

        /* synthetic */ a(C2295uaa uaa) {
            this();
        }

        public final a a(int i) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C2364vaa) this.f5428b).b(0);
            return this;
        }

        public final a a(Iba iba) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C2364vaa) this.f5428b).a((C2364vaa) iba);
            return this;
        }
    }

    static {
        C2364vaa vaa = new C2364vaa();
        zzhwp = vaa;
        AbstractC2092rca.a(C2364vaa.class, vaa);
    }

    private C2364vaa() {
    }

    public static C2364vaa a(Iba iba, C1197eca eca) {
        return (C2364vaa) AbstractC2092rca.a(zzhwp, iba, eca);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Iba iba) {
        iba.getClass();
        this.zzhry = iba;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhrx = i;
    }

    public static a p() {
        return (a) zzhwp.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2295uaa.f5732a[i - 1]) {
            case 1:
                return new C2364vaa();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhwp, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzhrx", "zzhry"});
            case 4:
                return zzhwp;
            case 5:
                AbstractC1750mda<C2364vaa> mda = zzel;
                if (mda == null) {
                    synchronized (C2364vaa.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhwp);
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

    public final Iba o() {
        return this.zzhry;
    }
}
