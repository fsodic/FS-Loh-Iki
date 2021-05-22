package b.c.b.a.d.d;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class B {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f334a = b();

    /* renamed from: b  reason: collision with root package name */
    static final B f335b = new B(true);

    /* renamed from: c  reason: collision with root package name */
    private final Map<Object, Object<?, ?>> f336c;

    B() {
        this.f336c = new HashMap();
    }

    private B(boolean z) {
        this.f336c = Collections.emptyMap();
    }

    public static B a() {
        return A.a();
    }

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
