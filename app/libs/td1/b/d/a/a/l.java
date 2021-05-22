package b.d.a.a;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.C;
import c.a.a.a.i.b.m;
import c.a.a.a.i.b.u;
import c.a.a.a.l.g;
import c.a.a.a.n.e;
import c.a.a.a.o;
import c.a.a.a.r;
import c.a.a.a.t;
import java.net.URI;
import java.net.URISyntaxException;

/* access modifiers changed from: package-private */
public class l extends m {

    /* renamed from: b  reason: collision with root package name */
    private final boolean f578b;

    public l(boolean z) {
        this.f578b = z;
    }

    @Override // c.a.a.a.b.o
    public URI a(t tVar, e eVar) {
        URI uri;
        if (tVar != null) {
            AbstractC0121e firstHeader = tVar.getFirstHeader("location");
            if (firstHeader != null) {
                String replaceAll = firstHeader.getValue().replaceAll(" ", "%20");
                try {
                    URI uri2 = new URI(replaceAll);
                    g params = tVar.getParams();
                    if (!uri2.isAbsolute()) {
                        if (!params.isParameterTrue("http.protocol.reject-relative-redirect")) {
                            o oVar = (o) eVar.getAttribute("http.target_host");
                            if (oVar != null) {
                                try {
                                    uri2 = c.a.a.a.b.f.e.a(c.a.a.a.b.f.e.a(new URI(((r) eVar.getAttribute("http.request")).getRequestLine().getUri()), oVar, true), uri2);
                                } catch (URISyntaxException e) {
                                    throw new C(e.getMessage(), e);
                                }
                            } else {
                                throw new IllegalStateException("Target host not available in the HTTP context");
                            }
                        } else {
                            throw new C("Relative redirect location '" + uri2 + "' not allowed");
                        }
                    }
                    if (params.isParameterFalse("http.protocol.allow-circular-redirects")) {
                        u uVar = (u) eVar.getAttribute("http.protocol.redirect-locations");
                        if (uVar == null) {
                            uVar = new u();
                            eVar.setAttribute("http.protocol.redirect-locations", uVar);
                        }
                        if (uri2.getFragment() != null) {
                            try {
                                uri = c.a.a.a.b.f.e.a(uri2, new o(uri2.getHost(), uri2.getPort(), uri2.getScheme()), true);
                            } catch (URISyntaxException e2) {
                                throw new C(e2.getMessage(), e2);
                            }
                        } else {
                            uri = uri2;
                        }
                        if (!uVar.b(uri)) {
                            uVar.a(uri);
                        } else {
                            throw new c.a.a.a.b.e("Circular redirect to '" + uri + "'");
                        }
                    }
                    return uri2;
                } catch (URISyntaxException e3) {
                    throw new C("Invalid redirect URI: " + replaceAll, e3);
                }
            } else {
                throw new C("Received redirect response " + tVar.getStatusLine() + " but no location header");
            }
        } else {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
    }

    @Override // c.a.a.a.b.o
    public boolean b(t tVar, e eVar) {
        if (!this.f578b) {
            return false;
        }
        if (tVar != null) {
            int statusCode = tVar.getStatusLine().getStatusCode();
            if (statusCode == 307) {
                return true;
            }
            switch (statusCode) {
                case 301:
                case 302:
                case 303:
                    return true;
                default:
                    return false;
            }
        } else {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
    }
}
