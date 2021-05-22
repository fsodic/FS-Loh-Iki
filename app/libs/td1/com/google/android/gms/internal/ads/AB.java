package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

final /* synthetic */ class AB implements AbstractC1187eV {

    /* renamed from: a  reason: collision with root package name */
    static final AbstractC1187eV f1485a = new AB();

    private AB() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1187eV
    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (CB cb : (List) obj) {
            if (cb != null) {
                arrayList.add(cb);
            }
        }
        return arrayList;
    }
}
