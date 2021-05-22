package c.a.a.a.i.d;

import c.a.a.a.f.b;
import c.a.a.a.f.c;
import c.a.a.a.f.f;
import c.a.a.a.f.h;
import c.a.a.a.f.p;
import c.a.a.a.p.a;
import c.a.a.a.p.i;

/* renamed from: c.a.a.a.i.d.i  reason: case insensitive filesystem */
public class C0134i implements b {
    static boolean a(String str, String str2) {
        if (str2 == null) {
            str2 = "/";
        }
        if (str2.length() > 1 && str2.endsWith("/")) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        return str.startsWith(str2) && (str2.equals("/") || str.length() == str2.length() || str.charAt(str2.length()) == '/');
    }

    @Override // c.a.a.a.f.b
    public String a() {
        return "path";
    }

    @Override // c.a.a.a.f.d
    public void a(c cVar, f fVar) {
        if (!b(cVar, fVar)) {
            throw new h("Illegal 'path' attribute \"" + cVar.getPath() + "\". Path of origin: \"" + fVar.b() + "\"");
        }
    }

    @Override // c.a.a.a.f.d
    public void a(p pVar, String str) {
        a.a(pVar, "Cookie");
        if (i.b(str)) {
            str = "/";
        }
        pVar.setPath(str);
    }

    @Override // c.a.a.a.f.d
    public boolean b(c cVar, f fVar) {
        a.a(cVar, "Cookie");
        a.a(fVar, "Cookie origin");
        return a(fVar.b(), cVar.getPath());
    }
}
