package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.Cw  reason: case insensitive filesystem */
public final class C0262Cw extends AbstractC2092rca<C0262Cw, a> implements AbstractC1131dda {
    private static final C0262Cw zzek;
    private static volatile AbstractC1750mda<C0262Cw> zzel;
    private int zzdw;
    private String zzdx = BuildConfig.FLAVOR;
    private long zzdy;
    private String zzdz = BuildConfig.FLAVOR;
    private String zzea = BuildConfig.FLAVOR;
    private String zzeb = BuildConfig.FLAVOR;
    private long zzec;
    private long zzed;
    private String zzee = BuildConfig.FLAVOR;
    private long zzef;
    private String zzeg = BuildConfig.FLAVOR;
    private String zzeh = BuildConfig.FLAVOR;
    private Cca<b> zzei = AbstractC2092rca.m();
    private int zzej;

    /* renamed from: com.google.android.gms.internal.ads.Cw$a */
    public static final class a extends AbstractC2092rca.b<C0262Cw, a> implements AbstractC1131dda {
        private a() {
            super(C0262Cw.zzek);
        }

        /* synthetic */ a(C1024bw bwVar) {
            this();
        }

        public final a a(long j) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C0262Cw) this.f5428b).a((C0262Cw) j);
            return this;
        }

        public final a a(c cVar) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C0262Cw) this.f5428b).a((C0262Cw) cVar);
            return this;
        }

        public final a a(String str) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C0262Cw) this.f5428b).a((C0262Cw) str);
            return this;
        }

        public final a b(String str) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C0262Cw) this.f5428b).b(str);
            return this;
        }

        public final a c(String str) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C0262Cw) this.f5428b).c(str);
            return this;
        }

        public final a d(String str) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C0262Cw) this.f5428b).d(str);
            return this;
        }

        public final a e(String str) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C0262Cw) this.f5428b).e(str);
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.Cw$b */
    public static final class b extends AbstractC2092rca<b, a> implements AbstractC1131dda {
        private static volatile AbstractC1750mda<b> zzel;
        private static final b zzeo;
        private int zzdw;
        private String zzem = BuildConfig.FLAVOR;
        private String zzen = BuildConfig.FLAVOR;

        /* renamed from: com.google.android.gms.internal.ads.Cw$b$a */
        public static final class a extends AbstractC2092rca.b<b, a> implements AbstractC1131dda {
            private a() {
                super(b.zzeo);
            }

            /* synthetic */ a(C1024bw bwVar) {
                this();
            }
        }

        static {
            b bVar = new b();
            zzeo = bVar;
            AbstractC2092rca.a(b.class, bVar);
        }

        private b() {
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.AbstractC2092rca
        public final Object a(int i, Object obj, Object obj2) {
            switch (C1024bw.f3955a[i - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(null);
                case 3:
                    return AbstractC2092rca.a(zzeo, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzdw", "zzem", "zzen"});
                case 4:
                    return zzeo;
                case 5:
                    AbstractC1750mda<b> mda = zzel;
                    if (mda == null) {
                        synchronized (b.class) {
                            mda = zzel;
                            if (mda == null) {
                                mda = new AbstractC2092rca.a<>(zzeo);
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
    }

    /* renamed from: com.google.android.gms.internal.ads.Cw$c */
    public enum c implements AbstractC2437wca {
        UNKNOWN(0),
        ENABLED(1),
        DISABLED(2);
        
        private static final AbstractC2368vca<c> d = new C1094cx();
        private final int f;

        private c(int i) {
            this.f = i;
        }

        public static c a(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ENABLED;
            }
            if (i != 2) {
                return null;
            }
            return DISABLED;
        }

        public static AbstractC2575yca b() {
            return C1301fy.f4355a;
        }

        public final int a() {
            return this.f;
        }

        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f + " name=" + name() + '>';
        }
    }

    static {
        C0262Cw cw = new C0262Cw();
        zzek = cw;
        AbstractC2092rca.a(C0262Cw.class, cw);
    }

    private C0262Cw() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(long j) {
        this.zzdw |= 2;
        this.zzdy = j;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(c cVar) {
        this.zzej = cVar.a();
        this.zzdw |= 2048;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        str.getClass();
        this.zzdw |= 1;
        this.zzdx = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(String str) {
        str.getClass();
        this.zzdw |= 4;
        this.zzdz = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void c(String str) {
        str.getClass();
        this.zzdw |= 8;
        this.zzea = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void d(String str) {
        str.getClass();
        this.zzdw |= 16;
        this.zzeb = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void e(String str) {
        str.getClass();
        this.zzdw |= 1024;
        this.zzeh = str;
    }

    public static a n() {
        return (a) zzek.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1024bw.f3955a[i - 1]) {
            case 1:
                return new C0262Cw();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzek, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zzdw", "zzdx", "zzdy", "zzdz", "zzea", "zzeb", "zzec", "zzed", "zzee", "zzef", "zzeg", "zzeh", "zzei", b.class, "zzej", c.b()});
            case 4:
                return zzek;
            case 5:
                AbstractC1750mda<C0262Cw> mda = zzel;
                if (mda == null) {
                    synchronized (C0262Cw.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzek);
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
}
