package com.google.android.gms.internal.ads;

import android.util.JsonWriter;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Pl  reason: case insensitive filesystem */
public final /* synthetic */ class C0589Pl implements AbstractC0641Rl {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f2878a;

    C0589Pl(byte[] bArr) {
        this.f2878a = bArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0641Rl
    public final void a(JsonWriter jsonWriter) {
        C0563Ol.a(this.f2878a, jsonWriter);
    }
}
