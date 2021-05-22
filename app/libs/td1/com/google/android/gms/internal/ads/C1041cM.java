package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.cM  reason: case insensitive filesystem */
final /* synthetic */ class C1041cM implements AbstractC0905aO {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f3985a;

    C1041cM(ArrayList arrayList) {
        this.f3985a = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final void a(Object obj) {
        ((Bundle) obj).putStringArrayList("android_permissions", this.f3985a);
    }
}
