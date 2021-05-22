package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Ye  reason: case insensitive filesystem */
public final /* synthetic */ class C0816Ye implements AbstractC1187eV {

    /* renamed from: a  reason: collision with root package name */
    private final String f3573a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0268Dc f3574b;

    C0816Ye(String str, AbstractC0268Dc dc) {
        this.f3573a = str;
        this.f3574b = dc;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1187eV
    public final Object apply(Object obj) {
        AbstractC0244Ce ce = (AbstractC0244Ce) obj;
        ce.b(this.f3573a, this.f3574b);
        return ce;
    }
}
