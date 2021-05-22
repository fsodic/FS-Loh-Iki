package c.a.a.a.i.c;

import c.a.a.a.e.r;
import c.a.a.a.e.s;
import c.a.a.a.o;
import c.a.a.a.p.a;

public class k implements r {

    /* renamed from: a  reason: collision with root package name */
    public static final k f826a = new k();

    @Override // c.a.a.a.e.r
    public int a(o oVar) {
        a.a(oVar, "HTTP host");
        int e = oVar.e();
        if (e > 0) {
            return e;
        }
        String f = oVar.f();
        if (f.equalsIgnoreCase("http")) {
            return 80;
        }
        if (f.equalsIgnoreCase("https")) {
            return 443;
        }
        throw new s(f + " protocol is not supported");
    }
}
