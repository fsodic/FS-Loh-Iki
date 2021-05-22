package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* renamed from: com.google.android.gms.internal.ads.hk  reason: case insensitive filesystem */
public final class C1419hk {

    /* renamed from: a  reason: collision with root package name */
    private BigInteger f4505a = BigInteger.ONE;

    /* renamed from: b  reason: collision with root package name */
    private String f4506b = "0";

    public final synchronized String a() {
        String bigInteger;
        bigInteger = this.f4505a.toString();
        this.f4505a = this.f4505a.add(BigInteger.ONE);
        this.f4506b = bigInteger;
        return bigInteger;
    }

    public final synchronized String b() {
        return this.f4506b;
    }
}
