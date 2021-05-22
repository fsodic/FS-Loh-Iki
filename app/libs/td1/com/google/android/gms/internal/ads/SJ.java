package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.e;

final class SJ implements e {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1423hm f3069a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ BR f3070b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1941pR f3071c;
    private final /* synthetic */ ZJ d;
    private final /* synthetic */ QJ e;

    SJ(QJ qj, C1423hm hmVar, BR br, C1941pR pRVar, ZJ zj) {
        this.e = qj;
        this.f3069a = hmVar;
        this.f3070b = br;
        this.f3071c = pRVar;
        this.d = zj;
    }

    @Override // com.google.android.gms.ads.internal.e
    public final void a() {
    }

    @Override // com.google.android.gms.ads.internal.e
    public final void a(View view) {
        this.f3069a.b(this.e.d.a(this.f3070b, this.f3071c, view, this.d));
    }

    @Override // com.google.android.gms.ads.internal.e
    public final void b() {
    }
}
