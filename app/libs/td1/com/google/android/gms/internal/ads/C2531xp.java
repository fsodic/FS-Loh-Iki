package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.gms.internal.ads.xp  reason: case insensitive filesystem */
public final class C2531xp extends ByteArrayOutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final C1415hi f6029a;

    public C2531xp(C1415hi hiVar, int i) {
        this.f6029a = hiVar;
        ((ByteArrayOutputStream) this).buf = this.f6029a.a(Math.max(i, 256));
    }

    private final void a(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i > ((ByteArrayOutputStream) this).buf.length) {
            byte[] a2 = this.f6029a.a((i2 + i) << 1);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a2, 0, ((ByteArrayOutputStream) this).count);
            this.f6029a.a(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = a2;
        }
    }

    @Override // java.io.OutputStream, java.io.ByteArrayOutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6029a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    @Override // java.lang.Object
    public final void finalize() {
        this.f6029a.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.OutputStream, java.io.ByteArrayOutputStream
    public final synchronized void write(int i) {
        a(1);
        super.write(i);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }
}
