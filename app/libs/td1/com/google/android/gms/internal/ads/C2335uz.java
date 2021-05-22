package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.uz  reason: case insensitive filesystem */
public final class C2335uz implements AbstractC0268Dc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<C2197sz> f5777a;

    private C2335uz(C2197sz szVar) {
        this.f5777a = new WeakReference<>(szVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final void a(Object obj, Map<String, String> map) {
        C2197sz szVar = this.f5777a.get();
        if (szVar != null && "_ac".equals(map.get("eventName"))) {
            szVar.h.e();
        }
    }
}
