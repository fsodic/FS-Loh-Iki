package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.ads.lba  reason: case insensitive filesystem */
public final class C1677lba {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<SecureRandom> f4866a = new C1608kba();

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        f4866a.get().nextBytes(bArr);
        return bArr;
    }

    /* access modifiers changed from: private */
    public static SecureRandom b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
