package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.vfa  reason: case insensitive filesystem */
final class C2374vfa {

    /* renamed from: a  reason: collision with root package name */
    static AbstractC2153sX f5820a;

    static boolean a(C1823nfa nfa) {
        Method a2;
        if (f5820a != null) {
            return true;
        }
        String str = (String) C2392voa.e().a(C2474x.Gb);
        if (str == null || str.length() == 0) {
            str = (nfa == null || (a2 = nfa.a("IPyaXEy+F5at6zi6GEs/jkKHpFTAlYWM90ImI4874hawRCOEgKKUBzsomxFaeDkJ", "UMjKs/aJTfdn6BJRL96Zl/lGRXJtRxPMhZNhmq0gEjI=")) == null) ? null : (String) a2.invoke(null, new Object[0]);
            if (str == null) {
                return false;
            }
        }
        try {
            BX a3 = FX.a(C2415wJ.a(str, true));
            for (C1056caa caa : C2637zY.f6187c.n()) {
                if (caa.n().isEmpty()) {
                    throw new GeneralSecurityException("Missing type_url.");
                } else if (caa.o().isEmpty()) {
                    throw new GeneralSecurityException("Missing primitive_name.");
                } else if (caa.r().isEmpty()) {
                    throw new GeneralSecurityException("Missing catalogue_name.");
                } else if (!caa.r().equals("TinkAead") && !caa.r().equals("TinkMac") && !caa.r().equals("TinkHybridDecrypt") && !caa.r().equals("TinkHybridEncrypt") && !caa.r().equals("TinkPublicKeySign") && !caa.r().equals("TinkPublicKeyVerify") && !caa.r().equals("TinkStreamingAead") && !caa.r().equals("TinkDeterministicAead")) {
                    AbstractC1878oX<?> a4 = LX.a(caa.r());
                    LX.a((GX) a4.a());
                    LX.a(a4.a(caa.n(), caa.o(), caa.p()), caa.q());
                }
            }
            f5820a = AY.a(a3, null);
            return f5820a != null;
        } catch (IllegalArgumentException unused) {
        }
    }
}
