package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import org.cocos2dx.lib.BuildConfig;

public final class WZ extends AbstractC2092rca<WZ, b> implements AbstractC1131dda {
    private static volatile AbstractC1750mda<WZ> zzel;
    private static final WZ zzhur;
    private String zzhuo = BuildConfig.FLAVOR;
    private Iba zzhup = Iba.f2236a;
    private int zzhuq;

    public enum a implements AbstractC2437wca {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        private static final AbstractC2368vca<a> g = new YZ();
        private final int i;

        private a(int i2) {
            this.i = i2;
        }

        public static a a(int i2) {
            if (i2 == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i2 == 1) {
                return SYMMETRIC;
            }
            if (i2 == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i2 == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i2 != 4) {
                return null;
            }
            return REMOTE;
        }

        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.i;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(a.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb.append(" number=");
                sb.append(a());
            }
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }
    }

    public static final class b extends AbstractC2092rca.b<WZ, b> implements AbstractC1131dda {
        private b() {
            super(WZ.zzhur);
        }

        /* synthetic */ b(VZ vz) {
            this();
        }

        public final b a(Iba iba) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((WZ) this.f5428b).a((WZ) iba);
            return this;
        }

        public final b a(a aVar) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((WZ) this.f5428b).a((WZ) aVar);
            return this;
        }

        public final b a(String str) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            ((WZ) this.f5428b).a((WZ) str);
            return this;
        }
    }

    static {
        WZ wz = new WZ();
        zzhur = wz;
        AbstractC2092rca.a(WZ.class, wz);
    }

    private WZ() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Iba iba) {
        iba.getClass();
        this.zzhup = iba;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(a aVar) {
        this.zzhuq = aVar.a();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        str.getClass();
        this.zzhuo = str;
    }

    public static b q() {
        return (b) zzhur.i();
    }

    public static WZ r() {
        return zzhur;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2092rca
    public final Object a(int i, Object obj, Object obj2) {
        switch (VZ.f3344a[i - 1]) {
            case 1:
                return new WZ();
            case 2:
                return new b(null);
            case 3:
                return AbstractC2092rca.a(zzhur, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzhuo", "zzhup", "zzhuq"});
            case 4:
                return zzhur;
            case 5:
                AbstractC1750mda<WZ> mda = zzel;
                if (mda == null) {
                    synchronized (WZ.class) {
                        mda = zzel;
                        if (mda == null) {
                            mda = new AbstractC2092rca.a<>(zzhur);
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
        return this.zzhuo;
    }

    public final Iba o() {
        return this.zzhup;
    }

    public final a p() {
        a a2 = a.a(this.zzhuq);
        return a2 == null ? a.UNRECOGNIZED : a2;
    }
}
