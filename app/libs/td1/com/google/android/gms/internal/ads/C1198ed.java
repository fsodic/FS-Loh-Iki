package com.google.android.gms.internal.ads;

import b.c.b.a.b.b;
import com.google.android.gms.common.internal.AbstractC0176b;

/* renamed from: com.google.android.gms.internal.ads.ed  reason: case insensitive filesystem */
final class C1198ed implements AbstractC0176b.AbstractC0028b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1423hm f4223a;

    C1198ed(C0788Xc xc, C1423hm hmVar) {
        this.f4223a = hmVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.AbstractC0028b
    public final void onConnectionFailed(b bVar) {
        this.f4223a.a(new RuntimeException("Connection failed."));
    }
}
