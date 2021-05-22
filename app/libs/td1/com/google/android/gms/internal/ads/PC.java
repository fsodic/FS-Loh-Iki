package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.i;

/* access modifiers changed from: package-private */
public final class PC implements i {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ MC f2805a;

    PC(MC mc) {
        this.f2805a = mc;
    }

    @Override // com.google.android.gms.ads.internal.i
    public final void a() {
        this.f2805a.h.onPause();
    }

    @Override // com.google.android.gms.ads.internal.i
    public final void b() {
        this.f2805a.h.onResume();
    }
}
