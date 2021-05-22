package c.a.a.a.i.d;

import c.a.a.a.f.b;
import c.a.a.a.f.c;
import c.a.a.a.f.f;
import c.a.a.a.f.h;
import c.a.a.a.f.n;
import c.a.a.a.f.p;
import c.a.a.a.p.a;
import java.util.Locale;

public class E implements b {
    @Override // c.a.a.a.f.b
    public String a() {
        return "domain";
    }

    @Override // c.a.a.a.f.d
    public void a(c cVar, f fVar) {
        a.a(cVar, "Cookie");
        a.a(fVar, "Cookie origin");
        String lowerCase = fVar.a().toLowerCase(Locale.ROOT);
        if (cVar.getDomain() != null) {
            String lowerCase2 = cVar.getDomain().toLowerCase(Locale.ROOT);
            if (!(cVar instanceof c.a.a.a.f.a) || !((c.a.a.a.f.a) cVar).containsAttribute("domain")) {
                if (!cVar.getDomain().equals(lowerCase)) {
                    throw new h("Illegal domain attribute: \"" + cVar.getDomain() + "\"." + "Domain of origin: \"" + lowerCase + "\"");
                }
            } else if (lowerCase2.startsWith(".")) {
                int indexOf = lowerCase2.indexOf(46, 1);
                if ((indexOf < 0 || indexOf == lowerCase2.length() - 1) && !lowerCase2.equals(".local")) {
                    throw new h("Domain attribute \"" + cVar.getDomain() + "\" violates RFC 2965: the value contains no embedded dots " + "and the value is not .local");
                } else if (!a(lowerCase, lowerCase2)) {
                    throw new h("Domain attribute \"" + cVar.getDomain() + "\" violates RFC 2965: effective host name does not " + "domain-match domain attribute.");
                } else if (lowerCase.substring(0, lowerCase.length() - lowerCase2.length()).indexOf(46) != -1) {
                    throw new h("Domain attribute \"" + cVar.getDomain() + "\" violates RFC 2965: " + "effective host minus domain may not contain any dots");
                }
            } else {
                throw new h("Domain attribute \"" + cVar.getDomain() + "\" violates RFC 2109: domain must start with a dot");
            }
        } else {
            throw new h("Invalid cookie state: domain not specified");
        }
    }

    @Override // c.a.a.a.f.d
    public void a(p pVar, String str) {
        a.a(pVar, "Cookie");
        if (str == null) {
            throw new n("Missing value for domain attribute");
        } else if (!str.trim().isEmpty()) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            if (!str.startsWith(".")) {
                lowerCase = '.' + lowerCase;
            }
            pVar.setDomain(lowerCase);
        } else {
            throw new n("Blank value for domain attribute");
        }
    }

    public boolean a(String str, String str2) {
        return str.equals(str2) || (str2.startsWith(".") && str.endsWith(str2));
    }

    @Override // c.a.a.a.f.d
    public boolean b(c cVar, f fVar) {
        a.a(cVar, "Cookie");
        a.a(fVar, "Cookie origin");
        String lowerCase = fVar.a().toLowerCase(Locale.ROOT);
        String domain = cVar.getDomain();
        return a(lowerCase, domain) && lowerCase.substring(0, lowerCase.length() - domain.length()).indexOf(46) == -1;
    }
}
