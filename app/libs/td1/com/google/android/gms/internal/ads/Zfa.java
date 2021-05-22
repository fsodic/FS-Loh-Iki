package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.internal.ads.C1511jB;

public final class Zfa extends AbstractCallableC1137dga {
    private final View i;

    public Zfa(C1823nfa nfa, String str, String str2, C1511jB.a aVar, int i2, int i3, View view) {
        super(nfa, str, str2, aVar, i2, 57);
        this.i = view;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC1137dga
    public final void a() {
        if (this.i != null) {
            Boolean bool = (Boolean) C2392voa.e().a(C2474x.Pb);
            DisplayMetrics displayMetrics = this.f4125b.a().getResources().getDisplayMetrics();
            C2443wfa wfa = new C2443wfa((String) this.f.invoke(null, this.i, displayMetrics, bool));
            C1511jB.f.a n = C1511jB.f.n();
            n.a(wfa.f5905b.longValue());
            n.b(wfa.f5906c.longValue());
            n.c(wfa.d.longValue());
            if (bool.booleanValue()) {
                n.d(wfa.e.longValue());
            }
            this.e.a((C1511jB.f) n.j());
        }
    }
}
