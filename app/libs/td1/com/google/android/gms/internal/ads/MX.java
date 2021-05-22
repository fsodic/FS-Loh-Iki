package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.LX;
import java.security.GeneralSecurityException;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class MX implements LX.b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ IX f2596a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AbstractC2429wX f2597b;

    MX(IX ix, AbstractC2429wX wXVar) {
        this.f2596a = ix;
        this.f2597b = wXVar;
    }

    @Override // com.google.android.gms.internal.ads.LX.b
    public final <Q> AbstractC2360vX<Q> a(Class<Q> cls) {
        try {
            return new JX(this.f2596a, this.f2597b, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.LX.b
    public final Set<Class<?>> a() {
        return this.f2596a.d();
    }

    @Override // com.google.android.gms.internal.ads.LX.b
    public final AbstractC2360vX<?> b() {
        IX ix = this.f2596a;
        return new JX(ix, this.f2597b, ix.e());
    }

    @Override // com.google.android.gms.internal.ads.LX.b
    public final Class<?> c() {
        return this.f2596a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.LX.b
    public final Class<?> d() {
        return this.f2597b.getClass();
    }
}
