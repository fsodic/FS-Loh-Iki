package com.google.android.gms.internal.ads;

public final class QA implements Sea<RA> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0707Tz> f2902a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0811Xz> f2903b;

    public QA(_ea<C0707Tz> _ea, _ea<C0811Xz> _ea2) {
        this.f2902a = _ea;
        this.f2903b = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new RA(this.f2902a.get(), this.f2903b.get());
    }
}
