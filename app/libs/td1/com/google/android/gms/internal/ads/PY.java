package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class PY {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2837a = new KY().a();
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    private static final C2088raa f2838b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    private static final C2088raa f2839c;
    @Deprecated
    private static final C2088raa d = f2838b;

    static {
        C2088raa o = C2088raa.o();
        f2838b = o;
        f2839c = o;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        LX.a((AbstractC2429wX) new KY(), true);
        LX.a((AbstractC2429wX) new FY(), true);
        LX.a((GX) new NY());
    }
}
