package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.LX;
import java.util.Collections;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class KX implements LX.b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractC2360vX f2407a;

    KX(AbstractC2360vX vXVar) {
        this.f2407a = vXVar;
    }

    @Override // com.google.android.gms.internal.ads.LX.b
    public final <Q> AbstractC2360vX<Q> a(Class<Q> cls) {
        if (this.f2407a.a().equals(cls)) {
            return this.f2407a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // com.google.android.gms.internal.ads.LX.b
    public final Set<Class<?>> a() {
        return Collections.singleton(this.f2407a.a());
    }

    @Override // com.google.android.gms.internal.ads.LX.b
    public final AbstractC2360vX<?> b() {
        return this.f2407a;
    }

    @Override // com.google.android.gms.internal.ads.LX.b
    public final Class<?> c() {
        return this.f2407a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.LX.b
    public final Class<?> d() {
        return null;
    }
}
