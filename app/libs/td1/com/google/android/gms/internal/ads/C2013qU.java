package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.qU  reason: case insensitive filesystem */
public final class C2013qU extends AbstractC2092rca<C2013qU, b> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<C2013qU> zzel;
    private static final Aca<Integer, a> zzhil = new C1944pU();
    private static final C2013qU zzhip;
    private int zzdw;
    private AbstractC2506xca zzhik = AbstractC2092rca.k();
    private String zzhim = BuildConfig.FLAVOR;
    private String zzhin = BuildConfig.FLAVOR;
    private String zzhio = BuildConfig.FLAVOR;

    /* renamed from: com.google.android.gms.internal.ads.qU$a */
    public enum a implements AbstractC2437wca {
        BLOCKED_REASON_UNKNOWN(1),
        BLOCKED_REASON_BACKGROUND(2);
        

        /* renamed from: c  reason: collision with root package name */
        private static final AbstractC2368vca<a> f5318c = new C2219tU();
        private final int e;

        private a(int i) {
            this.e = i;
        }

        public static a a(int i) {
            if (i == 1) {
                return BLOCKED_REASON_UNKNOWN;
            }
            if (i != 2) {
                return null;
            }
            return BLOCKED_REASON_BACKGROUND;
        }

        public static AbstractC2575yca b() {
            return C2150sU.f5517a;
        }

        public final int a() {
            return this.e;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.e + " name=" + name() + '>';
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.qU$b */
    public static final class b extends AbstractC2092rca.b<C2013qU, b> implements AbstractC1131dda {
        private b() {
            super(C2013qU.zzhip);
        }

        /* synthetic */ b(C1944pU pUVar) {
            this();
        }

        public final b a(a aVar) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C2013qU) this.f5428b).a((C2013qU) aVar);
            return this;
        }

        public final b a(String str) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((C2013qU) this.f5428b).a((C2013qU) str);
            return this;
        }
    }

    static {
        C2013qU qUVar = new C2013qU();
        zzhip = qUVar;
        AbstractC2092rca.a(C2013qU.class, qUVar);
    }

    private C2013qU() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(a aVar) {
        aVar.getClass();
        if (!this.zzhik.d()) {
            this.zzhik = AbstractC2092rca.a(this.zzhik);
        }
        this.zzhik.d(aVar.a());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        str.getClass();
        this.zzdw |= 1;
        this.zzhim = str;
    }

    public static b n() {
        return (b) zzhip.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2081rU.f5414a[i - 1]) {
            case 1:
                return new C2013qU();
            case 2:
                return new b(null);
            case 3:
                return AbstractC2092rca.a(zzhip, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzdw", "zzhik", a.b(), "zzhim", "zzhin", "zzhio"});
            case 4:
                return zzhip;
            case 5:
                AbstractC1750mda<C2013qU> mda = zzel;
                if (mda == null) {
                    synchronized (C2013qU.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhip);
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
