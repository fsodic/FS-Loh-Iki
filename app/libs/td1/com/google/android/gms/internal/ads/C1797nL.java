package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nL  reason: case insensitive filesystem */
public final class C1797nL implements Sea<String> {

    /* renamed from: a  reason: collision with root package name */
    private final C1590kL f5032a;

    public C1797nL(C1590kL kLVar) {
        this.f5032a = kLVar;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        String b2 = this.f5032a.b();
        Xea.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
