package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Nl  reason: case insensitive filesystem */
public final /* synthetic */ class C0537Nl implements AbstractC0641Rl {

    /* renamed from: a  reason: collision with root package name */
    private final String f2692a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2693b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f2694c;
    private final byte[] d;

    C0537Nl(String str, String str2, Map map, byte[] bArr) {
        this.f2692a = str;
        this.f2693b = str2;
        this.f2694c = map;
        this.d = bArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0641Rl
    public final void a(JsonWriter jsonWriter) {
        C0563Ol.a(this.f2692a, this.f2693b, this.f2694c, this.d, jsonWriter);
    }
}
