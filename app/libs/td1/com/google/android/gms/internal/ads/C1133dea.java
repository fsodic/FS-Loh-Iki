package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dea  reason: case insensitive filesystem */
final class C1133dea extends Zda {
    C1133dea() {
    }

    private static int a(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return Yda.b(i);
        }
        if (i2 == 1) {
            return Yda.b(i, Vda.a(bArr, j));
        }
        if (i2 == 2) {
            return Yda.b(i, Vda.a(bArr, j), Vda.a(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (com.google.android.gms.internal.ads.Vda.a(r25, r8) > -65) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        if (com.google.android.gms.internal.ads.Vda.a(r25, r8) > -65) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0103, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x012a, code lost:
        return -1;
     */
    @Override // com.google.android.gms.internal.ads.Zda
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r24, byte[] r25, int r26, int r27) {
        /*
        // Method dump skipped, instructions count: 387
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1133dea.a(int, byte[], int, int):int");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:38:0x00fb, LOOP_START, PHI: r2 r3 r4 r11 
      PHI: (r2v4 int) = (r2v3 int), (r2v6 int) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v3 char) = (r3v2 char), (r3v4 char) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v3 long) = (r4v2 long), (r4v5 long) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.Zda
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.CharSequence r23, byte[] r24, int r25, int r26) {
        /*
        // Method dump skipped, instructions count: 363
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1133dea.a(java.lang.CharSequence, byte[], int, int):int");
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Zda
    public final String b(byte[] bArr, int i, int i2) {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte a2 = Vda.a(bArr, (long) i);
                if (!_da.a(a2)) {
                    break;
                }
                i++;
                _da.a(a2, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte a3 = Vda.a(bArr, (long) i);
                if (_da.a(a3)) {
                    int i7 = i5 + 1;
                    _da.a(a3, cArr, i5);
                    while (i6 < i3) {
                        byte a4 = Vda.a(bArr, (long) i6);
                        if (!_da.a(a4)) {
                            break;
                        }
                        i6++;
                        _da.a(a4, cArr, i7);
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else if (_da.b(a3)) {
                    if (i6 < i3) {
                        int i8 = i6 + 1;
                        _da.a(a3, Vda.a(bArr, (long) i6), cArr, i5);
                        i = i8;
                        i5++;
                    } else {
                        throw Bca.i();
                    }
                } else if (_da.c(a3)) {
                    if (i6 < i3 - 1) {
                        int i9 = i6 + 1;
                        int i10 = i9 + 1;
                        _da.a(a3, Vda.a(bArr, (long) i6), Vda.a(bArr, (long) i9), cArr, i5);
                        i = i10;
                        i5++;
                    } else {
                        throw Bca.i();
                    }
                } else if (i6 < i3 - 2) {
                    int i11 = i6 + 1;
                    int i12 = i11 + 1;
                    _da.a(a3, Vda.a(bArr, (long) i6), Vda.a(bArr, (long) i11), Vda.a(bArr, (long) i12), cArr, i5);
                    i = i12 + 1;
                    i5 = i5 + 1 + 1;
                } else {
                    throw Bca.i();
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
