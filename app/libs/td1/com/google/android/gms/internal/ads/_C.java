package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final /* synthetic */ class _C implements AbstractC0878_o {

    /* renamed from: a  reason: collision with root package name */
    private final C1423hm f3695a;

    _C(C1423hm hmVar) {
        this.f3695a = hmVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0878_o
    public final void a(boolean z) {
        C1423hm hmVar = this.f3695a;
        if (z) {
            hmVar.b(null);
        } else {
            hmVar.a(new Exception("Ad Web View failed to load."));
        }
    }
}
