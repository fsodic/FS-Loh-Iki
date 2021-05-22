package com.google.android.gms.internal.ads;

import java.util.ArrayList;

final /* synthetic */ class YL implements AbstractC1187eV {

    /* renamed from: a  reason: collision with root package name */
    static final AbstractC1187eV f3552a = new YL();

    private YL() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1187eV
    public final Object apply(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1041cM(arrayList);
    }
}
