package c.a.a.a.p;

import c.a.a.a.C0119c;
import java.io.UnsupportedEncodingException;

public final class f {
    public static byte[] a(String str) {
        a.a((Object) str, "Input");
        return str.getBytes(C0119c.f646b);
    }

    public static byte[] a(String str, String str2) {
        a.a((Object) str, "Input");
        a.c(str2, "Charset");
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }
}
