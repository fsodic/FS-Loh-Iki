package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.ads.Yia;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.mia  reason: case insensitive filesystem */
public final class C1760mia {

    /* renamed from: a  reason: collision with root package name */
    private static final int f4980a = Jka.d("vide");

    /* renamed from: b  reason: collision with root package name */
    private static final int f4981b = Jka.d("soun");

    /* renamed from: c  reason: collision with root package name */
    private static final int f4982c = Jka.d("text");
    private static final int d = Jka.d("sbtl");
    private static final int e = Jka.d("subt");
    private static final int f = Jka.d("clcp");
    private static final int g = Jka.d("cenc");
    private static final int h = Jka.d("meta");

    private static int a(Dka dka) {
        int g2 = dka.g();
        int i = g2 & 127;
        while ((g2 & 128) == 128) {
            g2 = dka.g();
            i = (i << 7) | (g2 & 127);
        }
        return i;
    }

    private static int a(Dka dka, int i, int i2, C2104ria ria, int i3) {
        Hia hia;
        int b2 = dka.b();
        while (true) {
            boolean z = false;
            if (b2 - i >= i2) {
                return 0;
            }
            dka.c(b2);
            int d2 = dka.d();
            C2453wka.a(d2 > 0, "childAtomSize should be positive");
            if (dka.d() == C1691lia.V) {
                int i4 = b2 + 8;
                Pair pair = null;
                Integer num = null;
                Hia hia2 = null;
                boolean z2 = false;
                while (i4 - b2 < d2) {
                    dka.c(i4);
                    int d3 = dka.d();
                    int d4 = dka.d();
                    if (d4 == C1691lia.ba) {
                        num = Integer.valueOf(dka.d());
                    } else if (d4 == C1691lia.W) {
                        dka.d(4);
                        z2 = dka.d() == g;
                    } else if (d4 == C1691lia.X) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= d3) {
                                hia = null;
                                break;
                            }
                            dka.c(i5);
                            int d5 = dka.d();
                            if (dka.d() == C1691lia.Y) {
                                dka.d(6);
                                boolean z3 = dka.g() == 1;
                                int g2 = dka.g();
                                byte[] bArr = new byte[16];
                                dka.a(bArr, 0, 16);
                                hia = new Hia(z3, g2, bArr);
                            } else {
                                i5 += d5;
                            }
                        }
                        hia2 = hia;
                    }
                    i4 += d3;
                }
                if (z2) {
                    C2453wka.a(num != null, "frma atom is mandatory");
                    if (hia2 != null) {
                        z = true;
                    }
                    C2453wka.a(z, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, hia2);
                }
                if (pair != null) {
                    ria.f5444a[i3] = (Hia) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            b2 += d2;
        }
    }

    private static Pair<String, byte[]> a(Dka dka, int i) {
        dka.c(i + 8 + 4);
        dka.d(1);
        a(dka);
        dka.d(2);
        int g2 = dka.g();
        if ((g2 & 128) != 0) {
            dka.d(2);
        }
        if ((g2 & 64) != 0) {
            dka.d(dka.h());
        }
        if ((g2 & 32) != 0) {
            dka.d(2);
        }
        dka.d(1);
        a(dka);
        int g3 = dka.g();
        String str = null;
        if (g3 == 32) {
            str = "video/mp4v-es";
        } else if (g3 == 33) {
            str = "video/avc";
        } else if (g3 != 35) {
            if (g3 != 64) {
                if (g3 == 107) {
                    return Pair.create("audio/mpeg", null);
                }
                if (g3 == 165) {
                    str = "audio/ac3";
                } else if (g3 != 166) {
                    switch (g3) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (g3) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        dka.d(12);
        dka.d(1);
        int a2 = a(dka);
        byte[] bArr = new byte[a2];
        dka.a(bArr, 0, a2);
        return Pair.create(str, bArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:195:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x082e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x082f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.Iia a(com.google.android.gms.internal.ads.C1622kia r48, com.google.android.gms.internal.ads.C1829nia r49, long r50, com.google.android.gms.internal.ads.Dha r52, boolean r53) {
        /*
        // Method dump skipped, instructions count: 2152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1760mia.a(com.google.android.gms.internal.ads.kia, com.google.android.gms.internal.ads.nia, long, com.google.android.gms.internal.ads.Dha, boolean):com.google.android.gms.internal.ads.Iia");
    }

    public static Jia a(Iia iia, C1622kia kia, Uha uha) {
        AbstractC1898oia oia;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        long j2;
        long[] jArr3;
        int[] iArr3;
        boolean z2;
        int i5;
        long[] jArr4;
        int[] iArr4;
        int[] iArr5;
        int i6;
        int i7;
        Iia iia2 = iia;
        C1829nia d2 = kia.d(C1691lia.qa);
        if (d2 != null) {
            oia = new C2036qia(d2);
        } else {
            C1829nia d3 = kia.d(C1691lia.ra);
            if (d3 != null) {
                oia = new C2311uia(d3);
            } else {
                throw new Kga("Track has no sample table size information");
            }
        }
        int c2 = oia.c();
        if (c2 == 0) {
            return new Jia(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        C1829nia d4 = kia.d(C1691lia.sa);
        if (d4 == null) {
            d4 = kia.d(C1691lia.ta);
            z = true;
        } else {
            z = false;
        }
        Dka dka = d4.Qa;
        Dka dka2 = kia.d(C1691lia.pa).Qa;
        Dka dka3 = kia.d(C1691lia.ma).Qa;
        C1829nia d5 = kia.d(C1691lia.na);
        Dka dka4 = d5 != null ? d5.Qa : null;
        C1829nia d6 = kia.d(C1691lia.oa);
        Dka dka5 = d6 != null ? d6.Qa : null;
        C1967pia pia = new C1967pia(dka2, dka, z);
        dka3.c(12);
        int o = dka3.o() - 1;
        int o2 = dka3.o();
        int o3 = dka3.o();
        if (dka5 != null) {
            dka5.c(12);
            i = dka5.o();
        } else {
            i = 0;
        }
        int i8 = -1;
        if (dka4 != null) {
            dka4.c(12);
            i2 = dka4.o();
            if (i2 > 0) {
                i8 = dka4.o() - 1;
            } else {
                dka4 = null;
            }
        } else {
            i2 = 0;
        }
        long j3 = 0;
        if (!(oia.b() && "audio/raw".equals(iia2.f.f) && o == 0 && i == 0 && i2 == 0)) {
            jArr2 = new long[c2];
            iArr = new int[c2];
            jArr = new long[c2];
            iArr2 = new int[c2];
            int i9 = i2;
            int i10 = o3;
            int i11 = i;
            int i12 = i8;
            long j4 = 0;
            long j5 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = o2;
            int i18 = o;
            int i19 = 0;
            while (i19 < c2) {
                long j6 = j4;
                int i20 = i13;
                while (i20 == 0) {
                    C2453wka.b(pia.a());
                    j6 = pia.d;
                    i20 = pia.f5260c;
                    i18 = i18;
                    i10 = i10;
                }
                if (dka5 != null) {
                    while (i16 == 0 && i11 > 0) {
                        i16 = dka5.o();
                        i15 = dka5.d();
                        i11--;
                    }
                    i16--;
                }
                jArr2[i19] = j6;
                iArr[i19] = oia.a();
                if (iArr[i19] > i14) {
                    i6 = c2;
                    i14 = iArr[i19];
                } else {
                    i6 = c2;
                }
                jArr[i19] = j5 + ((long) i15);
                iArr2[i19] = dka4 == null ? 1 : 0;
                if (i19 == i12) {
                    iArr2[i19] = 1;
                    i9--;
                    if (i9 > 0) {
                        i12 = dka4.o() - 1;
                    }
                }
                int i21 = i10;
                j5 += (long) i21;
                i17--;
                if (i17 != 0 || i18 <= 0) {
                    i7 = i18;
                } else {
                    i7 = i18 - 1;
                    i17 = dka3.o();
                    i21 = dka3.o();
                }
                long j7 = j6 + ((long) iArr[i19]);
                i19++;
                i12 = i12;
                c2 = i6;
                i13 = i20 - 1;
                i15 = i15;
                i18 = i7;
                j4 = j7;
                i10 = i21;
                i9 = i9;
                oia = oia;
            }
            i4 = c2;
            C2453wka.a(i16 == 0);
            while (i11 > 0) {
                C2453wka.a(dka5.o() == 0);
                dka5.d();
                i11--;
            }
            if (i9 == 0 && i17 == 0 && i13 == 0 && i18 == 0) {
                iia2 = iia;
            } else {
                iia2 = iia;
                int i22 = iia2.f2257a;
                StringBuilder sb = new StringBuilder(215);
                sb.append("Inconsistent stbl box for track ");
                sb.append(i22);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i9);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i17);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i13);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i18);
                Log.w("AtomParsers", sb.toString());
            }
            j = j5;
            i3 = i14;
        } else {
            i4 = c2;
            int i23 = pia.f5258a;
            long[] jArr5 = new long[i23];
            int[] iArr6 = new int[i23];
            while (pia.a()) {
                int i24 = pia.f5259b;
                jArr5[i24] = pia.d;
                iArr6[i24] = pia.f5260c;
            }
            int a2 = oia.a();
            long j8 = (long) o3;
            int i25 = 8192 / a2;
            int i26 = 0;
            for (int i27 : iArr6) {
                i26 += Jka.a(i27, i25);
            }
            long[] jArr6 = new long[i26];
            int[] iArr7 = new int[i26];
            long[] jArr7 = new long[i26];
            int[] iArr8 = new int[i26];
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            while (i28 < iArr6.length) {
                int i32 = iArr6[i28];
                long j9 = jArr5[i28];
                int i33 = i29;
                int i34 = i31;
                while (i32 > 0) {
                    int min = Math.min(i25, i32);
                    jArr6[i30] = j9;
                    iArr7[i30] = a2 * min;
                    i34 = Math.max(i34, iArr7[i30]);
                    jArr7[i30] = ((long) i33) * j8;
                    iArr8[i30] = 1;
                    j9 += (long) iArr7[i30];
                    i33 += min;
                    i32 -= min;
                    i30++;
                    iArr6 = iArr6;
                    jArr5 = jArr5;
                }
                i28++;
                i31 = i34;
                i29 = i33;
            }
            C2587yia yia = new C2587yia(jArr6, iArr7, i31, jArr7, iArr8);
            jArr2 = yia.f6120a;
            iArr = yia.f6121b;
            int i35 = yia.f6122c;
            jArr = yia.d;
            iArr2 = yia.e;
            i3 = i35;
            j = 0;
        }
        if (iia2.i == null || uha.a()) {
            Jka.a(jArr, 1000000, iia2.f2259c);
            return new Jia(jArr2, iArr, i3, jArr, iArr2);
        }
        long[] jArr8 = iia2.i;
        if (jArr8.length == 1 && iia2.f2258b == 1 && jArr.length >= 2) {
            long j10 = iia2.j[0];
            long a3 = Jka.a(jArr8[0], iia2.f2259c, iia2.d) + j10;
            if (jArr[0] <= j10 && j10 < jArr[1] && jArr[jArr.length - 1] < a3 && a3 <= j) {
                long j11 = j - a3;
                long a4 = Jka.a(j10 - jArr[0], (long) iia2.f.s, iia2.f2259c);
                long a5 = Jka.a(j11, (long) iia2.f.s, iia2.f2259c);
                if (!(a4 == 0 && a5 == 0) && a4 <= 2147483647L && a5 <= 2147483647L) {
                    uha.f3274c = (int) a4;
                    uha.d = (int) a5;
                    Jka.a(jArr, 1000000, iia2.f2259c);
                    return new Jia(jArr2, iArr, i3, jArr, iArr2);
                }
            }
        }
        long[] jArr9 = iia2.i;
        if (jArr9.length == 1) {
            char c3 = 0;
            if (jArr9[0] == 0) {
                int i36 = 0;
                while (i36 < jArr.length) {
                    jArr[i36] = Jka.a(jArr[i36] - iia2.j[c3], 1000000, iia2.f2259c);
                    i36++;
                    c3 = 0;
                }
                return new Jia(jArr2, iArr, i3, jArr, iArr2);
            }
        }
        boolean z3 = iia2.f2258b == 1;
        int i37 = 0;
        boolean z4 = false;
        int i38 = 0;
        int i39 = 0;
        while (true) {
            long[] jArr10 = iia2.i;
            j2 = -1;
            if (i37 >= jArr10.length) {
                break;
            }
            long j12 = iia2.j[i37];
            if (j12 != -1) {
                long a6 = Jka.a(jArr10[i37], iia2.f2259c, iia2.d);
                int b2 = Jka.b(jArr, j12, true, true);
                int b3 = Jka.b(jArr, j12 + a6, z3, false);
                i38 += b3 - b2;
                z4 |= i39 != b2;
                i39 = b3;
            }
            i37++;
            iArr = iArr;
        }
        int[] iArr9 = iArr;
        boolean z5 = (i38 != i4) | z4;
        long[] jArr11 = z5 ? new long[i38] : jArr2;
        int[] iArr10 = z5 ? new int[i38] : iArr9;
        if (z5) {
            i3 = 0;
        }
        int[] iArr11 = z5 ? new int[i38] : iArr2;
        long[] jArr12 = new long[i38];
        int i40 = i3;
        int i41 = 0;
        int i42 = 0;
        while (true) {
            long[] jArr13 = iia2.i;
            if (i41 >= jArr13.length) {
                break;
            }
            long j13 = iia2.j[i41];
            long j14 = jArr13[i41];
            if (j13 != j2) {
                iArr4 = iArr11;
                i5 = i41;
                int b4 = Jka.b(jArr, j13, true, true);
                int b5 = Jka.b(jArr, Jka.a(j14, iia2.f2259c, iia2.d) + j13, z3, false);
                if (z5) {
                    int i43 = b5 - b4;
                    jArr4 = jArr11;
                    System.arraycopy(jArr2, b4, jArr4, i42, i43);
                    z2 = z3;
                    iArr5 = iArr9;
                    System.arraycopy(iArr5, b4, iArr10, i42, i43);
                    System.arraycopy(iArr2, b4, iArr4, i42, i43);
                } else {
                    jArr4 = jArr11;
                    z2 = z3;
                    iArr5 = iArr9;
                }
                int i44 = i40;
                while (b4 < b5) {
                    jArr12[i42] = Jka.a(j3, 1000000, iia2.d) + Jka.a(jArr[b4] - j13, 1000000, iia2.f2259c);
                    if (z5 && iArr10[i42] > i44) {
                        i44 = iArr5[b4];
                    }
                    i42++;
                    b4++;
                    jArr2 = jArr2;
                    j13 = j13;
                    iArr2 = iArr2;
                }
                jArr3 = jArr2;
                iArr3 = iArr2;
                i40 = i44;
            } else {
                iArr3 = iArr2;
                iArr4 = iArr11;
                i5 = i41;
                jArr4 = jArr11;
                z2 = z3;
                iArr5 = iArr9;
                jArr3 = jArr2;
            }
            j3 += j14;
            i41 = i5 + 1;
            jArr2 = jArr3;
            iArr9 = iArr5;
            iArr11 = iArr4;
            jArr11 = jArr4;
            z3 = z2;
            iArr2 = iArr3;
            jArr12 = jArr12;
            j2 = -1;
        }
        boolean z6 = false;
        for (int i45 = 0; i45 < iArr11.length && !z6; i45++) {
            z6 |= (iArr11[i45] & 1) != 0;
        }
        if (z6) {
            return new Jia(jArr11, iArr10, i40, jArr12, iArr11);
        }
        throw new Kga("The edited sample sequence does not contain a sync sample.");
    }

    public static Yia a(C1829nia nia, boolean z) {
        if (z) {
            return null;
        }
        Dka dka = nia.Qa;
        dka.c(8);
        while (dka.j() >= 8) {
            int b2 = dka.b();
            int d2 = dka.d();
            if (dka.d() == C1691lia.Ba) {
                dka.c(b2);
                int i = b2 + d2;
                dka.d(12);
                while (true) {
                    if (dka.b() >= i) {
                        break;
                    }
                    int b3 = dka.b();
                    int d3 = dka.d();
                    if (dka.d() == C1691lia.Ca) {
                        dka.c(b3);
                        int i2 = b3 + d3;
                        dka.d(8);
                        ArrayList arrayList = new ArrayList();
                        while (dka.b() < i2) {
                            Yia.a a2 = Bia.a(dka);
                            if (a2 != null) {
                                arrayList.add(a2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new Yia(arrayList);
                        }
                    } else {
                        dka.d(d3 - 8);
                    }
                }
                return null;
            }
            dka.d(d2 - 8);
        }
        return null;
    }
}
