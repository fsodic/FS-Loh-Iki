package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Cipher;

public final class Zaa implements _aa<Cipher> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads._aa
    public final /* synthetic */ Cipher a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
