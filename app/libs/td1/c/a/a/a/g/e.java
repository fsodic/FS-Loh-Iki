package c.a.a.a.g;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.AbstractC0122f;
import c.a.a.a.C0119c;
import c.a.a.a.k.f;
import c.a.a.a.l;
import c.a.a.a.p.a;
import c.a.a.a.p.d;
import c.a.a.a.p.i;
import c.a.a.a.z;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Locale;

public final class e implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final e f715a = a("application/atom+xml", C0119c.f647c);

    /* renamed from: b  reason: collision with root package name */
    public static final e f716b = a("application/x-www-form-urlencoded", C0119c.f647c);

    /* renamed from: c  reason: collision with root package name */
    public static final e f717c = a("application/json", C0119c.f645a);
    public static final e d = a("application/octet-stream", (Charset) null);
    public static final e e = a("application/svg+xml", C0119c.f647c);
    public static final e f = a("application/xhtml+xml", C0119c.f647c);
    public static final e g = a("application/xml", C0119c.f647c);
    public static final e h = a("multipart/form-data", C0119c.f647c);
    public static final e i = a("text/html", C0119c.f647c);
    public static final e j = a("text/plain", C0119c.f647c);
    public static final e k = a("text/xml", C0119c.f647c);
    public static final e l = a("*/*", (Charset) null);
    public static final e m = j;
    public static final e n = d;
    private final String o;
    private final Charset p;
    private final z[] q;

    e(String str, Charset charset) {
        this.o = str;
        this.p = charset;
        this.q = null;
    }

    e(String str, Charset charset, z[] zVarArr) {
        this.o = str;
        this.p = charset;
        this.q = zVarArr;
    }

    private static e a(AbstractC0122f fVar, boolean z) {
        return a(fVar.getName(), fVar.getParameters(), z);
    }

    public static e a(l lVar) {
        AbstractC0121e contentType;
        if (!(lVar == null || (contentType = lVar.getContentType()) == null)) {
            AbstractC0122f[] elements = contentType.getElements();
            if (elements.length > 0) {
                return a(elements[0], true);
            }
        }
        return null;
    }

    public static e a(String str, Charset charset) {
        a.b(str, "MIME type");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        a.a(a(lowerCase), "MIME type may not contain reserved characters");
        return new e(lowerCase, charset);
    }

    private static e a(String str, z[] zVarArr, boolean z) {
        Charset charset;
        int length = zVarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            z zVar = zVarArr[i2];
            if (zVar.getName().equalsIgnoreCase("charset")) {
                String value = zVar.getValue();
                if (!i.b(value)) {
                    try {
                        charset = Charset.forName(value);
                    } catch (UnsupportedCharsetException e2) {
                        if (z) {
                            throw e2;
                        }
                    }
                }
            } else {
                i2++;
            }
        }
        charset = null;
        if (zVarArr == null || zVarArr.length <= 0) {
            zVarArr = null;
        }
        return new e(str, charset, zVarArr);
    }

    private static boolean a(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '\"' || charAt == ',' || charAt == ';') {
                return false;
            }
        }
        return true;
    }

    public Charset a() {
        return this.p;
    }

    public String b() {
        return this.o;
    }

    public String toString() {
        d dVar = new d(64);
        dVar.a(this.o);
        if (this.q != null) {
            dVar.a("; ");
            f.f919b.a(dVar, this.q, false);
        } else if (this.p != null) {
            dVar.a("; charset=");
            dVar.a(this.p.name());
        }
        return dVar.toString();
    }
}
