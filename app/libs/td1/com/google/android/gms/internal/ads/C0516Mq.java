package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Mq  reason: case insensitive filesystem */
public final class C0516Mq implements Sea<C0849Zl> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<String> f2622a;

    public C0516Mq(_ea<String> _ea) {
        this.f2622a = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0849Zl zl = new C0849Zl(this.f2622a.get());
        Xea.a(zl, "Cannot return null from a non-@Nullable @Provides method");
        return zl;
    }
}
