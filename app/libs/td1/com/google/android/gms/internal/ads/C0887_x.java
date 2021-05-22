package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads._x  reason: case insensitive filesystem */
public final class C0887_x implements Sea<C0783Wx> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Set<C0523Mx<AbstractC0528Nc>>> f3775a;

    public C0887_x(_ea<Set<C0523Mx<AbstractC0528Nc>>> _ea) {
        this.f3775a = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0783Wx(this.f3775a.get());
    }
}
