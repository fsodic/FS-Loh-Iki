package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import org.cocos2dx.lib.BuildConfig;

public abstract class Iba implements Serializable, Iterable<Byte> {

    /* renamed from: a  reason: collision with root package name */
    public static final Iba f2236a = new Tba(C2230tca.f5628c);

    /* renamed from: b  reason: collision with root package name */
    private static final Oba f2237b = (Bba.a() ? new Vba(null) : new Mba(null));

    /* renamed from: c  reason: collision with root package name */
    private static final Comparator<Iba> f2238c = new Kba();
    private int d = 0;

    Iba() {
    }

    public static Iba a(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            Iba a2 = i2 == 0 ? null : a(bArr, 0, i2);
            if (a2 == null) {
                return a(arrayList);
            }
            arrayList.add(a2);
            i = Math.min(i << 1, 8192);
        }
    }

    public static Iba a(Iterable<Iba> iterable) {
        int i;
        if (!(iterable instanceof Collection)) {
            i = 0;
            Iterator<Iba> it = iterable.iterator();
            while (it.hasNext()) {
                it.next();
                i++;
            }
        } else {
            i = ((Collection) iterable).size();
        }
        return i == 0 ? f2236a : a(iterable.iterator(), i);
    }

    public static Iba a(String str) {
        return new Tba(str.getBytes(C2230tca.f5626a));
    }

    private static Iba a(Iterator<Iba> it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        } else if (i == 1) {
            return it.next();
        } else {
            int i2 = i >>> 1;
            Iba a2 = a(it, i2);
            Iba a3 = a(it, i - i2);
            if (Integer.MAX_VALUE - a2.size() >= a3.size()) {
                return C2232tda.a(a2, a3);
            }
            int size = a2.size();
            int size2 = a3.size();
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static Iba a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static Iba a(byte[] bArr, int i, int i2) {
        c(i, i + i2, bArr.length);
        return new Tba(f2237b.a(bArr, i, i2));
    }

    static void a(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* access modifiers changed from: private */
    public static int b(byte b2) {
        return b2 & 255;
    }

    static Iba b(byte[] bArr) {
        return new Tba(bArr);
    }

    static int c(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    static Qba j(int i) {
        return new Qba(i, null);
    }

    public static Sba n() {
        return new Sba(128);
    }

    /* access modifiers changed from: protected */
    public abstract int a(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract String a(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void a(Fba fba);

    @Deprecated
    public final void a(byte[] bArr, int i, int i2, int i3) {
        c(i, i + i3, size());
        c(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            b(bArr, i, i2, i3);
        }
    }

    public final byte[] a() {
        int size = size();
        if (size == 0) {
            return C2230tca.f5628c;
        }
        byte[] bArr = new byte[size];
        b(bArr, 0, 0, size);
        return bArr;
    }

    /* access modifiers changed from: protected */
    public abstract int b(int i, int i2, int i3);

    public abstract Iba b(int i, int i2);

    /* renamed from: b */
    public Nba iterator() {
        return new Hba(this);
    }

    /* access modifiers changed from: protected */
    public abstract void b(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    public abstract byte h(int i);

    public final int hashCode() {
        int i = this.d;
        if (i == 0) {
            int size = size();
            i = b(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.d = i;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public abstract byte i(int i);

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final String k() {
        return size() == 0 ? BuildConfig.FLAVOR : a(C2230tca.f5626a);
    }

    public abstract boolean l();

    public abstract Uba m();

    /* access modifiers changed from: protected */
    public abstract int o();

    /* access modifiers changed from: protected */
    public abstract boolean p();

    /* access modifiers changed from: protected */
    public final int q() {
        return this.d;
    }

    public abstract int size();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        objArr[2] = size() <= 50 ? Kda.a(this) : String.valueOf(Kda.a(b(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
