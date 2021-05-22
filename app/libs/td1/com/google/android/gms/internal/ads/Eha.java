package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class Eha extends C2516xha {

    /* renamed from: b  reason: collision with root package name */
    public final Aha f1885b = new Aha();

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer f1886c;
    public long d;
    private final int e = 0;

    public Eha(int i) {
    }

    private final ByteBuffer e(int i) {
        ByteBuffer byteBuffer = this.f1886c;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.C2516xha
    public final void a() {
        super.a();
        ByteBuffer byteBuffer = this.f1886c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void d(int i) {
        ByteBuffer byteBuffer = this.f1886c;
        if (byteBuffer != null) {
            int capacity = byteBuffer.capacity();
            int position = this.f1886c.position() + i;
            if (capacity < position) {
                e(position);
                throw null;
            }
            return;
        }
        e(i);
        throw null;
    }

    public final boolean e() {
        return c(1073741824);
    }
}
