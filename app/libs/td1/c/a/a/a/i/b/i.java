package c.a.a.a.i.b;

import c.a.a.a.b.c.e;
import c.a.a.a.p.g;
import c.a.a.a.t;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Deprecated
class i implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private static final Constructor<?> f766a;

    /* renamed from: b  reason: collision with root package name */
    private final t f767b;

    static {
        try {
            f766a = Proxy.getProxyClass(i.class.getClassLoader(), e.class).getConstructor(InvocationHandler.class);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        }
    }

    i(t tVar) {
        this.f767b = tVar;
    }

    public static e a(t tVar) {
        try {
            return (e) f766a.newInstance(new i(tVar));
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public void a() {
        g.a(this.f767b.getEntity());
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (method.getName().equals("close")) {
            a();
            return null;
        }
        try {
            return method.invoke(this.f767b, objArr);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
            throw e;
        }
    }
}
