package com.google.android.gms.internal.ads;

final class Fia {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f1982a = {Jka.d("isom"), Jka.d("iso2"), Jka.d("iso3"), Jka.d("iso4"), Jka.d("iso5"), Jka.d("iso6"), Jka.d("avc1"), Jka.d("hvc1"), Jka.d("hev1"), Jka.d("mp41"), Jka.d("mp42"), Jka.d("3g2a"), Jka.d("3g2b"), Jka.d("3gr6"), Jka.d("3gs6"), Jka.d("3ge6"), Jka.d("3gg6"), Jka.d("M4V "), Jka.d("M4A "), Jka.d("f4v "), Jka.d("kddi"), Jka.d("M4VP"), Jka.d("qt  "), Jka.d("MSNV")};

    public static boolean a(Oha oha) {
        return a(oha, true);
    }

    private static boolean a(Oha oha, boolean z) {
        boolean z2;
        boolean z3;
        long length = oha.getLength();
        if (length == -1 || length > 4096) {
            length = 4096;
        }
        int i = (int) length;
        Dka dka = new Dka(64);
        int i2 = 0;
        boolean z4 = false;
        while (true) {
            if (i2 >= i) {
                break;
            }
            dka.a(8);
            oha.a(dka.f1807a, 0, 8);
            long l = dka.l();
            int d = dka.d();
            int i3 = 16;
            if (l == 1) {
                oha.a(dka.f1807a, 8, 8);
                dka.b(16);
                l = dka.p();
            } else {
                i3 = 8;
            }
            long j = (long) i3;
            if (l >= j) {
                i2 += i3;
                if (d != C1691lia.B) {
                    if (d != C1691lia.K && d != C1691lia.M) {
                        if ((((long) i2) + l) - j >= ((long) i)) {
                            break;
                        }
                        int i4 = (int) (l - j);
                        i2 += i4;
                        if (d == C1691lia.f4890a) {
                            if (i4 < 8) {
                                return false;
                            }
                            dka.a(i4);
                            oha.a(dka.f1807a, 0, i4);
                            int i5 = i4 / 4;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    break;
                                }
                                if (i6 == 1) {
                                    dka.d(4);
                                } else {
                                    int d2 = dka.d();
                                    if ((d2 >>> 8) != Jka.d("3gp")) {
                                        int[] iArr = f1982a;
                                        int length2 = iArr.length;
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= length2) {
                                                z3 = false;
                                                break;
                                            } else if (iArr[i7] == d2) {
                                                break;
                                            } else {
                                                i7++;
                                            }
                                        }
                                    }
                                    z3 = true;
                                    if (z3) {
                                        z4 = true;
                                        break;
                                    }
                                }
                                i6++;
                            }
                            if (!z4) {
                                return false;
                            }
                        } else if (i4 != 0) {
                            oha.b(i4);
                        }
                    } else {
                        z2 = true;
                    }
                }
            } else {
                return false;
            }
        }
        z2 = false;
        return z4 && z == z2;
    }

    public static boolean b(Oha oha) {
        return a(oha, false);
    }
}
