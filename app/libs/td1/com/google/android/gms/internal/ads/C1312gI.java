package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.g;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.ads.internal.overlay.t;
import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.gI  reason: case insensitive filesystem */
public final class C1312gI implements AbstractC0732Uy {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4370a;

    /* renamed from: b  reason: collision with root package name */
    private final C0823Yl f4371b;

    /* renamed from: c  reason: collision with root package name */
    private final SW<AbstractC2127ry> f4372c;
    private final C1941pR d;
    private final AbstractC1564jo e;

    private C1312gI(Context context, C0823Yl yl, SW<AbstractC2127ry> sw, C1941pR pRVar, AbstractC1564jo joVar) {
        this.f4370a = context;
        this.f4371b = yl;
        this.f4372c = sw;
        this.d = pRVar;
        this.e = joVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0732Uy
    public final void a(boolean z, Context context) {
        this.e.d(true);
        q.c();
        g gVar = new g(false, C2452wk.n(this.f4370a), false, 0.0f, -1, z, this.d.G, false);
        q.b();
        C0472Ky k = ((AbstractC2127ry) JW.b(this.f4372c)).k();
        AbstractC1564jo joVar = this.e;
        C1941pR pRVar = this.d;
        int i = pRVar.I;
        C0823Yl yl = this.f4371b;
        String str = pRVar.y;
        C2216tR tRVar = pRVar.p;
        n.a(context, new AdOverlayInfoParcel((Ona) null, k, (t) null, joVar, i, yl, str, gVar, tRVar.f5610b, tRVar.f5609a), true);
    }
}
