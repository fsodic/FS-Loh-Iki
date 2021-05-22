package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

final class NL implements AbstractC1180eO<AbstractC0905aO<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f2654a;

    NL(Set<String> set) {
        this.f2654a = set;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<AbstractC0905aO<Bundle>> a() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f2654a) {
            arrayList.add(str);
        }
        return JW.a(new ML(arrayList));
    }
}
