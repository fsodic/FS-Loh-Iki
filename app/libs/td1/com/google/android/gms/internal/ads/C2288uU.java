package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import com.google.android.gms.internal.ads.C2013qU;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.uU  reason: case insensitive filesystem */
public final class C2288uU extends AbstractC2092rca<C2288uU, a> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C2288uU> zzel;
    private static final C2288uU zzhiw;
    private int zzdw;
    private String zzdx = BuildConfig.FLAVOR;
    private int zzhit;
    private String zzhiu = BuildConfig.FLAVOR;
    private C2013qU zzhiv;

    /* renamed from: com.google.android.gms.internal.ads.uU$a */
    public static final class a extends AbstractC2092rca.b<C2288uU, a> implements AbstractC1131dda {
        private a() {
            super(C2288uU.zzhiw);
        }

        /* synthetic */ a(C2357vU vUVar) {
            this();
        }

        public final a a(C2013qU.b bVar) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C2288uU) this.f5428b).a((C2288uU) ((C2013qU) bVar.j()));
            return this;
        }

        public final a a(b bVar) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C2288uU) this.f5428b).a((C2288uU) bVar);
            return this;
        }

        public final a a(String str) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C2288uU) this.f5428b).a((C2288uU) str);
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.uU$b */
    public enum b implements AbstractC2437wca {
        EVENT_TYPE_UNKNOWN(0),
        BLOCKED_IMPRESSION(1);
        

        /* renamed from: c  reason: collision with root package name */
        private static final AbstractC2368vca<b> f5725c = new C2426wU();
        private final int e;

        private b(int i) {
            this.e = i;
        }

        public static b a(int i) {
            if (i == 0) {
                return EVENT_TYPE_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return BLOCKED_IMPRESSION;
        }

        public static AbstractC2575yca b() {
            return C2564yU.f6091a;
        }

        public final int a() {
            return this.e;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.e + " name=" + name() + '>';
        }
    }

    static {
        C2288uU uUVar = new C2288uU();
        zzhiw = uUVar;
        AbstractC2092rca.a(C2288uU.class, uUVar);
    }

    private C2288uU() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(C2013qU qUVar) {
        qUVar.getClass();
        this.zzhiv = qUVar;
        this.zzdw |= 8;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(b bVar) {
        this.zzhit = bVar.a();
        this.zzdw |= 1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        str.getClass();
        this.zzdw |= 2;
        this.zzdx = str;
    }

    public static a n() {
        return (a) zzhiw.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2357vU.f5810a[i - 1]) {
            case 1:
                return new C2288uU();
            case 2:
                return new a(null);
            case 3:
                return AbstractC2092rca.a(zzhiw, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzdw", "zzhit", b.b(), "zzdx", "zzhiu", "zzhiv"});
            case 4:
                return zzhiw;
            case 5:
                AbstractC1750mda<C2288uU> mda = zzel;
                if (mda == null) {
                    synchronized (C2288uU.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhiw);
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
