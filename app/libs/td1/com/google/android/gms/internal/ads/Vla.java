package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

public final class Vla extends Kla {

    /* renamed from: c  reason: collision with root package name */
    private MessageDigest f3367c;
    private final int d;
    private final int e;

    public Vla(int i) {
        int i2 = i / 8;
        this.d = i % 8 > 0 ? i2 + 1 : i2;
        this.e = i;
    }

    @Override // com.google.android.gms.internal.ads.Kla
    public final byte[] a(String str) {
        synchronized (this.f2432b) {
            this.f3367c = a();
            if (this.f3367c == null) {
                return new byte[0];
            }
            this.f3367c.reset();
            this.f3367c.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] digest = this.f3367c.digest();
            byte[] bArr = new byte[(digest.length > this.d ? this.d : digest.length)];
            System.arraycopy(digest, 0, bArr, 0, bArr.length);
            if (this.e % 8 > 0) {
                long j = 0;
                for (int i = 0; i < bArr.length; i++) {
                    if (i > 0) {
                        j <<= 8;
                    }
                    j += (long) (bArr[i] & 255);
                }
                long j2 = j >>> (8 - (this.e % 8));
                for (int i2 = this.d - 1; i2 >= 0; i2--) {
                    bArr[i2] = (byte) ((int) (255 & j2));
                    j2 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
