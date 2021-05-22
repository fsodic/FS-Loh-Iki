package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class BX {

    /* renamed from: a  reason: collision with root package name */
    private C1125daa f1615a;

    private BX(C1125daa daa) {
        this.f1615a = daa;
    }

    static final BX a(C1125daa daa) {
        if (daa != null && daa.p() > 0) {
            return new BX(daa);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* access modifiers changed from: package-private */
    public final C1125daa a() {
        return this.f1615a;
    }

    public final String toString() {
        return QX.a(this.f1615a).toString();
    }
}
