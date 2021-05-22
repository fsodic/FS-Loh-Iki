package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class Yca implements Zca {
    Yca() {
    }

    @Override // com.google.android.gms.internal.ads.Zca
    public final int a(int i, Object obj, Object obj2) {
        Wca wca = (Wca) obj;
        Uca uca = (Uca) obj2;
        if (wca.isEmpty()) {
            return 0;
        }
        Iterator it = wca.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.Zca
    public final Xca<?, ?> a(Object obj) {
        Uca uca = (Uca) obj;
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.Zca
    public final Object a(Object obj, Object obj2) {
        Wca wca = (Wca) obj;
        Wca wca2 = (Wca) obj2;
        if (!wca2.isEmpty()) {
            if (!wca.c()) {
                wca = wca.f();
            }
            wca.a(wca2);
        }
        return wca;
    }

    @Override // com.google.android.gms.internal.ads.Zca
    public final Map<?, ?> b(Object obj) {
        return (Wca) obj;
    }

    @Override // com.google.android.gms.internal.ads.Zca
    public final boolean c(Object obj) {
        return !((Wca) obj).c();
    }

    @Override // com.google.android.gms.internal.ads.Zca
    public final Object d(Object obj) {
        ((Wca) obj).d();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.Zca
    public final Object e(Object obj) {
        return Wca.e().f();
    }

    @Override // com.google.android.gms.internal.ads.Zca
    public final Map<?, ?> f(Object obj) {
        return (Wca) obj;
    }
}
