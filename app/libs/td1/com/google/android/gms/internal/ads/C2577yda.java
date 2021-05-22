package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.yda  reason: case insensitive filesystem */
public final class C2577yda {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f6106a = d();

    /* renamed from: b  reason: collision with root package name */
    private static final Oda<?, ?> f6107b = a(false);

    /* renamed from: c  reason: collision with root package name */
    private static final Oda<?, ?> f6108c = a(true);
    private static final Oda<?, ?> d = new Rda();

    static int a(int i, Object obj, AbstractC2439wda wda) {
        return obj instanceof Kca ? AbstractC0991bca.a(i, (Kca) obj) : AbstractC0991bca.b(i, (AbstractC0993bda) obj, wda);
    }

    static int a(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int e = AbstractC0991bca.e(i) * size;
        if (list instanceof Mca) {
            Mca mca = (Mca) list;
            while (i2 < size) {
                Object g = mca.g(i2);
                e += g instanceof Iba ? AbstractC0991bca.a((Iba) g) : AbstractC0991bca.a((String) g);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                e += obj instanceof Iba ? AbstractC0991bca.a((Iba) obj) : AbstractC0991bca.a((String) obj);
                i2++;
            }
        }
        return e;
    }

    static int a(int i, List<?> list, AbstractC2439wda wda) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = AbstractC0991bca.e(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            e += obj instanceof Kca ? AbstractC0991bca.a((Kca) obj) : AbstractC0991bca.a((AbstractC0993bda) obj, wda);
        }
        return e;
    }

    static int a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * AbstractC0991bca.e(i));
    }

    static int a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Pca) {
            Pca pca = (Pca) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC0991bca.d(pca.h(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC0991bca.d(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static Oda<?, ?> a() {
        return f6107b;
    }

    private static Oda<?, ?> a(boolean z) {
        try {
            Class<?> e = e();
            if (e == null) {
                return null;
            }
            return (Oda) e.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB a(int i, int i2, UB ub, Oda<UT, UB> oda) {
        if (ub == null) {
            ub = oda.a();
        }
        oda.a(ub, i, (long) i2);
        return ub;
    }

    static <UT, UB> UB a(int i, List<Integer> list, AbstractC2575yca yca, UB ub, Oda<UT, UB> oda) {
        UB ub2;
        if (yca == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    if (!yca.b(intValue)) {
                        ub = (UB) a(i, intValue, ub2, oda);
                        it.remove();
                    }
                }
                break loop1;
            }
        } else {
            int size = list.size();
            ub2 = ub;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue2 = list.get(i3).intValue();
                if (yca.b(intValue2)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = (UB) a(i, intValue2, ub2, oda);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    public static void a(int i, List<String> list, AbstractC1752mea mea) {
        if (list != null && !list.isEmpty()) {
            mea.b(i, list);
        }
    }

    public static void a(int i, List<?> list, AbstractC1752mea mea, AbstractC2439wda wda) {
        if (list != null && !list.isEmpty()) {
            mea.a(i, list, wda);
        }
    }

    public static void a(int i, List<Double> list, AbstractC1752mea mea, boolean z) {
        if (list != null && !list.isEmpty()) {
            mea.m(i, list, z);
        }
    }

    static <T, UT, UB> void a(Oda<UT, UB> oda, T t, T t2) {
        oda.a(t, oda.c(oda.d(t), oda.d(t2)));
    }

    static <T> void a(Zca zca, T t, T t2, long j) {
        Vda.a(t, j, zca.a(Vda.f(t, j), Vda.f(t2, j)));
    }

    static <T, FT extends AbstractC1679lca<FT>> void a(AbstractC1335gca<FT> gca, T t, T t2) {
        C1541jca<FT> a2 = gca.a((Object) t2);
        if (!a2.f4692b.isEmpty()) {
            gca.b(t).a(a2);
        }
    }

    public static void a(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC2092rca.class.isAssignableFrom(cls) && (cls2 = f6106a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int b(int i, List<Iba> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * AbstractC0991bca.e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += AbstractC0991bca.a(list.get(i2));
        }
        return e;
    }

    static int b(int i, List<AbstractC0993bda> list, AbstractC2439wda wda) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += AbstractC0991bca.c(i, list.get(i3), wda);
        }
        return i2;
    }

    static int b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return b(list) + (size * AbstractC0991bca.e(i));
    }

    static int b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Pca) {
            Pca pca = (Pca) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC0991bca.e(pca.h(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC0991bca.e(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static Oda<?, ?> b() {
        return f6108c;
    }

    public static void b(int i, List<Iba> list, AbstractC1752mea mea) {
        if (list != null && !list.isEmpty()) {
            mea.a(i, list);
        }
    }

    public static void b(int i, List<?> list, AbstractC1752mea mea, AbstractC2439wda wda) {
        if (list != null && !list.isEmpty()) {
            mea.b(i, list, wda);
        }
    }

    public static void b(int i, List<Float> list, AbstractC1752mea mea, boolean z) {
        if (list != null && !list.isEmpty()) {
            mea.n(i, list, z);
        }
    }

    static int c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + (size * AbstractC0991bca.e(i));
    }

    static int c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Pca) {
            Pca pca = (Pca) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC0991bca.f(pca.h(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC0991bca.f(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static Oda<?, ?> c() {
        return d;
    }

    public static void c(int i, List<Long> list, AbstractC1752mea mea, boolean z) {
        if (list != null && !list.isEmpty()) {
            mea.d(i, list, z);
        }
    }

    static int d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return d(list) + (size * AbstractC0991bca.e(i));
    }

    static int d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2299uca) {
            C2299uca uca = (C2299uca) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC0991bca.k(uca.h(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC0991bca.k(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    private static Class<?> d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void d(int i, List<Long> list, AbstractC1752mea mea, boolean z) {
        if (list != null && !list.isEmpty()) {
            mea.k(i, list, z);
        }
    }

    static int e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return e(list) + (size * AbstractC0991bca.e(i));
    }

    static int e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2299uca) {
            C2299uca uca = (C2299uca) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC0991bca.f(uca.h(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC0991bca.f(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    private static Class<?> e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void e(int i, List<Long> list, AbstractC1752mea mea, boolean z) {
        if (list != null && !list.isEmpty()) {
            mea.j(i, list, z);
        }
    }

    static int f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return f(list) + (size * AbstractC0991bca.e(i));
    }

    static int f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2299uca) {
            C2299uca uca = (C2299uca) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC0991bca.g(uca.h(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC0991bca.g(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void f(int i, List<Long> list, AbstractC1752mea mea, boolean z) {
        if (list != null && !list.isEmpty()) {
            mea.i(i, list, z);
        }
    }

    static int g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + (size * AbstractC0991bca.e(i));
    }

    static int g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2299uca) {
            C2299uca uca = (C2299uca) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC0991bca.h(uca.h(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC0991bca.h(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void g(int i, List<Long> list, AbstractC1752mea mea, boolean z) {
        if (list != null && !list.isEmpty()) {
            mea.e(i, list, z);
        }
    }

    static int h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * AbstractC0991bca.i(i, 0);
    }

    static int h(List<?> list) {
        return list.size() << 2;
    }

    public static void h(int i, List<Integer> list, AbstractC1752mea mea, boolean z) {
        if (list != null && !list.isEmpty()) {
            mea.b(i, list, z);
        }
    }

    static int i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * AbstractC0991bca.g(i, 0L);
    }

    static int i(List<?> list) {
        return list.size() << 3;
    }

    public static void i(int i, List<Integer> list, AbstractC1752mea mea, boolean z) {
        if (list != null && !list.isEmpty()) {
            mea.g(i, list, z);
        }
    }

    static int j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * AbstractC0991bca.b(i, true);
    }

    static int j(List<?> list) {
        return list.size();
    }

    public static void j(int i, List<Integer> list, AbstractC1752mea mea, boolean z) {
        if (list != null && !list.isEmpty()) {
            mea.l(i, list, z);
        }
    }

    public static void k(int i, List<Integer> list, AbstractC1752mea mea, boolean z) {
        if (list != null && !list.isEmpty()) {
            mea.f(i, list, z);
        }
    }

    public static void l(int i, List<Integer> list, AbstractC1752mea mea, boolean z) {
        if (list != null && !list.isEmpty()) {
            mea.h(i, list, z);
        }
    }

    public static void m(int i, List<Integer> list, AbstractC1752mea mea, boolean z) {
        if (list != null && !list.isEmpty()) {
            mea.c(i, list, z);
        }
    }

    public static void n(int i, List<Boolean> list, AbstractC1752mea mea, boolean z) {
        if (list != null && !list.isEmpty()) {
            mea.a(i, list, z);
        }
    }
}
