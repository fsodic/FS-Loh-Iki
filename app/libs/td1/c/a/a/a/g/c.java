package c.a.a.a.g;

import c.a.a.a.l;
import c.a.a.a.p.a;
import c.a.a.a.p.g;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class c extends f {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f714b;

    public c(l lVar) {
        super(lVar);
        this.f714b = (!lVar.isRepeatable() || lVar.getContentLength() < 0) ? g.b(lVar) : null;
    }

    @Override // c.a.a.a.g.f, c.a.a.a.l
    public InputStream getContent() {
        byte[] bArr = this.f714b;
        return bArr != null ? new ByteArrayInputStream(bArr) : super.getContent();
    }

    @Override // c.a.a.a.g.f, c.a.a.a.l
    public long getContentLength() {
        byte[] bArr = this.f714b;
        return bArr != null ? (long) bArr.length : super.getContentLength();
    }

    @Override // c.a.a.a.g.f, c.a.a.a.l
    public boolean isChunked() {
        return this.f714b == null && super.isChunked();
    }

    @Override // c.a.a.a.g.f, c.a.a.a.l
    public boolean isRepeatable() {
        return true;
    }

    @Override // c.a.a.a.g.f, c.a.a.a.l
    public boolean isStreaming() {
        return this.f714b == null && super.isStreaming();
    }

    @Override // c.a.a.a.g.f, c.a.a.a.l
    public void writeTo(OutputStream outputStream) {
        a.a(outputStream, "Output stream");
        byte[] bArr = this.f714b;
        if (bArr != null) {
            outputStream.write(bArr);
        } else {
            super.writeTo(outputStream);
        }
    }
}
