package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;

public final class AE implements Sea<BE> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<d> f1488a;

    public AE(_ea<d> _ea) {
        this.f1488a = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new BE(this.f1488a.get());
    }
}
