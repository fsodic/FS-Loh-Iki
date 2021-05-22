package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.ena  reason: case insensitive filesystem */
public final class C1219ena extends AbstractC2092rca<C1219ena, b> implements AbstractC1131dda {
    private static final C1219ena zzcck;
    private static volatile AbstractC1750mda<C1219ena> zzel;
    private int zzbzv;
    private int zzccj;
    private int zzdw;

    /* renamed from: com.google.android.gms.internal.ads.ena$a */
    public enum a implements AbstractC2437wca {
        CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
        TWO_G(1),
        THREE_G(2),
        LTE(4);
        
        private static final AbstractC2368vca<a> e = new Fna();
        private final int g;

        private a(int i) {
            this.g = i;
        }

        public static a a(int i) {
            if (i == 0) {
                return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return TWO_G;
            }
            if (i == 2) {
                return THREE_G;
            }
            if (i != 4) {
                return null;
            }
            return LTE;
        }

        public static AbstractC2575yca b() {
            return Ena.f1905a;
        }

        public final int a() {
            return this.g;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.g + " name=" + name() + '>';
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.ena$b */
    public static final class b extends AbstractC2092rca.b<C1219ena, b> implements AbstractC1131dda {
        private b() {
            super(C1219ena.zzcck);
        }

        /* synthetic */ b(Nma nma) {
            this();
        }

        public final b a(a aVar) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1219ena) this.f5428b).a((C1219ena) aVar);
            return this;
        }

        public final b a(c cVar) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C1219ena) this.f5428b).a((C1219ena) cVar);
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.ena$c */
    public enum c implements AbstractC2437wca {
        NETWORKTYPE_UNSPECIFIED(0),
        CELL(1),
        WIFI(2);
        
        private static final AbstractC2368vca<c> d = new Gna();
        private final int f;

        private c(int i) {
            this.f = i;
        }

        public static c a(int i) {
            if (i == 0) {
                return NETWORKTYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return CELL;
            }
            if (i != 2) {
                return null;
            }
            return WIFI;
        }

        public static AbstractC2575yca b() {
            return Hna.f2176a;
        }

        public final int a() {
            return this.f;
        }

        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f + " name=" + name() + '>';
        }
    }

    static {
        C1219ena ena = new C1219ena();
        zzcck = ena;
        AbstractC2092rca.a(C1219ena.class, ena);
    }

    private C1219ena() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(a aVar) {
        this.zzccj = aVar.a();
        this.zzdw |= 2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(c cVar) {
        this.zzbzv = cVar.a();
        this.zzdw |= 1;
    }

    public static b n() {
        return (b) zzcck.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (Nma.f2699a[i - 1]) {
            case 1:
                return new C1219ena();
            case 2:
                return new b(null);
            case 3:
                return AbstractC2092rca.a(zzcck, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzdw", "zzbzv", c.b(), "zzccj", a.b()});
            case 4:
                return zzcck;
            case 5:
                AbstractC1750mda<C1219ena> mda = zzel;
                if (mda == null) {
                    synchronized (C1219ena.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzcck);
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
