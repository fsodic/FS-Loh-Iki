package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.fD  reason: case insensitive filesystem */
public final class C1238fD implements AbstractC1436hv {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1564jo f4274a;

    C1238fD(AbstractC1564jo joVar) {
        this.f4274a = !((Boolean) C2392voa.e().a(C2474x.pa)).booleanValue() ? null : joVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1436hv
    public final void b(Context context) {
        AbstractC1564jo joVar = this.f4274a;
        if (joVar != null) {
            joVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1436hv
    public final void c(Context context) {
        AbstractC1564jo joVar = this.f4274a;
        if (joVar != null) {
            joVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1436hv
    public final void d(Context context) {
        AbstractC1564jo joVar = this.f4274a;
        if (joVar != null) {
            joVar.onPause();
        }
    }
}
