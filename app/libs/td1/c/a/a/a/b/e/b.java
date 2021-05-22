package c.a.a.a.b.e;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.b.c.l;
import c.a.a.a.b.h;
import c.a.a.a.f.c;
import c.a.a.a.f.f;
import c.a.a.a.f.k;
import c.a.a.a.n.e;
import c.a.a.a.o;
import c.a.a.a.p.a;
import c.a.a.a.p.i;
import c.a.a.a.r;
import c.a.a.a.s;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class b implements s {

    /* renamed from: a  reason: collision with root package name */
    public c.a.a.a.h.b f627a = new c.a.a.a.h.b(b.class);

    @Override // c.a.a.a.s
    public void a(r rVar, e eVar) {
        URI uri;
        AbstractC0121e versionHeader;
        a.a(rVar, "HTTP request");
        a.a(eVar, "HTTP context");
        if (!rVar.getRequestLine().getMethod().equalsIgnoreCase("CONNECT")) {
            a a2 = a.a(eVar);
            h j = a2.j();
            if (j == null) {
                this.f627a.a("Cookie store not specified in HTTP context");
                return;
            }
            c.a.a.a.d.a<k> i = a2.i();
            if (i == null) {
                this.f627a.a("CookieSpec registry not specified in HTTP context");
                return;
            }
            o c2 = a2.c();
            if (c2 == null) {
                this.f627a.a("Target host not set in the context");
                return;
            }
            c.a.a.a.e.b.e l = a2.l();
            if (l == null) {
                this.f627a.a("Connection route not set in the context");
                return;
            }
            String d = a2.n().d();
            if (d == null) {
                d = "default";
            }
            if (this.f627a.a()) {
                this.f627a.a("CookieSpec selected: " + d);
            }
            String str = null;
            if (rVar instanceof l) {
                uri = ((l) rVar).getURI();
            } else {
                try {
                    uri = new URI(rVar.getRequestLine().getUri());
                } catch (URISyntaxException unused) {
                    uri = null;
                }
            }
            if (uri != null) {
                str = uri.getPath();
            }
            String d2 = c2.d();
            int e = c2.e();
            if (e < 0) {
                e = l.getTargetHost().e();
            }
            boolean z = false;
            if (e < 0) {
                e = 0;
            }
            if (i.c(str)) {
                str = "/";
            }
            f fVar = new f(d2, e, str, l.isSecure());
            k lookup = i.lookup(d);
            if (lookup != null) {
                c.a.a.a.f.i a3 = lookup.a(a2);
                List<c> cookies = j.getCookies();
                ArrayList arrayList = new ArrayList();
                Date date = new Date();
                for (c cVar : cookies) {
                    if (cVar.isExpired(date)) {
                        if (this.f627a.a()) {
                            this.f627a.a("Cookie " + cVar + " expired");
                        }
                        z = true;
                    } else if (a3.b(cVar, fVar)) {
                        if (this.f627a.a()) {
                            this.f627a.a("Cookie " + cVar + " match " + fVar);
                        }
                        arrayList.add(cVar);
                    }
                }
                if (z) {
                    j.clearExpired(date);
                }
                if (!arrayList.isEmpty()) {
                    for (AbstractC0121e eVar2 : a3.formatCookies(arrayList)) {
                        rVar.a(eVar2);
                    }
                }
                if (a3.getVersion() > 0 && (versionHeader = a3.getVersionHeader()) != null) {
                    rVar.a(versionHeader);
                }
                eVar.setAttribute("http.cookie-spec", a3);
                eVar.setAttribute("http.cookie-origin", fVar);
            } else if (this.f627a.a()) {
                this.f627a.a("Unsupported cookie policy: " + d);
            }
        }
    }
}
