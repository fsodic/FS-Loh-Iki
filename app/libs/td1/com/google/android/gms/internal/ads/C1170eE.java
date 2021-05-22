package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eE  reason: case insensitive filesystem */
public final class C1170eE implements AbstractC0650Ru, AbstractC0261Cv, AbstractC1093cw {

    /* renamed from: a  reason: collision with root package name */
    private final C1721mE f4181a;

    /* renamed from: b  reason: collision with root package name */
    private final C2272uE f4182b;

    public C1170eE(C1721mE mEVar, C2272uE uEVar) {
        this.f4181a = mEVar;
        this.f4182b = uEVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0261Cv
    public final void a() {
        this.f4181a.a().put("action", "loaded");
        this.f4182b.a(this.f4181a.a());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1093cw
    public final void a(BR br) {
        this.f4181a.a(br);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1093cw
    public final void a(C0715Uh uh) {
        this.f4181a.a(uh.f3269a);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0650Ru
    public final void c(int i) {
        this.f4181a.a().put("action", "ftl");
        this.f4181a.a().put("ftl", String.valueOf(i));
        this.f4182b.a(this.f4181a.a());
    }
}
