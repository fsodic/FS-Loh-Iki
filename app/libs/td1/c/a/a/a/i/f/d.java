package c.a.a.a.i.f;

import c.a.a.a.C0119c;
import c.a.a.a.j.a;
import c.a.a.a.j.e;
import c.a.a.a.j.g;
import c.a.a.a.p.c;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

@Deprecated
public abstract class d implements g, a {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f884a = {13, 10};

    /* renamed from: b  reason: collision with root package name */
    private OutputStream f885b;

    /* renamed from: c  reason: collision with root package name */
    private c f886c;
    private Charset d;
    private boolean e;
    private int f;
    private k g;
    private CodingErrorAction h;
    private CodingErrorAction i;
    private CharsetEncoder j;
    private ByteBuffer k;

    private void a(CharBuffer charBuffer) {
        if (charBuffer.hasRemaining()) {
            if (this.j == null) {
                this.j = this.d.newEncoder();
                this.j.onMalformedInput(this.h);
                this.j.onUnmappableCharacter(this.i);
            }
            if (this.k == null) {
                this.k = ByteBuffer.allocate(1024);
            }
            this.j.reset();
            while (charBuffer.hasRemaining()) {
                a(this.j.encode(charBuffer, this.k, true));
            }
            a(this.j.flush(this.k));
            this.k.clear();
        }
    }

    private void a(CoderResult coderResult) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.k.flip();
        while (this.k.hasRemaining()) {
            write(this.k.get());
        }
        this.k.compact();
    }

    /* access modifiers changed from: protected */
    public k a() {
        return new k();
    }

    @Override // c.a.a.a.j.g
    public void a(c.a.a.a.p.d dVar) {
        if (dVar != null) {
            int i2 = 0;
            if (this.e) {
                int length = dVar.length();
                while (length > 0) {
                    int min = Math.min(this.f886c.b() - this.f886c.f(), length);
                    if (min > 0) {
                        this.f886c.a(dVar, i2, min);
                    }
                    if (this.f886c.e()) {
                        b();
                    }
                    i2 += min;
                    length -= min;
                }
            } else {
                a(CharBuffer.wrap(dVar.a(), 0, dVar.length()));
            }
            a(f884a);
        }
    }

    /* access modifiers changed from: protected */
    public void a(OutputStream outputStream, int i2, c.a.a.a.l.g gVar) {
        c.a.a.a.p.a.a(outputStream, "Input stream");
        c.a.a.a.p.a.a(i2, "Buffer size");
        c.a.a.a.p.a.a(gVar, "HTTP parameters");
        this.f885b = outputStream;
        this.f886c = new c(i2);
        String str = (String) gVar.getParameter("http.protocol.element-charset");
        this.d = str != null ? Charset.forName(str) : C0119c.f646b;
        this.e = this.d.equals(C0119c.f646b);
        this.j = null;
        this.f = gVar.getIntParameter("http.connection.min-chunk-limit", 512);
        this.g = a();
        CodingErrorAction codingErrorAction = (CodingErrorAction) gVar.getParameter("http.malformed.input.action");
        if (codingErrorAction == null) {
            codingErrorAction = CodingErrorAction.REPORT;
        }
        this.h = codingErrorAction;
        CodingErrorAction codingErrorAction2 = (CodingErrorAction) gVar.getParameter("http.unmappable.input.action");
        if (codingErrorAction2 == null) {
            codingErrorAction2 = CodingErrorAction.REPORT;
        }
        this.i = codingErrorAction2;
    }

    public void a(byte[] bArr) {
        if (bArr != null) {
            write(bArr, 0, bArr.length);
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
        int f2 = this.f886c.f();
        if (f2 > 0) {
            this.f885b.write(this.f886c.a(), 0, f2);
            this.f886c.c();
            this.g.a((long) f2);
        }
    }

    @Override // c.a.a.a.j.g
    public void flush() {
        b();
        this.f885b.flush();
    }

    @Override // c.a.a.a.j.g
    public e getMetrics() {
        return this.g;
    }

    @Override // c.a.a.a.j.a
    public int length() {
        return this.f886c.f();
    }

    @Override // c.a.a.a.j.g
    public void write(int i2) {
        if (this.f886c.e()) {
            b();
        }
        this.f886c.a(i2);
    }

    @Override // c.a.a.a.j.g
    public void write(byte[] bArr, int i2, int i3) {
        if (bArr != null) {
            if (i3 > this.f || i3 > this.f886c.b()) {
                b();
                this.f885b.write(bArr, i2, i3);
                this.g.a((long) i3);
                return;
            }
            if (i3 > this.f886c.b() - this.f886c.f()) {
                b();
            }
            this.f886c.a(bArr, i2, i3);
        }
    }

    @Override // c.a.a.a.j.g
    public void writeLine(String str) {
        if (str != null) {
            if (str.length() > 0) {
                if (this.e) {
                    for (int i2 = 0; i2 < str.length(); i2++) {
                        write(str.charAt(i2));
                    }
                } else {
                    a(CharBuffer.wrap(str));
                }
            }
            a(f884a);
        }
    }
}
