package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.a.a;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.rx  reason: case insensitive filesystem */
public final class C2126rx implements Sea<Set<C0523Mx<a>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1162dx f5475a;

    private C2126rx(C1162dx dxVar) {
        this.f5475a = dxVar;
    }

    public static C2126rx a(C1162dx dxVar) {
        return new C2126rx(dxVar);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set<C0523Mx<a>> f = this.f5475a.f();
        Xea.a(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }
}
