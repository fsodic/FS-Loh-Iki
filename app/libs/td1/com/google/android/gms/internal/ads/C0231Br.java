package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Br  reason: case insensitive filesystem */
public final class C0231Br implements Sea<C0686Te> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0556Oe> f1659a;

    private C0231Br(_ea<C0556Oe> _ea) {
        this.f1659a = _ea;
    }

    public static C0231Br a(_ea<C0556Oe> _ea) {
        return new C0231Br(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0686Te a2 = this.f1659a.get().a();
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
