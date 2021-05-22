package c.a.a.a.i.f;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.C0117a;
import c.a.a.a.I;
import c.a.a.a.d.b;
import c.a.a.a.j.f;
import c.a.a.a.n;
import c.a.a.a.p.a;
import c.a.a.a.p.d;
import c.a.a.a.x;
import java.io.IOException;
import java.io.InputStream;

public class e extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final f f887a;

    /* renamed from: b  reason: collision with root package name */
    private final d f888b;

    /* renamed from: c  reason: collision with root package name */
    private final b f889c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private boolean h;
    private AbstractC0121e[] i;

    public e(f fVar) {
        this(fVar, null);
    }

    public e(f fVar, b bVar) {
        this.g = false;
        this.h = false;
        this.i = new AbstractC0121e[0];
        a.a(fVar, "Session input buffer");
        this.f887a = fVar;
        this.f = 0;
        this.f888b = new d(16);
        this.f889c = bVar == null ? b.f648a : bVar;
        this.d = 1;
    }

    private int a() {
        int i2 = this.d;
        if (i2 != 1) {
            if (i2 == 3) {
                this.f888b.clear();
                if (this.f887a.a(this.f888b) == -1) {
                    throw new x("CRLF expected at end of chunk");
                } else if (this.f888b.b()) {
                    this.d = 1;
                } else {
                    throw new x("Unexpected content at the end of chunk");
                }
            } else {
                throw new IllegalStateException("Inconsistent codec state");
            }
        }
        this.f888b.clear();
        if (this.f887a.a(this.f888b) != -1) {
            int b2 = this.f888b.b(59);
            if (b2 < 0) {
                b2 = this.f888b.length();
            }
            try {
                return Integer.parseInt(this.f888b.b(0, b2), 16);
            } catch (NumberFormatException unused) {
                throw new x("Bad chunk header");
            }
        } else {
            throw new C0117a("Premature end of chunk coded message body: closing chunk expected");
        }
    }

    private void b() {
        if (this.d != Integer.MAX_VALUE) {
            try {
                this.e = a();
                if (this.e >= 0) {
                    this.d = 2;
                    this.f = 0;
                    if (this.e == 0) {
                        this.g = true;
                        c();
                        return;
                    }
                    return;
                }
                throw new x("Negative chunk size");
            } catch (x e2) {
                this.d = Integer.MAX_VALUE;
                throw e2;
            }
        } else {
            throw new x("Corrupt data stream");
        }
    }

    private void c() {
        try {
            this.i = a.a(this.f887a, this.f889c.d(), this.f889c.e(), null);
        } catch (n e2) {
            x xVar = new x("Invalid footer: " + e2.getMessage());
            xVar.initCause(e2);
            throw xVar;
        }
    }

    @Override // java.io.InputStream
    public int available() {
        f fVar = this.f887a;
        if (fVar instanceof c.a.a.a.j.a) {
            return Math.min(((c.a.a.a.j.a) fVar).length(), this.e - this.f);
        }
        return 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        if (!this.h) {
            try {
                if (!this.g && this.d != Integer.MAX_VALUE) {
                    do {
                    } while (read(new byte[2048]) >= 0);
                }
            } finally {
                this.g = true;
                this.h = true;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.h) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.g) {
            return -1;
        } else {
            if (this.d != 2) {
                b();
                if (this.g) {
                    return -1;
                }
            }
            int read = this.f887a.read();
            if (read != -1) {
                this.f++;
                if (this.f >= this.e) {
                    this.d = 3;
                }
            }
            return read;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        if (this.h) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.g) {
            return -1;
        } else {
            if (this.d != 2) {
                b();
                if (this.g) {
                    return -1;
                }
            }
            int read = this.f887a.read(bArr, i2, Math.min(i3, this.e - this.f));
            if (read != -1) {
                this.f += read;
                if (this.f >= this.e) {
                    this.d = 3;
                }
                return read;
            }
            this.g = true;
            throw new I("Truncated chunk ( expected size: " + this.e + "; actual size: " + this.f + ")");
        }
    }
}
