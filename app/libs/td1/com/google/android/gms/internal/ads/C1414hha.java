package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.hha  reason: case insensitive filesystem */
public final class C1414hha {
    private long A;
    private long B;
    private boolean C;
    private long D;
    private Method E;
    private int F;
    private long G;
    private long H;
    private int I;
    private long J;
    private long K;
    private int L;
    private int M;
    private long N;
    private long O;
    private long P;
    private float Q;
    private Yga[] R;
    private ByteBuffer[] S;
    private ByteBuffer T;
    private ByteBuffer U;
    private byte[] V;
    private int W;
    private int X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a  reason: collision with root package name */
    private final Vga f4496a = null;
    private int aa;

    /* renamed from: b  reason: collision with root package name */
    private final C1896oha f4497b;
    private boolean ba;

    /* renamed from: c  reason: collision with root package name */
    private final C2585yha f4498c;
    private boolean ca;
    private final Yga[] d;
    private long da;
    private final AbstractC1827nha e;
    private final ConditionVariable f;
    private final long[] g;
    private final C1551jha h;
    private final LinkedList<C1758mha> i;
    private AudioTrack j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private int q;
    private long r;
    private Nga s;
    private Nga t;
    private long u;
    private long v;
    private ByteBuffer w;
    private int x;
    private int y;
    private int z;

