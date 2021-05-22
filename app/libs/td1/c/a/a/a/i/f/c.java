package c.a.a.a.i.f;

import c.a.a.a.C0119c;
import c.a.a.a.j.a;
import c.a.a.a.j.e;
import c.a.a.a.j.f;
import c.a.a.a.l.g;
import c.a.a.a.p.d;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

@Deprecated
public abstract class c implements f, a {

    /* renamed from: a  reason: collision with root package name */
    private InputStream f881a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f882b;

    /* renamed from: c  reason: collision with root package name */
    private c.a.a.a.p.c f883c;
    private Charset d;
    private boolean e;
    private int f;
    private int g;
    private k h;
    private CodingErrorAction i;
    private CodingErrorAction j;
    private int k;
    private int l;
    private CharsetDecoder m;
    private CharBuffer n;

    private int a(d dVar, int i2) {
        int i3 = this.k;
        this.k = i2 + 1;
        if (i2 > i3 && this.f882b[i2 - 1] == 13) {
            i2--;
        }
        int i4 = i2 - i3;
        if (!this.e) {
            return a(dVar, ByteBuffer.wrap(this.f882b, i3, i4));
        }
        dVar.a(this.f882b, i3, i4);
        return i4;
    }

    private int a(d dVar, ByteBuffer byteBuffer) {
        int i2 = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.m == null) {
            this.m = this.d.newDecoder();
            this.m.onMalformedInput(this.i);
            this.m.onUnmappableCharacter(this.j);
        }
        if (this.n == null) {
            this.n = CharBuffer.allocate(1024);
        }
        this.m.reset();
        while (byteBuffer.hasRemaining()) {
            i2 += a(this.m.decode(byteBuffer, this.n, true), dVar, byteBuffer);
        }
        int a2 = i2 + a(this.m.flush(this.n), dVar, byteBuffer);
        this.n.clear();
        return a2;
    }

    private int a(CoderResult coderResult, d dVar, ByteBuffer byteBuffer) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.n.flip();
        int remaining = this.n.remaining();
        while (this.n.hasRemaining()) {
            dVar.append(this.n.get());
        }
        this.n.compact();
        return remaining;
    }

    private int b(d dVar) {
        int f2 = this.f883c.f();
        if (f2 > 0) {
            if (this.f883c.b(f2 - 1) == 10) {
                f2--;
            }
            if (f2 > 0 && this.f883c.b(f2 - 1) == 13) {
                f2--;
            }
        }
        if (this.e) {
            dVar.a(this.f883c, 0, f2);
        } else {
            f2 = a(dVar, ByteBuffer.wrap(this.f883c.a(), 0, f2));
        }
        this.f883c.c();
        return f2;
    }

    private int e() {
        for (int i2 = this.k; i2 < this.l; i2++) {
            if (this.f882b[i2] == 10) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r2 == -1) goto L_0x002d;
     */
    @Override // c.a.a.a.j.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(c.a.a.a.p.d r8) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.i.f.c.a(c.a.a.a.p.d):int");
    }

    /* access modifiers changed from: protected */
    public void a(InputStream inputStream, int i2, g gVar) {
        c.a.a.a.p.a.a(inputStream, "Input stream");
        c.a.a.a.p.a.a(i2, "Buffer size");
        c.a.a.a.p.a.a(gVar, "HTTP parameters");
        this.f881a = inputStream;
        this.f882b = new byte[i2];
        this.k = 0;
        this.l = 0;
        this.f883c = new c.a.a.a.p.c(i2);
        String str = (String) gVar.getParameter("http.protocol.element-charset");
        this.d = str != null ? Charset.forName(str) : C0119c.f646b;
        this.e = this.d.equals(C0119c.f646b);
        this.m = null;
        this.f = gVar.getIntParameter("http.connection.max-line-length", -1);
        this.g = gVar.getIntParameter("http.connection.min-chunk-limit", 512);
        this.h = b();
        CodingErrorAction codingErrorAction = (CodingErrorAction) gVar.getParameter("http.malformed.input.action");
        if (codingErrorAction == null) {
            codingErrorAction = CodingErrorAction.REPORT;
        }
        this.i = codingErrorAction;
        CodingErrorAction codingErrorAction2 = (CodingErrorAction) gVar.getParameter("http.unmappable.input.action");
        if (codingErrorAction2 == null) {
            codingErrorAction2 = CodingErrorAction.REPORT;
        }
        this.j = codingErrorAction2;
    }

    /* access modifiers changed from: protected */
    public k b() {
        return new k();
    }

    /* access modifiers changed from: protected */
    public int c() {
        int i2 = this.k;
        if (i2 > 0) {
            int i3 = this.l - i2;
            if (i3 > 0) {
                byte[] bArr = this.f882b;
                System.arraycopy(bArr, i2, bArr, 0, i3);
            }
            this.k = 0;
            this.l = i3;
        }
        int i4 = this.l;
        byte[] bArr2 = this.f882b;
        int read = this.f881a.read(bArr2, i4, bArr2.length - i4);
        if (read == -1) {
            return -1;
        }
        this.l = i4 + read;
        this.h.a((long) read);
        return read;
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        return this.k < this.l;
    }

    @Override // c.a.a.a.j.f
    public e getMetrics() {
        return this.h;
    }

    @Override // c.a.a.a.j.a
    public int length() {
        return this.l - this.k;
    }

    @Override // c.a.a.a.j.f
    public int read() {
        while (!d()) {
            if (c() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.f882b;
        int i2 = this.k;
        this.k = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // c.a.a.a.j.f
    public int read(byte[] bArr, int i2, int i3) {
        if (bArr == null) {
            return 0;
        }
        if (!d()) {
            if (i3 > this.g) {
                int read = this.f881a.read(bArr, i2, i3);
                if (read > 0) {
                    this.h.a((long) read);
                }
                return read;
            }
            while (!d()) {
                if (c() == -1) {
                    return -1;
                }
            }
        }
        int min = Math.min(i3, this.l - this.k);
        System.arraycopy(this.f882b, this.k, bArr, i2, min);
        this.k += min;
        return min;
    }
}
