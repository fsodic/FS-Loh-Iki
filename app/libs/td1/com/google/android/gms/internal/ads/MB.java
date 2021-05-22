package com.google.android.gms.internal.ads;

import android.graphics.Rect;

final /* synthetic */ class MB implements AbstractC1835nla {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1564jo f2559a;

    MB(AbstractC1564jo joVar) {
        this.f2559a = joVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835nla
    public final void a(C1904ola ola) {
        AbstractC0774Wo d = this.f2559a.d();
        Rect rect = ola.f;
        d.a(rect.left, rect.top, false);
    }
}
