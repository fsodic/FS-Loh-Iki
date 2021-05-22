package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.xz  reason: case insensitive filesystem */
public final class C2542xz implements AbstractC0268Dc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<C2197sz> f6046a;

    private C2542xz(C2197sz szVar) {
        this.f6046a = new WeakReference<>(szVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final void a(Object obj, Map<String, String> map) {
        C2197sz szVar = this.f6046a.get();
        if (szVar != null) {
            szVar.g.b();
        }
    }
}
