package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class Yaa implements AbstractC1947pX {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1333gba f3568a;

    /* renamed from: b  reason: collision with root package name */
    private final CX f3569b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3570c;

    public Yaa(AbstractC1333gba gba, CX cx, int i) {
        this.f3568a = gba;
        this.f3569b = cx;
        this.f3570c = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1947pX
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a2 = this.f3568a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return Gaa.a(a2, this.f3569b.a(Gaa.a(bArr2, a2, copyOf)));
    }
}
