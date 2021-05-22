package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class Mba implements Oba {
    private Mba() {
    }

    /* synthetic */ Mba(Hba hba) {
        this();
    }

    @Override // com.google.android.gms.internal.ads.Oba
    public final byte[] a(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }
}
