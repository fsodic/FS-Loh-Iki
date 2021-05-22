package c.a.a.a.i.a;

import c.a.a.a.AbstractC0120d;
import c.a.a.a.AbstractC0121e;
import c.a.a.a.a.l;
import c.a.a.a.a.m;
import c.a.a.a.a.n;
import c.a.a.a.a.p;
import c.a.a.a.n.e;
import c.a.a.a.p.d;
import c.a.a.a.r;
import java.util.Locale;

public abstract class a implements m {

    /* renamed from: a  reason: collision with root package name */
    private l f728a;

    @Override // c.a.a.a.a.m
    public AbstractC0121e a(n nVar, r rVar, e eVar) {
        return a(nVar, rVar);
    }

    @Override // c.a.a.a.a.c
    public void a(AbstractC0121e eVar) {
        l lVar;
        int i;
        d dVar;
        c.a.a.a.p.a.a(eVar, "Header");
        String name = eVar.getName();
        if (name.equalsIgnoreCase("WWW-Authenticate")) {
            lVar = l.TARGET;
        } else if (name.equalsIgnoreCase("Proxy-Authenticate")) {
            lVar = l.PROXY;
        } else {
            throw new p("Unexpected header name: " + name);
        }
        this.f728a = lVar;
        if (eVar instanceof AbstractC0120d) {
            AbstractC0120d dVar2 = (AbstractC0120d) eVar;
            dVar = dVar2.getBuffer();
            i = dVar2.getValuePos();
        } else {
            String value = eVar.getValue();
            if (value != null) {
                dVar = new d(value.length());
                dVar.a(value);
                i = 0;
            } else {
                throw new p("Header value is null");
            }
        }
        while (i < dVar.length() && c.a.a.a.n.d.a(dVar.charAt(i))) {
            i++;
        }
        int i2 = i;
        while (i2 < dVar.length() && !c.a.a.a.n.d.a(dVar.charAt(i2))) {
            i2++;
        }
        String a2 = dVar.a(i, i2);
        if (a2.equalsIgnoreCase(getSchemeName())) {
            a(dVar, i2, dVar.length());
            return;
        }
        throw new p("Invalid scheme identifier: " + a2);
    }

    /* access modifiers changed from: protected */
    public abstract void a(d dVar, int i, int i2);

    public boolean a() {
        l lVar = this.f728a;
        return lVar != null && lVar == l.PROXY;
    }

    public String toString() {
        String schemeName = getSchemeName();
        return schemeName != null ? schemeName.toUpperCase(Locale.ROOT) : super.toString();
    }
}
