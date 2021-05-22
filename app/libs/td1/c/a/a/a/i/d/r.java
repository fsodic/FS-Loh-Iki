package c.a.a.a.i.d;

import c.a.a.a.AbstractC0120d;
import c.a.a.a.AbstractC0121e;
import c.a.a.a.AbstractC0122f;
import c.a.a.a.f.b;
import c.a.a.a.f.c;
import c.a.a.a.f.f;
import c.a.a.a.f.i;
import c.a.a.a.f.n;
import c.a.a.a.f.o;
import c.a.a.a.k.w;
import c.a.a.a.p.a;
import c.a.a.a.p.d;
import java.util.List;

public class r implements i {

    /* renamed from: a  reason: collision with root package name */
    private final G f857a;

    /* renamed from: b  reason: collision with root package name */
    private final z f858b;

    /* renamed from: c  reason: collision with root package name */
    private final w f859c;

    public r(String[] strArr, boolean z) {
        this.f857a = new G(z, new I(), new C0134i(), new E(), new F(), new C0133h(), new j(), new C0130e(), new C(), new D());
        this.f858b = new z(z, new B(), new C0134i(), new y(), new C0133h(), new j(), new C0130e());
        b[] bVarArr = new b[5];
        bVarArr[0] = new C0131f();
        bVarArr[1] = new C0134i();
        bVarArr[2] = new j();
        bVarArr[3] = new C0130e();
        bVarArr[4] = new C0132g(strArr != null ? (String[]) strArr.clone() : new String[]{"EEE, dd-MMM-yy HH:mm:ss z"});
        this.f859c = new w(bVarArr);
    }

    @Override // c.a.a.a.f.i
    public List<c> a(AbstractC0121e eVar, f fVar) {
        w wVar;
        d dVar;
        a.a(eVar, "Header");
        a.a(fVar, "Cookie origin");
        AbstractC0122f[] elements = eVar.getElements();
        boolean z = false;
        boolean z2 = false;
        for (AbstractC0122f fVar2 : elements) {
            if (fVar2.getParameterByName("version") != null) {
                z2 = true;
            }
            if (fVar2.getParameterByName("expires") != null) {
                z = true;
            }
        }
        if (!z && z2) {
            return "Set-Cookie2".equals(eVar.getName()) ? this.f857a.a(elements, fVar) : this.f858b.a(elements, fVar);
        }
        v vVar = v.f860a;
        if (eVar instanceof AbstractC0120d) {
            AbstractC0120d dVar2 = (AbstractC0120d) eVar;
            dVar = dVar2.getBuffer();
            wVar = new w(dVar2.getValuePos(), dVar.length());
        } else {
            String value = eVar.getValue();
            if (value != null) {
                dVar = new d(value.length());
                dVar.a(value);
                wVar = new w(0, dVar.length());
            } else {
                throw new n("Header value is null");
            }
        }
        return this.f859c.a(new AbstractC0122f[]{vVar.a(dVar, wVar)}, fVar);
    }

    @Override // c.a.a.a.f.i
    public void a(c cVar, f fVar) {
        a.a(cVar, "Cookie");
        a.a(fVar, "Cookie origin");
        if (cVar.getVersion() <= 0) {
            this.f859c.a(cVar, fVar);
        } else if (cVar instanceof o) {
            this.f857a.a(cVar, fVar);
        } else {
            this.f858b.a(cVar, fVar);
        }
    }

    @Override // c.a.a.a.f.i
    public boolean b(c cVar, f fVar) {
        a.a(cVar, "Cookie");
        a.a(fVar, "Cookie origin");
        return cVar.getVersion() > 0 ? cVar instanceof o ? this.f857a.b(cVar, fVar) : this.f858b.b(cVar, fVar) : this.f859c.b(cVar, fVar);
    }

    @Override // c.a.a.a.f.i
    public List<AbstractC0121e> formatCookies(List<c> list) {
        a.a((Object) list, "List of cookies");
        int i = Integer.MAX_VALUE;
        boolean z = true;
        for (c cVar : list) {
            if (!(cVar instanceof o)) {
                z = false;
            }
            if (cVar.getVersion() < i) {
                i = cVar.getVersion();
            }
        }
        return i > 0 ? z ? this.f857a.formatCookies(list) : this.f858b.formatCookies(list) : this.f859c.formatCookies(list);
    }

    @Override // c.a.a.a.f.i
    public int getVersion() {
        return this.f857a.getVersion();
    }

    @Override // c.a.a.a.f.i
    public AbstractC0121e getVersionHeader() {
        return null;
    }
}
