package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.qB  reason: case insensitive filesystem */
public final /* synthetic */ class C1994qB implements AbstractC1187eV {

    /* renamed from: a  reason: collision with root package name */
    static final AbstractC1187eV f5294a = new C1994qB();

    private C1994qB() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1187eV
    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (BinderC0474La la : (List) obj) {
            if (la != null) {
                arrayList.add(la);
            }
        }
        return arrayList;
    }
}
