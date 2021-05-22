package com.google.android.gms.internal.ads;

import java.util.Set;

public final class PL implements Sea<NL> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Set<String>> f2820a;

    private PL(_ea<Set<String>> _ea) {
        this.f2820a = _ea;
    }

    public static NL a(Set<String> set) {
        return new NL(set);
    }

    public static PL a(_ea<Set<String>> _ea) {
        return new PL(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f2820a.get());
    }
}
