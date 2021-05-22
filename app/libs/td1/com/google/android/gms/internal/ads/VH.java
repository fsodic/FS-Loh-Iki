package com.google.android.gms.internal.ads;

public enum VH implements AbstractC2437wca {
    UNKNOWN_PROTO(0),
    AFMA_SIGNALS(1),
    UNITY_SIGNALS(2),
    PARTNER_SIGNALS(3);
    
    private static final AbstractC2368vca<VH> e = new C2275uH();
    private final int g;

    private VH(int i) {
        this.g = i;
    }

    public static VH a(int i) {
        if (i == 0) {
            return UNKNOWN_PROTO;
        }
        if (i == 1) {
            return AFMA_SIGNALS;
        }
        if (i == 2) {
            return UNITY_SIGNALS;
        }
        if (i != 3) {
            return null;
        }
        return PARTNER_SIGNALS;
    }

    public static AbstractC2575yca a() {
        return C2345vI.f5793a;
    }

    public final String toString() {
        return "<" + VH.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.g + " name=" + name() + '>';
    }
}
