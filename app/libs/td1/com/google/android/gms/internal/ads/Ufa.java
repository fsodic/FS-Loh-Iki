package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1511jB;
import java.util.List;

public final class Ufa extends AbstractCallableC1137dga {
    private List<Long> i = null;

    public Ufa(C1823nfa nfa, String str, String str2, C1511jB.a aVar, int i2, int i3) {
        super(nfa, str, str2, aVar, i2, 31);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC1137dga
    public final void a() {
        this.e.x(-1);
        this.e.y(-1);
        if (this.i == null) {
            this.i = (List) this.f.invoke(null, this.f4125b.a());
        }
        List<Long> list = this.i;
        if (list != null && list.size() == 2) {
            synchronized (this.e) {
                this.e.x(this.i.get(0).longValue());
                this.e.y(this.i.get(1).longValue());
            }
        }
    }
}
