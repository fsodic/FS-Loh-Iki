package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.mY  reason: case insensitive filesystem */
public final class C1741mY implements AbstractC1947pX {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f4954a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    private final ZZ f4955b;

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC1947pX f4956c;

    public C1741mY(ZZ zz, AbstractC1947pX pXVar) {
        this.f4955b = zz;
        this.f4956c = pXVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1947pX
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] f = LX.b(this.f4955b).f();
        byte[] a2 = this.f4956c.a(f, f4954a);
        byte[] a3 = ((AbstractC1947pX) LX.a(this.f4955b.n(), f, AbstractC1947pX.class)).a(bArr, bArr2);
        return ByteBuffer.allocate(a2.length + 4 + a3.length).putInt(a2.length).put(a2).put(a3).array();
    }
}
