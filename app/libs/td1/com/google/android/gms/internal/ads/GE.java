package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class GE implements Sea<Set<C0523Mx<AbstractC1093cw>>> {
    public static Set<C0523Mx<AbstractC1093cw>> a(DE de, NE ne, Executor executor) {
        Set<C0523Mx<AbstractC1093cw>> i = DE.i(ne, executor);
        Xea.a(i, "Cannot return null from a non-@Nullable @Provides method");
        return i;
    }
}
