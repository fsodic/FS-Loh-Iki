package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;

public final class Sba extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f3099a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    private final int f3100b = 128;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<Iba> f3101c = new ArrayList<>();
    private int d;
    private byte[] e = new byte[128];
    private int f;

    Sba(int i) {
    }

    private final void a(int i) {
        this.f3101c.add(new Tba(this.e));
        this.d += this.e.length;
        this.e = new byte[Math.max(this.f3100b, Math.max(i, this.d >>> 1))];
        this.f = 0;
    }

    private final synchronized int size() {
        return this.d + this.f;
    }

    public final synchronized Iba a() {
        if (this.f >= this.e.length) {
            this.f3101c.add(new Tba(this.e));
            this.e = f3099a;
        } else if (this.f > 0) {
            byte[] bArr = this.e;
            int i = this.f;
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            this.f3101c.add(new Tba(bArr2));
        }
        this.d += this.f;
        this.f = 0;
        return Iba.a(this.f3101c);
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        if (this.f == this.e.length) {
            a(1);
        }
        byte[] bArr = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        bArr[i2] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        if (i2 <= this.e.length - this.f) {
            System.arraycopy(bArr, i, this.e, this.f, i2);
            this.f += i2;
            return;
        }
        int length = this.e.length - this.f;
        System.arraycopy(bArr, i, this.e, this.f, length);
        int i3 = i2 - length;
        a(i3);
        System.arraycopy(bArr, i + length, this.e, 0, i3);
        this.f = i3;
    }
}
