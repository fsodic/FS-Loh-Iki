package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hz  reason: case insensitive filesystem */
public enum EnumC1440hz implements AbstractC2437wca {
    ENUM_SIGNAL_SOURCE_UNKNOWN(0),
    ENUM_SIGNAL_SOURCE_DISABLE(1),
    ENUM_SIGNAL_SOURCE_ADSHIELD(2),
    ENUM_SIGNAL_SOURCE_GASS(3),
    ENUM_SIGNAL_SOURCE_CALLER_PROVIDED(4);
    
    private static final AbstractC2368vca<EnumC1440hz> f = new C1442iA();
    private final int h;

    private EnumC1440hz(int i) {
        this.h = i;
    }

    public static EnumC1440hz a(int i) {
        if (i == 0) {
            return ENUM_SIGNAL_SOURCE_UNKNOWN;
        }
        if (i == 1) {
            return ENUM_SIGNAL_SOURCE_DISABLE;
        }
        if (i == 2) {
            return ENUM_SIGNAL_SOURCE_ADSHIELD;
        }
        if (i == 3) {
            return ENUM_SIGNAL_SOURCE_GASS;
        }
        if (i != 4) {
            return null;
        }
        return ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
    }

    public static AbstractC2575yca a() {
        return C0421Iz.f2292a;
    }

    public final String toString() {
        return "<" + EnumC1440hz.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.h + " name=" + name() + '>';
    }
}
