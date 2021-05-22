package c.a.a.a.i.e;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.AbstractC0122f;
import c.a.a.a.B;
import c.a.a.a.C;
import c.a.a.a.g.d;
import c.a.a.a.p.a;
import c.a.a.a.q;

public class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f871a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final int f872b;

    public c() {
        this(-1);
    }

    public c(int i) {
        this.f872b = i;
    }

    @Override // c.a.a.a.g.d
    public long a(q qVar) {
        long j;
        a.a(qVar, "HTTP message");
        AbstractC0121e firstHeader = qVar.getFirstHeader("Transfer-Encoding");
        if (firstHeader != null) {
            try {
                AbstractC0122f[] elements = firstHeader.getElements();
                int length = elements.length;
                return (!"identity".equalsIgnoreCase(firstHeader.getValue()) && length > 0 && "chunked".equalsIgnoreCase(elements[length + -1].getName())) ? -2 : -1;
            } catch (B e) {
                throw new C("Invalid Transfer-Encoding header value: " + firstHeader, e);
            }
        } else if (qVar.getFirstHeader("Content-Length") == null) {
            return (long) this.f872b;
        } else {
            AbstractC0121e[] headers = qVar.getHeaders("Content-Length");
            int length2 = headers.length - 1;
            while (true) {
                if (length2 < 0) {
                    j = -1;
                    break;
                }
                try {
                    j = Long.parseLong(headers[length2].getValue());
                    break;
                } catch (NumberFormatException unused) {
                    length2--;
                }
            }
            if (j >= 0) {
                return j;
            }
            return -1;
        }
    }
}
