package com.google.android.gms.internal.ads;

public final class SO implements AbstractC1180eO<TO> {

    /* renamed from: a  reason: collision with root package name */
    private AbstractC0613Qj f3079a;

    /* renamed from: b  reason: collision with root package name */
    private VW f3080b;

    /* renamed from: c  reason: collision with root package name */
    private String f3081c;

    public SO(AbstractC0613Qj qj, VW vw, String str) {
        this.f3079a = qj;
        this.f3080b = vw;
        this.f3081c = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<TO> a() {
        new C1423hm();
        SW<String> a2 = JW.a((Object) null);
        if (((Boolean) C2392voa.e().a(C2474x.Ld)).booleanValue()) {
            a2 = this.f3079a.a(this.f3081c);
        }
        SW<String> b2 = this.f3079a.b(this.f3081c);
        return JW.b(a2, b2).a(new VO(a2, b2), C0875_l.f3755a);
    }
}
