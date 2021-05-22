package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.nu  reason: case insensitive filesystem */
final /* synthetic */ class C1848nu implements AbstractC1187eV {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5088a;

    /* renamed from: b  reason: collision with root package name */
    private final C0823Yl f5089b;

    /* renamed from: c  reason: collision with root package name */
    private final GR f5090c;

    C1848nu(Context context, C0823Yl yl, GR gr) {
        this.f5088a = context;
        this.f5089b = yl;
        this.f5090c = gr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1187eV
    public final Object apply(Object obj) {
        Context context = this.f5088a;
        C0823Yl yl = this.f5089b;
        GR gr = this.f5090c;
        C1941pR pRVar = (C1941pR) obj;
        C0536Nk nk = new C0536Nk(context);
        nk.c(pRVar.y);
        nk.d(pRVar.z.toString());
        nk.b(yl.f3587a);
        nk.a(gr.f);
        return nk;
    }
}
