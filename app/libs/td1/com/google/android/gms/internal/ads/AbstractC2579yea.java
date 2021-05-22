package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.yea  reason: case insensitive filesystem */
public abstract class AbstractC2579yea extends AbstractC2510xea implements AbstractC0856Zs {
    private int l;
    private int m;

    protected AbstractC2579yea(String str) {
        super(str);
    }

    public final int b() {
        if (!this.d) {
            a();
        }
        return this.l;
    }

    /* access modifiers changed from: protected */
    public final long b(ByteBuffer byteBuffer) {
        this.l = C2674zt.a(byteBuffer.get());
        this.m = (C2674zt.b(byteBuffer) << 8) + 0 + C2674zt.a(byteBuffer.get());
        return 4;
    }
}
