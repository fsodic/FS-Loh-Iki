package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.internal.ads.C1511jB;

public final class Afa extends AbstractCallableC1137dga {
    private final Activity i;
    private final View j;

    public Afa(C1823nfa nfa, String str, String str2, C1511jB.a aVar, int i2, int i3, View view, Activity activity) {
        super(nfa, str, str2, aVar, i2, 62);
        this.j = view;
        this.i = activity;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC1137dga
    public final void a() {
        if (this.j != null) {
            boolean booleanValue = ((Boolean) C2392voa.e().a(C2474x.zb)).booleanValue();
            Object[] objArr = (Object[]) this.f.invoke(null, this.j, this.i, Boolean.valueOf(booleanValue));
            synchronized (this.e) {
                this.e.i(((Long) objArr[0]).longValue());
                this.e.j(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.e.a((String) objArr[2]);
                }
            }
        }
    }
}
