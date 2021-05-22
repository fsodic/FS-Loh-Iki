package c.a.a.a.b.c;

import c.a.a.a.D;
import c.a.a.a.F;
import c.a.a.a.b.a.a;
import c.a.a.a.k.n;
import c.a.a.a.l.i;
import java.net.URI;

public abstract class k extends d implements l, f {
    private D e;
    private URI f;
    private a g;

    public void a(D d) {
        this.e = d;
    }

    public void a(a aVar) {
        this.g = aVar;
    }

    public void a(URI uri) {
        this.f = uri;
    }

    @Override // c.a.a.a.b.c.f
    public a c() {
        return this.g;
    }

    @Override // c.a.a.a.b.c.l
    public abstract String getMethod();

    @Override // c.a.a.a.q
    public D getProtocolVersion() {
        D d = this.e;
        return d != null ? d : i.b(getParams());
    }

    @Override // c.a.a.a.r
    public F getRequestLine() {
        String method = getMethod();
        D protocolVersion = getProtocolVersion();
        URI uri = getURI();
        String aSCIIString = uri != null ? uri.toASCIIString() : null;
        if (aSCIIString == null || aSCIIString.isEmpty()) {
            aSCIIString = "/";
        }
        return new n(method, aSCIIString, protocolVersion);
    }

    @Override // c.a.a.a.b.c.l
    public URI getURI() {
        return this.f;
    }

    public String toString() {
        return getMethod() + " " + getURI() + " " + getProtocolVersion();
    }
}
