package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.kia  reason: case insensitive filesystem */
public final class C1622kia extends C1691lia {
    public final long Qa;
    public final List<C1829nia> Ra = new ArrayList();
    public final List<C1622kia> Sa = new ArrayList();

    public C1622kia(int i, long j) {
        super(i);
        this.Qa = j;
    }

    public final void a(C1622kia kia) {
        this.Sa.add(kia);
    }

    public final void a(C1829nia nia) {
        this.Ra.add(nia);
    }

    public final C1829nia d(int i) {
        int size = this.Ra.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1829nia nia = this.Ra.get(i2);
            if (nia.Pa == i) {
                return nia;
            }
        }
        return null;
    }

    public final C1622kia e(int i) {
        int size = this.Sa.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1622kia kia = this.Sa.get(i2);
            if (kia.Pa == i) {
                return kia;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.C1691lia
    public final String toString() {
        String c2 = C1691lia.c(this.Pa);
        String arrays = Arrays.toString(this.Ra.toArray());
        String arrays2 = Arrays.toString(this.Sa.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append(c2);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
