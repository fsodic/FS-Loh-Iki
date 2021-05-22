package com.google.android.gms.internal.ads;

public final class WJ implements Sea<S> {

    /* renamed from: a  reason: collision with root package name */
    private final TJ f3403a;

    private WJ(TJ tj) {
        this.f3403a = tj;
    }

    public static WJ a(TJ tj) {
        return new WJ(tj);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return this.f3403a.a();
    }
}
