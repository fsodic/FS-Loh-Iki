package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.iN  reason: case insensitive filesystem */
public final /* synthetic */ class C1455iN implements AbstractC1248fN {

    /* renamed from: a  reason: collision with root package name */
    private final C1179eN f4560a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList f4561b;

    C1455iN(C1179eN eNVar, ArrayList arrayList) {
        this.f4560a = eNVar;
        this.f4561b = arrayList;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final void a(Bundle bundle) {
        this.f4560a.a(this.f4561b, bundle);
    }
}
