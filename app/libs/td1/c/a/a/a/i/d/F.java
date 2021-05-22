package c.a.a.a.i.d;

import c.a.a.a.f.b;
import c.a.a.a.f.c;
import c.a.a.a.f.f;
import c.a.a.a.f.h;
import c.a.a.a.f.n;
import c.a.a.a.f.o;
import c.a.a.a.f.p;
import c.a.a.a.p.a;
import java.util.StringTokenizer;

public class F implements b {
    private static boolean a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    private static int[] a(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            try {
                iArr[i] = Integer.parseInt(stringTokenizer.nextToken().trim());
                if (iArr[i] >= 0) {
                    i++;
                } else {
                    throw new n("Invalid Port attribute.");
                }
            } catch (NumberFormatException e) {
                throw new n("Invalid Port attribute: " + e.getMessage());
            }
        }
        return iArr;
    }

    @Override // c.a.a.a.f.b
    public String a() {
        return "port";
    }

    @Override // c.a.a.a.f.d
    public void a(c cVar, f fVar) {
        a.a(cVar, "Cookie");
        a.a(fVar, "Cookie origin");
        int c2 = fVar.c();
        if ((cVar instanceof c.a.a.a.f.a) && ((c.a.a.a.f.a) cVar).containsAttribute("port") && !a(c2, cVar.getPorts())) {
            throw new h("Port attribute violates RFC 2965: Request port not found in cookie's port list.");
        }
    }

    @Override // c.a.a.a.f.d
    public void a(p pVar, String str) {
        a.a(pVar, "Cookie");
        if (pVar instanceof o) {
            o oVar = (o) pVar;
            if (str != null && !str.trim().isEmpty()) {
                oVar.setPorts(a(str));
            }
        }
    }

    @Override // c.a.a.a.f.d
    public boolean b(c cVar, f fVar) {
        a.a(cVar, "Cookie");
        a.a(fVar, "Cookie origin");
        int c2 = fVar.c();
        if (!(cVar instanceof c.a.a.a.f.a) || !((c.a.a.a.f.a) cVar).containsAttribute("port")) {
            return true;
        }
        return cVar.getPorts() != null && a(c2, cVar.getPorts());
    }
}
