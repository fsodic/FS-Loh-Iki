package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.AbstractC0176b;

/* renamed from: com.google.android.gms.internal.ads.bd  reason: case insensitive filesystem */
final class C0992bd implements AbstractC0176b.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1423hm f3914a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0788Xc f3915b;

    C0992bd(C0788Xc xc, C1423hm hmVar) {
        this.f3915b = xc;
        this.f3914a = hmVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.a
    public final void onConnected(Bundle bundle) {
        try {
            this.f3914a.b(C0788Xc.b(this.f3915b).z());
        } catch (DeadObjectException e) {
            this.f3914a.a(e);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.a
    public final void onConnectionSuspended(int i) {
        C1423hm hmVar = this.f3914a;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        hmVar.a(new RuntimeException(sb.toString()));
    }
}
