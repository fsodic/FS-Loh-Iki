package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.o;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Nv  reason: case insensitive filesystem */
public final class C0547Nv implements Sea<C0469Kv> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Set<C0523Mx<o>>> f2711a;

    private C0547Nv(_ea<Set<C0523Mx<o>>> _ea) {
        this.f2711a = _ea;
    }

    public static C0547Nv a(_ea<Set<C0523Mx<o>>> _ea) {
        return new C0547Nv(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0469Kv(this.f2711a.get());
    }
}
