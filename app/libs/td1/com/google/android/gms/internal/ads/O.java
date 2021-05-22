package com.google.android.gms.internal.ads;

import android.view.View;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.ads.internal.e;

public final class O extends P {

    /* renamed from: a  reason: collision with root package name */
    private final e f2716a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2717b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2718c;

    public O(e eVar, String str, String str2) {
        this.f2716a = eVar;
        this.f2717b = str;
        this.f2718c = str2;
    }

    @Override // com.google.android.gms.internal.ads.Q
    public final String getContent() {
        return this.f2718c;
    }

    @Override // com.google.android.gms.internal.ads.Q
    public final void k(a aVar) {
        if (aVar != null) {
            this.f2716a.a((View) b.Q(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.Q
    public final String ra() {
        return this.f2717b;
    }

    @Override // com.google.android.gms.internal.ads.Q
    public final void u() {
        this.f2716a.b();
    }

    @Override // com.google.android.gms.internal.ads.Q
    public final void ya() {
        this.f2716a.a();
    }
}
