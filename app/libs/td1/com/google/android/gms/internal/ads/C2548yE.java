package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yE  reason: case insensitive filesystem */
public final class C2548yE implements Sea<C2617zE> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<String> f6055a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C2272uE> f6056b;

    public C2548yE(_ea<String> _ea, _ea<C2272uE> _ea2) {
        this.f6055a = _ea;
        this.f6056b = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C2617zE(this.f6055a.get(), this.f6056b.get());
    }
}
