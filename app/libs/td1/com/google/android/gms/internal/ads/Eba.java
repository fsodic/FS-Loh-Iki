package com.google.android.gms.internal.ads;

import org.cocos2dx.lib.BuildConfig;

/* access modifiers changed from: package-private */
public final class Eba {
    static int a(int i, byte[] bArr, int i2, int i3, Cca<?> cca, Dba dba) {
        C2299uca uca = (C2299uca) cca;
        int a2 = a(bArr, i2, dba);
        while (true) {
            uca.d(dba.f1783a);
            if (a2 >= i3) {
                break;
            }
            int a3 = a(bArr, a2, dba);
            if (i != dba.f1783a) {
                break;
            }
            a2 = a(bArr, a3, dba);
        }
        return a2;
    }

    static int a(int i, byte[] bArr, int i2, int i3, Dba dba) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return b(bArr, i2, dba);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return a(bArr, i2, dba) + dba.f1783a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = a(bArr, i2, dba);
                    i6 = dba.f1783a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = a(i6, bArr, i2, i3, dba);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw Bca.h();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw Bca.d();
            }
        } else {
            throw Bca.d();
        }
    }

    static int a(int i, byte[] bArr, int i2, int i3, Sda sda, Dba dba) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int b2 = b(bArr, i2, dba);
                sda.a(i, Long.valueOf(dba.f1784b));
                return b2;
            } else if (i4 == 1) {
                sda.a(i, Long.valueOf(b(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int a2 = a(bArr, i2, dba);
                int i5 = dba.f1783a;
                if (i5 < 0) {
                    throw Bca.b();
                } else if (i5 <= bArr.length - a2) {
                    sda.a(i, i5 == 0 ? Iba.f2236a : Iba.a(bArr, a2, i5));
                    return a2 + i5;
                } else {
                    throw Bca.a();
                }
            } else if (i4 == 3) {
                Sda d = Sda.d();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a3 = a(bArr, i2, dba);
                    int i8 = dba.f1783a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = a3;
                        break;
                    }
                    i7 = i8;
                    i2 = a(i8, bArr, a3, i3, d, dba);
                }
                if (i2 > i3 || i7 != i6) {
                    throw Bca.h();
                }
                sda.a(i, d);
                return i2;
            } else if (i4 == 5) {
                sda.a(i, Integer.valueOf(a(bArr, i2)));
                return i2 + 4;
            } else {
                throw Bca.d();
            }
        } else {
            throw Bca.d();
        }
    }

    static int a(int i, byte[] bArr, int i2, Dba dba) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            i4 = b2 << 7;
        } else {
            int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b3 = bArr[i6];
            if (b3 >= 0) {
                i3 = b3 << 14;
            } else {
                i5 = i7 | ((b3 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b4 = bArr[i8];
                if (b4 >= 0) {
                    i4 = b4 << 21;
                } else {
                    i7 = i5 | ((b4 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b5 = bArr[i6];
                    if (b5 >= 0) {
                        i3 = b5 << 28;
                    } else {
                        int i9 = i7 | ((b5 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                dba.f1783a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            dba.f1783a = i7 | i3;
            return i8;
        }
        dba.f1783a = i5 | i4;
        return i6;
    }

    static int a(AbstractC2439wda<?> wda, int i, byte[] bArr, int i2, int i3, Cca<?> cca, Dba dba) {
        int a2 = a(wda, bArr, i2, i3, dba);
        while (true) {
            cca.add(dba.f1785c);
            if (a2 >= i3) {
                break;
            }
            int a3 = a(bArr, a2, dba);
            if (i != dba.f1783a) {
                break;
            }
            a2 = a(wda, bArr, a3, i3, dba);
        }
        return a2;
    }

    static int a(AbstractC2439wda wda, byte[] bArr, int i, int i2, int i3, Dba dba) {
        C1268fda fda = (C1268fda) wda;
        Object a2 = fda.a();
        int a3 = fda.a(a2, bArr, i, i2, i3, dba);
        fda.c(a2);
        dba.f1785c = a2;
        return a3;
    }

    static int a(AbstractC2439wda wda, byte[] bArr, int i, int i2, Dba dba) {
        int i3 = i + 1;
        byte b2 = bArr[i];
        byte b3 = b2;
        if (b2 < 0) {
            i3 = a(b2, bArr, i3, dba);
            b3 = dba.f1783a;
        }
        if (b3 < 0 || b3 > i2 - i3) {
            throw Bca.a();
        }
        Object a2 = wda.a();
        int i4 = (b3 == 1 ? 1 : 0) + i3;
        wda.a(a2, bArr, i3, i4, dba);
        wda.c(a2);
        dba.f1785c = a2;
        return i4;
    }

    static int a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static int a(byte[] bArr, int i, Cca<?> cca, Dba dba) {
        C2299uca uca = (C2299uca) cca;
        int a2 = a(bArr, i, dba);
        int i2 = dba.f1783a + a2;
        while (a2 < i2) {
            a2 = a(bArr, a2, dba);
            uca.d(dba.f1783a);
        }
        if (a2 == i2) {
            return a2;
        }
        throw Bca.a();
    }

    static int a(byte[] bArr, int i, Dba dba) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return a(b2, bArr, i2, dba);
        }
        dba.f1783a = b2;
        return i2;
    }

    static int b(byte[] bArr, int i, Dba dba) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            dba.f1784b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | (((long) (b2 & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            byte b3 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b3 & Byte.MAX_VALUE)) << i4;
            b2 = b3;
            i3 = i5;
        }
        dba.f1784b = j2;
        return i3;
    }

    static long b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static double c(byte[] bArr, int i) {
        return Double.longBitsToDouble(b(bArr, i));
    }

    static int c(byte[] bArr, int i, Dba dba) {
        int a2 = a(bArr, i, dba);
        int i2 = dba.f1783a;
        if (i2 < 0) {
            throw Bca.b();
        } else if (i2 == 0) {
            dba.f1785c = BuildConfig.FLAVOR;
            return a2;
        } else {
            dba.f1785c = new String(bArr, a2, i2, C2230tca.f5626a);
            return a2 + i2;
        }
    }

    static float d(byte[] bArr, int i) {
        return Float.intBitsToFloat(a(bArr, i));
    }

    static int d(byte[] bArr, int i, Dba dba) {
        int a2 = a(bArr, i, dba);
        int i2 = dba.f1783a;
        if (i2 < 0) {
            throw Bca.b();
        } else if (i2 == 0) {
            dba.f1785c = BuildConfig.FLAVOR;
            return a2;
        } else {
            dba.f1785c = Yda.b(bArr, a2, i2);
            return a2 + i2;
        }
    }

    static int e(byte[] bArr, int i, Dba dba) {
        int a2 = a(bArr, i, dba);
        int i2 = dba.f1783a;
        if (i2 < 0) {
            throw Bca.b();
        } else if (i2 > bArr.length - a2) {
            throw Bca.a();
        } else if (i2 == 0) {
            dba.f1785c = Iba.f2236a;
            return a2;
        } else {
            dba.f1785c = Iba.a(bArr, a2, i2);
            return a2 + i2;
        }
    }
}
