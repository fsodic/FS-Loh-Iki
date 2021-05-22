package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.cocos2dx.lib.BuildConfig;
import sun.misc.Unsafe;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.fda  reason: case insensitive filesystem */
public final class C1268fda<T> implements AbstractC2439wda<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f4303a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    private static final Unsafe f4304b = Vda.c();

    /* renamed from: c  reason: collision with root package name */
    private final int[] f4305c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final AbstractC0993bda g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int[] l;
    private final int m;
    private final int n;
    private final AbstractC1475ida o;
    private final Lca p;
    private final Oda<?, ?> q;
    private final AbstractC1335gca<?> r;
    private final Zca s;

    private C1268fda(int[] iArr, Object[] objArr, int i2, int i3, AbstractC0993bda bda, boolean z, boolean z2, int[] iArr2, int i4, int i5, AbstractC1475ida ida, Lca lca, Oda<?, ?> oda, AbstractC1335gca<?> gca, Zca zca) {
        this.f4305c = iArr;
        this.d = objArr;
        this.e = i2;
        this.f = i3;
        this.i = bda instanceof AbstractC2092rca;
        this.j = z;
        this.h = gca != null && gca.a(bda);
        this.k = false;
        this.l = iArr2;
        this.m = i4;
        this.n = i5;
        this.o = ida;
        this.p = lca;
        this.q = oda;
        this.r = gca;
        this.g = bda;
        this.s = zca;
    }

    private final int a(int i2, int i3) {
        if (i2 < this.e || i2 > this.f) {
            return -1;
        }
        return b(i2, i3);
    }

    private static <UT, UB> int a(Oda<UT, UB> oda, T t) {
        return oda.c(oda.d(t));
    }

    private final int a(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, Dba dba) {
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        long j3;
        int i11;
        Unsafe unsafe = f4304b;
        long j4 = (long) (this.f4305c[i9 + 2] & 1048575);
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    obj = Double.valueOf(Eba.c(bArr, i2));
                    unsafe.putObject(t, j2, obj);
                    i10 = i2 + 8;
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 52:
                if (i6 == 5) {
                    obj2 = Float.valueOf(Eba.d(bArr, i2));
                    unsafe.putObject(t, j2, obj2);
                    i10 = i2 + 4;
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 53:
            case 54:
                if (i6 == 0) {
                    i10 = Eba.b(bArr, i2, dba);
                    j3 = dba.f1784b;
                    obj3 = Long.valueOf(j3);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 55:
            case 62:
                if (i6 == 0) {
                    i10 = Eba.a(bArr, i2, dba);
                    i11 = dba.f1783a;
                    obj3 = Integer.valueOf(i11);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 56:
            case 65:
                if (i6 == 1) {
                    obj = Long.valueOf(Eba.b(bArr, i2));
                    unsafe.putObject(t, j2, obj);
                    i10 = i2 + 8;
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 57:
            case 64:
                if (i6 == 5) {
                    obj2 = Integer.valueOf(Eba.a(bArr, i2));
                    unsafe.putObject(t, j2, obj2);
                    i10 = i2 + 4;
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 58:
                if (i6 == 0) {
                    i10 = Eba.b(bArr, i2, dba);
                    obj3 = Boolean.valueOf(dba.f1784b != 0);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 59:
                if (i6 == 2) {
                    i10 = Eba.a(bArr, i2, dba);
                    int i12 = dba.f1783a;
                    if (i12 == 0) {
                        obj3 = BuildConfig.FLAVOR;
                        unsafe.putObject(t, j2, obj3);
                        unsafe.putInt(t, j4, i5);
                        return i10;
                    } else if ((i7 & 536870912) == 0 || Yda.a(bArr, i10, i10 + i12)) {
                        unsafe.putObject(t, j2, new String(bArr, i10, i12, C2230tca.f5626a));
                        i10 += i12;
                        unsafe.putInt(t, j4, i5);
                        return i10;
                    } else {
                        throw Bca.i();
                    }
                }
                return i2;
            case 60:
                if (i6 == 2) {
                    i10 = Eba.a(a(i9), bArr, i2, i3, dba);
                    Object object = unsafe.getInt(t, j4) == i5 ? unsafe.getObject(t, j2) : null;
                    obj3 = object == null ? dba.f1785c : C2230tca.a(object, dba.f1785c);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 61:
                if (i6 == 2) {
                    i10 = Eba.e(bArr, i2, dba);
                    obj3 = dba.f1785c;
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 63:
                if (i6 == 0) {
                    int a2 = Eba.a(bArr, i2, dba);
                    int i13 = dba.f1783a;
                    AbstractC2575yca c2 = c(i9);
                    if (c2 == null || c2.b(i13)) {
                        unsafe.putObject(t, j2, Integer.valueOf(i13));
                        i10 = a2;
                        unsafe.putInt(t, j4, i5);
                        return i10;
                    }
                    a(t).a(i4, Long.valueOf((long) i13));
                    return a2;
                }
                return i2;
            case 66:
                if (i6 == 0) {
                    i10 = Eba.a(bArr, i2, dba);
                    i11 = Uba.e(dba.f1783a);
                    obj3 = Integer.valueOf(i11);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 67:
                if (i6 == 0) {
                    i10 = Eba.b(bArr, i2, dba);
                    j3 = Uba.a(dba.f1784b);
                    obj3 = Long.valueOf(j3);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 68:
                if (i6 == 3) {
                    i10 = Eba.a(a(i9), bArr, i2, i3, (i4 & -8) | 4, dba);
                    Object object2 = unsafe.getInt(t, j4) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object2 != null) {
                        obj3 = C2230tca.a(object2, dba.f1785c);
                        unsafe.putObject(t, j2, obj3);
                        unsafe.putInt(t, j4, i5);
                        return i10;
                    }
                    obj3 = dba.f1785c;
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            default:
                return i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0268, code lost:
        if (r30.f1784b != 0) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x026a, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x026c, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x026d, code lost:
        r11.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0270, code lost:
        if (r4 >= r20) goto L_0x03d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0272, code lost:
        r6 = com.google.android.gms.internal.ads.Eba.a(r18, r4, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0278, code lost:
        if (r21 != r30.f1783a) goto L_0x03d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x027a, code lost:
        r4 = com.google.android.gms.internal.ads.Eba.b(r18, r6, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0282, code lost:
        if (r30.f1784b == 0) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0136, code lost:
        if (r4 == 0) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0138, code lost:
        r11.add(com.google.android.gms.internal.ads.Iba.f2236a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013e, code lost:
        r11.add(com.google.android.gms.internal.ads.Iba.a(r18, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0146, code lost:
        if (r1 >= r20) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0148, code lost:
        r4 = com.google.android.gms.internal.ads.Eba.a(r18, r1, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x014e, code lost:
        if (r21 != r30.f1783a) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0150, code lost:
        r1 = com.google.android.gms.internal.ads.Eba.a(r18, r4, r30);
        r4 = r30.f1783a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0156, code lost:
        if (r4 < 0) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015a, code lost:
        if (r4 > (r18.length - r1)) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015c, code lost:
        if (r4 != 0) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0163, code lost:
        throw com.google.android.gms.internal.ads.Bca.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0168, code lost:
        throw com.google.android.gms.internal.ads.Bca.b();
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.ads.Dba r30) {
        /*
        // Method dump skipped, instructions count: 1048
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1268fda.a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.Dba):int");
    }

    private final <K, V> int a(T t, byte[] bArr, int i2, int i3, int i4, long j2, Dba dba) {
        Unsafe unsafe = f4304b;
        Object b2 = b(i4);
        Object object = unsafe.getObject(t, j2);
        if (this.s.c(object)) {
            Object e2 = this.s.e(b2);
            this.s.a(e2, object);
            unsafe.putObject(t, j2, e2);
        }
        this.s.a(b2);
        throw null;
    }

    private static Sda a(Object obj) {
        AbstractC2092rca rca = (AbstractC2092rca) obj;
        Sda sda = rca.zzieg;
        if (sda != Sda.c()) {
            return sda;
        }
        Sda d2 = Sda.d();
        rca.zzieg = d2;
        return d2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:162:0x0349  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.ads.C1268fda<T> a(java.lang.Class<T> r33, com.google.android.gms.internal.ads._ca r34, com.google.android.gms.internal.ads.AbstractC1475ida r35, com.google.android.gms.internal.ads.Lca r36, com.google.android.gms.internal.ads.Oda<?, ?> r37, com.google.android.gms.internal.ads.AbstractC1335gca<?> r38, com.google.android.gms.internal.ads.Zca r39) {
        /*
        // Method dump skipped, instructions count: 1045
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1268fda.a(java.lang.Class, com.google.android.gms.internal.ads._ca, com.google.android.gms.internal.ads.ida, com.google.android.gms.internal.ads.Lca, com.google.android.gms.internal.ads.Oda, com.google.android.gms.internal.ads.gca, com.google.android.gms.internal.ads.Zca):com.google.android.gms.internal.ads.fda");
    }

    private final AbstractC2439wda a(int i2) {
        int i3 = (i2 / 3) << 1;
        AbstractC2439wda wda = (AbstractC2439wda) this.d[i3];
        if (wda != null) {
            return wda;
        }
        AbstractC2439wda<T> a2 = C1957pda.a().a((Class) ((Class) this.d[i3 + 1]));
        this.d[i3] = a2;
        return a2;
    }

    private final <K, V, UT, UB> UB a(int i2, int i3, Map<K, V> map, AbstractC2575yca yca, UB ub, Oda<UT, UB> oda) {
        this.s.a(b(i2));
        throw null;
    }

    private final <UT, UB> UB a(Object obj, int i2, UB ub, Oda<UT, UB> oda) {
        AbstractC2575yca c2;
        int i3 = this.f4305c[i2];
        Object f2 = Vda.f(obj, (long) (d(i2) & 1048575));
        if (f2 == null || (c2 = c(i2)) == null) {
            return ub;
        }
        a(i2, i3, (Map<K, V>) this.s.f(f2), c2, ub, oda);
        throw null;
    }

    private static Field a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private static List<?> a(Object obj, long j2) {
        return (List) Vda.f(obj, j2);
    }

    private static void a(int i2, Object obj, AbstractC1752mea mea) {
        if (obj instanceof String) {
            mea.a(i2, (String) obj);
        } else {
            mea.a(i2, (Iba) obj);
        }
    }

    private static <UT, UB> void a(Oda<UT, UB> oda, T t, AbstractC1752mea mea) {
        oda.a(oda.d(t), mea);
    }

    private final <K, V> void a(AbstractC1752mea mea, int i2, Object obj, int i3) {
        if (obj != null) {
            this.s.a(b(i3));
            throw null;
        }
    }

    private final void a(Object obj, int i2, AbstractC2026qda qda) {
        long j2;
        Object b2;
        if (f(i2)) {
            j2 = (long) (i2 & 1048575);
            b2 = qda.a();
        } else if (this.i) {
            j2 = (long) (i2 & 1048575);
            b2 = qda.readString();
        } else {
            j2 = (long) (i2 & 1048575);
            b2 = qda.b();
        }
        Vda.a(obj, j2, b2);
    }

    private final void a(T t, T t2, int i2) {
        long d2 = (long) (d(i2) & 1048575);
        if (a((Object) t2, i2)) {
            Object f2 = Vda.f(t, d2);
            Object f3 = Vda.f(t2, d2);
            if (f2 != null && f3 != null) {
                Vda.a(t, d2, C2230tca.a(f2, f3));
                b((Object) t, i2);
            } else if (f3 != null) {
                Vda.a(t, d2, f3);
                b((Object) t, i2);
            }
        }
    }

    private final boolean a(T t, int i2) {
        int e2 = e(i2);
        long j2 = (long) (e2 & 1048575);
        if (j2 == 1048575) {
            int d2 = d(i2);
            long j3 = (long) (d2 & 1048575);
            switch ((d2 & 267386880) >>> 20) {
                case 0:
                    return Vda.e(t, j3) != 0.0d;
                case 1:
                    return Vda.d(t, j3) != 0.0f;
                case 2:
                    return Vda.b(t, j3) != 0;
                case 3:
                    return Vda.b(t, j3) != 0;
                case 4:
                    return Vda.a(t, j3) != 0;
                case 5:
                    return Vda.b(t, j3) != 0;
                case 6:
                    return Vda.a(t, j3) != 0;
                case 7:
                    return Vda.c(t, j3);
                case 8:
                    Object f2 = Vda.f(t, j3);
                    if (f2 instanceof String) {
                        return !((String) f2).isEmpty();
                    }
                    if (f2 instanceof Iba) {
                        return !Iba.f2236a.equals(f2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return Vda.f(t, j3) != null;
                case 10:
                    return !Iba.f2236a.equals(Vda.f(t, j3));
                case 11:
                    return Vda.a(t, j3) != 0;
                case 12:
                    return Vda.a(t, j3) != 0;
                case 13:
                    return Vda.a(t, j3) != 0;
                case 14:
                    return Vda.b(t, j3) != 0;
                case 15:
                    return Vda.a(t, j3) != 0;
                case 16:
                    return Vda.b(t, j3) != 0;
                case 17:
                    return Vda.f(t, j3) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (Vda.a(t, j2) & (1 << (e2 >>> 20))) != 0;
        }
    }

    private final boolean a(T t, int i2, int i3) {
        return Vda.a(t, (long) (e(i3) & 1048575)) == i2;
    }

    private final boolean a(T t, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? a((Object) t, i2) : (i4 & i5) != 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.gms.internal.ads.wda */
    /* JADX WARN: Multi-variable type inference failed */
    private static boolean a(Object obj, int i2, AbstractC2439wda wda) {
        return wda.e(Vda.f(obj, (long) (i2 & 1048575)));
    }

    private static <T> double b(T t, long j2) {
        return ((Double) Vda.f(t, j2)).doubleValue();
    }

    private final int b(int i2, int i3) {
        int length = (this.f4305c.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.f4305c[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private final Object b(int i2) {
        return this.d[(i2 / 3) << 1];
    }

    private final void b(T t, int i2) {
        int e2 = e(i2);
        long j2 = (long) (1048575 & e2);
        if (j2 != 1048575) {
            Vda.a((Object) t, j2, (1 << (e2 >>> 20)) | Vda.a(t, j2));
        }
    }

    private final void b(T t, int i2, int i3) {
        Vda.a((Object) t, (long) (e(i3) & 1048575), i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(T r17, com.google.android.gms.internal.ads.AbstractC1752mea r18) {
        /*
        // Method dump skipped, instructions count: 1292
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1268fda.b(java.lang.Object, com.google.android.gms.internal.ads.mea):void");
    }

    private final void b(T t, T t2, int i2) {
        int d2 = d(i2);
        int i3 = this.f4305c[i2];
        long j2 = (long) (d2 & 1048575);
        if (a(t2, i3, i2)) {
            Object f2 = Vda.f(t, j2);
            Object f3 = Vda.f(t2, j2);
            if (f2 != null && f3 != null) {
                Vda.a(t, j2, C2230tca.a(f2, f3));
                b(t, i3, i2);
            } else if (f3 != null) {
                Vda.a(t, j2, f3);
                b(t, i3, i2);
            }
        }
    }

    private static <T> float c(T t, long j2) {
        return ((Float) Vda.f(t, j2)).floatValue();
    }

    private final AbstractC2575yca c(int i2) {
        return (AbstractC2575yca) this.d[((i2 / 3) << 1) + 1];
    }

    private final boolean c(T t, T t2, int i2) {
        return a(t, i2) == a(t2, i2);
    }

    private final int d(int i2) {
        return this.f4305c[i2 + 1];
    }

    private static <T> int d(T t, long j2) {
        return ((Integer) Vda.f(t, j2)).intValue();
    }

    private final int e(int i2) {
        return this.f4305c[i2 + 2];
    }

    private static <T> long e(T t, long j2) {
        return ((Long) Vda.f(t, j2)).longValue();
    }

    private static boolean f(int i2) {
        return (i2 & 536870912) != 0;
    }

    private static <T> boolean f(T t, long j2) {
        return ((Boolean) Vda.f(t, j2)).booleanValue();
    }

    private final int g(int i2) {
        if (i2 < this.e || i2 > this.f) {
            return -1;
        }
        return b(i2, 0);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0415 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0470  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.ads.Dba r34) {
        /*
        // Method dump skipped, instructions count: 1318
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1268fda.a(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.Dba):int");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2439wda
    public final T a() {
        return (T) this.o.a(this.g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0464 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x08bd  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x08c3  */
    @Override // com.google.android.gms.internal.ads.AbstractC2439wda
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r13, com.google.android.gms.internal.ads.AbstractC1752mea r14) {
        /*
        // Method dump skipped, instructions count: 2538
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1268fda.a(java.lang.Object, com.google.android.gms.internal.ads.mea):void");
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.nodes.InsnNode.isSame(InsnNode.java:303)
        	at jadx.core.dex.instructions.IndexInsnNode.isSame(IndexInsnNode.java:36)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    @Override // com.google.android.gms.internal.ads.AbstractC2439wda
    public final void a(T r11, com.google.android.gms.internal.ads.AbstractC2026qda r12, com.google.android.gms.internal.ads.C1197eca r13) {
        /*
        // Method dump skipped, instructions count: 1462
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1268fda.a(java.lang.Object, com.google.android.gms.internal.ads.qda, com.google.android.gms.internal.ads.eca):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02f0, code lost:
        if (r0 == r4) goto L_0x0360;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x035e, code lost:
        if (r0 == r15) goto L_0x0360;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0360, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.AbstractC2439wda
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r32, byte[] r33, int r34, int r35, com.google.android.gms.internal.ads.Dba r36) {
        /*
        // Method dump skipped, instructions count: 990
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1268fda.a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.Dba):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (com.google.android.gms.internal.ads.C2577yda.a(com.google.android.gms.internal.ads.Vda.f(r10, r6), com.google.android.gms.internal.ads.Vda.f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (com.google.android.gms.internal.ads.Vda.b(r10, r6) == com.google.android.gms.internal.ads.Vda.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (com.google.android.gms.internal.ads.Vda.a(r10, r6) == com.google.android.gms.internal.ads.Vda.a(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (com.google.android.gms.internal.ads.Vda.b(r10, r6) == com.google.android.gms.internal.ads.Vda.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (com.google.android.gms.internal.ads.Vda.a(r10, r6) == com.google.android.gms.internal.ads.Vda.a(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (com.google.android.gms.internal.ads.Vda.a(r10, r6) == com.google.android.gms.internal.ads.Vda.a(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (com.google.android.gms.internal.ads.Vda.a(r10, r6) == com.google.android.gms.internal.ads.Vda.a(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (com.google.android.gms.internal.ads.C2577yda.a(com.google.android.gms.internal.ads.Vda.f(r10, r6), com.google.android.gms.internal.ads.Vda.f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (com.google.android.gms.internal.ads.C2577yda.a(com.google.android.gms.internal.ads.Vda.f(r10, r6), com.google.android.gms.internal.ads.Vda.f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (com.google.android.gms.internal.ads.C2577yda.a(com.google.android.gms.internal.ads.Vda.f(r10, r6), com.google.android.gms.internal.ads.Vda.f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (com.google.android.gms.internal.ads.Vda.c(r10, r6) == com.google.android.gms.internal.ads.Vda.c(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (com.google.android.gms.internal.ads.Vda.a(r10, r6) == com.google.android.gms.internal.ads.Vda.a(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        if (com.google.android.gms.internal.ads.Vda.b(r10, r6) == com.google.android.gms.internal.ads.Vda.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        if (com.google.android.gms.internal.ads.Vda.a(r10, r6) == com.google.android.gms.internal.ads.Vda.a(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0169, code lost:
        if (com.google.android.gms.internal.ads.Vda.b(r10, r6) == com.google.android.gms.internal.ads.Vda.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (com.google.android.gms.internal.ads.Vda.b(r10, r6) == com.google.android.gms.internal.ads.Vda.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0195, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.Vda.d(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.Vda.d(r11, r6))) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b0, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.Vda.e(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.Vda.e(r11, r6))) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.ads.C2577yda.a(com.google.android.gms.internal.ads.Vda.f(r10, r6), com.google.android.gms.internal.ads.Vda.f(r11, r6)) != false) goto L_0x01b3;
     */
    @Override // com.google.android.gms.internal.ads.AbstractC2439wda
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(T r10, T r11) {
        /*
        // Method dump skipped, instructions count: 626
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1268fda.a(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // com.google.android.gms.internal.ads.AbstractC2439wda
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(T r9) {
        /*
        // Method dump skipped, instructions count: 476
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1268fda.b(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2439wda
    public final void b(T t, T t2) {
        if (t2 != null) {
            for (int i2 = 0; i2 < this.f4305c.length; i2 += 3) {
                int d2 = d(i2);
                long j2 = (long) (1048575 & d2);
                int i3 = this.f4305c[i2];
                switch ((d2 & 267386880) >>> 20) {
                    case 0:
                        if (a((Object) t2, i2)) {
                            Vda.a(t, j2, Vda.e(t2, j2));
                            b((Object) t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (a((Object) t2, i2)) {
                            Vda.a((Object) t, j2, Vda.d(t2, j2));
                            b((Object) t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        Vda.a((Object) t, j2, Vda.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 3:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        Vda.a((Object) t, j2, Vda.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 4:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        Vda.a((Object) t, j2, Vda.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 5:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        Vda.a((Object) t, j2, Vda.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 6:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        Vda.a((Object) t, j2, Vda.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 7:
                        if (a((Object) t2, i2)) {
                            Vda.a(t, j2, Vda.c(t2, j2));
                            b((Object) t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        Vda.a(t, j2, Vda.f(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 9:
                    case 17:
                        a(t, t2, i2);
                        break;
                    case 10:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        Vda.a(t, j2, Vda.f(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 11:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        Vda.a((Object) t, j2, Vda.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 12:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        Vda.a((Object) t, j2, Vda.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 13:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        Vda.a((Object) t, j2, Vda.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 14:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        Vda.a((Object) t, j2, Vda.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 15:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        Vda.a((Object) t, j2, Vda.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 16:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        Vda.a((Object) t, j2, Vda.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.p.a(t, t2, j2);
                        break;
                    case 50:
                        C2577yda.a(this.s, t, t2, j2);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!a(t2, i3, i2)) {
                            break;
                        }
                        Vda.a(t, j2, Vda.f(t2, j2));
                        b(t, i3, i2);
                        break;
                    case 60:
                    case 68:
                        b(t, t2, i2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!a(t2, i3, i2)) {
                            break;
                        }
                        Vda.a(t, j2, Vda.f(t2, j2));
                        b(t, i3, i2);
                        break;
                }
            }
            C2577yda.a(this.q, t, t2);
            if (this.h) {
                C2577yda.a(this.r, t, t2);
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2439wda
    public final void c(T t) {
        int i2;
        int i3 = this.m;
        while (true) {
            i2 = this.n;
            if (i3 >= i2) {
                break;
            }
            long d2 = (long) (d(this.l[i3]) & 1048575);
            Object f2 = Vda.f(t, d2);
            if (f2 != null) {
                this.s.d(f2);
                Vda.a(t, d2, f2);
            }
            i3++;
        }
        int length = this.l.length;
        while (i2 < length) {
            this.p.b(t, (long) this.l[i2]);
            i2++;
        }
        this.q.a((Object) t);
        if (this.h) {
            this.r.c(t);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d8, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e9, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fa, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020b, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x020d, code lost:
        r2.putInt(r20, (long) r14, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0211, code lost:
        r3 = (com.google.android.gms.internal.ads.AbstractC0991bca.e(r3) + com.google.android.gms.internal.ads.AbstractC0991bca.g(r5)) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0331, code lost:
        if ((r5 instanceof com.google.android.gms.internal.ads.Iba) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0334, code lost:
        r3 = com.google.android.gms.internal.ads.AbstractC0991bca.b(r3, (java.lang.String) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0418, code lost:
        if (a(r20, r15, r3) != false) goto L_0x06b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0438, code lost:
        if (a(r20, r15, r3) != false) goto L_0x06e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0440, code lost:
        if (a(r20, r15, r3) != false) goto L_0x06ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0460, code lost:
        if (a(r20, r15, r3) != false) goto L_0x0710;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0468, code lost:
        if (a(r20, r15, r3) != false) goto L_0x071f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0478, code lost:
        if ((r4 instanceof com.google.android.gms.internal.ads.Iba) != false) goto L_0x0714;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0480, code lost:
        if (a(r20, r15, r3) != false) goto L_0x0746;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0488, code lost:
        if (a(r20, r15, r3) != false) goto L_0x0750;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0513, code lost:
        if (r19.k != false) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0525, code lost:
        if (r19.k != false) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0537, code lost:
        if (r19.k != false) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0549, code lost:
        if (r19.k != false) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x055b, code lost:
        if (r19.k != false) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x056d, code lost:
        if (r19.k != false) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x057f, code lost:
        if (r19.k != false) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0591, code lost:
        if (r19.k != false) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x05a2, code lost:
        if (r19.k != false) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x05b3, code lost:
        if (r19.k != false) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x05c4, code lost:
        if (r19.k != false) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x05d5, code lost:
        if (r19.k != false) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x05e6, code lost:
        if (r19.k != false) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x05f7, code lost:
        if (r19.k != false) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x05f9, code lost:
        r2.putInt(r20, (long) r11, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x05fd, code lost:
        r9 = (com.google.android.gms.internal.ads.AbstractC0991bca.e(r15) + com.google.android.gms.internal.ads.AbstractC0991bca.g(r4)) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x06b2, code lost:
        if ((r12 & r18) != 0) goto L_0x06b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x06b4, code lost:
        r4 = com.google.android.gms.internal.ads.AbstractC0991bca.c(r15, (com.google.android.gms.internal.ads.AbstractC0993bda) r2.getObject(r20, r9), a(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x06df, code lost:
        if ((r12 & r18) != 0) goto L_0x06e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x06e1, code lost:
        r4 = com.google.android.gms.internal.ads.AbstractC0991bca.h(r15, 0L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x06ea, code lost:
        if ((r12 & r18) != 0) goto L_0x06ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x06ec, code lost:
        r9 = com.google.android.gms.internal.ads.AbstractC0991bca.j(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x070e, code lost:
        if ((r12 & r18) != 0) goto L_0x0710;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0710, code lost:
        r4 = r2.getObject(r20, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0714, code lost:
        r4 = com.google.android.gms.internal.ads.AbstractC0991bca.c(r15, (com.google.android.gms.internal.ads.Iba) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x071d, code lost:
        if ((r12 & r18) != 0) goto L_0x071f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x071f, code lost:
        r4 = com.google.android.gms.internal.ads.C2577yda.a(r15, r2.getObject(r20, r9), a(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0737, code lost:
        if ((r4 instanceof com.google.android.gms.internal.ads.Iba) != false) goto L_0x0714;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x073a, code lost:
        r4 = com.google.android.gms.internal.ads.AbstractC0991bca.b(r15, (java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        if ((r5 instanceof com.google.android.gms.internal.ads.Iba) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0744, code lost:
        if ((r12 & r18) != 0) goto L_0x0746;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0746, code lost:
        r4 = com.google.android.gms.internal.ads.AbstractC0991bca.b(r15, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x074e, code lost:
        if ((r12 & r18) != 0) goto L_0x0750;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0750, code lost:
        r9 = com.google.android.gms.internal.ads.AbstractC0991bca.i(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0127, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0139, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014b, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015d, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016f, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0181, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0193, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a5, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b6, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c7, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    @Override // com.google.android.gms.internal.ads.AbstractC2439wda
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int d(T r20) {
        /*
        // Method dump skipped, instructions count: 2348
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1268fda.d(java.lang.Object):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: com.google.android.gms.internal.ads.wda */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC2439wda
    public final boolean e(T t) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z = true;
            if (i6 >= this.m) {
                return !this.h || this.r.a(t).c();
            }
            int i7 = this.l[i6];
            int i8 = this.f4305c[i7];
            int d2 = d(i7);
            int i9 = this.f4305c[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                i2 = i10 != 1048575 ? f4304b.getInt(t, (long) i10) : i5;
                i3 = i10;
            } else {
                i3 = i4;
                i2 = i5;
            }
            if (((268435456 & d2) != 0) && !a(t, i7, i3, i2, i11)) {
                return false;
            }
            int i12 = (267386880 & d2) >>> 20;
            if (i12 != 9 && i12 != 17) {
                if (i12 != 27) {
                    if (i12 == 60 || i12 == 68) {
                        if (a(t, i8, i7) && !a(t, d2, a(i7))) {
                            return false;
                        }
                    } else if (i12 != 49) {
                        if (i12 == 50 && !this.s.b(Vda.f(t, (long) (d2 & 1048575))).isEmpty()) {
                            this.s.a(b(i7));
                            throw null;
                        }
                    }
                }
                List list = (List) Vda.f(t, (long) (d2 & 1048575));
                if (!list.isEmpty()) {
                    AbstractC2439wda a2 = a(i7);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= list.size()) {
                            break;
                        } else if (!a2.e(list.get(i13))) {
                            z = false;
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (a(t, i7, i3, i2, i11) && !a(t, d2, a(i7))) {
                return false;
            }
            i6++;
            i4 = i3;
            i5 = i2;
        }
    }
}
