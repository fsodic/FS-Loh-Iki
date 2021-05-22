package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Pp  reason: case insensitive filesystem */
public final class C0593Pp implements Sea<HashMap<String, HG>> {
    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        HashMap hashMap = new HashMap();
        Xea.a(hashMap, "Cannot return null from a non-@Nullable @Provides method");
        return hashMap;
    }
}
