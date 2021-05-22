package c.a.a.a.i.b;

import c.a.a.a.AbstractC0120d;
import c.a.a.a.AbstractC0121e;
import c.a.a.a.a.h;
import c.a.a.a.a.n;
import c.a.a.a.a.p;
import c.a.a.a.b.a.a;
import c.a.a.a.b.i;
import c.a.a.a.h.b;
import c.a.a.a.n.e;
import c.a.a.a.o;
import c.a.a.a.p.d;
import c.a.a.a.t;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;

/* access modifiers changed from: package-private */
public abstract class c implements c.a.a.a.b.c {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f754a = Collections.unmodifiableList(Arrays.asList("Negotiate", "Kerberos", "NTLM", "Digest", "Basic"));

    /* renamed from: b  reason: collision with root package name */
    public b f755b = new b(getClass());

    /* renamed from: c  reason: collision with root package name */
    private final int f756c;
    private final String d;

    c(int i, String str) {
        this.f756c = i;
        this.d = str;
    }

    /* access modifiers changed from: package-private */
    public abstract Collection<String> a(a aVar);

    @Override // c.a.a.a.b.c
    public Map<String, AbstractC0121e> a(o oVar, t tVar, e eVar) {
        d dVar;
        int i;
        c.a.a.a.p.a.a(tVar, "HTTP response");
        AbstractC0121e[] headers = tVar.getHeaders(this.d);
        HashMap hashMap = new HashMap(headers.length);
        for (AbstractC0121e eVar2 : headers) {
            if (eVar2 instanceof AbstractC0120d) {
                AbstractC0120d dVar2 = (AbstractC0120d) eVar2;
                dVar = dVar2.getBuffer();
                i = dVar2.getValuePos();
            } else {
                String value = eVar2.getValue();
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
            hashMap.put(dVar.a(i, i2).toLowerCase(Locale.ROOT), eVar2);
        }
        return hashMap;
    }

    @Override // c.a.a.a.b.c
    public Queue<c.a.a.a.a.a> a(Map<String, AbstractC0121e> map, o oVar, t tVar, e eVar) {
        b bVar;
        String str;
        c.a.a.a.p.a.a(map, "Map of auth challenges");
        c.a.a.a.p.a.a(oVar, "Host");
        c.a.a.a.p.a.a(tVar, "HTTP response");
        c.a.a.a.p.a.a(eVar, "HTTP context");
        c.a.a.a.b.e.a a2 = c.a.a.a.b.e.a.a(eVar);
        LinkedList linkedList = new LinkedList();
        c.a.a.a.d.a<c.a.a.a.a.e> f = a2.f();
        if (f == null) {
            bVar = this.f755b;
            str = "Auth scheme registry not set in the context";
        } else {
            i k = a2.k();
            if (k == null) {
                bVar = this.f755b;
                str = "Credentials provider not set in the context";
            } else {
                Collection<String> a3 = a(a2.n());
                if (a3 == null) {
                    a3 = f754a;
                }
                if (this.f755b.a()) {
                    b bVar2 = this.f755b;
                    bVar2.a("Authentication schemes in the order of preference: " + a3);
                }
                for (String str2 : a3) {
                    AbstractC0121e eVar2 = map.get(str2.toLowerCase(Locale.ROOT));
                    if (eVar2 != null) {
                        c.a.a.a.a.e lookup = f.lookup(str2);
                        if (lookup != null) {
                            c.a.a.a.a.c a4 = lookup.a(eVar);
                            a4.a(eVar2);
                            n a5 = k.a(new h(oVar.d(), oVar.e(), a4.getRealm(), a4.getSchemeName()));
                            if (a5 != null) {
                                linkedList.add(new c.a.a.a.a.a(a4, a5));
                            }
                        } else if (this.f755b.d()) {
                            b bVar3 = this.f755b;
                            bVar3.d("Authentication scheme " + str2 + " not supported");
                        }
                    } else if (this.f755b.a()) {
                        b bVar4 = this.f755b;
                        bVar4.a("Challenge for " + str2 + " authentication scheme not available");
                    }
                }
                return linkedList;
            }
        }
        bVar.a(str);
        return linkedList;
    }

    @Override // c.a.a.a.b.c
    public void a(o oVar, c.a.a.a.a.c cVar, e eVar) {
        c.a.a.a.p.a.a(oVar, "Host");
        c.a.a.a.p.a.a(eVar, "HTTP context");
        c.a.a.a.b.a e = c.a.a.a.b.e.a.a(eVar).e();
        if (e != null) {
            if (this.f755b.a()) {
                b bVar = this.f755b;
                bVar.a("Clearing cached auth scheme for " + oVar);
            }
            e.a(oVar);
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(c.a.a.a.a.c cVar) {
        if (cVar == null || !cVar.isComplete()) {
            return false;
        }
        String schemeName = cVar.getSchemeName();
        return schemeName.equalsIgnoreCase("Basic") || schemeName.equalsIgnoreCase("Digest");
    }

    @Override // c.a.a.a.b.c
    public void b(o oVar, c.a.a.a.a.c cVar, e eVar) {
        c.a.a.a.p.a.a(oVar, "Host");
        c.a.a.a.p.a.a(cVar, "Auth scheme");
        c.a.a.a.p.a.a(eVar, "HTTP context");
        c.a.a.a.b.e.a a2 = c.a.a.a.b.e.a.a(eVar);
        if (a(cVar)) {
            c.a.a.a.b.a e = a2.e();
            if (e == null) {
                e = new d();
                a2.a(e);
            }
            if (this.f755b.a()) {
                b bVar = this.f755b;
                bVar.a("Caching '" + cVar.getSchemeName() + "' auth scheme for " + oVar);
            }
            e.a(oVar, cVar);
        }
    }

    @Override // c.a.a.a.b.c
    public boolean b(o oVar, t tVar, e eVar) {
        c.a.a.a.p.a.a(tVar, "HTTP response");
        return tVar.getStatusLine().getStatusCode() == this.f756c;
    }
}
