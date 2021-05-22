package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;

/* renamed from: com.google.android.gms.internal.ads.gs  reason: case insensitive filesystem */
final /* synthetic */ class C1364gs implements AbstractC0261Cv {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4436a;

    /* renamed from: b  reason: collision with root package name */
    private final C0823Yl f4437b;

    /* renamed from: c  reason: collision with root package name */
    private final C1941pR f4438c;
    private final GR d;

    C1364gs(Context context, C0823Yl yl, C1941pR pRVar, GR gr) {
        this.f4436a = context;
        this.f4437b = yl;
        this.f4438c = pRVar;
        this.d = gr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0261Cv
    public final void a() {
        q.m().b(this.f4436a, this.f4437b.f3587a, this.f4438c.z.toString(), this.d.f);
    }
}
