package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.vy  reason: case insensitive filesystem */
public final class C2403vy implements Sea<View> {

    /* renamed from: a  reason: collision with root package name */
    private final C2059qy f5859a;

    private C2403vy(C2059qy qyVar) {
        this.f5859a = qyVar;
    }

    public static C2403vy a(C2059qy qyVar) {
        return new C2403vy(qyVar);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return this.f5859a.d();
    }
}
