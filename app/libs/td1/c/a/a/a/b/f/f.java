package c.a.a.a.b.f;

import c.a.a.a.C0119c;
import c.a.a.a.g.e;
import c.a.a.a.k.m;
import c.a.a.a.k.w;
import c.a.a.a.k.x;
import c.a.a.a.l;
import c.a.a.a.n.d;
import c.a.a.a.p.a;
import c.a.a.a.z;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final BitSet f641a = new BitSet(256);

    /* renamed from: b  reason: collision with root package name */
    private static final BitSet f642b = new BitSet(256);

    /* renamed from: c  reason: collision with root package name */
    private static final BitSet f643c = new BitSet(256);
    private static final BitSet d = new BitSet(256);
    private static final BitSet e = new BitSet(256);
    private static final BitSet f = new BitSet(256);
    private static final BitSet g = new BitSet(256);

    static {
        for (int i = 97; i <= 122; i++) {
            f641a.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            f641a.set(i2);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            f641a.set(i3);
        }
        f641a.set(95);
        f641a.set(45);
        f641a.set(46);
        f641a.set(42);
        g.or(f641a);
        f641a.set(33);
        f641a.set(126);
        f641a.set(39);
        f641a.set(40);
        f641a.set(41);
        f642b.set(44);
        f642b.set(59);
        f642b.set(58);
        f642b.set(36);
        f642b.set(38);
        f642b.set(43);
        f642b.set(61);
        f643c.or(f641a);
        f643c.or(f642b);
        d.or(f641a);
        d.set(47);
        d.set(59);
        d.set(58);
        d.set(64);
        d.set(38);
        d.set(61);
        d.set(43);
        d.set(36);
        d.set(44);
        f.set(59);
        f.set(47);
        f.set(63);
        f.set(58);
        f.set(64);
        f.set(38);
        f.set(61);
        f.set(43);
        f.set(36);
        f.set(44);
        f.set(91);
        f.set(93);
        e.or(f);
        e.or(f641a);
    }

    public static String a(Iterable<? extends z> iterable, char c2, Charset charset) {
        StringBuilder sb = new StringBuilder();
        for (z zVar : iterable) {
            String f2 = f(zVar.getName(), charset);
            String f3 = f(zVar.getValue(), charset);
            if (sb.length() > 0) {
                sb.append(c2);
            }
            sb.append(f2);
            if (f3 != null) {
                sb.append("=");
                sb.append(f3);
            }
        }
        return sb.toString();
    }

    public static String a(Iterable<? extends z> iterable, Charset charset) {
        return a(iterable, '&', charset);
    }

    static String a(String str, Charset charset) {
        return a(str, charset, d, false);
    }

    private static String a(String str, Charset charset, BitSet bitSet, boolean z) {
        char upperCase;
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        ByteBuffer encode = charset.encode(str);
        while (encode.hasRemaining()) {
            int i = encode.get() & 255;
            if (bitSet.get(i)) {
                upperCase = (char) i;
            } else if (!z || i != 32) {
                sb.append("%");
                char upperCase2 = Character.toUpperCase(Character.forDigit((i >> 4) & 15, 16));
                upperCase = Character.toUpperCase(Character.forDigit(i & 15, 16));
                sb.append(upperCase2);
            } else {
                upperCase = '+';
            }
            sb.append(upperCase);
        }
        return sb.toString();
    }

    private static String a(String str, Charset charset, boolean z) {
        byte b2;
        if (str == null) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(str.length());
        CharBuffer wrap = CharBuffer.wrap(str);
        while (wrap.hasRemaining()) {
            int i = wrap.get();
            if (i == 37 && wrap.remaining() >= 2) {
                char c2 = wrap.get();
                char c3 = wrap.get();
                int digit = Character.digit(c2, 16);
                int digit2 = Character.digit(c3, 16);
                if (digit == -1 || digit2 == -1) {
                    allocate.put((byte) 37);
                    allocate.put((byte) c2);
                    b2 = (byte) c3;
                    allocate.put(b2);
                } else {
                    i = (digit << 4) + digit2;
                }
            } else if (z && i == 43) {
                b2 = 32;
                allocate.put(b2);
            }
            b2 = (byte) i;
            allocate.put(b2);
        }
        allocate.flip();
        return charset.decode(allocate).toString();
    }

    /* JADX INFO: finally extract failed */
    public static List<z> a(l lVar) {
        e a2 = e.a(lVar);
        if (a2 == null || !a2.b().equalsIgnoreCase("application/x-www-form-urlencoded")) {
            return Collections.emptyList();
        }
        long contentLength = lVar.getContentLength();
        a.a(contentLength <= 2147483647L, "HTTP entity is too large");
        Charset a3 = a2.a() != null ? a2.a() : d.f963a;
        InputStream content = lVar.getContent();
        if (content == null) {
            return Collections.emptyList();
        }
        try {
            c.a.a.a.p.d dVar = new c.a.a.a.p.d(contentLength > 0 ? (int) contentLength : 1024);
            InputStreamReader inputStreamReader = new InputStreamReader(content, a3);
            char[] cArr = new char[1024];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    break;
                }
                dVar.a(cArr, 0, read);
            }
            content.close();
            if (dVar.length() == 0) {
                return Collections.emptyList();
            }
            return a(dVar, a3, '&');
        } catch (Throwable th) {
            content.close();
            throw th;
        }
    }

    public static List<z> a(c.a.a.a.p.d dVar, Charset charset, char... cArr) {
        a.a((Object) dVar, "Char array buffer");
        x xVar = x.f952a;
        BitSet bitSet = new BitSet();
        for (char c2 : cArr) {
            bitSet.set(c2);
        }
        w wVar = new w(0, dVar.length());
        ArrayList arrayList = new ArrayList();
        while (!wVar.a()) {
            bitSet.set(61);
            String a2 = xVar.a(dVar, wVar, bitSet);
            String str = null;
            if (!wVar.a()) {
                char charAt = dVar.charAt(wVar.b());
                wVar.a(wVar.b() + 1);
                if (charAt == '=') {
                    bitSet.clear(61);
                    str = xVar.b(dVar, wVar, bitSet);
                    if (!wVar.a()) {
                        wVar.a(wVar.b() + 1);
                    }
                }
            }
            if (!a2.isEmpty()) {
                arrayList.add(new m(e(a2, charset), e(str, charset)));
            }
        }
        return arrayList;
    }

    static String b(String str, Charset charset) {
        return a(str, charset, e, false);
    }

    static String c(String str, Charset charset) {
        return a(str, charset, f643c, false);
    }

    public static List<z> d(String str, Charset charset) {
        c.a.a.a.p.d dVar = new c.a.a.a.p.d(str.length());
        dVar.a(str);
        return a(dVar, charset, '&', ';');
    }

    private static String e(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = C0119c.f645a;
        }
        return a(str, charset, true);
    }

    private static String f(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = C0119c.f645a;
        }
        return a(str, charset, g, true);
    }
}
