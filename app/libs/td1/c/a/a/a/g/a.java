package c.a.a.a.g;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.k.b;
import c.a.a.a.l;

public abstract class a implements l {

    /* renamed from: a  reason: collision with root package name */
    protected AbstractC0121e f711a;

    /* renamed from: b  reason: collision with root package name */
    protected AbstractC0121e f712b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f713c;

    protected a() {
    }

    public void a(AbstractC0121e eVar) {
        this.f712b = eVar;
    }

    public void a(String str) {
        b(str != null ? new b("Content-Type", str) : null);
    }

    public void a(boolean z) {
        this.f713c = z;
    }

    public void b(AbstractC0121e eVar) {
        this.f711a = eVar;
    }

    @Override // c.a.a.a.l
    @Deprecated
    public void consumeContent() {
    }

    @Override // c.a.a.a.l
    public AbstractC0121e getContentEncoding() {
        return this.f712b;
    }

    @Override // c.a.a.a.l
    public AbstractC0121e getContentType() {
        return this.f711a;
    }

    @Override // c.a.a.a.l
    public boolean isChunked() {
        return this.f713c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        if (this.f711a != null) {
            sb.append("Content-Type: ");
            sb.append(this.f711a.getValue());
            sb.append(',');
        }
        if (this.f712b != null) {
            sb.append("Content-Encoding: ");
            sb.append(this.f712b.getValue());
            sb.append(',');
        }
        long contentLength = getContentLength();
        if (contentLength >= 0) {
            sb.append("Content-Length: ");
            sb.append(contentLength);
            sb.append(',');
        }
        sb.append("Chunked: ");
        sb.append(this.f713c);
        sb.append(']');
        return sb.toString();
    }
}
