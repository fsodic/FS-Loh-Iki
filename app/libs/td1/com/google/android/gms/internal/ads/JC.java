package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Oma;

public final class JC implements Sea<Oma.a> {
    public static JC a() {
        return IC.a();
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Oma.a aVar = Oma.a.REWARD_BASED_VIDEO_AD;
        Xea.a(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }
}
