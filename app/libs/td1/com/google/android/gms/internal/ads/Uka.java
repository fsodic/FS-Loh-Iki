package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
public final class Uka extends Lia {
    private static final int[] V = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private long Aa;
    private int Ba;
    private final Context W;
    private final Zka X;
    private final _ka Y;
    private final long Z;
    private final int aa;
    private final boolean ba;
    private final long[] ca;
    private Hga[] da;
    private Xka ea;
    private Surface fa;
    private Surface ga;
    private int ha;
    private boolean ia;
    private long ja;
    private long ka;
    private int la;
    private int ma;
    private int na;
    private float oa;
    private int pa;
    private int qa;
    private int ra;
    private float sa;
    private int ta;
    private int ua;
    private int va;
    private float wa;
    private boolean xa;
    private int ya;
    Wka za;

    public Uka(Context context, Nia nia, long j, Handler handler, AbstractC0940ala ala, int i) {
        this(context, nia, 0, null, false, handler, ala, -1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private Uka(Context context, Nia nia, long j, Iha<Kha> iha, boolean z, Handler handler, AbstractC0940ala ala, int i) {
        super(2, nia, null, false);
        boolean z2 = false;
        this.Z = 0;
        this.aa = -1;
        this.W = context.getApplicationContext();
        this.X = new Zka(context);
        this.Y = new _ka(handler, ala);
        if (Jka.f2347a <= 22 && "foster".equals(Jka.f2348b) && "NVIDIA".equals(Jka.f2349c)) {
            z2 = true;
        }
        this.ba = z2;
        this.ca = new long[10];
        this.Aa = -9223372036854775807L;
        this.ja = -9223372036854775807L;
        this.pa = -1;
        this.qa = -1;
        this.sa = -1.0f;
        this.oa = -1.0f;
        this.ha = 1;
        B();
    }

    private final void A() {
        MediaCodec k;
        this.ia = false;
        if (Jka.f2347a >= 23 && this.xa && (k = k()) != null) {
            this.za = new Wka(this, k);
        }
    }

    private final void B() {
        this.ta = -1;
        this.ua = -1;
        this.wa = -1.0f;
        this.va = -1;
    }

    private final void C() {
        if (this.ta != this.pa || this.ua != this.qa || this.va != this.ra || this.wa != this.sa) {
            this.Y.a(this.pa, this.qa, this.ra, this.sa);
            this.ta = this.pa;
            this.ua = this.qa;
            this.va = this.ra;
            this.wa = this.sa;
        }
    }

    private final void D() {
        if (this.ta != -1 || this.ua != -1) {
            this.Y.a(this.pa, this.qa, this.ra, this.sa);
        }
    }

    private final void E() {
        if (this.la > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.Y.a(this.la, elapsedRealtime - this.ka);
            this.la = 0;
            this.ka = elapsedRealtime;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private static int a(String str, int i, int i2) {
        char c2;
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        int i4 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (!(c2 == 0 || c2 == 1)) {
            if (c2 != 2) {
                if (c2 != 3) {
                    if (c2 != 4 && c2 != 5) {
                        return -1;
                    }
                    i3 = i * i2;
                    return (i3 * 3) / (i4 * 2);
                }
            } else if ("BRAVIA 4K 2015".equals(Jka.d)) {
                return -1;
            } else {
                i3 = ((Jka.a(i, 16) * Jka.a(i2, 16)) << 4) << 4;
                i4 = 2;
                return (i3 * 3) / (i4 * 2);
            }
        }
        i3 = i * i2;
        i4 = 2;
        return (i3 * 3) / (i4 * 2);
    }

    private final void a(MediaCodec mediaCodec, int i, long j) {
        Kka.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        Kka.a();
        this.U.e++;
    }

    @TargetApi(21)
    private final void a(MediaCodec mediaCodec, int i, long j, long j2) {
        C();
        Kka.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        Kka.a();
        this.U.d++;
        this.ma = 0;
        n();
    }

    private static boolean a(boolean z, Hga hga, Hga hga2) {
        if (!hga.f.equals(hga2.f) || d(hga) != d(hga2)) {
            return false;
        }
        if (!z) {
            return hga.j == hga2.j && hga.k == hga2.k;
        }
        return true;
    }

    private final void b(MediaCodec mediaCodec, int i, long j) {
        C();
        Kka.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        Kka.a();
        this.U.d++;
        this.ma = 0;
        n();
    }

    private final boolean b(boolean z) {
        if (Jka.f2347a < 23 || this.xa) {
            return false;
        }
        return !z || Qka.a(this.W);
    }

    private static int c(Hga hga) {
        int i = hga.g;
        return i != -1 ? i : a(hga.f, hga.j, hga.k);
    }

    private static boolean c(long j) {
        return j < -30000;
    }

    private static int d(Hga hga) {
        int i = hga.m;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    private final void o() {
        this.ja = this.Z > 0 ? SystemClock.elapsedRealtime() + this.Z : -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia
    public final int a(Nia nia, Hga hga) {
        boolean z;
        int i;
        int i2;
        String str = hga.f;
        int i3 = 0;
        if (!C2660zka.b(str)) {
            return 0;
        }
        Dha dha = hga.i;
        if (dha != null) {
            z = false;
            for (int i4 = 0; i4 < dha.f1799c; i4++) {
                z |= dha.a(i4).e;
            }
        } else {
            z = false;
        }
        Mia a2 = nia.a(str, z);
        if (a2 == null) {
            return 1;
        }
        boolean b2 = a2.b(hga.f2159c);
        if (b2 && (i = hga.j) > 0 && (i2 = hga.k) > 0) {
            if (Jka.f2347a >= 21) {
                b2 = a2.a(i, i2, (double) hga.l);
            } else {
                b2 = i * i2 <= Pia.b();
                if (!b2) {
                    int i5 = hga.j;
                    int i6 = hga.k;
                    String str2 = Jka.e;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                    sb.append("FalseCheck [legacyFrameSize, ");
                    sb.append(i5);
                    sb.append("x");
                    sb.append(i6);
                    sb.append("] [");
                    sb.append(str2);
                    sb.append("]");
                    Log.d("MediaCodecVideoRenderer", sb.toString());
                }
            }
        }
        int i7 = a2.f2611b ? 8 : 4;
        if (a2.f2612c) {
            i3 = 16;
        }
        return (b2 ? 3 : 2) | i7 | i3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2514xga, com.google.android.gms.internal.ads.AbstractC2100rga
    public final void a(int i, Object obj) {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.ga;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    Mia l = l();
                    if (l != null && b(l.d)) {
                        this.ga = Qka.a(this.W, l.d);
                        surface = this.ga;
                    }
                }
            }
            if (this.fa != surface) {
                this.fa = surface;
                int state = getState();
                if (state == 1 || state == 2) {
                    MediaCodec k = k();
                    if (Jka.f2347a < 23 || k == null || surface == null) {
                        m();
                        j();
                    } else {
                        k.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.ga) {
                    B();
                    A();
                    return;
                }
                D();
                A();
                if (state == 2) {
                    o();
                }
            } else if (surface != null && surface != this.ga) {
                D();
                if (this.ia) {
                    this.Y.a(this.fa);
                }
            }
        } else if (i == 4) {
            this.ha = ((Integer) obj).intValue();
            MediaCodec k2 = k();
            if (k2 != null) {
                k2.setVideoScalingMode(this.ha);
            }
        } else {
            super.a(i, obj);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia, com.google.android.gms.internal.ads.AbstractC2100rga
    public final void a(long j, boolean z) {
        super.a(j, z);
        A();
        this.ma = 0;
        int i = this.Ba;
        if (i != 0) {
            this.Aa = this.ca[i - 1];
            this.Ba = 0;
        }
        if (z) {
            o();
        } else {
            this.ja = -9223372036854775807L;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        this.pa = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        this.qa = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.sa = this.oa;
        if (Jka.f2347a >= 21) {
            int i = this.na;
            if (i == 90 || i == 270) {
                int i2 = this.pa;
                this.pa = this.qa;
                this.qa = i2;
                this.sa = 1.0f / this.sa;
            }
        } else {
            this.ra = this.na;
        }
        mediaCodec.setVideoScalingMode(this.ha);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia
    public final void a(Eha eha) {
        if (Jka.f2347a < 23 && this.xa) {
            n();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia
    public final void a(Mia mia, MediaCodec mediaCodec, Hga hga, MediaCrypto mediaCrypto) {
        Xka xka;
        int i;
        Point point;
        float f;
        Hga[] hgaArr = this.da;
        int i2 = hga.j;
        int i3 = hga.k;
        int c2 = c(hga);
        if (hgaArr.length == 1) {
            xka = new Xka(i2, i3, c2);
        } else {
            int i4 = i3;
            int i5 = c2;
            boolean z = false;
            int i6 = i2;
            for (Hga hga2 : hgaArr) {
                if (a(mia.f2611b, hga, hga2)) {
                    z |= hga2.j == -1 || hga2.k == -1;
                    i6 = Math.max(i6, hga2.j);
                    int max = Math.max(i4, hga2.k);
                    i5 = Math.max(i5, c(hga2));
                    i4 = max;
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i6);
                sb.append("x");
                sb.append(i4);
                Log.w("MediaCodecVideoRenderer", sb.toString());
                boolean z2 = hga.k > hga.j;
                int i7 = z2 ? hga.k : hga.j;
                int i8 = z2 ? hga.j : hga.k;
                float f2 = ((float) i8) / ((float) i7);
                int[] iArr = V;
                int length = iArr.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        break;
                    }
                    int i10 = iArr[i9];
                    int i11 = (int) (((float) i10) * f2);
                    if (i10 <= i7 || i11 <= i8) {
                        break;
                    }
                    if (Jka.f2347a >= 21) {
                        int i12 = z2 ? i11 : i10;
                        if (z2) {
                            i11 = i10;
                        }
                        Point a2 = mia.a(i12, i11);
                        i = i5;
                        f = f2;
                        if (mia.a(a2.x, a2.y, (double) hga.l)) {
                            point = a2;
                            break;
                        }
                    } else {
                        i = i5;
                        f = f2;
                        int a3 = Jka.a(i10, 16) << 4;
                        int a4 = Jka.a(i11, 16) << 4;
                        if (a3 * a4 <= Pia.b()) {
                            int i13 = z2 ? a4 : a3;
                            if (z2) {
                                a4 = a3;
                            }
                            point = new Point(i13, a4);
                        }
                    }
                    i9++;
                    length = length;
                    iArr = iArr;
                    i7 = i7;
                    i8 = i8;
                    i5 = i;
                    f2 = f;
                }
                i = i5;
                point = null;
                if (point != null) {
                    i6 = Math.max(i6, point.x);
                    i4 = Math.max(i4, point.y);
                    i5 = Math.max(i, a(hga.f, i6, i4));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i6);
                    sb2.append("x");
                    sb2.append(i4);
                    Log.w("MediaCodecVideoRenderer", sb2.toString());
                } else {
                    i5 = i;
                }
            }
            xka = new Xka(i6, i4, i5);
        }
        this.ea = xka;
        Xka xka2 = this.ea;
        boolean z3 = this.ba;
        int i14 = this.ya;
        MediaFormat K = hga.K();
        K.setInteger("max-width", xka2.f3522a);
        K.setInteger("max-height", xka2.f3523b);
        int i15 = xka2.f3524c;
        if (i15 != -1) {
            K.setInteger("max-input-size", i15);
        }
        if (z3) {
            K.setInteger("auto-frc", 0);
        }
        if (i14 != 0) {
            K.setFeatureEnabled("tunneled-playback", true);
            K.setInteger("audio-session-id", i14);
        }
        if (this.fa == null) {
            C2453wka.b(b(mia.d));
            if (this.ga == null) {
                this.ga = Qka.a(this.W, mia.d);
            }
            this.fa = this.ga;
        }
        mediaCodec.configure(K, this.fa, (MediaCrypto) null, 0);
        if (Jka.f2347a >= 23 && this.xa) {
            this.za = new Wka(this, mediaCodec);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia
    public final void a(String str, long j, long j2) {
        this.Y.a(str, j, j2);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia, com.google.android.gms.internal.ads.AbstractC2100rga
    public final void a(boolean z) {
        super.a(z);
        this.ya = g().f2773b;
        this.xa = this.ya != 0;
        this.Y.a(this.U);
        this.X.b();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2100rga
    public final void a(Hga[] hgaArr, long j) {
        this.da = hgaArr;
        if (this.Aa == -9223372036854775807L) {
            this.Aa = j;
        } else {
            int i = this.Ba;
            long[] jArr = this.ca;
            if (i == jArr.length) {
                long j2 = jArr[i - 1];
                StringBuilder sb = new StringBuilder(65);
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(j2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
            } else {
                this.Ba = i + 1;
            }
            this.ca[this.Ba - 1] = j;
        }
        super.a(hgaArr, j);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia
    public final boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        while (true) {
            int i3 = this.Ba;
            if (i3 == 0) {
                break;
            }
            long[] jArr = this.ca;
            if (j3 < jArr[0]) {
                break;
            }
            this.Aa = jArr[0];
            this.Ba = i3 - 1;
            System.arraycopy(jArr, 1, jArr, 0, this.Ba);
        }
        long j4 = j3 - this.Aa;
        if (z) {
            a(mediaCodec, i, j4);
            return true;
        }
        long j5 = j3 - j;
        if (this.fa == this.ga) {
            if (!c(j5)) {
                return false;
            }
            a(mediaCodec, i, j4);
            return true;
        } else if (!this.ia) {
            if (Jka.f2347a >= 21) {
                a(mediaCodec, i, j4, System.nanoTime());
            } else {
                b(mediaCodec, i, j4);
            }
            return true;
        } else if (getState() != 2) {
            return false;
        } else {
            long elapsedRealtime = j5 - ((SystemClock.elapsedRealtime() * 1000) - j2);
            long nanoTime = System.nanoTime();
            long a2 = this.X.a(j3, (elapsedRealtime * 1000) + nanoTime);
            long j6 = (a2 - nanoTime) / 1000;
            if (c(j6)) {
                Kka.a("dropVideoBuffer");
                mediaCodec.releaseOutputBuffer(i, false);
                Kka.a();
                Bha bha = this.U;
                bha.f++;
                this.la++;
                this.ma++;
                bha.g = Math.max(this.ma, bha.g);
                if (this.la == this.aa) {
                    E();
                }
                return true;
            }
            if (Jka.f2347a >= 21) {
                if (j6 < 50000) {
                    a(mediaCodec, i, j4, a2);
                    return true;
                }
            } else if (j6 < 30000) {
                if (j6 > 11000) {
                    try {
                        Thread.sleep((j6 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                b(mediaCodec, i, j4);
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia
    public final boolean a(MediaCodec mediaCodec, boolean z, Hga hga, Hga hga2) {
        if (!a(z, hga, hga2)) {
            return false;
        }
        int i = hga2.j;
        Xka xka = this.ea;
        return i <= xka.f3522a && hga2.k <= xka.f3523b && hga2.g <= xka.f3524c;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia
    public final boolean a(Mia mia) {
        return this.fa != null || b(mia.d);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia
    public final void b(Hga hga) {
        super.b(hga);
        this.Y.a(hga);
        float f = hga.n;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.oa = f;
        this.na = d(hga);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia, com.google.android.gms.internal.ads.AbstractC2100rga
    public final void d() {
        super.d();
        this.la = 0;
        this.ka = SystemClock.elapsedRealtime();
        this.ja = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia, com.google.android.gms.internal.ads.AbstractC2100rga
    public final void e() {
        E();
        super.e();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia, com.google.android.gms.internal.ads.AbstractC2100rga
    public final void f() {
        this.pa = -1;
        this.qa = -1;
        this.sa = -1.0f;
        this.oa = -1.0f;
        this.Aa = -9223372036854775807L;
        this.Ba = 0;
        B();
        A();
        this.X.a();
        this.za = null;
        this.xa = false;
        try {
            super.f();
        } finally {
            this.U.a();
            this.Y.b(this.U);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia
    public final void m() {
        try {
            super.m();
        } finally {
            Surface surface = this.ga;
            if (surface != null) {
                if (this.fa == surface) {
                    this.fa = null;
                }
                this.ga.release();
                this.ga = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void n() {
        if (!this.ia) {
            this.ia = true;
            this.Y.a(this.fa);
        }
    }

    @Override // com.google.android.gms.internal.ads.Mga, com.google.android.gms.internal.ads.Lia
    public final boolean p() {
        Surface surface;
        if (super.p() && (this.ia || (((surface = this.ga) != null && this.fa == surface) || k() == null))) {
            this.ja = -9223372036854775807L;
            return true;
        } else if (this.ja == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.ja) {
                return true;
            }
            this.ja = -9223372036854775807L;
            return false;
        }
    }
}
