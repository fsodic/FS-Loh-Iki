package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ux  reason: case insensitive filesystem */
public final class C2333ux implements Sea<C1162dx> {

    /* renamed from: a  reason: collision with root package name */
    private final C1162dx f5773a;

    private C2333ux(C1162dx dxVar) {
        this.f5773a = dxVar;
    }

    public static C2333ux a(C1162dx dxVar) {
        return new C2333ux(dxVar);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C1162dx dxVar = this.f5773a;
        if (dxVar != null) {
            Xea.a(dxVar, "Cannot return null from a non-@Nullable @Provides method");
            return dxVar;
        }
        throw null;
    }
}
