package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.xc  reason: case insensitive filesystem */
final class C2505xc implements AbstractC0268Dc<Object> {
    C2505xc() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final void a(Object obj, Map<String, String> map) {
        String valueOf = String.valueOf(map.get("string"));
        C0745Vl.c(valueOf.length() != 0 ? "Received log message: ".concat(valueOf) : new String("Received log message: "));
    }
}
