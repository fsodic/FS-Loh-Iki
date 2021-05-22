package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC0176b;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.xma  reason: case insensitive filesystem */
public final class C2526xma implements AbstractC0176b.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1906oma f6022a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1423hm f6023b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C2388vma f6024c;

    C2526xma(C2388vma vma, C1906oma oma, C1423hm hmVar) {
        this.f6024c = vma;
        this.f6022a = oma;
        this.f6023b = hmVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.a
    public final void onConnected(Bundle bundle) {
        synchronized (this.f6024c.d) {
            if (!(this.f6024c.f5837b)) {
                this.f6024c.f5837b = true;
                C1975pma pma = this.f6024c.f5836a;
                if (pma != null) {
                    this.f6023b.a(new RunnableC2664zma(this.f6023b, C0875_l.f3755a.a(new Ama(this, pma, this.f6022a, this.f6023b))), C0875_l.f);
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.a
    public final void onConnectionSuspended(int i) {
    }
}
