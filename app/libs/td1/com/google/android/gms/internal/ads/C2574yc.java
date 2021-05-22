package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.yc  reason: case insensitive filesystem */
final class C2574yc implements AbstractC0268Dc<AbstractC1564jo> {
    C2574yc() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final /* synthetic */ void a(AbstractC1564jo joVar, Map map) {
        AbstractC1564jo joVar2 = joVar;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            joVar2.a();
        } else if ("resume".equals(str)) {
            joVar2.b();
        }
    }
}
