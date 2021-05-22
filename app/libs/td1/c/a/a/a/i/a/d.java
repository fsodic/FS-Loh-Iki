package c.a.a.a.i.a;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.C0119c;
import c.a.a.a.a.j;
import c.a.a.a.a.n;
import c.a.a.a.a.p;
import c.a.a.a.k.q;
import c.a.a.a.l;
import c.a.a.a.m;
import c.a.a.a.n.a;
import c.a.a.a.n.e;
import c.a.a.a.p.f;
import c.a.a.a.r;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Locale;
import java.util.StringTokenizer;

public class d extends m {
    private static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private boolean e;
    private String f;
    private long g;
    private String h;
    private String i;
    private String j;

    public d() {
        this(C0119c.f646b);
    }

    public d(Charset charset) {
        super(charset);
        this.e = false;
    }

    static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length * 2)];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            char[] cArr2 = d;
            cArr[i3] = cArr2[(bArr[i2] & 240) >> 4];
            cArr[i3 + 1] = cArr2[bArr[i2] & 15];
        }
        return new String(cArr);
    }

    private AbstractC0121e b(n nVar, r rVar) {
        String str;
        char c2;
        String str2;
        String str3;
        char c3;
        String str4;
        StringBuilder sb;
        String a2 = a("uri");
        String a3 = a("realm");
        String a4 = a("nonce");
        String a5 = a("opaque");
        String a6 = a("methodname");
        String a7 = a("algorithm");
        if (a7 == null) {
            a7 = "MD5";
        }
        HashSet hashSet = new HashSet(8);
        String a8 = a("qop");
        if (a8 != null) {
            str = "qop";
            for (StringTokenizer stringTokenizer = new StringTokenizer(a8, ","); stringTokenizer.hasMoreTokens(); stringTokenizer = stringTokenizer) {
                hashSet.add(stringTokenizer.nextToken().trim().toLowerCase(Locale.ROOT));
            }
            c2 = (!(rVar instanceof m) || !hashSet.contains("auth-int")) ? hashSet.contains("auth") ? (char) 2 : 65535 : 1;
        } else {
            str = "qop";
            c2 = 0;
        }
        if (c2 != 65535) {
            String a9 = a("charset");
            if (a9 == null) {
                a9 = "ISO-8859-1";
            }
            String str5 = a7.equalsIgnoreCase("MD5-sess") ? "MD5" : a7;
            try {
                MessageDigest b2 = b(str5);
                String name = nVar.getUserPrincipal().getName();
                String password = nVar.getPassword();
                if (a4.equals(this.f)) {
                    str2 = a3;
                    this.g++;
                } else {
                    str2 = a3;
                    this.g = 1;
                    this.h = null;
                    this.f = a4;
                }
                StringBuilder sb2 = new StringBuilder(256);
                Formatter formatter = new Formatter(sb2, Locale.US);
                formatter.format("%08x", Long.valueOf(this.g));
                formatter.close();
                String sb3 = sb2.toString();
                if (this.h == null) {
                    this.h = d();
                }
                this.i = null;
                this.j = null;
                if (a7.equalsIgnoreCase("MD5-sess")) {
                    sb2.setLength(0);
                    sb2.append(name);
                    sb2.append(':');
                    sb2.append(str2);
                    sb2.append(':');
                    sb2.append(password);
                    String a10 = a(b2.digest(f.a(sb2.toString(), a9)));
                    sb2.setLength(0);
                    sb2.append(a10);
                    sb2.append(':');
                    sb2.append(a4);
                    sb2.append(':');
                    password = this.h;
                } else {
                    sb2.setLength(0);
                    sb2.append(name);
                    sb2.append(':');
                    sb2.append(str2);
                    sb2.append(':');
                }
                sb2.append(password);
                this.i = sb2.toString();
                String a11 = a(b2.digest(f.a(this.i, a9)));
                if (c2 == 2) {
                    this.j = a6 + ':' + a2;
                    str3 = "auth";
                } else {
                    if (c2 == 1) {
                        l entity = rVar instanceof m ? ((m) rVar).getEntity() : null;
                        if (entity == null || entity.isRepeatable()) {
                            str3 = "auth";
                            h hVar = new h(b2);
                            if (entity != null) {
                                try {
                                    entity.writeTo(hVar);
                                } catch (IOException e2) {
                                    throw new j("I/O error reading entity content", e2);
                                }
                            }
                            hVar.close();
                            sb = new StringBuilder();
                            sb.append(a6);
                            sb.append(':');
                            sb.append(a2);
                            sb.append(':');
                            sb.append(a(hVar.a()));
                        } else {
                            str3 = "auth";
                            if (hashSet.contains(str3)) {
                                this.j = a6 + ':' + a2;
                                c2 = 2;
                            } else {
                                throw new j("Qop auth-int cannot be used with a non-repeatable entity");
                            }
                        }
                    } else {
                        str3 = "auth";
                        sb = new StringBuilder();
                        sb.append(a6);
                        sb.append(':');
                        sb.append(a2);
                    }
                    this.j = sb.toString();
                }
                String a12 = a(b2.digest(f.a(this.j, a9)));
                if (c2 == 0) {
                    sb2.setLength(0);
                    sb2.append(a11);
                    c3 = ':';
                    sb2.append(':');
                    sb2.append(a4);
                } else {
                    c3 = ':';
                    sb2.setLength(0);
                    sb2.append(a11);
                    sb2.append(':');
                    sb2.append(a4);
                    sb2.append(':');
                    sb2.append(sb3);
                    sb2.append(':');
                    sb2.append(this.h);
                    sb2.append(':');
                    sb2.append(c2 == 1 ? "auth-int" : str3);
                }
                sb2.append(c3);
                sb2.append(a12);
                String a13 = a(b2.digest(f.a(sb2.toString())));
                c.a.a.a.p.d dVar = new c.a.a.a.p.d(128);
                dVar.a(a() ? "Proxy-Authorization" : "Authorization");
                dVar.a(": Digest ");
                ArrayList arrayList = new ArrayList(20);
                arrayList.add(new c.a.a.a.k.m("username", name));
                arrayList.add(new c.a.a.a.k.m("realm", str2));
                arrayList.add(new c.a.a.a.k.m("nonce", a4));
                arrayList.add(new c.a.a.a.k.m("uri", a2));
                arrayList.add(new c.a.a.a.k.m("response", a13));
                if (c2 != 0) {
                    if (c2 == 1) {
                        str3 = "auth-int";
                    }
                    str4 = str;
                    arrayList.add(new c.a.a.a.k.m(str4, str3));
                    arrayList.add(new c.a.a.a.k.m("nc", sb3));
                    arrayList.add(new c.a.a.a.k.m("cnonce", this.h));
                } else {
                    str4 = str;
                }
                arrayList.add(new c.a.a.a.k.m("algorithm", a7));
                if (a5 != null) {
                    arrayList.add(new c.a.a.a.k.m("opaque", a5));
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    c.a.a.a.k.m mVar = (c.a.a.a.k.m) arrayList.get(i2);
                    if (i2 > 0) {
                        dVar.a(", ");
                    }
                    String name2 = mVar.getName();
                    c.a.a.a.k.f.f919b.a(dVar, mVar, !("nc".equals(name2) || str4.equals(name2) || "algorithm".equals(name2)));
                }
                return new q(dVar);
            } catch (n unused) {
                throw new j("Unsuppported digest algorithm: " + str5);
            }
        } else {
            throw new j("None of the qop methods is supported: " + a8);
        }
    }

    private static MessageDigest b(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (Exception unused) {
            throw new n("Unsupported algorithm in HTTP Digest authentication: " + str);
        }
    }

    public static String d() {
        byte[] bArr = new byte[8];
        new SecureRandom().nextBytes(bArr);
        return a(bArr);
    }

    @Override // c.a.a.a.a.c
    @Deprecated
    public AbstractC0121e a(n nVar, r rVar) {
        return a(nVar, rVar, new a());
    }

    @Override // c.a.a.a.i.a.a, c.a.a.a.a.m
    public AbstractC0121e a(n nVar, r rVar, e eVar) {
        c.a.a.a.p.a.a(nVar, "Credentials");
        c.a.a.a.p.a.a(rVar, "HTTP request");
        if (a("realm") == null) {
            throw new j("missing realm in challenge");
        } else if (a("nonce") != null) {
            c().put("methodname", rVar.getRequestLine().getMethod());
            c().put("uri", rVar.getRequestLine().getUri());
            if (a("charset") == null) {
                c().put("charset", a(rVar));
            }
            return b(nVar, rVar);
        } else {
            throw new j("missing nonce in challenge");
        }
    }

    @Override // c.a.a.a.i.a.a, c.a.a.a.a.c
    public void a(AbstractC0121e eVar) {
        super.a(eVar);
        this.e = true;
        if (c().isEmpty()) {
            throw new p("Authentication challenge is empty");
        }
    }

    @Override // c.a.a.a.a.c
    public String getSchemeName() {
        return "digest";
    }

    @Override // c.a.a.a.a.c
    public boolean isComplete() {
        if ("true".equalsIgnoreCase(a("stale"))) {
            return false;
        }
        return this.e;
    }

    @Override // c.a.a.a.a.c
    public boolean isConnectionBased() {
        return false;
    }

    @Override // c.a.a.a.i.a.a
    public String toString() {
        return "DIGEST [complete=" + this.e + ", nonce=" + this.f + ", nc=" + this.g + "]";
    }
}
