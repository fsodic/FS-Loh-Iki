package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.s;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ly  reason: case insensitive filesystem */
public final class C1714ly implements Sea<C1232ey> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Set<C0523Mx<s.a>>> f4918a;

    private C1714ly(_ea<Set<C0523Mx<s.a>>> _ea) {
        this.f4918a = _ea;
    }

    public static C1714ly a(_ea<Set<C0523Mx<s.a>>> _ea) {
        return new C1714ly(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1232ey(this.f4918a.get());
    }
}
