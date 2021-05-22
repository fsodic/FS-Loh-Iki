package com.google.android.gms.internal.ads;

import android.net.Uri;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.vk  reason: case insensitive filesystem */
public final /* synthetic */ class C2383vk implements AbstractC2221tW {

    /* renamed from: a  reason: collision with root package name */
    private final C2452wk f5828a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f5829b;

    C2383vk(C2452wk wkVar, Uri uri) {
        this.f5828a = wkVar;
        this.f5829b = uri;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final SW b(Object obj) {
        return JW.a(C2452wk.b(this.f5829b));
    }
}
