package com.google.android.gms.internal.ads;

public enum SE implements AbstractC2437wca {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3),
    DG(4),
    DG_XTEA(5);
    
    private static final AbstractC2368vca<SE> g = new C2065rE();
    private final int i;

    private SE(int i2) {
        this.i = i2;
    }

    public static SE a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_ENCRYPTION_METHOD;
        }
        if (i2 == 1) {
            return BITSLICER;
        }
        if (i2 == 2) {
            return TINK_HYBRID;
        }
        if (i2 == 3) {
            return UNENCRYPTED;
        }
        if (i2 == 4) {
            return DG;
        }
        if (i2 != 5) {
            return null;
        }
        return DG_XTEA;
    }

    public static AbstractC2575yca b() {
        return TF.f3155a;
    }

    public final int a() {
        return this.i;
    }

    public final String toString() {
        return "<" + SE.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.i + " name=" + name() + '>';
    }
}
