package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.a;

/* renamed from: com.google.android.gms.internal.ads.Aq  reason: case insensitive filesystem */
public final class C0204Aq implements Sea<a> {

    /* renamed from: a  reason: collision with root package name */
    private final C2602yq f1569a;

    public C0204Aq(C2602yq yqVar) {
        this.f1569a = yqVar;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        a e = this.f1569a.e();
        Xea.a(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }
}
