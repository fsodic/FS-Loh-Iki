package com.google.android.gms.internal.ads;

import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.aL  reason: case insensitive filesystem */
public final /* synthetic */ class C0902aL implements AbstractC1187eV {

    /* renamed from: a  reason: collision with root package name */
    private final XK f3796a;

    /* renamed from: b  reason: collision with root package name */
    private final List f3797b;

    C0902aL(XK xk, List list) {
        this.f3796a = xk;
        this.f3797b = list;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1187eV
    public final Object apply(Object obj) {
        return XK.a(this.f3797b, (String) obj);
    }
}
