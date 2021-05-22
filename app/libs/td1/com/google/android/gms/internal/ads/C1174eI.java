package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.eI  reason: case insensitive filesystem */
public final /* synthetic */ class C1174eI implements AbstractC1187eV {

    /* renamed from: a  reason: collision with root package name */
    private final C0899aI f4192a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC1564jo f4193b;

    /* renamed from: c  reason: collision with root package name */
    private final C1941pR f4194c;
    private final AbstractC2127ry d;

    C1174eI(C0899aI aIVar, AbstractC1564jo joVar, C1941pR pRVar, AbstractC2127ry ryVar) {
        this.f4192a = aIVar;
        this.f4193b = joVar;
        this.f4194c = pRVar;
        this.d = ryVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1187eV
    public final Object apply(Object obj) {
        AbstractC1564jo joVar = this.f4193b;
        C1941pR pRVar = this.f4194c;
        AbstractC2127ry ryVar = this.d;
        if (pRVar.E) {
            joVar.g();
        }
        joVar.p();
        if (((Boolean) C2392voa.e().a(C2474x.ka)).booleanValue()) {
            q.e();
            C0224Bk.a(joVar);
        }
        return ryVar.i();
    }
}
