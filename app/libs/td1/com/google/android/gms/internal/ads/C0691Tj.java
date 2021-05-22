package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.c.a;

/* renamed from: com.google.android.gms.internal.ads.Tj  reason: case insensitive filesystem */
public final class C0691Tj implements AbstractC0743Vj {
    @Override // com.google.android.gms.internal.ads.AbstractC0743Vj
    public final SW<a.C0023a> a(Context context) {
        C1423hm hmVar = new C1423hm();
        C2392voa.a();
        if (C0459Kl.c(context)) {
            C0875_l.f3755a.execute(new RunnableC0769Wj(this, context, hmVar));
        }
        return hmVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0743Vj
    public final SW<String> a(Context context, int i) {
        return JW.a((Object) null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0743Vj
    public final SW<String> a(String str, PackageInfo packageInfo) {
        return JW.a(str);
    }
}
