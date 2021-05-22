package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

final /* synthetic */ class ML implements AbstractC0905aO {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f2575a;

    ML(ArrayList arrayList) {
        this.f2575a = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final void a(Object obj) {
        ((Bundle) obj).putStringArrayList("ad_types", this.f2575a);
    }
}
