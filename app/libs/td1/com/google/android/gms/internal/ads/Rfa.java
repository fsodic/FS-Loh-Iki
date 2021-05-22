package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

final class Rfa extends C2102rha {

    /* renamed from: b  reason: collision with root package name */
    private byte[] f3031b;

    public Rfa(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f3031b = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.f3031b;
    }
}
