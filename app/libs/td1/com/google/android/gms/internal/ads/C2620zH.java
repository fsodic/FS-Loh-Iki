package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.zH  reason: case insensitive filesystem */
public final /* synthetic */ class C2620zH implements AbstractC0804Xs {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1564jo f6166a;

    private C2620zH(AbstractC1564jo joVar) {
        this.f6166a = joVar;
    }

    static AbstractC0804Xs a(AbstractC1564jo joVar) {
        return new C2620zH(joVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0804Xs
    public final AbstractC2532xpa getVideoController() {
        return this.f6166a.E();
    }
}
