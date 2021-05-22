package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.a.a;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Ow  reason: case insensitive filesystem */
public final class C0574Ow implements Sea<C0522Mw> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Set<C0523Mx<a>>> f2799a;

    private C0574Ow(_ea<Set<C0523Mx<a>>> _ea) {
        this.f2799a = _ea;
    }

    public static C0574Ow a(_ea<Set<C0523Mx<a>>> _ea) {
        return new C0574Ow(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0522Mw(this.f2799a.get());
    }
}
