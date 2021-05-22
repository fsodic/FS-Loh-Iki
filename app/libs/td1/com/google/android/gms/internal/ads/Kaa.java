package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

abstract class Kaa implements AbstractC1947pX {

    /* renamed from: a  reason: collision with root package name */
    private final Iaa f2411a;

    /* renamed from: b  reason: collision with root package name */
    private final Iaa f2412b;

    public Kaa(byte[] bArr) {
        this.f2411a = a(bArr, 1);
        this.f2412b = a(bArr, 0);
    }

    /* access modifiers changed from: package-private */
    public abstract Iaa a(byte[] bArr, int i);

    @Override // com.google.android.gms.internal.ads.AbstractC1947pX
    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= (Integer.MAX_VALUE - this.f2411a.a()) - 16) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length + this.f2411a.a() + 16);
            if (allocate.remaining() >= bArr.length + this.f2411a.a() + 16) {
                int position = allocate.position();
                this.f2411a.a(allocate, bArr);
                allocate.position(position);
                byte[] bArr3 = new byte[this.f2411a.a()];
                allocate.get(bArr3);
                allocate.limit(allocate.limit() - 16);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] bArr4 = new byte[32];
                this.f2412b.a(bArr3, 0).get(bArr4);
                int length = bArr2.length % 16 == 0 ? bArr2.length : (bArr2.length + 16) - (bArr2.length % 16);
                int remaining = allocate.remaining();
                int i = remaining % 16;
                int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length;
                ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(length);
                order.put(allocate);
                order.position(i2);
                order.putLong((long) bArr2.length);
                order.putLong((long) remaining);
                byte[] a2 = C1471iba.a(bArr4, order.array());
                allocate.limit(allocate.limit() + 16);
                allocate.put(a2);
                return allocate.array();
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
