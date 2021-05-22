package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.br  reason: case insensitive filesystem */
public final class C1019br implements AbstractC0950ar {

    /* renamed from: a  reason: collision with root package name */
    private AbstractC1901ok f3947a;

    public C1019br(AbstractC1901ok okVar) {
        this.f3947a = okVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0950ar
    public final void a(Map<String, String> map) {
        this.f3947a.a(Boolean.parseBoolean(map.get("content_vertical_opted_out")));
    }
}
