package c.a.a.a.i.a;

import c.a.a.a.AbstractC0122f;
import c.a.a.a.C0119c;
import c.a.a.a.k.g;
import c.a.a.a.k.w;
import c.a.a.a.p.d;
import c.a.a.a.r;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public abstract class m extends a implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f747b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private transient Charset f748c;

    public m(Charset charset) {
        this.f748c = charset == null ? C0119c.f646b : charset;
    }

    /* access modifiers changed from: package-private */
    public String a(r rVar) {
        String str = (String) rVar.getParams().getParameter("http.auth.credential-charset");
        return str == null ? b().name() : str;
    }

    public String a(String str) {
        if (str == null) {
            return null;
        }
        return this.f747b.get(str.toLowerCase(Locale.ROOT));
    }

    /* access modifiers changed from: protected */
    @Override // c.a.a.a.i.a.a
    public void a(d dVar, int i, int i2) {
        AbstractC0122f[] a2 = g.f921b.a(dVar, new w(i, dVar.length()));
        this.f747b.clear();
        for (AbstractC0122f fVar : a2) {
            this.f747b.put(fVar.getName().toLowerCase(Locale.ROOT), fVar.getValue());
        }
    }

    public Charset b() {
        Charset charset = this.f748c;
        return charset != null ? charset : C0119c.f646b;
    }

    /* access modifiers changed from: protected */
    public Map<String, String> c() {
        return this.f747b;
    }

    @Override // c.a.a.a.a.c
    public String getRealm() {
        return a("realm");
    }
}
