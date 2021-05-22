package com.google.android.gms.internal.ads;

import java.util.HashMap;

final /* synthetic */ class LB implements AbstractC1835nla {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1564jo f2458a;

    LB(AbstractC1564jo joVar) {
        this.f2458a = joVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835nla
    public final void a(C1904ola ola) {
        AbstractC1564jo joVar = this.f2458a;
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", ola.m ? "1" : "0");
        joVar.a("onAdVisibilityChanged", hashMap);
    }
}
