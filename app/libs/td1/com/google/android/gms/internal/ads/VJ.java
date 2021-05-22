package com.google.android.gms.internal.ads;

public final class VJ implements Sea<TJ> {

    /* renamed from: a  reason: collision with root package name */
    private final TJ f3328a;

    private VJ(TJ tj) {
        this.f3328a = tj;
    }

    public static VJ a(TJ tj) {
        return new VJ(tj);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        TJ tj = this.f3328a;
        if (tj != null) {
            Xea.a(tj, "Cannot return null from a non-@Nullable @Provides method");
            return tj;
        }
        throw null;
    }
}
