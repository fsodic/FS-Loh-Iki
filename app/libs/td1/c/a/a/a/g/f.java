package c.a.a.a.g;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.l;
import c.a.a.a.p.a;
import java.io.InputStream;
import java.io.OutputStream;

public class f implements l {

    /* renamed from: a  reason: collision with root package name */
    protected l f718a;

    public f(l lVar) {
        a.a(lVar, "Wrapped entity");
        this.f718a = lVar;
    }

    @Override // c.a.a.a.l
    @Deprecated
    public void consumeContent() {
        this.f718a.consumeContent();
    }

    @Override // c.a.a.a.l
    public InputStream getContent() {
        return this.f718a.getContent();
    }

    @Override // c.a.a.a.l
    public AbstractC0121e getContentEncoding() {
        return this.f718a.getContentEncoding();
    }

    @Override // c.a.a.a.l
    public long getContentLength() {
        return this.f718a.getContentLength();
    }

    @Override // c.a.a.a.l
    public AbstractC0121e getContentType() {
        return this.f718a.getContentType();
    }

    @Override // c.a.a.a.l
    public boolean isChunked() {
        return this.f718a.isChunked();
    }

    @Override // c.a.a.a.l
    public boolean isRepeatable() {
        return this.f718a.isRepeatable();
    }

    @Override // c.a.a.a.l
    public boolean isStreaming() {
        return this.f718a.isStreaming();
    }

    @Override // c.a.a.a.l
    public void writeTo(OutputStream outputStream) {
        this.f718a.writeTo(outputStream);
    }
}
