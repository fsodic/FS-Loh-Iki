package b.c.b.a.d.d;

import org.cocos2dx.lib.BuildConfig;

public enum U {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, BuildConfig.FLAVOR),
    BYTE_STRING(AbstractC0071i.class, AbstractC0071i.class, AbstractC0071i.f429a),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    private final Class<?> l;
    private final Class<?> m;
    private final Object n;

    private U(Class cls, Class cls2, Object obj) {
        this.l = cls;
        this.m = cls2;
        this.n = obj;
    }

    public final Class<?> a() {
        return this.m;
    }
}
