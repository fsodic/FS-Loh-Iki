package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.zu  reason: case insensitive filesystem */
public final class C2675zu implements Sea<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final C2537xu f6222a;

    private C2675zu(C2537xu xuVar) {
        this.f6222a = xuVar;
    }

    public static C2675zu a(C2537xu xuVar) {
        return new C2675zu(xuVar);
    }

    public static Bundle b(C2537xu xuVar) {
        return xuVar.d();
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return this.f6222a.d();
    }
}
