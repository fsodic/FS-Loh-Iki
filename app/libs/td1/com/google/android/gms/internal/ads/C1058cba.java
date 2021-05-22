package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.ads.cba  reason: case insensitive filesystem */
public final class C1058cba implements _aa<Mac> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads._aa
    public final /* synthetic */ Mac a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
