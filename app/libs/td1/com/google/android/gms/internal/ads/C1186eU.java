package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.ads.C2013qU;
import com.google.android.gms.internal.ads.C2288uU;

/* renamed from: com.google.android.gms.internal.ads.eU  reason: case insensitive filesystem */
public final class C1186eU {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4214a;

    /* renamed from: b  reason: collision with root package name */
    private final Looper f4215b;

    public C1186eU(Context context, Looper looper) {
        this.f4214a = context;
        this.f4215b = looper;
    }

    public final void a(String str) {
        C2288uU.a n = C2288uU.n();
        n.a(this.f4214a.getPackageName());
        n.a(C2288uU.b.BLOCKED_IMPRESSION);
        C2013qU.b n2 = C2013qU.n();
        n2.a(str);
        n2.a(C2013qU.a.BLOCKED_REASON_BACKGROUND);
        n.a(n2);
        new C1462iU(this.f4214a, this.f4215b, (C2288uU) n.j()).a();
    }
}
