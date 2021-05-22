package c.a.a.a.e;

import c.a.a.a.p.a;
import java.io.IOException;
import java.io.InputStream;

public class k extends InputStream implements i {

    /* renamed from: a  reason: collision with root package name */
    protected InputStream f700a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f701b = false;

    /* renamed from: c  reason: collision with root package name */
    private final l f702c;

    public k(InputStream inputStream, l lVar) {
        a.a(inputStream, "Wrapped stream");
        this.f700a = inputStream;
        this.f702c = lVar;
    }

    /* access modifiers changed from: protected */
    public void a() {
        InputStream inputStream = this.f700a;
        if (inputStream != null) {
            boolean z = true;
            try {
                if (this.f702c != null) {
                    z = this.f702c.streamAbort(inputStream);
                }
                if (z) {
                    this.f700a.close();
                }
            } finally {
                this.f700a = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i) {
        InputStream inputStream = this.f700a;
        if (inputStream != null && i < 0) {
            boolean z = true;
            try {
                if (this.f702c != null) {
                    z = this.f702c.eofDetected(inputStream);
                }
                if (z) {
                    this.f700a.close();
                }
            } finally {
                this.f700a = null;
            }
        }
    }

    @Override // c.a.a.a.e.i
    public void abortConnection() {
        this.f701b = true;
        a();
    }

    @Override // java.io.InputStream
    public int available() {
        if (!c()) {
            return 0;
        }
        try {
            return this.f700a.available();
        } catch (IOException e) {
            a();
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
        InputStream inputStream = this.f700a;
        if (inputStream != null) {
            boolean z = true;
            try {
                if (this.f702c != null) {
                    z = this.f702c.streamClosed(inputStream);
                }
                if (z) {
                    this.f700a.close();
                }
            } finally {
                this.f700a = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        if (!this.f701b) {
            return this.f700a != null;
        }
        throw new IOException("Attempted read on closed stream.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        this.f701b = true;
        b();
    }

    @Override // java.io.InputStream
    public int read() {
        if (!c()) {
            return -1;
        }
        try {
            int read = this.f700a.read();
            a(read);
            return read;
        } catch (IOException e) {
            a();
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (!c()) {
            return -1;
        }
        try {
            int read = this.f700a.read(bArr, i, i2);
            a(read);
            return read;
        } catch (IOException e) {
            a();
            throw e;
        }
    }
}
