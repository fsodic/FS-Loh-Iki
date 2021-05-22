package c.a.a.a.i.f;

import c.a.a.a.j.g;
import c.a.a.a.p.a;
import java.io.IOException;
import java.io.OutputStream;

public class h extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final g f896a;

    /* renamed from: b  reason: collision with root package name */
    private final long f897b;

    /* renamed from: c  reason: collision with root package name */
    private long f898c = 0;
    private boolean d = false;

    public h(g gVar, long j) {
        a.a(gVar, "Session output buffer");
        this.f896a = gVar;
        a.a(j, "Content length");
        this.f897b = j;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.d) {
            this.d = true;
            this.f896a.flush();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.f896a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        if (this.d) {
            throw new IOException("Attempted write to closed stream.");
        } else if (this.f898c < this.f897b) {
            this.f896a.write(i);
            this.f898c++;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (!this.d) {
            long j = this.f898c;
            long j2 = this.f897b;
            if (j < j2) {
                long j3 = j2 - j;
                if (((long) i2) > j3) {
                    i2 = (int) j3;
                }
                this.f896a.write(bArr, i, i2);
                this.f898c += (long) i2;
                return;
            }
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }
}
