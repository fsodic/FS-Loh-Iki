package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.LX;
import java.security.GeneralSecurityException;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class OX implements LX.b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractC2429wX f2750a;

    OX(AbstractC2429wX wXVar) {
        this.f2750a = wXVar;
    }

    @Override // com.google.android.gms.internal.ads.LX.b
    public final <Q> AbstractC2360vX<Q> a(Class<Q> cls) {
        try {
            return new C2291uX(this.f2750a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.LX.b
    public final Set<Class<?>> a() {
        return this.f2750a.d();
    }

    @Override // com.google.android.gms.internal.ads.LX.b
    public final AbstractC2360vX<?> b() {
        AbstractC2429wX wXVar = this.f2750a;
        return new C2291uX(wXVar, wXVar.e());
    }

    @Override // com.google.android.gms.internal.ads.LX.b
    public final Class<?> c() {
        return this.f2750a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.LX.b
    public final Class<?> d() {
        return null;
    }
}
