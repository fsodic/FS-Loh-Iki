package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.Dha;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.fia  reason: case insensitive filesystem */
public final class C1278fia implements Pha {

    /* renamed from: a  reason: collision with root package name */
    private static final Qha f4323a = new C1209eia();

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f4324b = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f4325c = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final UUID d = new UUID(72057594037932032L, -9223371306706625679L);
    private long A;
    private boolean B;
    private long C;
    private long D;
    private long E;
    private C2522xka F;
    private C2522xka G;
    private boolean H;
    private int I;
    private long J;
    private long K;
    private int L;
    private int M;
    private int[] N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private byte W;
    private int X;
    private int Y;
    private int Z;
    private boolean aa;
    private boolean ba;
    private Rha ca;
    private final AbstractC1141dia e;
    private final C1484iia f;
    private final SparseArray<C1347gia> g;
    private final boolean h;
    private final Dka i;
    private final Dka j;
    private final Dka k;
    private final Dka l;
    private final Dka m;
    private final Dka n;
    private final Dka o;
    private final Dka p;
    private final Dka q;
    private ByteBuffer r;
    private long s;
    private long t;
    private long u;
    private long v;
    private long w;
    private C1347gia x;
    private boolean y;
    private int z;

    public C1278fia() {
        this(0);
    }

    private C1278fia(int i2) {
        this(new Zha(), 0);
    }

    private C1278fia(AbstractC1141dia dia, int i2) {
        this.t = -1;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.C = -1;
        this.D = -1;
        this.E = -9223372036854775807L;
        this.e = dia;
        this.e.a(new C1416hia(this, null));
        this.h = true;
        this.f = new C1484iia();
        this.g = new SparseArray<>();
        this.k = new Dka(4);
        this.l = new Dka(ByteBuffer.allocate(4).putInt(-1).array());
        this.m = new Dka(4);
        this.i = new Dka(Cka.f1722a);
        this.j = new Dka(4);
        this.n = new Dka();
        this.o = new Dka();
        this.p = new Dka(8);
        this.q = new Dka();
    }

