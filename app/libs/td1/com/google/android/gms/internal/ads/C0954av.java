package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.av  reason: case insensitive filesystem */
public final class C0954av extends AbstractC2510xea {
    private ByteBuffer l;

    public C0954av(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2510xea
    public final void a(ByteBuffer byteBuffer) {
        this.l = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
