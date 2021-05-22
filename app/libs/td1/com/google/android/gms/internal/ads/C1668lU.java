package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.c.a;
import com.google.android.gms.internal.ads.C1511jB;
import java.nio.ByteBuffer;
import java.util.UUID;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.lU  reason: case insensitive filesystem */
public final class C1668lU implements AbstractC1806nU {

    /* renamed from: a  reason: collision with root package name */
    private static final C1511jB f4857a = C1511jB.v();

    C1668lU() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1806nU
    public final C1511jB a() {
        return f4857a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1806nU
    public final C1511jB a(Context context) {
        C1511jB.a u = C1511jB.u();
        a aVar = new a(context);
        aVar.c();
        a.C0023a b2 = aVar.b();
        String a2 = b2.a();
        if (a2 != null && a2.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(a2);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            a2 = Base64.encodeToString(bArr, 11);
        }
        if (a2 != null) {
            u.b(a2);
            u.a(b2.b());
            u.a(C1511jB.c.DEVICE_IDENTIFIER_ANDROID_AD_ID);
        }
        return (C1511jB) u.j();
    }
}
