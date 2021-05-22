package b.c.b.a.d.d;

import java.util.List;

final class Ha {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f350a = d();

    /* renamed from: b  reason: collision with root package name */
    private static final Xa<?, ?> f351b = a(false);

    /* renamed from: c  reason: collision with root package name */
    private static final Xa<?, ?> f352c = a(true);
    private static final Xa<?, ?> d = new Za();

    static int a(int i, Object obj, Fa fa) {
        return obj instanceof Z ? AbstractC0100x.a(i, (Z) obj) : AbstractC0100x.b(i, (AbstractC0089ra) obj, fa);
    }

    static int a(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int b2 = AbstractC0100x.b(i) * size;
        if (list instanceof AbstractC0058ba) {
            AbstractC0058ba baVar = (AbstractC0058ba) list;
            while (i2 < size) {
                Object f = baVar.f(i2);
                b2 += f instanceof AbstractC0071i ? AbstractC0100x.a((AbstractC0071i) f) : AbstractC0100x.a((String) f);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                b2 += obj instanceof AbstractC0071i ? AbstractC0100x.a((AbstractC0071i) obj) : AbstractC0100x.a((String) obj);
                i2++;
            }
        }
        return b2;
    }

    static int a(int i, List<?> list, Fa fa) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int b2 = AbstractC0100x.b(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            b2 += obj instanceof Z ? AbstractC0100x.a((Z) obj) : AbstractC0100x.a((AbstractC0089ra) obj, fa);
        }
        return b2;
    }

    static int a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * AbstractC0100x.b(i));
    }

    static int a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0068ga) {
            C0068ga gaVar = (C0068ga) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC0100x.d(gaVar.h(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC0100x.d(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static Xa<?, ?> a() {
        return f351b;
    }

    private static Xa<?, ?> a(boolean z) {
        try {
            Class<?> e = e();
            if (e == null) {
                return null;
            }
            return (Xa) e.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a(int i, List<String> list, qb qbVar) {
        if (list != null && !list.isEmpty()) {
            qbVar.b(i, list);
        }
    }

    public static void a(int i, List<?> list, qb qbVar, Fa fa) {
        if (list != null && !list.isEmpty()) {
            qbVar.a(i, list, fa);
        }
    }

    public static void a(int i, List<Double> list, qb qbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            qbVar.m(i, list, z);
        }
    }

    static <T, FT extends H<FT>> void a(C<FT> c2, T t, T t2) {
        F<FT> a2 = c2.a((Object) t2);
        if (!a2.f346b.isEmpty()) {
            c2.b(t).a(a2);
        }
    }

    static <T, UT, UB> void a(Xa<UT, UB> xa, T t, T t2) {
        xa.a(t, xa.b(xa.c(t), xa.c(t2)));
    }

    static <T> void a(AbstractC0080ma maVar, T t, T t2, long j) {
        cb.a(t, j, maVar.a(cb.f(t, j), cb.f(t2, j)));
    }

    public static void a(Class<?> cls) {
        Class<?> cls2;
        if (!M.class.isAssignableFrom(cls) && (cls2 = f350a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int b(int i, List<AbstractC0071i> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int b2 = size * AbstractC0100x.b(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            b2 += AbstractC0100x.a(list.get(i2));
        }
        return b2;
    }

    static int b(int i, List<AbstractC0089ra> list, Fa fa) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += AbstractC0100x.c(i, list.get(i3), fa);
        }
        return i2;
    }

    static int b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return b(list) + (size * AbstractC0100x.b(i));
    }

    static int b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0068ga) {
            C0068ga gaVar = (C0068ga) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC0100x.e(gaVar.h(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC0100x.e(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static Xa<?, ?> b() {
        return f352c;
    }

    public static void b(int i, List<AbstractC0071i> list, qb qbVar) {
        if (list != null && !list.isEmpty()) {
            qbVar.a(i, list);
        }
    }

    public static void b(int i, List<?> list, qb qbVar, Fa fa) {
        if (list != null && !list.isEmpty()) {
            qbVar.b(i, list, fa);
        }
    }

    public static void b(int i, List<Float> list, qb qbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            qbVar.n(i, list, z);
        }
    }

    static int c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + (size * AbstractC0100x.b(i));
    }

    static int c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0068ga) {
            C0068ga gaVar = (C0068ga) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC0100x.f(gaVar.h(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC0100x.f(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static Xa<?, ?> c() {
        return d;
    }

    public static void c(int i, List<Long> list, qb qbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            qbVar.d(i, list, z);
        }
    }

    static int d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return d(list) + (size * AbstractC0100x.b(i));
    }

    static int d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof N) {
            N n = (N) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC0100x.h(n.h(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC0100x.h(list.get(i2).intValue());
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

    public static void d(int i, List<Long> list, qb qbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            qbVar.k(i, list, z);
        }
    }

    static int e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return e(list) + (size * AbstractC0100x.b(i));
    }

    static int e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof N) {
            N n = (N) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC0100x.c(n.h(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC0100x.c(list.get(i2).intValue());
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

    public static void e(int i, List<Long> list, qb qbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            qbVar.j(i, list, z);
        }
    }

    static int f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return f(list) + (size * AbstractC0100x.b(i));
    }

    static int f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof N) {
            N n = (N) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC0100x.d(n.h(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC0100x.d(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void f(int i, List<Long> list, qb qbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            qbVar.i(i, list, z);
        }
    }

    static int g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + (size * AbstractC0100x.b(i));
    }

    static int g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof N) {
            N n = (N) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC0100x.e(n.h(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC0100x.e(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void g(int i, List<Long> list, qb qbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            qbVar.e(i, list, z);
        }
    }

    static int h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * AbstractC0100x.i(i, 0);
    }

    static int h(List<?> list) {
        return list.size() << 2;
    }

    public static void h(int i, List<Integer> list, qb qbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            qbVar.b(i, list, z);
        }
    }

    static int i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * AbstractC0100x.g(i, 0L);
    }

    static int i(List<?> list) {
        return list.size() << 3;
    }

    public static void i(int i, List<Integer> list, qb qbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            qbVar.g(i, list, z);
        }
    }

    static int j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * AbstractC0100x.b(i, true);
    }

    static int j(List<?> list) {
        return list.size();
    }

    public static void j(int i, List<Integer> list, qb qbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            qbVar.l(i, list, z);
        }
    }

    public static void k(int i, List<Integer> list, qb qbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            qbVar.f(i, list, z);
        }
    }

    public static void l(int i, List<Integer> list, qb qbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            qbVar.h(i, list, z);
        }
    }

    public static void m(int i, List<Integer> list, qb qbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            qbVar.c(i, list, z);
        }
    }

    public static void n(int i, List<Boolean> list, qb qbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            qbVar.a(i, list, z);
        }
    }
}
