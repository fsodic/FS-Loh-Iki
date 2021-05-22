package com.google.android.gms.internal.ads;

final /* synthetic */ class IH implements AbstractC0804Xs {

    /* renamed from: a  reason: collision with root package name */
    private final SR f2206a;

    private IH(SR sr) {
        this.f2206a = sr;
    }

    static AbstractC0804Xs a(SR sr) {
        return new IH(sr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0804Xs
    public final AbstractC2532xpa getVideoController() {
        return this.f2206a.b();
    }
}
