package com.google.android.gms.internal.ads;

public enum Cna implements AbstractC2437wca {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);
    
    private static final AbstractC2368vca<Cna> d = new Bna();
    private final int f;

    private Cna(int i) {
        this.f = i;
    }

    public static Cna a(int i) {
        if (i == 0) {
            return ENUM_FALSE;
        }
        if (i == 1) {
            return ENUM_TRUE;
        }
        if (i != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static AbstractC2575yca b() {
        return Dna.f1820a;
    }

    public final int a() {
        return this.f;
    }

    public final String toString() {
        return "<" + Cna.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f + " name=" + name() + '>';
    }
}
