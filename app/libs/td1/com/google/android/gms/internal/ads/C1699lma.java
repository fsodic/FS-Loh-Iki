package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.AbstractC0176b;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.lma  reason: case insensitive filesystem */
public final class C1699lma implements AbstractC0176b.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1355gma f4904a;

    C1699lma(C1355gma gma) {
        this.f4904a = gma;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.a
    public final void onConnected(Bundle bundle) {
        synchronized (this.f4904a.f4423b) {
            try {
                if (this.f4904a.f4424c != null) {
                    this.f4904a.e = this.f4904a.f4424c.z();
                }
            } catch (DeadObjectException e) {
                C0745Vl.b("Unable to obtain a cache service instance.", e);
                this.f4904a.c();
            }
            this.f4904a.f4423b.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.a
    public final void onConnectionSuspended(int i) {
        synchronized (this.f4904a.f4423b) {
            this.f4904a.e = null;
            this.f4904a.f4423b.notifyAll();
        }
    }
}
