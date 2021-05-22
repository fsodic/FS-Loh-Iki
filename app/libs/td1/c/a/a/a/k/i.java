package c.a.a.a.k;

import c.a.a.a.D;
import c.a.a.a.E;
import c.a.a.a.G;
import c.a.a.a.l;
import c.a.a.a.p.a;
import c.a.a.a.t;
import c.a.a.a.w;
import java.util.Locale;

public class i extends a implements t {

    /* renamed from: c  reason: collision with root package name */
    private G f924c;
    private D d;
    private int e;
    private String f;
    private l g;
    private final E h;
    private Locale i;

    public i(G g2, E e2, Locale locale) {
        a.a(g2, "Status line");
        this.f924c = g2;
        this.d = g2.getProtocolVersion();
        this.e = g2.getStatusCode();
        this.f = g2.getReasonPhrase();
        this.h = e2;
        this.i = locale;
    }

    /* access modifiers changed from: protected */
    public String a(int i2) {
        E e2 = this.h;
        if (e2 == null) {
            return null;
        }
        Locale locale = this.i;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return e2.getReason(i2, locale);
    }

    @Override // c.a.a.a.t
    public void a(l lVar) {
        this.g = lVar;
    }

    @Override // c.a.a.a.t
    public l getEntity() {
        return this.g;
    }

    @Override // c.a.a.a.q
    public D getProtocolVersion() {
        return this.d;
    }

    @Override // c.a.a.a.t
    public G getStatusLine() {
        if (this.f924c == null) {
            D d2 = this.d;
            if (d2 == null) {
                d2 = w.f;
            }
            int i2 = this.e;
            String str = this.f;
            if (str == null) {
                str = a(i2);
            }
            this.f924c = new o(d2, i2, str);
        }
        return this.f924c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getStatusLine());
        sb.append(' ');
        sb.append(this.f905a);
        if (this.g != null) {
            sb.append(' ');
            sb.append(this.g);
        }
        return sb.toString();
    }
}
