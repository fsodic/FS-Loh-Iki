package com.google.android.gms.internal.ads;

import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.mC  reason: case insensitive filesystem */
public final class C1719mC implements GW<AbstractC1564jo> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f4921a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Map f4922b;

    C1719mC(C1306gC gCVar, String str, Map map) {
        this.f4921a = str;
        this.f4922b = map;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.GW
    public final /* synthetic */ void a(AbstractC1564jo joVar) {
        joVar.a(this.f4921a, this.f4922b);
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
    }
}
