package com.google.android.gms.internal.ads;

import android.content.Context;

public final class OM implements AbstractC1180eO<PM> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2738a;

    /* renamed from: b  reason: collision with root package name */
    private final VW f2739b;

    public OM(Context context, VW vw) {
        this.f2738a = context;
        this.f2739b = vw;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<PM> a() {
        return this.f2739b.a(new RM(this));
    }
}
