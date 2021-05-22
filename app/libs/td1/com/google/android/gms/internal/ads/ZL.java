package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* access modifiers changed from: package-private */
public final class ZL implements AbstractC0368Gy {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f3630a;

    public ZL(ByteBuffer byteBuffer) {
        this.f3630a = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0368Gy
    public final void a(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer slice;
        synchronized (this.f3630a) {
            int i2 = (int) j;
            this.f3630a.position(i2);
            this.f3630a.limit(i2 + i);
            slice = this.f3630a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0368Gy
    public final long size() {
        return (long) this.f3630a.capacity();
    }
}
