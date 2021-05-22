package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sJ  reason: case insensitive filesystem */
final class C2139sJ implements AbstractC1095cy {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ BR f5498a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1941pR f5499b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1931pH f5500c;
    final /* synthetic */ C2002qJ d;

    C2139sJ(C2002qJ qJVar, BR br, C1941pR pRVar, C1931pH pHVar) {
        this.d = qJVar;
        this.f5498a = br;
        this.f5499b = pRVar;
        this.f5500c = pHVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1095cy
    public final void Q() {
        C2002qJ.a(this.d).execute(new RunnableC2346vJ(this, this.f5498a, this.f5499b, this.f5500c));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1095cy
    public final void a(int i) {
        String valueOf = String.valueOf(this.f5500c.f5210a);
        C0745Vl.d(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "));
    }
}
