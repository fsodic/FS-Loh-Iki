package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.iga  reason: case insensitive filesystem */
public final class C1480iga extends AbstractC2092rca<C1480iga, a> implements AbstractC1131dda {
    private static final C1480iga zzacg;
    private static volatile AbstractC1750mda<C1480iga> zzel;
    private String zzacb = BuildConfig.FLAVOR;
    private String zzacc = BuildConfig.FLAVOR;
    private long zzacd;
    private long zzace;
    private long zzacf;
    private int zzdw;

    /* renamed from: com.google.android.gms.internal.ads.iga$a */
    public static final class a extends AbstractC2092rca.b<C1480iga, a> implements AbstractC1131dda {
        private a() {
            super(C1480iga.zzacg);
        }

        /* synthetic */ a(C1549jga jga) {
            this();
        }

        public final a a(long j) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1480iga) this.f5428b).a((C1480iga) j);
            return this;
        }

        public final a a(String str) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1480iga) this.f5428b).a((C1480iga) str);
            return this;
        }

        public final a b(long j) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1480iga) this.f5428b).b((C1480iga) j);
            return this;
        }

        public final a b(String str) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1480iga) this.f5428b).b((C1480iga) str);
            return this;
        }

        public final a c(long j) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1480iga) this.f5428b).c(j);
            return this;
        }
    }

    static {
        C1480iga iga = new C1480iga();
        zzacg = iga;
        AbstractC2092rca.a(C1480iga.class, iga);
    }

    private C1480iga() {
    }

    public static C1480iga a(Iba iba) {
        return (C1480iga) AbstractC2092rca.a(zzacg, iba);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(long j) {
        this.zzdw |= 4;
        this.zzacd = j;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        str.getClass();
        this.zzdw |= 1;
        this.zzacb = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(long j) {
        this.zzdw |= 8;
        this.zzace = j;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(String str) {
        str.getClass();
        this.zzdw |= 2;
        this.zzacc = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void c(long j) {
        this.zzdw |= 16;
        this.zzacf = j;
    }

    public static a s() {
        return (a) zzacg.i();
    }

    public static C1480iga t() {
        return zzacg;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1549jga.f4702a[i - 1]) {
            case 1:
                return new C1480iga();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzacg, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzdw", "zzacb", "zzacc", "zzacd", "zzace", "zzacf"});
            case 4:
                return zzacg;
            case 5:
                AbstractC1750mda<C1480iga> mda = zzel;
                if (mda == null) {
                    synchronized (C1480iga.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzacg);
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
        return this.zzacb;
    }

    public final String o() {
        return this.zzacc;
    }

    public final long p() {
        return this.zzacd;
    }

    public final long q() {
        return this.zzace;
    }

    public final long r() {
        return this.zzacf;
    }
}
