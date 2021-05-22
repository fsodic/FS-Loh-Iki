package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iz  reason: case insensitive filesystem */
public final class C1508iz implements Sea<C1302fz> {

    /* renamed from: a  reason: collision with root package name */
    private final C1302fz f4628a;

    private C1508iz(C1302fz fzVar) {
        this.f4628a = fzVar;
    }

    public static C1508iz a(C1302fz fzVar) {
        return new C1508iz(fzVar);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C1302fz fzVar = this.f4628a;
        if (fzVar != null) {
            Xea.a(fzVar, "Cannot return null from a non-@Nullable @Provides method");
            return fzVar;
        }
        throw null;
    }
}
