package b.c.b.a.d.d;

import org.cocos2dx.lib.BuildConfig;

public enum pb {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(false),
    STRING(BuildConfig.FLAVOR),
    BYTE_STRING(AbstractC0071i.f429a),
    ENUM(null),
    MESSAGE(null);
    
    private final Object k;

    private pb(Object obj) {
        this.k = obj;
    }
}
