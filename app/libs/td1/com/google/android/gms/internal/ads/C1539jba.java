package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.ads.jba  reason: case insensitive filesystem */
public final class C1539jba implements CX {

    /* renamed from: a  reason: collision with root package name */
    private final Mac f4687a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4688b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4689c;
    private final Key d;

    public C1539jba(String str, Key key, int i) {
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        } else if (key.getEncoded().length >= 16) {
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1823053428) {
                if (hashCode != 392315118) {
                    if (hashCode == 392317873 && str.equals("HMACSHA512")) {
                        c2 = 2;
                    }
                } else if (str.equals("HMACSHA256")) {
                    c2 = 1;
                }
            } else if (str.equals("HMACSHA1")) {
                c2 = 0;
            }
            if (c2 != 0) {
                if (c2 != 1) {
                    if (c2 != 2) {
                        String valueOf = String.valueOf(str);
                        throw new NoSuchAlgorithmException(valueOf.length() != 0 ? "unknown Hmac algorithm: ".concat(valueOf) : new String("unknown Hmac algorithm: "));
                    } else if (i > 64) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                } else if (i > 32) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
            } else if (i > 20) {
                throw new InvalidAlgorithmParameterException("tag size too big");
            }
            this.f4689c = str;
            this.f4688b = i;
            this.d = key;
            this.f4687a = Xaa.d.a(str);
            this.f4687a.init(key);
        } else {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.CX
    public final byte[] a(byte[] bArr) {
        Mac mac;
        try {
            mac = (Mac) this.f4687a.clone();
        } catch (CloneNotSupportedException unused) {
            mac = Xaa.d.a(this.f4689c);
            mac.init(this.d);
        }
        mac.update(bArr);
        byte[] bArr2 = new byte[this.f4688b];
        System.arraycopy(mac.doFinal(), 0, bArr2, 0, this.f4688b);
        return bArr2;
    }
}
