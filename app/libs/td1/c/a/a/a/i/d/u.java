package c.a.a.a.i.d;

import c.a.a.a.f.c;
import c.a.a.a.f.f;
import c.a.a.a.f.h;
import c.a.a.a.f.n;
import c.a.a.a.f.p;
import c.a.a.a.p.a;
import c.a.a.a.p.i;
import java.util.Locale;
import java.util.StringTokenizer;

public class u extends C0131f {
    private static boolean a(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        return upperCase.endsWith(".COM") || upperCase.endsWith(".EDU") || upperCase.endsWith(".NET") || upperCase.endsWith(".GOV") || upperCase.endsWith(".MIL") || upperCase.endsWith(".ORG") || upperCase.endsWith(".INT");
    }

    @Override // c.a.a.a.f.b, c.a.a.a.i.d.C0131f
    public String a() {
        return "domain";
    }

    @Override // c.a.a.a.f.d, c.a.a.a.i.d.C0131f
    public void a(c cVar, f fVar) {
        String a2 = fVar.a();
        String domain = cVar.getDomain();
        if (!a2.equals(domain) && !C0131f.a(domain, a2)) {
            throw new h("Illegal domain attribute \"" + domain + "\". Domain of origin: \"" + a2 + "\"");
        } else if (a2.contains(".")) {
            int countTokens = new StringTokenizer(domain, ".").countTokens();
            if (a(domain)) {
                if (countTokens < 2) {
                    throw new h("Domain attribute \"" + domain + "\" violates the Netscape cookie specification for " + "special domains");
                }
            } else if (countTokens < 3) {
                throw new h("Domain attribute \"" + domain + "\" violates the Netscape cookie specification");
            }
        }
    }

    @Override // c.a.a.a.f.d, c.a.a.a.i.d.C0131f
    public void a(p pVar, String str) {
        a.a(pVar, "Cookie");
        if (!i.b(str)) {
            pVar.setDomain(str);
            return;
        }
        throw new n("Blank or null value for domain attribute");
    }

    @Override // c.a.a.a.f.d, c.a.a.a.i.d.C0131f
    public boolean b(c cVar, f fVar) {
        a.a(cVar, "Cookie");
        a.a(fVar, "Cookie origin");
        String a2 = fVar.a();
        String domain = cVar.getDomain();
        if (domain == null) {
            return false;
        }
        return a2.endsWith(domain);
    }
}
