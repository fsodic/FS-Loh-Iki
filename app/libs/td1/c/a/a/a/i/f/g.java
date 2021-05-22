package c.a.a.a.i.f;

import c.a.a.a.C0117a;
import c.a.a.a.j.f;
import c.a.a.a.p.a;
import java.io.IOException;
import java.io.InputStream;

public class g extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final long f893a;

    /* renamed from: b  reason: collision with root package name */
    private long f894b = 0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f895c = false;
    private f d = null;

    public g(f fVar, long j) {
        a.a(fVar, "Session input buffer");
        this.d = fVar;
        a.a(j, "Content length");
        this.f893a = j;
    }

    @Override // java.io.InputStream
    public int available() {
        f fVar = this.d;
        if (fVar instanceof c.a.a.a.j.a) {
            return Math.min(((c.a.a.a.j.a) fVar).length(), (int) (this.f893a - this.f894b));
        }
        return 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        if (!this.f895c) {
            try {
                if (this.f894b < this.f893a) {
                    do {
                    } while (read(new byte[2048]) >= 0);
                }
            } finally {
                this.f895c = true;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f895c) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.f894b >= this.f893a) {
            return -1;
        } else {
            int read = this.d.read();
            if (read != -1) {
                this.f894b++;
            } else if (this.f894b < this.f893a) {
                throw new C0117a("Premature end of Content-Length delimited message body (expected: " + this.f893a + "; received: " + this.f894b);
            }
            return read;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (!this.f895c) {
            long j = this.f894b;
            long j2 = this.f893a;
            if (j >= j2) {
                return -1;
            }
            if (((long) i2) + j > j2) {
                i2 = (int) (j2 - j);
            }
            int read = this.d.read(bArr, i, i2);
            if (read != -1 || this.f894b >= this.f893a) {
                if (read > 0) {
                    this.f894b += (long) read;
                }
                return read;
            }
            throw new C0117a("Premature end of Content-Length delimited message body (expected: " + this.f893a + "; received: " + this.f894b);
        }
        throw new IOException("Attempted read from closed stream.");
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        int read;
        if (j <= 0) {
            return 0;
        }
        byte[] bArr = new byte[2048];
        long min = Math.min(j, this.f893a - this.f894b);
        long j2 = 0;
        while (min > 0 && (read = read(bArr, 0, (int) Math.min(2048L, min))) != -1) {
            long j3 = (long) read;
            j2 += j3;
            min -= j3;
        }
        return j2;
    }
}
