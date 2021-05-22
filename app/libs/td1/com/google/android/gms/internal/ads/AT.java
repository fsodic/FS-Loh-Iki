package com.google.android.gms.internal.ads;

import java.util.Set;

final class AT extends C0834Yw<IT> implements AbstractC2632zT<EnumC2563yT> {
    AT(Set<C0523Mx<IT>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2632zT
    public final void a(C1598kT<EnumC2563yT, ?> kTVar) {
        a(new DT(kTVar));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2632zT
    public final void a(C1598kT<EnumC2563yT, ?> kTVar, Throwable th) {
        a(new FT(kTVar, th));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2632zT
    public final void b(C1598kT<EnumC2563yT, ?> kTVar) {
        a(new ET(kTVar));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2632zT
    public final void c(C1598kT<EnumC2563yT, ?> kTVar) {
        a(new CT(kTVar));
    }
}
