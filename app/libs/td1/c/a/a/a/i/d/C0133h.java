package c.a.a.a.i.d;

import c.a.a.a.f.b;
import c.a.a.a.f.n;
import c.a.a.a.f.p;
import c.a.a.a.p.a;
import java.util.Date;

/* renamed from: c.a.a.a.i.d.h  reason: case insensitive filesystem */
public class C0133h extends AbstractC0126a implements b {
    @Override // c.a.a.a.f.b
    public String a() {
        return "max-age";
    }

    @Override // c.a.a.a.f.d
    public void a(p pVar, String str) {
        a.a(pVar, "Cookie");
        if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt >= 0) {
                    pVar.setExpiryDate(new Date(System.currentTimeMillis() + (((long) parseInt) * 1000)));
                    return;
                }
                throw new n("Negative 'max-age' attribute: " + str);
            } catch (NumberFormatException unused) {
                throw new n("Invalid 'max-age' attribute: " + str);
            }
        } else {
            throw new n("Missing value for 'max-age' attribute");
        }
    }
}
