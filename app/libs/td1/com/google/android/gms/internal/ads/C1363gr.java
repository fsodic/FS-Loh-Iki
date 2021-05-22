package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.gr  reason: case insensitive filesystem */
public final class C1363gr implements AbstractC0950ar {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1901ok f4435a;

    public C1363gr(AbstractC1901ok okVar) {
        this.f4435a = okVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0950ar
    public final void a(Map<String, String> map) {
        String str = map.get("value");
        if ("auto_collect_location".equals(map.get("key"))) {
            this.f4435a.b(Boolean.parseBoolean(str));
        }
    }
}
