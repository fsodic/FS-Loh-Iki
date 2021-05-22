package com.google.android.gms.internal.ads;

import android.graphics.Rect;

/* access modifiers changed from: package-private */
public final /* synthetic */ class VC implements AbstractC1835nla {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1564jo f3314a;

    VC(AbstractC1564jo joVar) {
        this.f3314a = joVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835nla
    public final void a(C1904ola ola) {
        AbstractC0774Wo d = this.f3314a.d();
        Rect rect = ola.f;
        d.a(rect.left, rect.top, false);
    }
}
