package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.yaa  reason: case insensitive filesystem */
public final class C2571yaa implements AbstractC1333gba {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f6103a = new Baa();

    /* renamed from: b  reason: collision with root package name */
    private final SecretKeySpec f6104b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6105c;
    private final int d = f6103a.get().getBlockSize();

    public C2571yaa(byte[] bArr, int i) {
        C1746mba.a(bArr.length);
        this.f6104b = new SecretKeySpec(bArr, "AES");
        if (i < 12 || i > this.d) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f6105c = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1333gba
    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i = this.f6105c;
        if (length <= Integer.MAX_VALUE - i) {
            byte[] bArr2 = new byte[(bArr.length + i)];
            byte[] a2 = C1677lba.a(i);
            System.arraycopy(a2, 0, bArr2, 0, this.f6105c);
            int length2 = bArr.length;
            int i2 = this.f6105c;
            Cipher cipher = f6103a.get();
            byte[] bArr3 = new byte[this.d];
            System.arraycopy(a2, 0, bArr3, 0, this.f6105c);
            cipher.init(1, this.f6104b, new IvParameterSpec(bArr3));
            if (cipher.doFinal(bArr, 0, length2, bArr2, i2) == length2) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        int i3 = Integer.MAX_VALUE - i;
        StringBuilder sb = new StringBuilder(43);
        sb.append("plaintext length can not exceed ");
        sb.append(i3);
        throw new GeneralSecurityException(sb.toString());
    }
}
