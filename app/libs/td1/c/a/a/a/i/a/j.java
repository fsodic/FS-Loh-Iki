package c.a.a.a.i.a;

import c.a.a.a.C0119c;
import c.a.a.a.p.e;
import java.nio.charset.Charset;
import java.security.SecureRandom;

final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f736a = e.a("UnicodeLittleUnmarked");

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f737b = C0119c.f646b;

    /* renamed from: c  reason: collision with root package name */
    private static final SecureRandom f738c;
    private static final byte[] d;
    private static final b e = new b();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private byte[] f739a = null;

        /* renamed from: b  reason: collision with root package name */
        private int f740b = 0;

        a() {
        }
    }

    static class b extends a {

        /* renamed from: c  reason: collision with root package name */
        private final byte[] f741c = null;
        private final byte[] d = null;

        b() {
        }
    }

    static {
        SecureRandom secureRandom;
        try {
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
        } catch (Exception unused) {
            secureRandom = null;
        }
        f738c = secureRandom;
        byte[] bytes = "NTLMSSP".getBytes(C0119c.f646b);
        d = new byte[(bytes.length + 1)];
        System.arraycopy(bytes, 0, d, 0, bytes.length);
        d[bytes.length] = 0;
    }

    j() {
    }
}
