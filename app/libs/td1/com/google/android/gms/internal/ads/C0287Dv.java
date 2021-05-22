package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.g.a;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Dv  reason: case insensitive filesystem */
public final class C0287Dv implements Sea<C0209Av> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Set<C0523Mx<a>>> f1834a;

    private C0287Dv(_ea<Set<C0523Mx<a>>> _ea) {
        this.f1834a = _ea;
    }

    public static C0287Dv a(_ea<Set<C0523Mx<a>>> _ea) {
        return new C0287Dv(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0209Av(this.f1834a.get());
    }
}
