package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;

/* renamed from: com.google.android.gms.internal.ads.xl  reason: case insensitive filesystem */
public final class C2523xl extends AbstractC1487ik {
    private final C0849Zl d;
    private final String e;

    public C2523xl(Context context, String str, String str2) {
        this(str2, q.c().b(context, str));
    }

    private C2523xl(String str, String str2) {
        this.d = new C0849Zl(str2);
        this.e = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1487ik
    public final void a() {
        this.d.a(this.e);
    }
}
