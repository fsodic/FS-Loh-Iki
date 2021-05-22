package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.gm  reason: case insensitive filesystem */
public final class C1354gm implements GW<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f4421a;

    C1354gm(String str) {
        this.f4421a = str;
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        q.g().a(th, this.f4421a);
    }
}
