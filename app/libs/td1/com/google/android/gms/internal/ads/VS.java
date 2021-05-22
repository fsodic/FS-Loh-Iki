package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class VS implements Sea<Executor> {
    public static VS a() {
        return US.a();
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        VW vw = C0875_l.e;
        Xea.a(vw, "Cannot return null from a non-@Nullable @Provides method");
        return vw;
    }
}
