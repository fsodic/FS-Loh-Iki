package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

public final class HS {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<EnumC2493xS, FS<? extends C0952at>> f2132a = new HashMap<>();

    public final <AdT extends C0952at> FS<AdT> a(EnumC2493xS xSVar, Context context, C1873oS oSVar, OS<AdT> os) {
        FS<AdT> fs = (FS<AdT>) this.f2132a.get(xSVar);
        if (fs != null) {
            return fs;
        }
        C2286uS uSVar = new C2286uS(C2562yS.a(xSVar, context));
        FS<AdT> fs2 = new FS<>(uSVar, new LS(uSVar, oSVar, os));
        this.f2132a.put(xSVar, fs2);
        return fs2;
    }
}
