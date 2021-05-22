package com.google.android.gms.internal.ads;

public final class XG implements Sea<YG> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1036cH> f3482a;

    private XG(_ea<C1036cH> _ea) {
        this.f3482a = _ea;
    }

    public static XG a(_ea<C1036cH> _ea) {
        return new XG(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new YG(this.f3482a.get());
    }
}
