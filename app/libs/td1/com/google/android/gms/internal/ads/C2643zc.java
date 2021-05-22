package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.zc  reason: case insensitive filesystem */
final class C2643zc implements AbstractC0268Dc<AbstractC1564jo> {
    C2643zc() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final /* synthetic */ void a(AbstractC1564jo joVar, Map map) {
        joVar.b(!Boolean.parseBoolean((String) map.get("disabled")));
    }
}
