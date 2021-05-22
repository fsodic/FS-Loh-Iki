package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.In  reason: case insensitive filesystem */
public final class C0409In extends AbstractC2534xr {

    /* renamed from: c  reason: collision with root package name */
    static final C0409In f2273c = new C0409In();

    C0409In() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2534xr
    public final AbstractC0856Zs a(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new C0883_t() : "mvhd".equals(str) ? new C0235Bv() : new C0954av(str);
    }
}
