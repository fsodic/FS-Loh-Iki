package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class HX<P> {

    /* renamed from: a  reason: collision with root package name */
    private final P f2141a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f2142b;

    /* renamed from: c  reason: collision with root package name */
    private final XZ f2143c;
    private final EnumC1951paa d;
    private final int e;

    HX(P p, byte[] bArr, XZ xz, EnumC1951paa paa, int i) {
        this.f2141a = p;
        this.f2142b = Arrays.copyOf(bArr, bArr.length);
        this.f2143c = xz;
        this.d = paa;
        this.e = i;
    }

    public final P a() {
        return this.f2141a;
    }

    public final XZ b() {
        return this.f2143c;
    }

    public final EnumC1951paa c() {
        return this.d;
    }

    public final byte[] d() {
        byte[] bArr = this.f2142b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
