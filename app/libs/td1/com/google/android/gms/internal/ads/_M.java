package com.google.android.gms.internal.ads;

public final class _M implements AbstractC1180eO<C0973bN> {

    /* renamed from: a  reason: collision with root package name */
    private final VW f3711a;

    /* renamed from: b  reason: collision with root package name */
    private final C1803nR f3712b;

    public _M(VW vw, C1803nR nRVar) {
        this.f3711a = vw;
        this.f3712b = nRVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<C0973bN> a() {
        return this.f3711a.a(new CallableC1111dN(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C0973bN b() {
        return new C0973bN(this.f3712b);
    }
}
