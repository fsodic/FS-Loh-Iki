package c.a.a.a.b.e;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.AbstractC0124h;
import c.a.a.a.b.h;
import c.a.a.a.f.c;
import c.a.a.a.f.f;
import c.a.a.a.f.i;
import c.a.a.a.f.n;
import c.a.a.a.h.b;
import c.a.a.a.n.e;
import c.a.a.a.p.a;
import c.a.a.a.t;
import c.a.a.a.v;

public class j implements v {

    /* renamed from: a  reason: collision with root package name */
    public b f633a = new b(j.class);

    private static String a(c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.getName());
        sb.append("=\"");
        String value = cVar.getValue();
        if (value != null) {
            if (value.length() > 100) {
                value = value.substring(0, 100) + "...";
            }
            sb.append(value);
        }
        sb.append("\"");
        sb.append(", version:");
        sb.append(Integer.toString(cVar.getVersion()));
        sb.append(", domain:");
        sb.append(cVar.getDomain());
        sb.append(", path:");
        sb.append(cVar.getPath());
        sb.append(", expiry:");
        sb.append(cVar.getExpiryDate());
        return sb.toString();
    }

    private void a(AbstractC0124h hVar, i iVar, f fVar, h hVar2) {
        while (hVar.hasNext()) {
            AbstractC0121e nextHeader = hVar.nextHeader();
            try {
                for (c cVar : iVar.a(nextHeader, fVar)) {
                    try {
                        iVar.a(cVar, fVar);
                        hVar2.a(cVar);
                        if (this.f633a.a()) {
                            b bVar = this.f633a;
                            bVar.a("Cookie accepted [" + a(cVar) + "]");
                        }
                    } catch (n e) {
                        if (this.f633a.d()) {
                            b bVar2 = this.f633a;
                            bVar2.d("Cookie rejected [" + a(cVar) + "] " + e.getMessage());
                        }
                    }
                }
            } catch (n e2) {
                if (this.f633a.d()) {
                    b bVar3 = this.f633a;
                    bVar3.d("Invalid cookie header: \"" + nextHeader + "\". " + e2.getMessage());
                }
            }
        }
    }

    @Override // c.a.a.a.v
    public void a(t tVar, e eVar) {
        b bVar;
        String str;
        a.a(tVar, "HTTP request");
        a.a(eVar, "HTTP context");
        a a2 = a.a(eVar);
        i h = a2.h();
        if (h == null) {
            bVar = this.f633a;
            str = "Cookie spec not specified in HTTP context";
        } else {
            h j = a2.j();
            if (j == null) {
                bVar = this.f633a;
                str = "Cookie store not specified in HTTP context";
            } else {
                f g = a2.g();
                if (g == null) {
                    bVar = this.f633a;
                    str = "Cookie origin not specified in HTTP context";
                } else {
                    a(tVar.headerIterator("Set-Cookie"), h, g, j);
                    if (h.getVersion() > 0) {
                        a(tVar.headerIterator("Set-Cookie2"), h, g, j);
                        return;
                    }
                    return;
                }
            }
        }
        bVar.a(str);
    }
}
