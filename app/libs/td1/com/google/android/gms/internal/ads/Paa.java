package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.interfaces.ECPublicKey;

public final class Paa implements AbstractC2153sX {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f2844a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    private final Saa f2845b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2846c;
    private final byte[] d;
    private final Vaa e;
    private final Naa f;

    public Paa(ECPublicKey eCPublicKey, byte[] bArr, String str, Vaa vaa, Naa naa) {
        Uaa.a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f2845b = new Saa(eCPublicKey);
        this.d = bArr;
        this.f2846c = str;
        this.e = vaa;
        this.f = naa;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2153sX
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        Qaa a2 = this.f2845b.a(this.f2846c, this.d, bArr2, this.f.a(), this.e);
        byte[] a3 = this.f.a(a2.b()).a(bArr, f2844a);
        byte[] a4 = a2.a();
        return ByteBuffer.allocate(a4.length + a3.length).put(a4).put(a3).array();
    }
}
