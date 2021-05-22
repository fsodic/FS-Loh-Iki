package com.google.android.gms.internal.ads;

public final class UM implements Sea<SM> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<VW> f3239a;

    private UM(_ea<VW> _ea) {
        this.f3239a = _ea;
    }

    public static UM a(_ea<VW> _ea) {
        return new UM(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new SM(this.f3239a.get());
    }
}
