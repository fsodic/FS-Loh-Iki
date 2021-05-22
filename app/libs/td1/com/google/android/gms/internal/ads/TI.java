package com.google.android.gms.internal.ads;

public final class TI implements Sea<QI> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<OR> f3161a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1445iD> f3162b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C1859oE> f3163c;

    private TI(_ea<OR> _ea, _ea<C1445iD> _ea2, _ea<C1859oE> _ea3) {
        this.f3161a = _ea;
        this.f3162b = _ea2;
        this.f3163c = _ea3;
    }

    public static TI a(_ea<OR> _ea, _ea<C1445iD> _ea2, _ea<C1859oE> _ea3) {
        return new TI(_ea, _ea2, _ea3);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new QI(this.f3161a.get(), this.f3162b.get(), this.f3163c.get());
    }
}
