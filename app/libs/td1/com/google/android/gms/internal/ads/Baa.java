package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

final class Baa extends ThreadLocal<Cipher> {
    Baa() {
    }

    private static Cipher a() {
        try {
            return Xaa.f3508c.a("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Cipher initialValue() {
        return a();
    }
}
