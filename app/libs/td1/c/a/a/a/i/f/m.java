package c.a.a.a.i.f;

import c.a.a.a.j.g;
import c.a.a.a.p.a;
import java.io.IOException;
import java.io.OutputStream;

public class m extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final g f903a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f904b = false;

    public m(g gVar) {
        a.a(gVar, "Session output buffer");
        this.f903a = gVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f904b) {
            this.f904b = true;
            this.f903a.flush();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.f903a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        if (!this.f904b) {
            this.f903a.write(i);
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (!this.f904b) {
            this.f903a.write(bArr, i, i2);
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }
}
