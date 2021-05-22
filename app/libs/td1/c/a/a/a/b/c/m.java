package c.a.a.a.b.c;

import c.a.a.a.C0119c;
import c.a.a.a.D;
import c.a.a.a.b.f.d;
import c.a.a.a.b.f.f;
import c.a.a.a.g.e;
import c.a.a.a.k.r;
import c.a.a.a.l;
import c.a.a.a.z;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.List;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private String f624a;

    /* renamed from: b  reason: collision with root package name */
    private Charset f625b;

    /* renamed from: c  reason: collision with root package name */
    private D f626c;
    private URI d;
    private r e;
    private l f;
    private List<z> g;
    private c.a.a.a.b.a.a h;

    static class a extends g {
        private final String i;

        a(String str) {
            this.i = str;
        }

        @Override // c.a.a.a.b.c.k, c.a.a.a.b.c.l
        public String getMethod() {
            return this.i;
        }
    }

    static class b extends k {
        private final String h;

        b(String str) {
            this.h = str;
        }

        @Override // c.a.a.a.b.c.k, c.a.a.a.b.c.l
        public String getMethod() {
            return this.h;
        }
    }

    m() {
        this(null);
    }

    m(String str) {
        this.f625b = C0119c.f645a;
        this.f624a = str;
    }

    public static m a(c.a.a.a.r rVar) {
        c.a.a.a.p.a.a(rVar, "HTTP request");
        m mVar = new m();
        mVar.b(rVar);
        return mVar;
    }

    private m b(c.a.a.a.r rVar) {
        if (rVar == null) {
            return this;
        }
        this.f624a = rVar.getRequestLine().getMethod();
        this.f626c = rVar.getRequestLine().getProtocolVersion();
        if (this.e == null) {
            this.e = new r();
        }
        this.e.c();
        this.e.a(rVar.getAllHeaders());
        this.g = null;
        this.f = null;
        if (rVar instanceof c.a.a.a.m) {
            l entity = ((c.a.a.a.m) rVar).getEntity();
            e a2 = e.a(entity);
            if (a2 == null || !a2.b().equals(e.f716b.b())) {
                this.f = entity;
            } else {
                try {
                    List<z> a3 = f.a(entity);
                    if (!a3.isEmpty()) {
                        this.g = a3;
                    }
                } catch (IOException unused) {
                }
            }
        }
        URI uri = rVar instanceof l ? ((l) rVar).getURI() : URI.create(rVar.getRequestLine().getUri());
        d dVar = new d(uri);
        if (this.g == null) {
            List<z> e2 = dVar.e();
            if (!e2.isEmpty()) {
                this.g = e2;
                dVar.b();
            } else {
                this.g = null;
            }
        }
        try {
            this.d = dVar.a();
        } catch (URISyntaxException unused2) {
            this.d = uri;
        }
        if (rVar instanceof f) {
            this.h = ((f) rVar).c();
        } else {
            this.h = null;
        }
        return this;
    }

    public l a() {
        k kVar;
        URI uri = this.d;
        if (uri == null) {
            uri = URI.create("/");
        }
        l lVar = this.f;
        List<z> list = this.g;
        if (list != null && !list.isEmpty()) {
            if (lVar != null || (!"POST".equalsIgnoreCase(this.f624a) && !"PUT".equalsIgnoreCase(this.f624a))) {
                try {
                    d dVar = new d(uri);
                    dVar.a(this.f625b);
                    dVar.a(this.g);
                    uri = dVar.a();
                } catch (URISyntaxException unused) {
                }
            } else {
                lVar = new c.a.a.a.b.b.a(this.g, c.a.a.a.n.d.f963a);
            }
        }
        if (lVar == null) {
            kVar = new b(this.f624a);
        } else {
            a aVar = new a(this.f624a);
            aVar.a(lVar);
            kVar = aVar;
        }
        kVar.a(this.f626c);
        kVar.a(uri);
        r rVar = this.e;
        if (rVar != null) {
            kVar.a(rVar.d());
        }
        kVar.a(this.h);
        return kVar;
    }

    public m a(URI uri) {
        this.d = uri;
        return this;
    }
}
