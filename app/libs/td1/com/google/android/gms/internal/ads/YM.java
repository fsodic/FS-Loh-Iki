package com.google.android.gms.internal.ads;

public final class YM implements Sea<WM> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<VW> f3553a;

    private YM(_ea<VW> _ea) {
        this.f3553a = _ea;
    }

    public static YM a(_ea<VW> _ea) {
        return new YM(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new WM(this.f3553a.get());
    }
}
