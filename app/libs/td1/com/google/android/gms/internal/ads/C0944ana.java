package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import com.google.android.gms.internal.ads.Oma;
import com.google.android.gms.internal.ads.Zma;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.ana  reason: case insensitive filesystem */
public final class C0944ana extends AbstractC2092rca<C0944ana, a> implements AbstractC1131dda {
    private static final C0944ana zzcby;
    private static volatile AbstractC1750mda<C0944ana> zzel;
    private int zzcbl;
    private String zzcbm = BuildConfig.FLAVOR;
    private int zzcbn;
    private int zzcbo = 1000;
    private C1770mna zzcbp;
    private AbstractC2644zca zzcbq = AbstractC2092rca.l();
    private Zma zzcbr;
    private _ma zzcbs;
    private C1219ena zzcbt;
    private Oma zzcbu;
    private C1357gna zzcbv;
    private Tma zzcbw;
    private Uma zzcbx;
    private int zzdw;

    /* renamed from: com.google.android.gms.internal.ads.ana$a */
    public static final class a extends AbstractC2092rca.b<C0944ana, a> implements AbstractC1131dda {
        private a() {
            super(C0944ana.zzcby);
        }

        /* synthetic */ a(Nma nma) {
            this();
        }

        public final a a(Oma.b bVar) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C0944ana) this.f5428b).a((C0944ana) ((Oma) bVar.j()));
            return this;
        }

        public final a a(Tma tma) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C0944ana) this.f5428b).a((C0944ana) tma);
            return this;
        }

        public final a a(Uma uma) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C0944ana) this.f5428b).a((C0944ana) uma);
            return this;
        }

        public final a a(Zma.a aVar) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C0944ana) this.f5428b).a((C0944ana) ((Zma) aVar.j()));
            return this;
        }

        public final a a(C1357gna gna) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C0944ana) this.f5428b).a((C0944ana) gna);
            return this;
        }

        public final a a(Iterable<? extends Long> iterable) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C0944ana) this.f5428b).a((C0944ana) iterable);
            return this;
        }

        public final a a(String str) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C0944ana) this.f5428b).a((C0944ana) str);
            return this;
        }

        public final String k() {
            return ((C0944ana) this.f5428b).n();
        }

        public final Zma l() {
            return ((C0944ana) this.f5428b).o();
        }

        public final Oma m() {
            return ((C0944ana) this.f5428b).p();
        }

        public final a n() {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C0944ana) this.f5428b).s();
            return this;
        }
    }

    static {
        C0944ana ana = new C0944ana();
        zzcby = ana;
        AbstractC2092rca.a(C0944ana.class, ana);
    }

    private C0944ana() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Oma oma) {
        oma.getClass();
        this.zzcbu = oma;
        this.zzdw |= 256;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Tma tma) {
        tma.getClass();
        this.zzcbw = tma;
        this.zzdw |= 1024;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Uma uma) {
        uma.getClass();
        this.zzcbx = uma;
        this.zzdw |= 2048;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Zma zma) {
        zma.getClass();
        this.zzcbr = zma;
        this.zzdw |= 32;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(C1357gna gna) {
        gna.getClass();
        this.zzcbv = gna;
        this.zzdw |= 512;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Iterable<? extends Long> iterable) {
        if (!this.zzcbq.d()) {
            AbstractC2644zca zca = this.zzcbq;
            int size = zca.size();
            this.zzcbq = zca.e(size == 0 ? 10 : size << 1);
        }
        AbstractC2642zba.a(iterable, this.zzcbq);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        str.getClass();
        this.zzdw |= 2;
        this.zzcbm = str;
    }

    public static a q() {
        return (a) zzcby.i();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void s() {
        this.zzcbq = AbstractC2092rca.l();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new C0944ana();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzcby, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzdw", "zzcbl", "zzcbm", "zzcbn", "zzcbo", Cna.b(), "zzcbp", "zzcbq", "zzcbr", "zzcbs", "zzcbt", "zzcbu", "zzcbv", "zzcbw", "zzcbx"});
            case 4:
                return zzcby;
            case 5:
                AbstractC1750mda<C0944ana> mda = zzel;
                if (mda == null) {
                    synchronized (C0944ana.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcby);
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
        return this.zzcbm;
    }

    public final Zma o() {
        Zma zma = this.zzcbr;
        return zma == null ? Zma.n() : zma;
    }

    public final Oma p() {
        Oma oma = this.zzcbu;
        return oma == null ? Oma.o() : oma;
    }
}
