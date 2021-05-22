package com.google.ads.mediation;

import com.google.android.gms.ads.g.a;

final class g extends a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractAdViewAdapter f1012a;

    g(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f1012a = abstractAdViewAdapter;
    }

    @Override // com.google.android.gms.ads.g.a
    public final void c() {
        if (AbstractAdViewAdapter.zzb(this.f1012a) != null && AbstractAdViewAdapter.zza(this.f1012a) != null) {
            AbstractAdViewAdapter.zza(this.f1012a).a(AbstractAdViewAdapter.zzb(this.f1012a).a());
        }
    }
}
