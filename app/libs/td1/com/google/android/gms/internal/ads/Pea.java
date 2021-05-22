package com.google.android.gms.internal.ads;

public final class Pea<T> implements Sea<T> {

    /* renamed from: a  reason: collision with root package name */
    private _ea<T> f2860a;

    public static <T> void a(_ea<T> _ea, _ea<T> _ea2) {
        Xea.a(_ea2);
        Pea pea = (Pea) _ea;
        if (pea.f2860a == null) {
            pea.f2860a = _ea2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final T get() {
        _ea<T> _ea = this.f2860a;
        if (_ea != null) {
            return _ea.get();
        }
        throw new IllegalStateException();
    }
}
