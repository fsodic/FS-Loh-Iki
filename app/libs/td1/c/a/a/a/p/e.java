package c.a.a.a.p;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public class e {
    public static Charset a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Charset.forName(str);
        } catch (UnsupportedCharsetException unused) {
            return null;
        }
    }
}
