package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.ls  reason: case insensitive filesystem */
public final class C1708ls implements Sea<View> {

    /* renamed from: a  reason: collision with root package name */
    private final C1433hs f4913a;

    public C1708ls(C1433hs hsVar) {
        this.f4913a = hsVar;
    }

    public static View a(C1433hs hsVar) {
        View b2 = hsVar.b();
        Xea.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f4913a);
    }
}
