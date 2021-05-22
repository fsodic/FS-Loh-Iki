package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.vv  reason: case insensitive filesystem */
public final class C2400vv implements Sea<C1780mv> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Set<C0523Mx<AbstractC0520Mu>>> f5854a;

    private C2400vv(_ea<Set<C0523Mx<AbstractC0520Mu>>> _ea) {
        this.f5854a = _ea;
    }

    public static C2400vv a(_ea<Set<C0523Mx<AbstractC0520Mu>>> _ea) {
        return new C2400vv(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1780mv(this.f5854a.get());
    }
}
