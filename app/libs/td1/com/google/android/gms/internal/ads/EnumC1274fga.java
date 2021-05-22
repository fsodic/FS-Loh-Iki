package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fga  reason: case insensitive filesystem */
public enum EnumC1274fga implements AbstractC2437wca {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6);
    
    private static final AbstractC2368vca<EnumC1274fga> f = new C1205ega();
    private final int h;

    private EnumC1274fga(int i) {
        this.h = i;
    }

    public final int a() {
        return this.h;
    }

    public final String toString() {
        return "<" + EnumC1274fga.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.h + " name=" + name() + '>';
    }
}
