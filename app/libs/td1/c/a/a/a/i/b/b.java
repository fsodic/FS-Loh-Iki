package c.a.a.a.i.b;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.a.a;
import c.a.a.a.a.h;
import c.a.a.a.a.j;
import c.a.a.a.a.n;
import c.a.a.a.b.c;
import c.a.a.a.b.i;
import c.a.a.a.n.e;
import c.a.a.a.o;
import c.a.a.a.t;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;

/* access modifiers changed from: package-private */
@Deprecated
public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public c.a.a.a.h.b f752a;

    /* renamed from: b  reason: collision with root package name */
    private final c.a.a.a.b.b f753b;

    private boolean a(c.a.a.a.a.c cVar) {
        if (cVar == null || !cVar.isComplete()) {
            return false;
        }
        String schemeName = cVar.getSchemeName();
        return schemeName.equalsIgnoreCase("Basic") || schemeName.equalsIgnoreCase("Digest");
    }

    public c.a.a.a.b.b a() {
        return this.f753b;
    }

    @Override // c.a.a.a.b.c
    public Map<String, AbstractC0121e> a(o oVar, t tVar, e eVar) {
        return this.f753b.a(tVar, eVar);
    }

    @Override // c.a.a.a.b.c
    public Queue<a> a(Map<String, AbstractC0121e> map, o oVar, t tVar, e eVar) {
        c.a.a.a.p.a.a(map, "Map of auth challenges");
        c.a.a.a.p.a.a(oVar, "Host");
        c.a.a.a.p.a.a(tVar, "HTTP response");
        c.a.a.a.p.a.a(eVar, "HTTP context");
        LinkedList linkedList = new LinkedList();
        i iVar = (i) eVar.getAttribute("http.auth.credentials-provider");
        if (iVar == null) {
            this.f752a.a("Credentials provider not set in the context");
            return linkedList;
        }
        try {
            c.a.a.a.a.c a2 = this.f753b.a(map, tVar, eVar);
            a2.a(map.get(a2.getSchemeName().toLowerCase(Locale.ROOT)));
            n a3 = iVar.a(new h(oVar.d(), oVar.e(), a2.getRealm(), a2.getSchemeName()));
            if (a3 != null) {
                linkedList.add(new a(a2, a3));
            }
            return linkedList;
        } catch (j e) {
            if (this.f752a.d()) {
                this.f752a.b(e.getMessage(), e);
            }
            return linkedList;
        }
    }

    @Override // c.a.a.a.b.c
    public void a(o oVar, c.a.a.a.a.c cVar, e eVar) {
        c.a.a.a.b.a aVar = (c.a.a.a.b.a) eVar.getAttribute("http.auth.auth-cache");
        if (aVar != null) {
            if (this.f752a.a()) {
                c.a.a.a.h.b bVar = this.f752a;
                bVar.a("Removing from cache '" + cVar.getSchemeName() + "' auth scheme for " + oVar);
            }
            aVar.a(oVar);
        }
    }

    @Override // c.a.a.a.b.c
    public void b(o oVar, c.a.a.a.a.c cVar, e eVar) {
        c.a.a.a.b.a aVar = (c.a.a.a.b.a) eVar.getAttribute("http.auth.auth-cache");
        if (a(cVar)) {
            if (aVar == null) {
                aVar = new d();
                eVar.setAttribute("http.auth.auth-cache", aVar);
            }
            if (this.f752a.a()) {
                c.a.a.a.h.b bVar = this.f752a;
                bVar.a("Caching '" + cVar.getSchemeName() + "' auth scheme for " + oVar);
            }
            aVar.a(oVar, cVar);
        }
    }

    @Override // c.a.a.a.b.c
    public boolean b(o oVar, t tVar, e eVar) {
        return this.f753b.b(tVar, eVar);
    }
}
