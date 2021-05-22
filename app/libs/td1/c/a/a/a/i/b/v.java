package c.a.a.a.i.b;

import c.a.a.a.C;
import c.a.a.a.D;
import c.a.a.a.F;
import c.a.a.a.b.c.l;
import c.a.a.a.k.a;
import c.a.a.a.k.n;
import c.a.a.a.l.i;
import c.a.a.a.r;
import java.net.URI;
import java.net.URISyntaxException;

@Deprecated
public class v extends a implements l {

    /* renamed from: c  reason: collision with root package name */
    private final r f784c;
    private URI d;
    private String e;
    private D f;
    private int g;

    public v(r rVar) {
        D protocolVersion;
        c.a.a.a.p.a.a(rVar, "HTTP request");
        this.f784c = rVar;
        a(rVar.getParams());
        a(rVar.getAllHeaders());
        if (rVar instanceof l) {
            l lVar = (l) rVar;
            this.d = lVar.getURI();
            this.e = lVar.getMethod();
            protocolVersion = null;
        } else {
            F requestLine = rVar.getRequestLine();
            try {
                this.d = new URI(requestLine.getUri());
                this.e = requestLine.getMethod();
                protocolVersion = rVar.getProtocolVersion();
            } catch (URISyntaxException e2) {
                throw new C("Invalid request URI: " + requestLine.getUri(), e2);
            }
        }
        this.f = protocolVersion;
        this.g = 0;
    }

    public void a(URI uri) {
        this.d = uri;
    }

    @Override // c.a.a.a.b.c.l
    public void abort() {
        throw new UnsupportedOperationException();
    }

    public int d() {
        return this.g;
    }

    public r e() {
        return this.f784c;
    }

    public void f() {
        this.g++;
    }

    public boolean g() {
        return true;
    }

    @Override // c.a.a.a.b.c.l
    public String getMethod() {
        return this.e;
    }

    @Override // c.a.a.a.q
    public D getProtocolVersion() {
        if (this.f == null) {
            this.f = i.b(getParams());
        }
        return this.f;
    }

    @Override // c.a.a.a.r
    public F getRequestLine() {
        D protocolVersion = getProtocolVersion();
        URI uri = this.d;
        String aSCIIString = uri != null ? uri.toASCIIString() : null;
        if (aSCIIString == null || aSCIIString.isEmpty()) {
            aSCIIString = "/";
        }
        return new n(getMethod(), aSCIIString, protocolVersion);
    }

    @Override // c.a.a.a.b.c.l
    public URI getURI() {
        return this.d;
    }

    public void h() {
        this.f905a.c();
        a(this.f784c.getAllHeaders());
    }

    @Override // c.a.a.a.b.c.l
    public boolean isAborted() {
        return false;
    }
}
