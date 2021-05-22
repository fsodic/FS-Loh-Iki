package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.g;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.AbstractC1487ik;
import com.google.android.gms.internal.ads.C0224Bk;
import com.google.android.gms.internal.ads.C2452wk;

final class l extends AbstractC1487ik {
    final /* synthetic */ c d;

    private l(c cVar) {
        this.d = cVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1487ik
    public final void a() {
        Bitmap a2 = q.v().a(Integer.valueOf(this.d.f1101c.o.f));
        if (a2 != null) {
            C0224Bk e = q.e();
            c cVar = this.d;
            Activity activity = cVar.f1100b;
            g gVar = cVar.f1101c.o;
            C2452wk.f5921a.post(new k(this, e.a(activity, a2, gVar.d, gVar.e)));
        }
    }
}
