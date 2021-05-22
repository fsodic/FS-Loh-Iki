package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final /* synthetic */ class CQ implements AbstractC1458iQ {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1897oi f1690a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1691b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1692c;

    CQ(AbstractC1897oi oiVar, String str, String str2) {
        this.f1690a = oiVar;
        this.f1691b = str;
        this.f1692c = str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1458iQ
    public final void a(Object obj) {
        AbstractC1897oi oiVar = this.f1690a;
        ((AbstractC0742Vi) obj).a(new BinderC1004bj(oiVar.getType(), oiVar.A()), this.f1691b, this.f1692c);
    }
}
