package b.c.b.a.d.d;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class O {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f380a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f381b = Charset.forName("ISO-8859-1");

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f382c;
    private static final ByteBuffer d;
    private static final AbstractC0094u e;

    static {
        byte[] bArr = new byte[0];
        f382c = bArr;
        d = ByteBuffer.wrap(bArr);
        byte[] bArr2 = f382c;
        e = AbstractC0094u.a(bArr2, 0, bArr2.length, false);
    }

    static int a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int a(byte[] bArr) {
        int length = bArr.length;
        int a2 = a(length, bArr, 0, length);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    static Object a(Object obj, Object obj2) {
        AbstractC0091sa f = ((AbstractC0089ra) obj).f();
        f.a((AbstractC0089ra) obj2);
        return f.b();
    }

    static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static boolean a(AbstractC0089ra raVar) {
        return false;
    }

    public static boolean b(byte[] bArr) {
        return eb.a(bArr);
    }

    public static String c(byte[] bArr) {
        return new String(bArr, f380a);
    }
}
