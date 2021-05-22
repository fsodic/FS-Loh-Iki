package c.a.a.a.b.f;

import c.a.a.a.C0119c;
import c.a.a.a.z;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private String f638a;

    /* renamed from: b  reason: collision with root package name */
    private String f639b;

    /* renamed from: c  reason: collision with root package name */
    private String f640c;
    private String d;
    private String e;
    private String f;
    private int g;
    private String h;
    private String i;
    private String j;
    private List<z> k;
    private String l;
    private Charset m;
    private String n;
    private String o;

    public d(URI uri) {
        a(uri);
    }

    private List<z> a(String str, Charset charset) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return f.d(str, charset);
    }

    private void a(URI uri) {
        this.f638a = uri.getScheme();
        this.f639b = uri.getRawSchemeSpecificPart();
        this.f640c = uri.getRawAuthority();
        this.f = uri.getHost();
        this.g = uri.getPort();
        this.e = uri.getRawUserInfo();
        this.d = uri.getUserInfo();
        this.i = uri.getRawPath();
        this.h = uri.getPath();
        this.j = uri.getRawQuery();
        String rawQuery = uri.getRawQuery();
        Charset charset = this.m;
        if (charset == null) {
            charset = C0119c.f645a;
        }
        this.k = a(rawQuery, charset);
        this.o = uri.getRawFragment();
        this.n = uri.getFragment();
    }

    private String b(List<z> list) {
        Charset charset = this.m;
        if (charset == null) {
            charset = C0119c.f645a;
        }
        return f.a(list, charset);
    }

    private String f(String str) {
        Charset charset = this.m;
        if (charset == null) {
            charset = C0119c.f645a;
        }
        return f.a(str, charset);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String g() {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.b.f.d.g():java.lang.String");
    }

    private String g(String str) {
        Charset charset = this.m;
        if (charset == null) {
            charset = C0119c.f645a;
        }
        return f.b(str, charset);
    }

    private String h(String str) {
        Charset charset = this.m;
        if (charset == null) {
            charset = C0119c.f645a;
        }
        return f.c(str, charset);
    }

    private static String i(String str) {
        if (str == null) {
            return null;
        }
        int i2 = 0;
        while (i2 < str.length() && str.charAt(i2) == '/') {
            i2++;
        }
        return i2 > 1 ? str.substring(i2 - 1) : str;
    }

    public d a(int i2) {
        if (i2 < 0) {
            i2 = -1;
        }
        this.g = i2;
        this.f639b = null;
        this.f640c = null;
        return this;
    }

    public d a(String str) {
        this.n = str;
        this.o = null;
        return this;
    }

    public d a(Charset charset) {
        this.m = charset;
        return this;
    }

    public d a(List<z> list) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        this.k.addAll(list);
        this.j = null;
        this.f639b = null;
        this.l = null;
        return this;
    }

    public URI a() {
        return new URI(g());
    }

    public d b() {
        this.k = null;
        this.j = null;
        this.f639b = null;
        return this;
    }

    public d b(String str) {
        this.f = str;
        this.f639b = null;
        this.f640c = null;
        return this;
    }

    public d c(String str) {
        this.h = str;
        this.f639b = null;
        this.i = null;
        return this;
    }

    public String c() {
        return this.f;
    }

    public d d(String str) {
        this.f638a = str;
        return this;
    }

    public String d() {
        return this.h;
    }

    public d e(String str) {
        this.d = str;
        this.f639b = null;
        this.f640c = null;
        this.e = null;
        return this;
    }

    public List<z> e() {
        List<z> list = this.k;
        return list != null ? new ArrayList(list) : new ArrayList();
    }

    public String f() {
        return this.d;
    }

    public String toString() {
        return g();
    }
}
