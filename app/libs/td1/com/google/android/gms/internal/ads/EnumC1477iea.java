package com.google.android.gms.internal.ads;

import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.iea  reason: case insensitive filesystem */
public enum EnumC1477iea {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(false),
    STRING(BuildConfig.FLAVOR),
    BYTE_STRING(Iba.f2236a),
    ENUM(null),
    MESSAGE(null);
    
    private final Object k;

    private EnumC1477iea(Object obj) {
        this.k = obj;
    }
}
