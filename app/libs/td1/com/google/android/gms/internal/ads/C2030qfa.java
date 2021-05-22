package com.google.android.gms.internal.ads;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.qfa  reason: case insensitive filesystem */
public final class C2030qfa implements AbstractC0368Gy {

    /* renamed from: a  reason: collision with root package name */
    private final FileChannel f5335a;

    /* renamed from: b  reason: collision with root package name */
    private final long f5336b;

    /* renamed from: c  reason: collision with root package name */
    private final long f5337c;

    public C2030qfa(FileChannel fileChannel, long j, long j2) {
        this.f5335a = fileChannel;
        this.f5336b = j;
        this.f5337c = j2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0368Gy
    public final void a(MessageDigest[] messageDigestArr, long j, int i) {
        MappedByteBuffer map = this.f5335a.map(FileChannel.MapMode.READ_ONLY, this.f5336b + j, (long) i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0368Gy
    public final long size() {
        return this.f5337c;
    }
}
