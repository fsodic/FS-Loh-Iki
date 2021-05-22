package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lz  reason: case insensitive filesystem */
public final class C1715lz implements Sea<C1098dA> {

    /* renamed from: a  reason: collision with root package name */
    private final C1302fz f4919a;

    private C1715lz(C1302fz fzVar) {
        this.f4919a = fzVar;
    }

    public static C1715lz a(C1302fz fzVar) {
        return new C1715lz(fzVar);
    }

    public static C1098dA b(C1302fz fzVar) {
        C1098dA a2 = fzVar.a();
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return b(this.f4919a);
    }
}
