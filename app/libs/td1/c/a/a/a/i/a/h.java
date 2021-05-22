package c.a.a.a.i.a;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

class h extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final MessageDigest f733a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f734b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f735c;

    h(MessageDigest messageDigest) {
        this.f733a = messageDigest;
        this.f733a.reset();
    }

    public byte[] a() {
        return this.f735c;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f734b) {
            this.f734b = true;
            this.f735c = this.f733a.digest();
            super.close();
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        if (!this.f734b) {
            this.f733a.update((byte) i);
            return;
        }
        throw new IOException("Stream has been already closed");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (!this.f734b) {
            this.f733a.update(bArr, i, i2);
            return;
        }
        throw new IOException("Stream has been already closed");
    }
}
