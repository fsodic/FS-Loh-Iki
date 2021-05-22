package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.kJ  reason: case insensitive filesystem */
public final /* synthetic */ class C1588kJ implements AbstractC1187eV {

    /* renamed from: a  reason: collision with root package name */
    private final C1313gJ f4754a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC1564jo f4755b;

    /* renamed from: c  reason: collision with root package name */
    private final C1941pR f4756c;
    private final BC d;

    C1588kJ(C1313gJ gJVar, AbstractC1564jo joVar, C1941pR pRVar, BC bc) {
        this.f4754a = gJVar;
        this.f4755b = joVar;
        this.f4756c = pRVar;
        this.d = bc;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1187eV
    public final Object apply(Object obj) {
        AbstractC1564jo joVar = this.f4755b;
        C1941pR pRVar = this.f4756c;
        BC bc = this.d;
        if (pRVar.E) {
            joVar.g();
        }
        joVar.p();
        if (((Boolean) C2392voa.e().a(C2474x.ka)).booleanValue()) {
            q.e();
            C0224Bk.a(joVar);
        }
        return bc.k();
    }
}
