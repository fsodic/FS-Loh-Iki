package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.fm  reason: case insensitive filesystem */
public final class C1285fm implements GW<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f4339a;

    C1285fm(String str) {
        this.f4339a = str;
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        q.g().b(th, this.f4339a);
    }
}
