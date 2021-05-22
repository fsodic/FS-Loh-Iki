package com.google.android.gms.internal.ads;

public final class UL implements AbstractC1180eO<VL> {

    /* renamed from: a  reason: collision with root package name */
    private final VW f3237a;

    /* renamed from: b  reason: collision with root package name */
    private final GR f3238b;

    public UL(VW vw, GR gr) {
        this.f3237a = vw;
        this.f3238b = gr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<VL> a() {
        return this.f3237a.a(new XL(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ VL b() {
        return new VL(this.f3238b.j);
    }
}
