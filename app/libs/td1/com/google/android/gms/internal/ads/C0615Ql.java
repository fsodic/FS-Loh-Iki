package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Ql  reason: case insensitive filesystem */
public final /* synthetic */ class C0615Ql implements AbstractC0641Rl {

    /* renamed from: a  reason: collision with root package name */
    private final int f2963a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f2964b;

    C0615Ql(int i, Map map) {
        this.f2963a = i;
        this.f2964b = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0641Rl
    public final void a(JsonWriter jsonWriter) {
        C0563Ol.a(this.f2963a, this.f2964b, jsonWriter);
    }
}
