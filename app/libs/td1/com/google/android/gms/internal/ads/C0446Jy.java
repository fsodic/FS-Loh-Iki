package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.Jy  reason: case insensitive filesystem */
public final class C0446Jy implements Sea<View> {

    /* renamed from: a  reason: collision with root package name */
    private final C2059qy f2370a;

    private C0446Jy(C2059qy qyVar) {
        this.f2370a = qyVar;
    }

    public static C0446Jy a(C2059qy qyVar) {
        return new C0446Jy(qyVar);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return this.f2370a.c();
    }
}
