package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* access modifiers changed from: package-private */
public final class Mla implements Comparator<Sla> {
    Mla(Nla nla) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Sla sla, Sla sla2) {
        Sla sla3 = sla;
        Sla sla4 = sla2;
        int i = sla3.f3124c - sla4.f3124c;
        return i != 0 ? i : (int) (sla3.f3122a - sla4.f3122a);
    }
}
