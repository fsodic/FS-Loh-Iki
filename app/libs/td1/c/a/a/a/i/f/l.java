package c.a.a.a.i.f;

import c.a.a.a.j.f;
import c.a.a.a.p.a;
import java.io.InputStream;

public class l extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final f f901a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f902b = false;

    public l(f fVar) {
        a.a(fVar, "Session input buffer");
        this.f901a = fVar;
    }

    @Override // java.io.InputStream
    public int available() {
        f fVar = this.f901a;
        if (fVar instanceof c.a.a.a.j.a) {
            return ((c.a.a.a.j.a) fVar).length();
        }
        return 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        this.f902b = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f902b) {
            return -1;
        }
        return this.f901a.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (this.f902b) {
            return -1;
        }
        return this.f901a.read(bArr, i, i2);
    }
}
