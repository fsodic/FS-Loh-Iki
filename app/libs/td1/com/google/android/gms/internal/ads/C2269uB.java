package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.uB  reason: case insensitive filesystem */
public final /* synthetic */ class C2269uB implements AbstractC2221tW {

    /* renamed from: a  reason: collision with root package name */
    private final SW f5689a;

    C2269uB(SW sw) {
        this.f5689a = sw;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final SW b(Object obj) {
        SW sw = this.f5689a;
        AbstractC1564jo joVar = (AbstractC1564jo) obj;
        if (joVar != null && joVar.E() != null) {
            return sw;
        }
        throw new SI(YR.f3560a, "Retrieve video view in instream ad response failed.");
    }
}
