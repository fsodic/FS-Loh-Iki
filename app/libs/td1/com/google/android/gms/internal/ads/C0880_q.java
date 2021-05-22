package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads._q  reason: case insensitive filesystem */
public final class C0880_q implements AbstractC0950ar {

    /* renamed from: a  reason: collision with root package name */
    private AbstractC1901ok f3769a;

    public C0880_q(AbstractC1901ok okVar) {
        this.f3769a = okVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0950ar
    public final void a(Map<String, String> map) {
        this.f3769a.c(Boolean.parseBoolean(map.get("content_url_opted_out")));
    }
}
