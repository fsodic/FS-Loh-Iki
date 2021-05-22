package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class Kba implements Comparator<Iba> {
    Kba() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Iba iba, Iba iba2) {
        Iba iba3 = iba;
        Iba iba4 = iba2;
        Nba nba = (Nba) iba3.iterator();
        Nba nba2 = (Nba) iba4.iterator();
        while (nba.hasNext() && nba2.hasNext()) {
            int compare = Integer.compare(Iba.b(nba.nextByte()), Iba.b(nba2.nextByte()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(iba3.size(), iba4.size());
    }
}
