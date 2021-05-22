package com.google.android.gms.internal.ads;

import b.c.b.a.b.b;
import com.google.android.gms.common.internal.AbstractC0176b;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.kma  reason: case insensitive filesystem */
public final class C1630kma implements AbstractC0176b.AbstractC0028b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1355gma f4804a;

    C1630kma(C1355gma gma) {
        this.f4804a = gma;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.AbstractC0028b
    public final void onConnectionFailed(b bVar) {
        synchronized (this.f4804a.f4423b) {
            this.f4804a.e = null;
            if (this.f4804a.f4424c != null) {
                this.f4804a.f4424c = null;
            }
            this.f4804a.f4423b.notifyAll();
        }
    }
}
