package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.o;

/* renamed from: com.google.android.gms.internal.ads.du  reason: case insensitive filesystem */
public final class C1159du implements Sea<C0523Mx<o>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0727Ut f4158a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C2329ut> f4159b;

    private C1159du(C0727Ut ut, _ea<C2329ut> _ea) {
        this.f4158a = ut;
        this.f4159b = _ea;
    }

    public static C1159du a(C0727Ut ut, _ea<C2329ut> _ea) {
        return new C1159du(ut, _ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f4159b.get(), C0875_l.f);
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
