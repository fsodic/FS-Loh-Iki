package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Signature;

/* renamed from: com.google.android.gms.internal.ads.eba  reason: case insensitive filesystem */
public final class C1195eba implements _aa<Signature> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads._aa
    public final /* synthetic */ Signature a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
