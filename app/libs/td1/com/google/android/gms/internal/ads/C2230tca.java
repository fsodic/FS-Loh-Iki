package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.ads.tca  reason: case insensitive filesystem */
public final class C2230tca {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f5626a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f5627b = Charset.forName("ISO-8859-1");

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f5628c;
    private static final ByteBuffer d;
    private static final Uba e;

    static {
        byte[] bArr = new byte[0];
        f5628c = bArr;
        d = ByteBuffer.wrap(bArr);
        byte[] bArr2 = f5628c;
        e = Uba.a(bArr2, 0, bArr2.length, false);
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
        AbstractC1199eda b2 = ((AbstractC0993bda) obj).b();
        b2.a((AbstractC0993bda) obj2);
        return b2.K();
    }

    static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean b(byte[] bArr) {
        return Yda.a(bArr);
    }

    public static String c(byte[] bArr) {
        return new String(bArr, f5626a);
    }
}
