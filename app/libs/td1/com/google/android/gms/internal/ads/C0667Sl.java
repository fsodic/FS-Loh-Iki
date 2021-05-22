package com.google.android.gms.internal.ads;

import android.util.JsonWriter;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Sl  reason: case insensitive filesystem */
public final /* synthetic */ class C0667Sl implements AbstractC0641Rl {

    /* renamed from: a  reason: collision with root package name */
    private final String f3121a;

    C0667Sl(String str) {
        this.f3121a = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0641Rl
    public final void a(JsonWriter jsonWriter) {
        C0563Ol.a(this.f3121a, jsonWriter);
    }
}
