package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cr  reason: case insensitive filesystem */
public final class C1088cr implements Sea<C0880_q> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<AbstractC1901ok> f4038a;

    private C1088cr(_ea<AbstractC1901ok> _ea) {
        this.f4038a = _ea;
    }

    public static C1088cr a(_ea<AbstractC1901ok> _ea) {
        return new C1088cr(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0880_q(this.f4038a.get());
    }
}
