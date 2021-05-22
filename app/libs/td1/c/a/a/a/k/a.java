package c.a.a.a.k;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.AbstractC0124h;
import c.a.a.a.l.b;
import c.a.a.a.l.g;
import c.a.a.a.q;

public abstract class a implements q {

    /* renamed from: a  reason: collision with root package name */
    protected r f905a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    protected g f906b;

    protected a() {
        this(null);
    }

    @Deprecated
    protected a(g gVar) {
        this.f905a = new r();
        this.f906b = gVar;
    }

    @Override // c.a.a.a.q
    public void a(AbstractC0121e eVar) {
        this.f905a.a(eVar);
    }

    @Override // c.a.a.a.q
    @Deprecated
    public void a(g gVar) {
        c.a.a.a.p.a.a(gVar, "HTTP parameters");
        this.f906b = gVar;
    }

    @Override // c.a.a.a.q
    public void a(AbstractC0121e[] eVarArr) {
        this.f905a.a(eVarArr);
    }

    @Override // c.a.a.a.q
    public void addHeader(String str, String str2) {
        c.a.a.a.p.a.a((Object) str, "Header name");
        this.f905a.a(new b(str, str2));
    }

    @Override // c.a.a.a.q
    public void b(AbstractC0121e eVar) {
        this.f905a.b(eVar);
    }

    @Override // c.a.a.a.q
    public boolean containsHeader(String str) {
        return this.f905a.a(str);
    }

    @Override // c.a.a.a.q
    public AbstractC0121e[] getAllHeaders() {
        return this.f905a.d();
    }

    @Override // c.a.a.a.q
    public AbstractC0121e getFirstHeader(String str) {
        return this.f905a.b(str);
    }

    @Override // c.a.a.a.q
    public AbstractC0121e[] getHeaders(String str) {
        return this.f905a.c(str);
    }

    @Override // c.a.a.a.q
    @Deprecated
    public g getParams() {
        if (this.f906b == null) {
            this.f906b = new b();
        }
        return this.f906b;
    }

    @Override // c.a.a.a.q
    public AbstractC0124h headerIterator() {
        return this.f905a.e();
    }

    @Override // c.a.a.a.q
    public AbstractC0124h headerIterator(String str) {
        return this.f905a.d(str);
    }

    @Override // c.a.a.a.q
    public void removeHeaders(String str) {
        if (str != null) {
            AbstractC0124h e = this.f905a.e();
            while (e.hasNext()) {
                if (str.equalsIgnoreCase(e.nextHeader().getName())) {
                    e.remove();
                }
            }
        }
    }

    @Override // c.a.a.a.q
    public void setHeader(String str, String str2) {
        c.a.a.a.p.a.a((Object) str, "Header name");
        this.f905a.c(new b(str, str2));
    }
}