    public C1414hha(Vga vga, Yga[] ygaArr, AbstractC1827nha nha) {
        this.e = nha;
        this.f = new ConditionVariable(true);
        if (Jka.f2347a >= 18) {
            try {
                this.E = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (Jka.f2347a >= 19) {
            this.h = new C1482iha();
        } else {
            this.h = new C1551jha(null);
        }
        this.f4497b = new C1896oha();
        this.f4498c = new C2585yha();
        this.d = new Yga[(ygaArr.length + 3)];
        this.d[0] = new C2447wha();
        Yga[] ygaArr2 = this.d;
        ygaArr2[1] = this.f4497b;
        System.arraycopy(ygaArr, 0, ygaArr2, 2, ygaArr.length);
        this.d[ygaArr.length + 2] = this.f4498c;
        this.g = new long[10];
        this.Q = 1.0f;
        this.M = 0;
        this.o = 3;
        this.aa = 0;
        this.t = Nga.f2682a;
        this.X = -1;
        this.R = new Yga[0];
        this.S = new ByteBuffer[0];
        this.i = new LinkedList<>();
    }

    private final void a(long j2) {
        ByteBuffer byteBuffer;
        int length = this.R.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.S[i2 - 1];
            } else {
                byteBuffer = this.T;
                if (byteBuffer == null) {
                    byteBuffer = Yga.f3578a;
                }
            }
            if (i2 == length) {
                b(byteBuffer, j2);
            } else {
                Yga yga = this.R[i2];
                yga.a(byteBuffer);
                ByteBuffer a2 = yga.a();
                this.S[i2] = a2;
                if (a2.hasRemaining()) {
                    i2++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i2--;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private static int b(String str) {
        char c2;
        switch (str.hashCode()) {
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            return 5;
        }
        if (c2 == 1) {
            return 6;
        }
        if (c2 != 2) {
            return c2 != 3 ? 0 : 8;
        }
        return 7;
    }

    private final long b(long j2) {
        return (j2 * 1000000) / ((long) this.k);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d9, code lost:
        if (r11 < r10) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b(java.nio.ByteBuffer r9, long r10) {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1414hha.b(java.nio.ByteBuffer, long):boolean");
    }

    private final long c(long j2) {
        return (j2 * ((long) this.k)) / 1000000;
    }

    private final boolean k() {
        return this.j != null;
    }

    private final void l() {
        ArrayList arrayList = new ArrayList();
        Yga[] ygaArr = this.d;
        for (Yga yga : ygaArr) {
            if (yga.c()) {
                arrayList.add(yga);
            } else {
                yga.flush();
            }
        }
        int size = arrayList.size();
        this.R = (Yga[]) arrayList.toArray(new Yga[size]);
        this.S = new ByteBuffer[size];
        for (int i2 = 0; i2 < size; i2++) {
            Yga yga2 = this.R[i2];
            yga2.flush();
            this.S[i2] = yga2.a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m() {
        /*
            r9 = this;
            int r0 = r9.X
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.p
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.Yga[] r0 = r9.R
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r9.X = r0
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r9.X
            com.google.android.gms.internal.ads.Yga[] r5 = r9.R
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0036
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.d()
        L_0x0028:
            r9.a(r7)
            boolean r0 = r4.q()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.X
            int r0 = r0 + r2
            goto L_0x0010
        L_0x0036:
            java.nio.ByteBuffer r0 = r9.U
            if (r0 == 0) goto L_0x0042
            r9.b(r0, r7)
            java.nio.ByteBuffer r0 = r9.U
            if (r0 == 0) goto L_0x0042
            return r3
        L_0x0042:
            r9.X = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1414hha.m():boolean");
    }

    private final void n() {
        if (!k()) {
            return;
        }
        if (Jka.f2347a >= 21) {
            this.j.setVolume(this.Q);
            return;
        }
        AudioTrack audioTrack = this.j;
        float f2 = this.Q;
        audioTrack.setStereoVolume(f2, f2);
    }

    private final long o() {
        return this.p ? this.K : this.J / ((long) this.I);
    }

    private final void p() {
        this.A = 0;
        this.z = 0;
        this.y = 0;
        this.B = 0;
        this.C = false;
        this.D = 0;
    }

    private final boolean q() {
        if (Jka.f2347a >= 23) {
            return false;
        }
        int i2 = this.n;
        return i2 == 5 || i2 == 6;
    }

    public final long a(boolean z2) {
        long j2;
        long j3;
        long j4;
        long j5;
        StringBuilder sb;
        String str;
        if (!(k() && this.M != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.j.getPlayState() == 3) {
            long f2 = this.h.f();
            if (f2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.B >= 30000) {
                    long[] jArr = this.g;
                    int i2 = this.y;
                    jArr[i2] = f2 - nanoTime;
                    this.y = (i2 + 1) % 10;
                    int i3 = this.z;
                    if (i3 < 10) {
                        this.z = i3 + 1;
                    }
                    this.B = nanoTime;
                    this.A = 0;
                    int i4 = 0;
                    while (true) {
                        int i5 = this.z;
                        if (i4 >= i5) {
                            break;
                        }
                        this.A += this.g[i4] / ((long) i5);
                        i4++;
                    }
                }
                if (!q() && nanoTime - this.D >= 500000) {
                    this.C = this.h.b();
                    if (this.C) {
                        long c2 = this.h.c() / 1000;
                        long d2 = this.h.d();
                        if (c2 >= this.O) {
                            if (Math.abs(c2 - nanoTime) > 5000000) {
                                sb = new StringBuilder(136);
                                str = "Spurious audio timestamp (system clock mismatch): ";
                            } else if (Math.abs(b(d2) - f2) > 5000000) {
                                sb = new StringBuilder(138);
                                str = "Spurious audio timestamp (frame position mismatch): ";
                            }
                            sb.append(str);
                            sb.append(d2);
                            sb.append(", ");
                            sb.append(c2);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(f2);
                            Log.w("AudioTrack", sb.toString());
                        }
                        this.C = false;
                    }
                    Method method = this.E;
                    if (method != null && !this.p) {
                        try {
                            this.P = (((long) ((Integer) method.invoke(this.j, null)).intValue()) * 1000) - this.r;
                            this.P = Math.max(this.P, 0L);
                            if (this.P > 5000000) {
                                long j6 = this.P;
                                StringBuilder sb2 = new StringBuilder(61);
                                sb2.append("Ignoring impossibly large audio latency: ");
                                sb2.append(j6);
                                Log.w("AudioTrack", sb2.toString());
                                this.P = 0;
                            }
                        } catch (Exception unused) {
                            this.E = null;
                        }
                    }
                    this.D = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.C) {
            j2 = b(this.h.d() + c(nanoTime2 - (this.h.c() / 1000)));
        } else {
            j2 = this.z == 0 ? this.h.f() : nanoTime2 + this.A;
            if (!z2) {
                j2 -= this.P;
            }
        }
        long j7 = this.N;
        while (!this.i.isEmpty() && j2 >= C1758mha.b(this.i.getFirst())) {
            C1758mha remove = this.i.remove();
            this.t = C1758mha.a(remove);
            this.v = C1758mha.b(remove);
            this.u = C1758mha.c(remove) - this.N;
        }
        if (this.t.f2683b == 1.0f) {
            j3 = (j2 + this.u) - this.v;
        } else {
            if (!this.i.isEmpty() || this.f4498c.g() < 1024) {
                j4 = this.u;
                double d3 = (double) this.t.f2683b;
                double d4 = (double) (j2 - this.v);
                Double.isNaN(d3);
                Double.isNaN(d4);
                j5 = (long) (d3 * d4);
            } else {
                j4 = this.u;
                j5 = Jka.a(j2 - this.v, this.f4498c.f(), this.f4498c.g());
            }
            j3 = j5 + j4;
        }
        return j7 + j3;
    }

    public final Nga a(Nga nga) {
        if (this.p) {
            this.t = Nga.f2682a;
            return this.t;
        }
        float a2 = this.f4498c.a(nga.f2683b);
        C2585yha yha = this.f4498c;
        float f2 = nga.f2684c;
        yha.b(f2);
        Nga nga2 = new Nga(a2, f2);
        Nga nga3 = this.s;
        if (nga3 == null) {
            nga3 = !this.i.isEmpty() ? C1758mha.a(this.i.getLast()) : this.t;
        }
        if (!nga2.equals(nga3)) {
            if (k()) {
                this.s = nga2;
            } else {
                this.t = nga2;
            }
        }
        return this.t;
    }

    public final void a() {
        this.Z = false;
        if (k()) {
            p();
            this.h.a();
        }
    }

    public final void a(float f2) {
        if (this.Q != f2) {
            this.Q = f2;
            n();
        }
    }

    public final void a(int i2) {
        if (this.o != i2) {
            this.o = i2;
            if (!this.ba) {
                d();
                this.aa = 0;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r8, int r9, int r10, int r11, int r12, int[] r13) {
        /*
        // Method dump skipped, instructions count: 360
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1414hha.a(java.lang.String, int, int, int, int, int[]):void");
    }

    public final boolean a(String str) {
        Vga vga = this.f4496a;
        return vga != null && vga.a(b(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ce A[SYNTHETIC, Splitter:B:23:0x00ce] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.nio.ByteBuffer r25, long r26) {
        /*
        // Method dump skipped, instructions count: 598
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1414hha.a(java.nio.ByteBuffer, long):boolean");
    }

    public final void b() {
        this.Z = true;
        if (k()) {
            this.O = System.nanoTime() / 1000;
            this.j.play();
        }
    }

    public final void b(int i2) {
        C2453wka.b(Jka.f2347a >= 21);
        if (!this.ba || this.aa != i2) {
            this.ba = true;
            this.aa = i2;
            d();
        }
    }

    public final void c() {
        d();
        for (Yga yga : this.d) {
            yga.reset();
        }
        this.aa = 0;
        this.Z = false;
    }

    public final void d() {
        if (k()) {
            this.G = 0;
            this.H = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            Nga nga = this.s;
            if (nga != null) {
                this.t = nga;
                this.s = null;
            } else if (!this.i.isEmpty()) {
                this.t = C1758mha.a(this.i.getLast());
            }
            this.i.clear();
            this.u = 0;
            this.v = 0;
            this.T = null;
            this.U = null;
            int i2 = 0;
            while (true) {
                Yga[] ygaArr = this.R;
                if (i2 >= ygaArr.length) {
                    break;
                }
                Yga yga = ygaArr[i2];
                yga.flush();
                this.S[i2] = yga.a();
                i2++;
            }
            this.Y = false;
            this.X = -1;
            this.w = null;
            this.x = 0;
            this.M = 0;
            this.P = 0;
            p();
            if (this.j.getPlayState() == 3) {
                this.j.pause();
            }
            AudioTrack audioTrack = this.j;
            this.j = null;
            this.h.a(null, false);
            this.f.close();
            new C1345gha(this, audioTrack).start();
        }
    }

    public final boolean e() {
        if (k()) {
            return this.Y && !h();
        }
        return true;
    }

    public final void f() {
        if (this.M == 1) {
            this.M = 2;
        }
    }

    public final void g() {
        if (!this.Y && k() && m()) {
            this.h.a(o());
            this.x = 0;
            this.Y = true;
        }
    }

    public final boolean h() {
        if (k()) {
            if (o() <= this.h.e()) {
                if (q() && this.j.getPlayState() == 2 && this.j.getPlaybackHeadPosition() == 0) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public final Nga i() {
        return this.t;
    }

    public final void j() {
        if (this.ba) {
            this.ba = false;
            this.aa = 0;
            d();
        }
    }
}
