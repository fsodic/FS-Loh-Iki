package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

public final class Rla extends Kla {

    /* renamed from: c  reason: collision with root package name */
    private MessageDigest f3038c;

    @Override // com.google.android.gms.internal.ads.Kla
    public final byte[] a(String str) {
        byte[] bArr;
        String[] split = str.split(" ");
        int i = 4;
        if (split.length == 1) {
            int a2 = Ola.a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(a2);
            bArr = allocate.array();
        } else if (split.length < 5) {
            bArr = new byte[(split.length << 1)];
            for (int i2 = 0; i2 < split.length; i2++) {
                int a3 = Ola.a(split[i2]);
                int i3 = (a3 >> 16) ^ (65535 & a3);
                byte[] bArr2 = {(byte) i3, (byte) (i3 >> 8)};
                int i4 = i2 << 1;
                bArr[i4] = bArr2[0];
                bArr[i4 + 1] = bArr2[1];
            }
        } else {
            bArr = new byte[split.length];
            for (int i5 = 0; i5 < split.length; i5++) {
                int a4 = Ola.a(split[i5]);
                bArr[i5] = (byte) ((a4 >> 24) ^ (((a4 & 255) ^ ((a4 >> 8) & 255)) ^ ((a4 >> 16) & 255)));
            }
        }
        this.f3038c = a();
        synchronized (this.f2432b) {
            if (this.f3038c == null) {
                return new byte[0];
            }
            this.f3038c.reset();
            this.f3038c.update(bArr);
            byte[] digest = this.f3038c.digest();
            if (digest.length <= 4) {
                i = digest.length;
            }
            byte[] bArr3 = new byte[i];
            System.arraycopy(digest, 0, bArr3, 0, bArr3.length);
            return bArr3;
        }
    }
}
