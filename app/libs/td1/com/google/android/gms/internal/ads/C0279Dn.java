package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.Dn  reason: case insensitive filesystem */
final class C0279Dn implements Dea {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f1819a;

    C0279Dn(ByteBuffer byteBuffer) {
        this.f1819a = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.Dea
    public final ByteBuffer a(long j, long j2) {
        int position = this.f1819a.position();
        this.f1819a.position((int) j);
        ByteBuffer slice = this.f1819a.slice();
        slice.limit((int) j2);
        this.f1819a.position(position);
        return slice;
    }

    @Override // com.google.android.gms.internal.ads.Dea
    public final void a(long j) {
        this.f1819a.position((int) j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.google.android.gms.internal.ads.Dea
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.Dea
    public final long position() {
        return (long) this.f1819a.position();
    }

    @Override // com.google.android.gms.internal.ads.Dea
    public final int read(ByteBuffer byteBuffer) {
        if (this.f1819a.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.f1819a.remaining());
        byte[] bArr = new byte[min];
        this.f1819a.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.Dea
    public final long size() {
        return (long) this.f1819a.limit();
    }
}
