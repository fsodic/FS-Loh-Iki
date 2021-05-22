package c.a.a.a.i.d;

import c.a.a.a.e.f.a;
import c.a.a.a.f.b;
import c.a.a.a.f.c;
import c.a.a.a.f.f;
import c.a.a.a.f.h;
import c.a.a.a.f.n;
import c.a.a.a.f.p;
import c.a.a.a.p.i;
import java.util.Locale;

/* renamed from: c.a.a.a.i.d.f  reason: case insensitive filesystem */
public class C0131f implements b {
    static boolean a(String str, String str2) {
        if (!a.a(str2) && !a.b(str2)) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            if (str2.endsWith(str)) {
                int length = str2.length() - str.length();
                if (length == 0) {
                    return true;
                }
                return length > 1 && str2.charAt(length - 1) == '.';
            }
        }
    }

    @Override // c.a.a.a.f.b
    public String a() {
        return "domain";
    }

    @Override // c.a.a.a.f.d
    public void a(c cVar, f fVar) {
        c.a.a.a.p.a.a(cVar, "Cookie");
        c.a.a.a.p.a.a(fVar, "Cookie origin");
        String a2 = fVar.a();
        String domain = cVar.getDomain();
        if (domain == null) {
            throw new h("Cookie 'domain' may not be null");
        } else if (!a2.equals(domain) && !a(domain, a2)) {
            throw new h("Illegal 'domain' attribute \"" + domain + "\". Domain of origin: \"" + a2 + "\"");
        }
    }

    @Override // c.a.a.a.f.d
    public void a(p pVar, String str) {
        c.a.a.a.p.a.a(pVar, "Cookie");
        if (i.b(str)) {
            throw new n("Blank or null value for domain attribute");
        } else if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            pVar.setDomain(str.toLowerCase(Locale.ROOT));
        }
    }

    @Override // c.a.a.a.f.d
    public boolean b(c cVar, f fVar) {
        c.a.a.a.p.a.a(cVar, "Cookie");
        c.a.a.a.p.a.a(fVar, "Cookie origin");
        String a2 = fVar.a();
        String domain = cVar.getDomain();
        if (domain == null) {
            return false;
        }
        if (domain.startsWith(".")) {
            domain = domain.substring(1);
        }
        String lowerCase = domain.toLowerCase(Locale.ROOT);
        if (a2.equals(lowerCase)) {
            return true;
        }
        if (!(cVar instanceof c.a.a.a.f.a) || !((c.a.a.a.f.a) cVar).containsAttribute("domain")) {
            return false;
        }
        return a(lowerCase, a2);
    }
}
