package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.lc  reason: case insensitive filesystem */
public final class C1678lc implements AbstractC0268Dc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1609kc f4867a;

    public C1678lc(AbstractC1609kc kcVar) {
        this.f4867a = kcVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("name");
        if (str == null) {
            C0745Vl.d("App event with no name parameter.");
        } else {
            this.f4867a.a(str, map.get("info"));
        }
    }
}
