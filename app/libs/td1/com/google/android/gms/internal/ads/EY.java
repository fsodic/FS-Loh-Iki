package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

final class EY {
    public static Vaa a(EnumC2431wZ wZVar) {
        int i = DY.f1776c[wZVar.ordinal()];
        if (i == 1) {
            return Vaa.UNCOMPRESSED;
        }
        if (i == 2) {
            return Vaa.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        if (i == 3) {
            return Vaa.COMPRESSED;
        }
        String valueOf = String.valueOf(wZVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("unknown point format: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static Waa a(KZ kz) {
        int i = DY.f1775b[kz.ordinal()];
        if (i == 1) {
            return Waa.NIST_P256;
        }
        if (i == 2) {
            return Waa.NIST_P384;
        }
        if (i == 3) {
            return Waa.NIST_P521;
        }
        String valueOf = String.valueOf(kz);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("unknown curve type: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static String a(LZ lz) {
        int i = DY.f1774a[lz.ordinal()];
        if (i == 1) {
            return "HmacSha1";
        }
        if (i == 2) {
            return "HmacSha256";
        }
        if (i == 3) {
            return "HmacSha512";
        }
        String valueOf = String.valueOf(lz);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("hash unsupported for HMAC: ");
        sb.append(valueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    public static void a(CZ cz) {
        Uaa.a(a(cz.n().n()));
        a(cz.n().o());
        if (cz.p() != EnumC2431wZ.UNKNOWN_FORMAT) {
            LX.a(cz.o().n());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }
}
