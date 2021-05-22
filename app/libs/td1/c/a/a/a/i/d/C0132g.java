package c.a.a.a.i.d;

import c.a.a.a.b.f.c;
import c.a.a.a.f.b;
import c.a.a.a.f.n;
import c.a.a.a.f.p;
import c.a.a.a.p.a;
import java.util.Date;

/* renamed from: c.a.a.a.i.d.g  reason: case insensitive filesystem */
public class C0132g extends AbstractC0126a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f849a;

    public C0132g(String[] strArr) {
        a.a(strArr, "Array of date patterns");
        this.f849a = strArr;
    }

    @Override // c.a.a.a.f.b
    public String a() {
        return "expires";
    }

    @Override // c.a.a.a.f.d
    public void a(p pVar, String str) {
        a.a(pVar, "Cookie");
        if (str != null) {
            Date a2 = c.a(str, this.f849a);
            if (a2 != null) {
                pVar.setExpiryDate(a2);
                return;
            }
            throw new n("Invalid 'expires' attribute: " + str);
        }
        throw new n("Missing value for 'expires' attribute");
    }
}
