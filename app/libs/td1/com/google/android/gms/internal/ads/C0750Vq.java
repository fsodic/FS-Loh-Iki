package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* renamed from: com.google.android.gms.internal.ads.Vq  reason: case insensitive filesystem */
public final class C0750Vq implements Sea<C2243tj> {

    /* renamed from: a  reason: collision with root package name */
    private final C0386Hq f3376a;

    public C0750Vq(C0386Hq hq) {
        this.f3376a = hq;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C2243tj A = q.A();
        Xea.a(A, "Cannot return null from a non-@Nullable @Provides method");
        return A;
    }
}
