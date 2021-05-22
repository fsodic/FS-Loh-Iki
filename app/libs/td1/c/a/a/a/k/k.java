package c.a.a.a.k;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.B;
import c.a.a.a.D;
import c.a.a.a.G;
import c.a.a.a.p.a;
import c.a.a.a.p.d;
import c.a.a.a.w;
import org.cocos2dx.lib.BuildConfig;

public class k implements v {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final k f927a = new k();

    /* renamed from: b  reason: collision with root package name */
    public static final k f928b = new k();

    /* renamed from: c  reason: collision with root package name */
    protected final D f929c;

    public k() {
        this(null);
    }

    public k(D d) {
        this.f929c = d == null ? w.f : d;
    }

    /* access modifiers changed from: protected */
    public D a(int i, int i2) {
        return this.f929c.a(i, i2);
    }

    /* access modifiers changed from: protected */
    public G a(D d, int i, String str) {
        return new o(d, i, str);
    }

    @Override // c.a.a.a.k.v
    public G a(d dVar, w wVar) {
        a.a((Object) dVar, "Char array buffer");
        a.a(wVar, "Parser cursor");
        int b2 = wVar.b();
        int c2 = wVar.c();
        try {
            D c3 = c(dVar, wVar);
            d(dVar, wVar);
            int b3 = wVar.b();
            int a2 = dVar.a(32, b3, c2);
            if (a2 < 0) {
                a2 = c2;
            }
            String b4 = dVar.b(b3, a2);
            for (int i = 0; i < b4.length(); i++) {
                if (!Character.isDigit(b4.charAt(i))) {
                    throw new B("Status line contains invalid status code: " + dVar.a(b2, c2));
                }
            }
            try {
                return a(c3, Integer.parseInt(b4), a2 < c2 ? dVar.b(a2, c2) : BuildConfig.FLAVOR);
            } catch (NumberFormatException unused) {
                throw new B("Status line contains invalid status code: " + dVar.a(b2, c2));
            }
        } catch (IndexOutOfBoundsException unused2) {
            throw new B("Invalid status line: " + dVar.a(b2, c2));
        }
    }

    @Override // c.a.a.a.k.v
    public AbstractC0121e a(d dVar) {
        return new q(dVar);
    }

    @Override // c.a.a.a.k.v
    public boolean b(d dVar, w wVar) {
        a.a((Object) dVar, "Char array buffer");
        a.a(wVar, "Parser cursor");
        int b2 = wVar.b();
        String e = this.f929c.e();
        int length = e.length();
        if (dVar.length() < length + 4) {
            return false;
        }
        if (b2 < 0) {
            b2 = (dVar.length() - 4) - length;
        } else if (b2 == 0) {
            while (b2 < dVar.length() && c.a.a.a.n.d.a(dVar.charAt(b2))) {
                b2++;
            }
        }
        int i = b2 + length;
        if (i + 4 > dVar.length()) {
            return false;
        }
        boolean z = true;
        int i2 = 0;
        while (z && i2 < length) {
            z = dVar.charAt(b2 + i2) == e.charAt(i2);
            i2++;
        }
        return z ? dVar.charAt(i) == '/' : z;
    }

    public D c(d dVar, w wVar) {
        a.a((Object) dVar, "Char array buffer");
        a.a(wVar, "Parser cursor");
        String e = this.f929c.e();
        int length = e.length();
        int b2 = wVar.b();
        int c2 = wVar.c();
        d(dVar, wVar);
        int b3 = wVar.b();
        int i = b3 + length;
        if (i + 4 <= c2) {
            boolean z = true;
            int i2 = 0;
            while (z && i2 < length) {
                z = dVar.charAt(b3 + i2) == e.charAt(i2);
                i2++;
            }
            if (z) {
                z = dVar.charAt(i) == '/';
            }
            if (z) {
                int i3 = b3 + length + 1;
                int a2 = dVar.a(46, i3, c2);
                if (a2 != -1) {
                    try {
                        int parseInt = Integer.parseInt(dVar.b(i3, a2));
                        int i4 = a2 + 1;
                        int a3 = dVar.a(32, i4, c2);
                        if (a3 == -1) {
                            a3 = c2;
                        }
                        try {
                            int parseInt2 = Integer.parseInt(dVar.b(i4, a3));
                            wVar.a(a3);
                            return a(parseInt, parseInt2);
                        } catch (NumberFormatException unused) {
                            throw new B("Invalid protocol minor version number: " + dVar.a(b2, c2));
                        }
                    } catch (NumberFormatException unused2) {
                        throw new B("Invalid protocol major version number: " + dVar.a(b2, c2));
                    }
                } else {
                    throw new B("Invalid protocol version number: " + dVar.a(b2, c2));
                }
            } else {
                throw new B("Not a valid protocol version: " + dVar.a(b2, c2));
            }
        } else {
            throw new B("Not a valid protocol version: " + dVar.a(b2, c2));
        }
    }

    /* access modifiers changed from: protected */
    public void d(d dVar, w wVar) {
        int b2 = wVar.b();
        int c2 = wVar.c();
        while (b2 < c2 && c.a.a.a.n.d.a(dVar.charAt(b2))) {
            b2++;
        }
        wVar.a(b2);
    }
}
