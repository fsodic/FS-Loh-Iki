package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.ads.aba  reason: case insensitive filesystem */
public final class C0920aba implements _aa<KeyFactory> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads._aa
    public final /* synthetic */ KeyFactory a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
