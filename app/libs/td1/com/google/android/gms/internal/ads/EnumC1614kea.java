package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kea  reason: case insensitive filesystem */
public enum EnumC1614kea implements AbstractC2437wca {
    SAFE(0),
    DANGEROUS(1),
    UNKNOWN(2),
    POTENTIALLY_UNWANTED(3),
    DANGEROUS_HOST(4);
    
    private static final AbstractC2368vca<EnumC1614kea> f = new C1959pea();
    private final int h;

    private EnumC1614kea(int i) {
        this.h = i;
    }

    public static EnumC1614kea a(int i) {
        if (i == 0) {
            return SAFE;
        }
        if (i == 1) {
            return DANGEROUS;
        }
        if (i == 2) {
            return UNKNOWN;
        }
        if (i == 3) {
            return POTENTIALLY_UNWANTED;
        }
        if (i != 4) {
            return null;
        }
        return DANGEROUS_HOST;
    }

    public static AbstractC2575yca a() {
        return C1890oea.f5151a;
    }

    public final String toString() {
        return "<" + EnumC1614kea.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.h + " name=" + name() + '>';
    }
}