    static int a(int i2) {
        switch (i2) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    private final int a(Oha oha, Xha xha, int i2) {
        int i3;
        int j2 = this.n.j();
        if (j2 > 0) {
            i3 = Math.min(i2, j2);
            xha.a(this.n, i3);
        } else {
            i3 = xha.a(oha, i2, false);
        }
        this.R += i3;
        this.Z += i3;
        return i3;
    }

    private final long a(long j2) {
        long j3 = this.u;
        if (j3 != -9223372036854775807L) {
            return Jka.a(j2, j3, 1000);
        }
        throw new Kga("Can't scale timecode prior to timecodeScale being set.");
    }

    private final void a(Oha oha, int i2) {
        if (this.k.c() < i2) {
            if (this.k.a() < i2) {
                Dka dka = this.k;
                byte[] bArr = dka.f1807a;
                dka.a(Arrays.copyOf(bArr, Math.max(bArr.length << 1, i2)), this.k.c());
            }
            Dka dka2 = this.k;
            oha.readFully(dka2.f1807a, dka2.c(), i2 - this.k.c());
            this.k.b(i2);
        }
    }

    private final void a(Oha oha, C1347gia gia, int i2) {
        int i3;
        if ("S_TEXT/UTF8".equals(gia.f4410a)) {
            int length = f4324b.length + i2;
            if (this.o.a() < length) {
                this.o.f1807a = Arrays.copyOf(f4324b, length + i2);
            }
            oha.readFully(this.o.f1807a, f4324b.length, i2);
            this.o.c(0);
            this.o.b(length);
            return;
        }
        Xha xha = gia.O;
        if (!this.S) {
            if (gia.e) {
                this.Q &= -1073741825;
                int i4 = 128;
                if (!this.T) {
                    oha.readFully(this.k.f1807a, 0, 1);
                    this.R++;
                    byte[] bArr = this.k.f1807a;
                    if ((bArr[0] & 128) != 128) {
                        this.W = bArr[0];
                        this.T = true;
                    } else {
                        throw new Kga("Extension bit is set in signal byte");
                    }
                }
                byte b2 = this.W;
                if ((b2 & 1) == 1) {
                    boolean z2 = (b2 & 2) == 2;
                    this.Q |= 1073741824;
                    if (!this.U) {
                        oha.readFully(this.p.f1807a, 0, 8);
                        this.R += 8;
                        this.U = true;
                        byte[] bArr2 = this.k.f1807a;
                        if (!z2) {
                            i4 = 0;
                        }
                        bArr2[0] = (byte) (i4 | 8);
                        this.k.c(0);
                        xha.a(this.k, 1);
                        this.Z++;
                        this.p.c(0);
                        xha.a(this.p, 8);
                        this.Z += 8;
                    }
                    if (z2) {
                        if (!this.V) {
                            oha.readFully(this.k.f1807a, 0, 1);
                            this.R++;
                            this.k.c(0);
                            this.X = this.k.g();
                            this.V = true;
                        }
                        int i5 = this.X << 2;
                        this.k.a(i5);
                        oha.readFully(this.k.f1807a, 0, i5);
                        this.R += i5;
                        short s2 = (short) ((this.X / 2) + 1);
                        int i6 = (s2 * 6) + 2;
                        ByteBuffer byteBuffer = this.r;
                        if (byteBuffer == null || byteBuffer.capacity() < i6) {
                            this.r = ByteBuffer.allocate(i6);
                        }
                        this.r.position(0);
                        this.r.putShort(s2);
                        int i7 = 0;
                        int i8 = 0;
                        while (true) {
                            i3 = this.X;
                            if (i7 >= i3) {
                                break;
                            }
                            int o2 = this.k.o();
                            if (i7 % 2 == 0) {
                                this.r.putShort((short) (o2 - i8));
                            } else {
                                this.r.putInt(o2 - i8);
                            }
                            i7++;
                            i8 = o2;
                        }
                        int i9 = (i2 - this.R) - i8;
                        if (i3 % 2 == 1) {
                            this.r.putInt(i9);
                        } else {
                            this.r.putShort((short) i9);
                            this.r.putInt(0);
                        }
                        this.q.a(this.r.array(), i6);
                        xha.a(this.q, i6);
                        this.Z += i6;
                    }
                }
            } else {
                byte[] bArr3 = gia.f;
                if (bArr3 != null) {
                    this.n.a(bArr3, bArr3.length);
                }
            }
            this.S = true;
        }
        int c2 = i2 + this.n.c();
        if (!"V_MPEG4/ISO/AVC".equals(gia.f4410a) && !"V_MPEGH/ISO/HEVC".equals(gia.f4410a)) {
            while (true) {
                int i10 = this.R;
                if (i10 >= c2) {
                    break;
                }
                a(oha, xha, c2 - i10);
            }
        } else {
            byte[] bArr4 = this.j.f1807a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i11 = gia.P;
            int i12 = 4 - i11;
            while (this.R < c2) {
                int i13 = this.Y;
                if (i13 == 0) {
                    int min = Math.min(i11, this.n.j());
                    oha.readFully(bArr4, i12 + min, i11 - min);
                    if (min > 0) {
                        this.n.a(bArr4, i12, min);
                    }
                    this.R += i11;
                    this.j.c(0);
                    this.Y = this.j.o();
                    this.i.c(0);
                    xha.a(this.i, 4);
                    this.Z += 4;
                } else {
                    this.Y = i13 - a(oha, xha, i13);
                }
            }
        }
        if ("A_VORBIS".equals(gia.f4410a)) {
            this.l.c(0);
            xha.a(this.l, 4);
            this.Z += 4;
        }
    }

    private final void a(C1347gia gia, long j2) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(gia.f4410a)) {
            byte[] bArr2 = this.o.f1807a;
            long j3 = this.K;
            if (j3 == -9223372036854775807L) {
                bArr = f4325c;
            } else {
                int i2 = (int) (j3 / 3600000000L);
                long j4 = j3 - (((long) i2) * 3600000000L);
                int i3 = (int) (j4 / 60000000);
                long j5 = j4 - ((long) (60000000 * i3));
                int i4 = (int) (j5 / 1000000);
                bArr = Jka.c(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j5 - ((long) (1000000 * i4))) / 1000))));
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            Xha xha = gia.O;
            Dka dka = this.o;
            xha.a(dka, dka.c());
            this.Z += this.o.c();
        }
        gia.O.a(j2, this.Q, this.Z, 0, gia.g);
        this.aa = true;
        c();
    }

    private static int[] a(int[] iArr, int i2) {
        return iArr == null ? new int[i2] : iArr.length >= i2 ? iArr : new int[Math.max(iArr.length << 1, i2)];
    }

    static boolean b(int i2) {
        return i2 == 357149030 || i2 == 524531317 || i2 == 475249515 || i2 == 374648427;
    }

    private final void c() {
        this.R = 0;
        this.Z = 0;
        this.Y = 0;
        this.S = false;
        this.T = false;
        this.V = false;
        this.X = 0;
        this.W = 0;
        this.U = false;
        this.n.i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0039 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0005 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.Pha
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(com.google.android.gms.internal.ads.Oha r9, com.google.android.gms.internal.ads.Wha r10) {
        /*
            r8 = this;
            r0 = 0
            r8.aa = r0
            r1 = 1
            r2 = 1
        L_0x0005:
            if (r2 == 0) goto L_0x003a
            boolean r3 = r8.aa
            if (r3 != 0) goto L_0x003a
            com.google.android.gms.internal.ads.dia r2 = r8.e
            boolean r2 = r2.a(r9)
            if (r2 == 0) goto L_0x0005
            long r3 = r9.getPosition()
            boolean r5 = r8.B
            if (r5 == 0) goto L_0x0025
            r8.D = r3
            long r3 = r8.C
            r10.f3447a = r3
            r8.B = r0
        L_0x0023:
            r3 = 1
            goto L_0x0037
        L_0x0025:
            boolean r3 = r8.y
            if (r3 == 0) goto L_0x0036
            long r3 = r8.D
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0036
            r10.f3447a = r3
            r8.D = r5
            goto L_0x0023
        L_0x0036:
            r3 = 0
        L_0x0037:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003a:
            if (r2 == 0) goto L_0x003d
            return r0
        L_0x003d:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1278fia.a(com.google.android.gms.internal.ads.Oha, com.google.android.gms.internal.ads.Wha):int");
    }

    @Override // com.google.android.gms.internal.ads.Pha
    public final void a() {
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, double d2) {
        if (i2 == 181) {
            this.x.I = (int) d2;
        } else if (i2 != 17545) {
            switch (i2) {
                case 21969:
                    this.x.w = (float) d2;
                    return;
                case 21970:
                    this.x.x = (float) d2;
                    return;
                case 21971:
                    this.x.y = (float) d2;
                    return;
                case 21972:
                    this.x.z = (float) d2;
                    return;
                case 21973:
                    this.x.A = (float) d2;
                    return;
                case 21974:
                    this.x.B = (float) d2;
                    return;
                case 21975:
                    this.x.C = (float) d2;
                    return;
                case 21976:
                    this.x.D = (float) d2;
                    return;
                case 21977:
                    this.x.E = (float) d2;
                    return;
                case 21978:
                    this.x.F = (float) d2;
                    return;
                default:
                    return;
            }
        } else {
            this.v = (long) d2;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01fd, code lost:
        throw new com.google.android.gms.internal.ads.Kga("EBML lacing sample size out of range.");
     */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0253  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r20, int r21, com.google.android.gms.internal.ads.Oha r22) {
        /*
        // Method dump skipped, instructions count: 692
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1278fia.a(int, int, com.google.android.gms.internal.ads.Oha):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, long j2) {
        if (i2 != 20529) {
            if (i2 != 20530) {
                boolean z2 = false;
                switch (i2) {
                    case 131:
                        this.x.f4412c = (int) j2;
                        return;
                    case 136:
                        C1347gia gia = this.x;
                        if (j2 == 1) {
                            z2 = true;
                        }
                        gia.L = z2;
                        return;
                    case 155:
                        this.K = a(j2);
                        return;
                    case 159:
                        this.x.G = (int) j2;
                        return;
                    case 176:
                        this.x.j = (int) j2;
                        return;
                    case 179:
                        this.F.a(a(j2));
                        return;
                    case 186:
                        this.x.k = (int) j2;
                        return;
                    case 215:
                        this.x.f4411b = (int) j2;
                        return;
                    case 231:
                        this.E = a(j2);
                        return;
                    case 241:
                        if (!this.H) {
                            this.G.a(j2);
                            this.H = true;
                            return;
                        }
                        return;
                    case 251:
                        this.ba = true;
                        return;
                    case 16980:
                        if (j2 != 3) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("ContentCompAlgo ");
                            sb.append(j2);
                            sb.append(" not supported");
                            throw new Kga(sb.toString());
                        }
                        return;
                    case 17029:
                        if (j2 < 1 || j2 > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j2);
                            sb2.append(" not supported");
                            throw new Kga(sb2.toString());
                        }
                        return;
                    case 17143:
                        if (j2 != 1) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j2);
                            sb3.append(" not supported");
                            throw new Kga(sb3.toString());
                        }
                        return;
                    case 18401:
                        if (j2 != 5) {
                            StringBuilder sb4 = new StringBuilder(49);
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j2);
                            sb4.append(" not supported");
                            throw new Kga(sb4.toString());
                        }
                        return;
                    case 18408:
                        if (j2 != 1) {
                            StringBuilder sb5 = new StringBuilder(56);
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j2);
                            sb5.append(" not supported");
                            throw new Kga(sb5.toString());
                        }
                        return;
                    case 21420:
                        this.A = j2 + this.t;
                        return;
                    case 21432:
                        int i3 = (int) j2;
                        if (i3 == 0) {
                            this.x.p = 0;
                            return;
                        } else if (i3 == 1) {
                            this.x.p = 2;
                            return;
                        } else if (i3 == 3) {
                            this.x.p = 1;
                            return;
                        } else if (i3 == 15) {
                            this.x.p = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        this.x.l = (int) j2;
                        return;
                    case 21682:
                        this.x.n = (int) j2;
                        return;
                    case 21690:
                        this.x.m = (int) j2;
                        return;
                    case 21930:
                        C1347gia gia2 = this.x;
                        if (j2 == 1) {
                            z2 = true;
                        }
                        gia2.M = z2;
                        return;
                    case 22186:
                        this.x.J = j2;
                        return;
                    case 22203:
                        this.x.K = j2;
                        return;
                    case 25188:
                        this.x.H = (int) j2;
                        return;
                    case 2352003:
                        this.x.d = (int) j2;
                        return;
                    case 2807729:
                        this.u = j2;
                        return;
                    default:
                        switch (i2) {
                            case 21945:
                                int i4 = (int) j2;
                                if (i4 == 1) {
                                    this.x.t = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.x.t = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i5 = (int) j2;
                                if (i5 != 1) {
                                    if (i5 == 16) {
                                        this.x.s = 6;
                                        return;
                                    } else if (i5 == 18) {
                                        this.x.s = 7;
                                        return;
                                    } else if (!(i5 == 6 || i5 == 7)) {
                                        return;
                                    }
                                }
                                this.x.s = 3;
                                return;
                            case 21947:
                                C1347gia gia3 = this.x;
                                gia3.q = true;
                                int i6 = (int) j2;
                                if (i6 == 1) {
                                    gia3.r = 1;
                                    return;
                                } else if (i6 == 9) {
                                    gia3.r = 6;
                                    return;
                                } else if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                    this.x.r = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                this.x.u = (int) j2;
                                return;
                            case 21949:
                                this.x.v = (int) j2;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j2 != 1) {
                StringBuilder sb6 = new StringBuilder(55);
                sb6.append("ContentEncodingScope ");
                sb6.append(j2);
                sb6.append(" not supported");
                throw new Kga(sb6.toString());
            }
        } else if (j2 != 0) {
            StringBuilder sb7 = new StringBuilder(55);
            sb7.append("ContentEncodingOrder ");
            sb7.append(j2);
            sb7.append(" not supported");
            throw new Kga(sb7.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, long j2, long j3) {
        if (i2 == 160) {
            this.ba = false;
        } else if (i2 == 174) {
            this.x = new C1347gia(null);
        } else if (i2 == 187) {
            this.H = false;
        } else if (i2 == 19899) {
            this.z = -1;
            this.A = -1;
        } else if (i2 == 20533) {
            this.x.e = true;
        } else if (i2 == 21968) {
            this.x.q = true;
        } else if (i2 == 25152) {
        } else {
            if (i2 == 408125543) {
                long j4 = this.t;
                if (j4 == -1 || j4 == j2) {
                    this.t = j2;
                    this.s = j3;
                    return;
                }
                throw new Kga("Multiple Segment elements not supported");
            } else if (i2 == 475249515) {
                this.F = new C2522xka();
                this.G = new C2522xka();
            } else if (i2 != 524531317 || this.y) {
            } else {
                if (!this.h || this.C == -1) {
                    this.ca.a(new Yha(this.w));
                    this.y = true;
                    return;
                }
                this.B = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, String str) {
        if (i2 == 134) {
            this.x.f4410a = str;
        } else if (i2 != 17026) {
            if (i2 == 2274716) {
                C1347gia.a(this.x, str);
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new Kga(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.Pha
    public final void a(long j2, long j3) {
        this.E = -9223372036854775807L;
        this.I = 0;
        this.e.reset();
        this.f.a();
        c();
    }

    @Override // com.google.android.gms.internal.ads.Pha
    public final void a(Rha rha) {
        this.ca = rha;
    }

    @Override // com.google.android.gms.internal.ads.Pha
    public final boolean a(Oha oha) {
        return new C1553jia().a(oha);
    }

    /* access modifiers changed from: package-private */
    public final void c(int i2) {
        Vha vha;
        C2522xka xka;
        C2522xka xka2;
        int i3;
        int i4 = 0;
        if (i2 != 160) {
            if (i2 == 174) {
                String str = this.x.f4410a;
                if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                    i4 = 1;
                }
                if (i4 != 0) {
                    C1347gia gia = this.x;
                    gia.a(this.ca, gia.f4411b);
                    SparseArray<C1347gia> sparseArray = this.g;
                    C1347gia gia2 = this.x;
                    sparseArray.put(gia2.f4411b, gia2);
                }
                this.x = null;
            } else if (i2 == 19899) {
                int i5 = this.z;
                if (i5 != -1) {
                    long j2 = this.A;
                    if (j2 != -1) {
                        if (i5 == 475249515) {
                            this.C = j2;
                            return;
                        }
                        return;
                    }
                }
                throw new Kga("Mandatory element SeekID or SeekPosition not found");
            } else if (i2 == 25152) {
                C1347gia gia3 = this.x;
                if (gia3.e) {
                    _ha _ha = gia3.g;
                    if (_ha != null) {
                        gia3.i = new Dha(new Dha.a(C2238tga.f5634b, "video/webm", _ha.f3739b));
                        return;
                    }
                    throw new Kga("Encrypted Track found but ContentEncKeyID was not found");
                }
            } else if (i2 == 28032) {
                C1347gia gia4 = this.x;
                if (gia4.e && gia4.f != null) {
                    throw new Kga("Combining encryption and compression is not supported");
                }
            } else if (i2 == 357149030) {
                if (this.u == -9223372036854775807L) {
                    this.u = 1000000;
                }
                long j3 = this.v;
                if (j3 != -9223372036854775807L) {
                    this.w = a(j3);
                }
            } else if (i2 != 374648427) {
                if (i2 == 475249515 && !this.y) {
                    Rha rha = this.ca;
                    if (this.t == -1 || this.w == -9223372036854775807L || (xka = this.F) == null || xka.a() == 0 || (xka2 = this.G) == null || xka2.a() != this.F.a()) {
                        this.F = null;
                        this.G = null;
                        vha = new Yha(this.w);
                    } else {
                        int a2 = this.F.a();
                        int[] iArr = new int[a2];
                        long[] jArr = new long[a2];
                        long[] jArr2 = new long[a2];
                        long[] jArr3 = new long[a2];
                        for (int i6 = 0; i6 < a2; i6++) {
                            jArr3[i6] = this.F.a(i6);
                            jArr[i6] = this.t + this.G.a(i6);
                        }
                        while (true) {
                            i3 = a2 - 1;
                            if (i4 >= i3) {
                                break;
                            }
                            int i7 = i4 + 1;
                            iArr[i4] = (int) (jArr[i7] - jArr[i4]);
                            jArr2[i4] = jArr3[i7] - jArr3[i4];
                            i4 = i7;
                        }
                        iArr[i3] = (int) ((this.t + this.s) - jArr[i3]);
                        jArr2[i3] = this.w - jArr3[i3];
                        this.F = null;
                        this.G = null;
                        vha = new Nha(iArr, jArr, jArr2, jArr3);
                    }
                    rha.a(vha);
                    this.y = true;
                }
            } else if (this.g.size() != 0) {
                this.ca.f();
            } else {
                throw new Kga("No valid tracks were found");
            }
        } else if (this.I == 2) {
            if (!this.ba) {
                this.Q |= 1;
            }
            a(this.g.get(this.O), this.J);
            this.I = 0;
        }
    }
}
