package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.vW  reason: case insensitive filesystem */
public final class C2359vW<V> extends AbstractC2152sW<V, List<V>> {
    C2359vW(AbstractC2634zV<? extends SW<? extends V>> zVVar, boolean z) {
        super(zVVar, true);
        k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2152sW
    public final /* synthetic */ Object a(List list) {
        ArrayList a2 = JV.a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2290uW uWVar = (C2290uW) it.next();
            a2.add(uWVar != null ? uWVar.f5726a : null);
        }
        return Collections.unmodifiableList(a2);
    }
}
