package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.ads.fba  reason: case insensitive filesystem */
public final class C1264fba implements _aa<MessageDigest> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads._aa
    public final /* synthetic */ MessageDigest a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
