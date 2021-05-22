package c.a.a.a.i.b;

import c.a.a.a.b.c.l;
import c.a.a.a.b.f;
import c.a.a.a.b.f.e;
import c.a.a.a.b.j;
import c.a.a.a.h.b;
import c.a.a.a.o;
import c.a.a.a.p.a;
import c.a.a.a.r;
import java.io.Closeable;
import java.net.URI;

public abstract class h implements j, Closeable {

    /* renamed from: a  reason: collision with root package name */
    public b f765a = new b(getClass());

    private static o a(l lVar) {
        URI uri = lVar.getURI();
        if (!uri.isAbsolute()) {
            return null;
        }
        o a2 = e.a(uri);
        if (a2 != null) {
            return a2;
        }
        throw new f("URI does not specify a valid host name: " + uri);
    }

    public c.a.a.a.b.c.e a(l lVar, c.a.a.a.n.e eVar) {
        a.a(lVar, "HTTP request");
        return a(a(lVar), lVar, eVar);
    }

    /* access modifiers changed from: protected */
    public abstract c.a.a.a.b.c.e a(o oVar, r rVar, c.a.a.a.n.e eVar);
}
