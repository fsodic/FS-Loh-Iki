package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.b.g;
import b.c.b.a.b.h;
import com.google.android.gms.ads.c.a;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.nk  reason: case insensitive filesystem */
public final class C1832nk extends AbstractC1487ik {
    private Context d;

    C1832nk(Context context) {
        this.d = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1487ik
    public final void a() {
        boolean z;
        try {
            z = a.b(this.d);
        } catch (g | h | IOException | IllegalStateException e) {
            C0745Vl.b("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        C0563Ol.a(z);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        C0745Vl.d(sb.toString());
    }
}
