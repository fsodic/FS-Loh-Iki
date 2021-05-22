package com.google.android.gms.internal.ads;

import b.c.b.a.b.b;
import com.google.android.gms.common.internal.AbstractC0176b;

/* access modifiers changed from: package-private */
public final class Bma implements AbstractC0176b.AbstractC0028b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1423hm f1654a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2388vma f1655b;

    Bma(C2388vma vma, C1423hm hmVar) {
        this.f1655b = vma;
        this.f1654a = hmVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.AbstractC0028b
    public final void onConnectionFailed(b bVar) {
        synchronized (this.f1655b.d) {
            this.f1654a.a(new RuntimeException("Connection failed."));
        }
    }
}
