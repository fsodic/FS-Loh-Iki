package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Xq  reason: case insensitive filesystem */
public final class C0802Xq extends ThreadLocal<ByteBuffer> {
    C0802Xq(AbstractC2534xr xrVar) {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ ByteBuffer initialValue() {
        return ByteBuffer.allocate(32);
    }
}
