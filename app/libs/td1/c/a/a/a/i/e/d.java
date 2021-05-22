package c.a.a.a.i.e;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.C;
import c.a.a.a.p.a;
import c.a.a.a.q;
import c.a.a.a.w;

public class d implements c.a.a.a.g.d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f873a = new d();

    /* renamed from: b  reason: collision with root package name */
    private final int f874b;

    public d() {
        this(-1);
    }

    public d(int i) {
        this.f874b = i;
    }

    @Override // c.a.a.a.g.d
    public long a(q qVar) {
        a.a(qVar, "HTTP message");
        AbstractC0121e firstHeader = qVar.getFirstHeader("Transfer-Encoding");
        if (firstHeader != null) {
            String value = firstHeader.getValue();
            if ("chunked".equalsIgnoreCase(value)) {
                if (!qVar.getProtocolVersion().c(w.e)) {
                    return -2;
                }
                throw new C("Chunked transfer encoding not allowed for " + qVar.getProtocolVersion());
            } else if ("identity".equalsIgnoreCase(value)) {
                return -1;
            } else {
                throw new C("Unsupported transfer encoding: " + value);
            }
        } else {
            AbstractC0121e firstHeader2 = qVar.getFirstHeader("Content-Length");
            if (firstHeader2 == null) {
                return (long) this.f874b;
            }
            String value2 = firstHeader2.getValue();
            try {
                long parseLong = Long.parseLong(value2);
                if (parseLong >= 0) {
                    return parseLong;
                }
                throw new C("Negative content length: " + value2);
            } catch (NumberFormatException unused) {
                throw new C("Invalid content length: " + value2);
            }
        }
    }
}
