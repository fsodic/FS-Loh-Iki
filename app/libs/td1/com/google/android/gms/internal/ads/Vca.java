package com.google.android.gms.internal.ads;

final class Vca implements AbstractC1062cda {

    /* renamed from: a  reason: collision with root package name */
    private AbstractC1062cda[] f3348a;

    Vca(AbstractC1062cda... cdaArr) {
        this.f3348a = cdaArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1062cda
    public final boolean a(Class<?> cls) {
        for (AbstractC1062cda cda : this.f3348a) {
            if (cda.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1062cda
    public final _ca b(Class<?> cls) {
        AbstractC1062cda[] cdaArr = this.f3348a;
        for (AbstractC1062cda cda : cdaArr) {
            if (cda.a(cls)) {
                return cda.b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
