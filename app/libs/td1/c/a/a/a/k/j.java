package c.a.a.a.k;

import c.a.a.a.AbstractC0120d;
import c.a.a.a.AbstractC0121e;
import c.a.a.a.D;
import c.a.a.a.F;
import c.a.a.a.G;
import c.a.a.a.p.a;
import c.a.a.a.p.d;

public class j implements u {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final j f925a = new j();

    /* renamed from: b  reason: collision with root package name */
    public static final j f926b = new j();

    /* access modifiers changed from: protected */
    public int a(D d) {
        return d.e().length() + 4;
    }

    /* access modifiers changed from: protected */
    public d a(d dVar) {
        if (dVar == null) {
            return new d(64);
        }
        dVar.clear();
        return dVar;
    }

    public d a(d dVar, D d) {
        a.a(d, "Protocol version");
        int a2 = a(d);
        if (dVar == null) {
            dVar = new d(a2);
        } else {
            dVar.a(a2);
        }
        dVar.a(d.e());
        dVar.append('/');
        dVar.a(Integer.toString(d.c()));
        dVar.append('.');
        dVar.a(Integer.toString(d.d()));
        return dVar;
    }

    @Override // c.a.a.a.k.u
    public d a(d dVar, F f) {
        a.a(f, "Request line");
        d a2 = a(dVar);
        b(a2, f);
        return a2;
    }

    @Override // c.a.a.a.k.u
    public d a(d dVar, AbstractC0121e eVar) {
        a.a(eVar, "Header");
        if (eVar instanceof AbstractC0120d) {
            return ((AbstractC0120d) eVar).getBuffer();
        }
        d a2 = a(dVar);
        b(a2, eVar);
        return a2;
    }

    /* access modifiers changed from: protected */
    public void a(d dVar, G g) {
        int a2 = a(g.getProtocolVersion()) + 1 + 3 + 1;
        String reasonPhrase = g.getReasonPhrase();
        if (reasonPhrase != null) {
            a2 += reasonPhrase.length();
        }
        dVar.a(a2);
        a(dVar, g.getProtocolVersion());
        dVar.append(' ');
        dVar.a(Integer.toString(g.getStatusCode()));
        dVar.append(' ');
        if (reasonPhrase != null) {
            dVar.a(reasonPhrase);
        }
    }

    public d b(d dVar, G g) {
        a.a(g, "Status line");
        d a2 = a(dVar);
        a(a2, g);
        return a2;
    }

    /* access modifiers changed from: protected */
    public void b(d dVar, F f) {
        String method = f.getMethod();
        String uri = f.getUri();
        dVar.a(method.length() + 1 + uri.length() + 1 + a(f.getProtocolVersion()));
        dVar.a(method);
        dVar.append(' ');
        dVar.a(uri);
        dVar.append(' ');
        a(dVar, f.getProtocolVersion());
    }

    /* access modifiers changed from: protected */
    public void b(d dVar, AbstractC0121e eVar) {
        String name = eVar.getName();
        String value = eVar.getValue();
        int length = name.length() + 2;
        if (value != null) {
            length += value.length();
        }
        dVar.a(length);
        dVar.a(name);
        dVar.a(": ");
        if (value != null) {
            dVar.a(value);
        }
    }
}
