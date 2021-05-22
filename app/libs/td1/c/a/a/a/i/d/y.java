package c.a.a.a.i.d;

import c.a.a.a.f.b;
import c.a.a.a.f.c;
import c.a.a.a.f.f;
import c.a.a.a.f.h;
import c.a.a.a.f.n;
import c.a.a.a.f.p;
import c.a.a.a.p.a;
import java.util.Locale;

public class y implements b {
    @Override // c.a.a.a.f.b
    public String a() {
        return "domain";
    }

    @Override // c.a.a.a.f.d
    public void a(c cVar, f fVar) {
        a.a(cVar, "Cookie");
        a.a(fVar, "Cookie origin");
        String a2 = fVar.a();
        String domain = cVar.getDomain();
        if (domain == null) {
            throw new h("Cookie domain may not be null");
        } else if (domain.equals(a2)) {
        } else {
            if (domain.indexOf(46) == -1) {
                throw new h("Domain attribute \"" + domain + "\" does not match the host \"" + a2 + "\"");
            } else if (domain.startsWith(".")) {
                int indexOf = domain.indexOf(46, 1);
                if (indexOf < 0 || indexOf == domain.length() - 1) {
                    throw new h("Domain attribute \"" + domain + "\" violates RFC 2109: domain must contain an embedded dot");
                }
                String lowerCase = a2.toLowerCase(Locale.ROOT);
                if (!lowerCase.endsWith(domain)) {
                    throw new h("Illegal domain attribute \"" + domain + "\". Domain of origin: \"" + lowerCase + "\"");
                } else if (lowerCase.substring(0, lowerCase.length() - domain.length()).indexOf(46) != -1) {
                    throw new h("Domain attribute \"" + domain + "\" violates RFC 2109: host minus domain may not contain any dots");
                }
            } else {
                throw new h("Domain attribute \"" + domain + "\" violates RFC 2109: domain must start with a dot");
            }
        }
    }

    @Override // c.a.a.a.f.d
    public void a(p pVar, String str) {
        a.a(pVar, "Cookie");
        if (str == null) {
            throw new n("Missing value for domain attribute");
        } else if (!str.trim().isEmpty()) {
            pVar.setDomain(str);
        } else {
            throw new n("Blank value for domain attribute");
        }
    }

    @Override // c.a.a.a.f.d
    public boolean b(c cVar, f fVar) {
        a.a(cVar, "Cookie");
        a.a(fVar, "Cookie origin");
        String a2 = fVar.a();
        String domain = cVar.getDomain();
        if (domain == null) {
            return false;
        }
        return a2.equals(domain) || (domain.startsWith(".") && a2.endsWith(domain));
    }
}
