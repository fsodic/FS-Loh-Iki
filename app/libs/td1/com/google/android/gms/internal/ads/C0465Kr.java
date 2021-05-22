package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.Kr  reason: case insensitive filesystem */
public final class C0465Kr implements Sea<View> {

    /* renamed from: a  reason: collision with root package name */
    private final C0491Lr f2441a;

    public C0465Kr(C0491Lr lr) {
        this.f2441a = lr;
    }

    public static View a(C0491Lr lr) {
        View b2 = lr.b();
        Xea.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f2441a);
    }
}
