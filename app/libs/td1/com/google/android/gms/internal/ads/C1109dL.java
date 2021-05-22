package com.google.android.gms.internal.ads;

import android.net.Uri;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.dL  reason: case insensitive filesystem */
public final /* synthetic */ class C1109dL implements AbstractC1187eV {

    /* renamed from: a  reason: collision with root package name */
    private final XK f4064a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f4065b;

    C1109dL(XK xk, Uri uri) {
        this.f4064a = xk;
        this.f4065b = uri;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1187eV
    public final Object apply(Object obj) {
        return XK.a(this.f4065b, (String) obj);
    }
}
