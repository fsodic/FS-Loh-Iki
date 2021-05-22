package c.a.a.a.i.b;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.C;
import c.a.a.a.b.c.i;
import c.a.a.a.b.c.j;
import c.a.a.a.b.c.l;
import c.a.a.a.b.c.m;
import c.a.a.a.b.f.d;
import c.a.a.a.b.p;
import c.a.a.a.h.b;
import c.a.a.a.n.e;
import c.a.a.a.o;
import c.a.a.a.p.a;
import c.a.a.a.r;
import c.a.a.a.t;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;

public class n implements p {

    /* renamed from: a  reason: collision with root package name */
    public static final n f773a = new n();

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f774b = {"GET", "HEAD"};

    /* renamed from: c  reason: collision with root package name */
    public b f775c = new b(n.class);

    @Override // c.a.a.a.b.p
    public l a(r rVar, t tVar, e eVar) {
        URI c2 = c(rVar, tVar, eVar);
        String method = rVar.getRequestLine().getMethod();
        if (method.equalsIgnoreCase("HEAD")) {
            return new j(c2);
        }
        if (method.equalsIgnoreCase("GET")) {
            return new i(c2);
        }
        if (tVar.getStatusLine().getStatusCode() != 307) {
            return new i(c2);
        }
        m a2 = m.a(rVar);
        a2.a(c2);
        return a2.a();
    }

    /* access modifiers changed from: protected */
    public URI a(String str) {
        try {
            d dVar = new d(new URI(str).normalize());
            String c2 = dVar.c();
            if (c2 != null) {
                dVar.b(c2.toLowerCase(Locale.ROOT));
            }
            if (c.a.a.a.p.i.c(dVar.d())) {
                dVar.c("/");
            }
            return dVar.a();
        } catch (URISyntaxException e) {
            throw new C("Invalid redirect URI: " + str, e);
        }
    }

    @Override // c.a.a.a.b.p
    public boolean b(r rVar, t tVar, e eVar) {
        a.a(rVar, "HTTP request");
        a.a(tVar, "HTTP response");
        int statusCode = tVar.getStatusLine().getStatusCode();
        String method = rVar.getRequestLine().getMethod();
        AbstractC0121e firstHeader = tVar.getFirstHeader("location");
        if (statusCode != 307) {
            switch (statusCode) {
                case 301:
                    break;
                case 302:
                    return b(method) && firstHeader != null;
                case 303:
                    return true;
                default:
                    return false;
            }
        }
        return b(method);
    }

    /* access modifiers changed from: protected */
    public boolean b(String str) {
        for (String str2 : f774b) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public URI c(r rVar, t tVar, e eVar) {
        a.a(rVar, "HTTP request");
        a.a(tVar, "HTTP response");
        a.a(eVar, "HTTP context");
        c.a.a.a.b.e.a a2 = c.a.a.a.b.e.a.a(eVar);
        AbstractC0121e firstHeader = tVar.getFirstHeader("location");
        if (firstHeader != null) {
            String value = firstHeader.getValue();
            if (this.f775c.a()) {
                b bVar = this.f775c;
                bVar.a("Redirect requested to location '" + value + "'");
            }
            c.a.a.a.b.a.a n = a2.n();
            URI a3 = a(value);
            try {
                if (!a3.isAbsolute()) {
                    if (n.h()) {
                        o c2 = a2.c();
                        c.a.a.a.p.b.a(c2, "Target host");
                        a3 = c.a.a.a.b.f.e.a(c.a.a.a.b.f.e.a(new URI(rVar.getRequestLine().getUri()), c2, false), a3);
                    } else {
                        throw new C("Relative redirect location '" + a3 + "' not allowed");
                    }
                }
                u uVar = (u) a2.getAttribute("http.protocol.redirect-locations");
                if (uVar == null) {
                    uVar = new u();
                    eVar.setAttribute("http.protocol.redirect-locations", uVar);
                }
                if (n.g() || !uVar.b(a3)) {
                    uVar.a(a3);
                    return a3;
                }
                throw new c.a.a.a.b.e("Circular redirect to '" + a3 + "'");
            } catch (URISyntaxException e) {
                throw new C(e.getMessage(), e);
            }
        } else {
            throw new C("Received redirect response " + tVar.getStatusLine() + " but no location header");
        }
    }
}
