package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Bc  reason: case insensitive filesystem */
final class C0216Bc implements AbstractC0268Dc<AbstractC1564jo> {
    C0216Bc() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final /* synthetic */ void a(AbstractC1564jo joVar, Map map) {
        AbstractC1564jo joVar2 = joVar;
        if (map.keySet().contains("start")) {
            joVar2.c(true);
        }
        if (map.keySet().contains("stop")) {
            joVar2.c(false);
        }
    }
}
