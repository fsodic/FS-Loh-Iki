package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC0993bda;
import com.google.android.gms.internal.ads.WZ;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.wX  reason: case insensitive filesystem */
public abstract class AbstractC2429wX<KeyProtoT extends AbstractC0993bda> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<KeyProtoT> f5894a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, AbstractC2567yX<?, KeyProtoT>> f5895b;

    /* renamed from: c  reason: collision with root package name */
    private final Class<?> f5896c;

    @SafeVarargs
    protected AbstractC2429wX(Class<KeyProtoT> cls, AbstractC2567yX<?, KeyProtoT>... yXVarArr) {
        this.f5894a = cls;
        HashMap hashMap = new HashMap();
        for (AbstractC2567yX<?, KeyProtoT> yXVar : yXVarArr) {
            if (hashMap.containsKey(yXVar.a())) {
                String valueOf = String.valueOf(yXVar.a().getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            } else {
                hashMap.put(yXVar.a(), yXVar);
            }
        }
        this.f5896c = yXVarArr.length > 0 ? yXVarArr[0].a() : Void.class;
        this.f5895b = Collections.unmodifiableMap(hashMap);
    }

    public abstract KeyProtoT a(Iba iba);

    public final <P> P a(KeyProtoT keyprotot, Class<P> cls) {
        AbstractC2567yX<?, KeyProtoT> yXVar = this.f5895b.get(cls);
        if (yXVar != null) {
            return (P) yXVar.a(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
        sb.append("Requested primitive class ");
        sb.append(canonicalName);
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    public abstract String a();

    public abstract void a(KeyProtoT keyprotot);

    public final Class<KeyProtoT> b() {
        return this.f5894a;
    }

    public abstract WZ.a c();

    public final Set<Class<?>> d() {
        return this.f5895b.keySet();
    }

    /* access modifiers changed from: package-private */
    public final Class<?> e() {
        return this.f5896c;
    }

    public AbstractC2636zX<?, KeyProtoT> f() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }
}
