package androidx.lifecycle;

import androidx.lifecycle.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class a {

    /* renamed from: a  reason: collision with root package name */
    static a f209a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class, C0007a> f210b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class, Boolean> f211c = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.a$a  reason: collision with other inner class name */
    public static class C0007a {

        /* renamed from: a  reason: collision with root package name */
        final Map<f.a, List<b>> f212a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<b, f.a> f213b;

        C0007a(Map<b, f.a> map) {
            this.f213b = map;
            for (Map.Entry<b, f.a> entry : map.entrySet()) {
                f.a value = entry.getValue();
                List<b> list = this.f212a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f212a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void a(List<b> list, h hVar, f.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(hVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(h hVar, f.a aVar, Object obj) {
            a(this.f212a.get(aVar), hVar, aVar, obj);
            a(this.f212a.get(f.a.ON_ANY), hVar, aVar, obj);
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f214a;

        /* renamed from: b  reason: collision with root package name */
        final Method f215b;

        b(int i, Method method) {
            this.f214a = i;
            this.f215b = method;
            this.f215b.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        public void a(h hVar, f.a aVar, Object obj) {
            try {
                int i = this.f214a;
                if (i == 0) {
                    this.f215b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f215b.invoke(obj, hVar);
                } else if (i == 2) {
                    this.f215b.invoke(obj, hVar, aVar);
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f214a == bVar.f214a && this.f215b.getName().equals(bVar.f215b.getName());
        }

        public int hashCode() {
            return (this.f214a * 31) + this.f215b.getName().hashCode();
        }
    }

    a() {
    }

    private C0007a a(Class cls, Method[] methodArr) {
        int i;
        C0007a a2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (a2 = a(superclass)) == null)) {
            hashMap.putAll(a2.f213b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, f.a> entry : a(cls2).f213b.entrySet()) {
                a(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            q qVar = (q) method.getAnnotation(q.class);
            if (qVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(h.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                f.a value = qVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(f.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == f.a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    a(hashMap, new b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0007a aVar = new C0007a(hashMap);
        this.f210b.put(cls, aVar);
        this.f211c.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    private void a(Map<b, f.a> map, b bVar, f.a aVar, Class cls) {
        f.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f215b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous" + " value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    private Method[] c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: package-private */
    public C0007a a(Class cls) {
        C0007a aVar = this.f210b.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    /* access modifiers changed from: package-private */
    public boolean b(Class cls) {
        if (this.f211c.containsKey(cls)) {
            return this.f211c.get(cls).booleanValue();
        }
        Method[] c2 = c(cls);
        for (Method method : c2) {
            if (((q) method.getAnnotation(q.class)) != null) {
                a(cls, c2);
                return true;
            }
        }
        this.f211c.put(cls, false);
        return false;
    }
}
