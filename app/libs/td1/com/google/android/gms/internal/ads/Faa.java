package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Faa implements AbstractC1947pX {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f1968a = new Eaa();

    /* renamed from: b  reason: collision with root package name */
    private final SecretKey f1969b;

    public Faa(byte[] bArr) {
        C1746mba.a(bArr.length);
        this.f1969b = new SecretKeySpec(bArr, "AES");
    }

    private static AlgorithmParameterSpec a(byte[] bArr, int i, int i2) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i2);
        } catch (ClassNotFoundException unused) {
            if (C1815nba.a()) {
                return new IvParameterSpec(bArr, 0, i2);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1947pX
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            byte[] a2 = C1677lba.a(12);
            System.arraycopy(a2, 0, bArr3, 0, 12);
            f1968a.get().init(1, this.f1969b, a(a2, 0, a2.length));
            if (!(bArr2 == null || bArr2.length == 0)) {
                f1968a.get().updateAAD(bArr2);
            }
            int doFinal = f1968a.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr.length)));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
