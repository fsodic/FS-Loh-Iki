package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sF  reason: case insensitive filesystem */
public enum EnumC2135sF implements AbstractC2437wca {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_FAILURE(2),
    ENUM_UNKNOWN(1000);
    
    private static final AbstractC2368vca<EnumC2135sF> e = new UG();
    private final int g;

    private EnumC2135sF(int i) {
        this.g = i;
    }

    public static EnumC2135sF a(int i) {
        if (i == 0) {
            return ENUM_FALSE;
        }
        if (i == 1) {
            return ENUM_TRUE;
        }
        if (i == 2) {
            return ENUM_FAILURE;
        }
        if (i != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static AbstractC2575yca b() {
        return C2205tG.f5588a;
    }

    public final int a() {
        return this.g;
    }

    public final String toString() {
        return "<" + EnumC2135sF.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.g + " name=" + name() + '>';
    }
}
