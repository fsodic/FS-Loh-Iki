package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yN  reason: case insensitive filesystem */
public final class C2557yN implements Sea<C2626zN> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<String> f6074a;

    private C2557yN(_ea<String> _ea) {
        this.f6074a = _ea;
    }

    public static C2557yN a(_ea<String> _ea) {
        return new C2557yN(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C2626zN(this.f6074a.get());
    }
}
