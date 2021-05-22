package com.google.android.gms.internal.ads;

import org.cocos2dx.lib.BuildConfig;

public enum Dca {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, BuildConfig.FLAVOR),
    BYTE_STRING(Iba.class, Iba.class, Iba.f2236a),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    private final Class<?> l;
    private final Class<?> m;
    private final Object n;

    private Dca(Class cls, Class cls2, Object obj) {
        this.l = cls;
        this.m = cls2;
        this.n = obj;
    }

    public final Class<?> a() {
        return this.m;
    }
}
