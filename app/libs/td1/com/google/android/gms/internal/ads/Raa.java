package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.C1511jB;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class Raa extends C1810nY {
    private Raa(Context context, String str, boolean z, int i) {
        super(context, str, z, i);
    }

    public static Raa a(String str, Context context, boolean z) {
        return b(str, context, false, XJ.f3487a);
    }

    public static Raa b(String str, Context context, boolean z, int i) {
        C1810nY.a(context, z);
        C1810nY.a(str, context, z, i);
        return new Raa(context, str, z, i);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.C1810nY
    public final List<Callable<Void>> a(C1823nfa nfa, Context context, C1511jB.a aVar, C0289Dx dx) {
        if (nfa.e() == null || !this.B) {
            return super.a(nfa, context, aVar, dx);
        }
        int c2 = nfa.c();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.a(nfa, context, aVar, dx));
        arrayList.add(new Ifa(nfa, "dB9nU8T59ryKJmWsX8227JmprxMTr/BJUpIu7gXDsZZaHmbsnoTSiUl5TzUnFlE8", "5lhN2r0HBs7T9NDv68OqYdEED6z/p5KbOT380l1QTlE=", aVar, c2, 24));
        return arrayList;
    }
}
