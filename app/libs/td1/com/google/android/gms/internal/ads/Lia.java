package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
public abstract class Lia extends AbstractC2100rga {
    private static final byte[] i = Jka.e("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private ByteBuffer[] F;
    private ByteBuffer[] G;
    private long H;
    private int I;
    private int J;
    private boolean K;
    private boolean L;
    private int M;
    private int N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    protected Bha U;
    private final Nia j;
    private final Iha<Kha> k;
    private final boolean l;
    private final Eha m;
    private final Eha n;
    private final Jga o;
    private final List<Long> p;
    private final MediaCodec.BufferInfo q;
    private Hga r;
    private Gha<Kha> s;
    private Gha<Kha> t;
    private MediaCodec u;
    private Mia v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public Lia(int i2, Nia nia, Iha<Kha> iha, boolean z2) {
        super(i2);
        C2453wka.b(Jka.f2347a >= 16);
        C2453wka.a(nia);
        this.j = nia;
        this.k = iha;
        this.l = z2;
        this.m = new Eha(0);
        this.n = new Eha(0);
        this.o = new Jga();
        this.p = new ArrayList();
        this.q = new MediaCodec.BufferInfo();
        this.M = 0;
        this.N = 0;
    }

    private final void a(Oia oia) {
        throw C2169sga.a(oia, c());
    }

    private final boolean b(long j2, long j3) {
        boolean z2;
        boolean z3;
        if (this.J < 0) {
            if (!this.B || !this.P) {
                this.J = this.u.dequeueOutputBuffer(this.q, 0);
            } else {
                try {
                    this.J = this.u.dequeueOutputBuffer(this.q, 0);
                } catch (IllegalStateException unused) {
                    o();
                    if (this.R) {
                        m();
                    }
                    return false;
                }
            }
            int i2 = this.J;
            if (i2 >= 0) {
                if (this.E) {
                    this.E = false;
                    this.u.releaseOutputBuffer(i2, false);
                    this.J = -1;
                    return true;
                }
                MediaCodec.BufferInfo bufferInfo = this.q;
                if ((bufferInfo.flags & 4) != 0) {
                    o();
                    this.J = -1;
                    return false;
                }
                ByteBuffer byteBuffer = this.G[i2];
                if (byteBuffer != null) {
                    byteBuffer.position(bufferInfo.offset);
                    MediaCodec.BufferInfo bufferInfo2 = this.q;
                    byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                long j4 = this.q.presentationTimeUs;
                int size = this.p.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        z3 = false;
                        break;
                    } else if (this.p.get(i3).longValue() == j4) {
                        this.p.remove(i3);
                        z3 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                this.K = z3;
            } else if (i2 == -2) {
                MediaFormat outputFormat = this.u.getOutputFormat();
                if (this.y && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.E = true;
                } else {
                    if (this.C) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    a(this.u, outputFormat);
                }
                return true;
            } else if (i2 == -3) {
                this.G = this.u.getOutputBuffers();
                return true;
            } else {
                if (this.z && (this.Q || this.N == 2)) {
                    o();
                }
                return false;
            }
        }
        if (!this.B || !this.P) {
            MediaCodec mediaCodec = this.u;
            ByteBuffer[] byteBufferArr = this.G;
            int i4 = this.J;
            ByteBuffer byteBuffer2 = byteBufferArr[i4];
            MediaCodec.BufferInfo bufferInfo3 = this.q;
            z2 = a(j2, j3, mediaCodec, byteBuffer2, i4, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.K);
        } else {
            try {
                z2 = a(j2, j3, this.u, this.G[this.J], this.J, this.q.flags, this.q.presentationTimeUs, this.K);
            } catch (IllegalStateException unused2) {
                o();
                if (this.R) {
                    m();
                }
                return false;
            }
        }
        if (!z2) {
            return false;
        }
        long j5 = this.q.presentationTimeUs;
        this.J = -1;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x014b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean n() {
        /*
        // Method dump skipped, instructions count: 471
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Lia.n():boolean");
    }

    private final void o() {
        if (this.N == 2) {
            m();
            j();
            return;
        }
        this.R = true;
        i();
    }

    @Override // com.google.android.gms.internal.ads.Pga
    public final int J() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.Pga
    public final int a(Hga hga) {
        try {
            return a(this.j, hga);
        } catch (Uia e) {
            throw C2169sga.a(e, c());
        }
    }

    /* access modifiers changed from: protected */
    public abstract int a(Nia nia, Hga hga);

    /* access modifiers changed from: protected */
    public Mia a(Nia nia, Hga hga, boolean z2) {
        return nia.a(hga.f, z2);
    }

    @Override // com.google.android.gms.internal.ads.Mga
    public final void a(long j2, long j3) {
        if (this.R) {
            i();
            return;
        }
        if (this.r == null) {
            this.n.a();
            int a2 = a(this.o, this.n, true);
            if (a2 == -5) {
                b(this.o.f2341a);
            } else if (a2 == -4) {
                C2453wka.b(this.n.c());
                this.Q = true;
                o();
                return;
            } else {
                return;
            }
        }
        j();
        if (this.u != null) {
            Kka.a("drainAndFeed");
            do {
            } while (b(j2, j3));
            do {
            } while (n());
            Kka.a();
        } else {
            b(j2);
            this.n.a();
            int a3 = a(this.o, this.n, false);
            if (a3 == -5) {
                b(this.o.f2341a);
            } else if (a3 == -4) {
                C2453wka.b(this.n.c());
                this.Q = true;
                o();
            }
        }
        this.U.a();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2100rga
    public void a(long j2, boolean z2) {
        this.Q = false;
        this.R = false;
        if (this.u != null) {
            this.H = -9223372036854775807L;
            this.I = -1;
            this.J = -1;
            this.T = true;
            this.S = false;
            this.K = false;
            this.p.clear();
            this.D = false;
            this.E = false;
            if (this.x || ((this.A && this.P) || this.N != 0)) {
                m();
                j();
            } else {
                this.u.flush();
                this.O = false;
            }
            if (this.L && this.r != null) {
                this.M = 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(MediaCodec mediaCodec, MediaFormat mediaFormat);

    /* access modifiers changed from: protected */
    public void a(Eha eha) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(Mia mia, MediaCodec mediaCodec, Hga hga, MediaCrypto mediaCrypto);

    /* access modifiers changed from: protected */
    public abstract void a(String str, long j2, long j3);

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2100rga
    public void a(boolean z2) {
        this.U = new Bha();
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z2);

    /* access modifiers changed from: protected */
    public boolean a(MediaCodec mediaCodec, boolean z2, Hga hga, Hga hga2) {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean a(Mia mia) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        if (r5.k == r0.k) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.google.android.gms.internal.ads.Hga r5) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Lia.b(com.google.android.gms.internal.ads.Hga):void");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2100rga
    public void d() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2100rga
    public void e() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2100rga
    public void f() {
        this.r = null;
        try {
            m();
            try {
                if (this.s != null) {
                    this.k.a(this.s);
                }
                try {
                    if (!(this.t == null || this.t == this.s)) {
                        this.k.a(this.t);
                    }
                } finally {
                    this.s = null;
                    this.t = null;
                }
            } catch (Throwable th) {
                if (!(this.t == null || this.t == this.s)) {
                    this.k.a(this.t);
                }
                throw th;
            } finally {
                this.s = null;
                this.t = null;
            }
        } catch (Throwable th2) {
            try {
                if (!(this.t == null || this.t == this.s)) {
                    this.k.a(this.t);
                }
                throw th2;
            } finally {
                this.s = null;
                this.t = null;
            }
        } finally {
        }
    }

    /* access modifiers changed from: protected */
    public void i() {
    }

    /* access modifiers changed from: protected */
    public final void j() {
        Hga hga;
        if (this.u == null && (hga = this.r) != null) {
            this.s = this.t;
            String str = hga.f;
            Gha<Kha> gha = this.s;
            if (gha != null) {
                int state = gha.getState();
                if (state == 0) {
                    throw C2169sga.a(this.s.a(), c());
                } else if (state == 3 || state == 4) {
                    this.s.b();
                    throw new NoSuchMethodError();
                }
            } else {
                if (this.v == null) {
                    try {
                        this.v = a(this.j, hga, false);
                        Mia mia = this.v;
                        if (this.v == null) {
                            a(new Oia(this.r, (Throwable) null, false, -49999));
                            throw null;
                        }
                    } catch (Uia e) {
                        a(new Oia(this.r, (Throwable) e, false, -49998));
                        throw null;
                    }
                }
                if (a(this.v)) {
                    String str2 = this.v.f2610a;
                    this.w = Jka.f2347a < 21 && this.r.h.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
                    int i2 = Jka.f2347a;
                    this.x = i2 < 18 || (i2 == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (Jka.f2347a == 19 && Jka.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
                    this.y = Jka.f2347a < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2)) && ("flounder".equals(Jka.f2348b) || "flounder_lte".equals(Jka.f2348b) || "grouper".equals(Jka.f2348b) || "tilapia".equals(Jka.f2348b));
                    this.z = Jka.f2347a <= 17 && ("OMX.rk.video_decoder.avc".equals(str2) || "OMX.allwinner.video.decoder.avc".equals(str2));
                    this.A = (Jka.f2347a <= 23 && "OMX.google.vorbis.decoder".equals(str2)) || (Jka.f2347a <= 19 && "hb2000".equals(Jka.f2348b) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2)));
                    this.B = Jka.f2347a == 21 && "OMX.google.aac.decoder".equals(str2);
                    this.C = Jka.f2347a <= 18 && this.r.r == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String valueOf = String.valueOf(str2);
                        Kka.a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
                        this.u = MediaCodec.createByCodecName(str2);
                        Kka.a();
                        Kka.a("configureCodec");
                        a(this.v, this.u, this.r, (MediaCrypto) null);
                        Kka.a();
                        Kka.a("startCodec");
                        this.u.start();
                        Kka.a();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        a(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                        this.F = this.u.getInputBuffers();
                        this.G = this.u.getOutputBuffers();
                        this.H = getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                        this.I = -1;
                        this.J = -1;
                        this.T = true;
                        this.U.f1634a++;
                    } catch (Exception e2) {
                        a(new Oia(this.r, (Throwable) e2, false, str2));
                        throw null;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final MediaCodec k() {
        return this.u;
    }

    /* access modifiers changed from: protected */
    public final Mia l() {
        return this.v;
    }

    /* access modifiers changed from: protected */
    public void m() {
        this.H = -9223372036854775807L;
        this.I = -1;
        this.J = -1;
        this.S = false;
        this.K = false;
        this.p.clear();
        this.F = null;
        this.G = null;
        this.v = null;
        this.L = false;
        this.O = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.P = false;
        this.M = 0;
        this.N = 0;
        this.m.f1886c = null;
        MediaCodec mediaCodec = this.u;
        if (mediaCodec != null) {
            this.U.f1635b++;
            try {
                mediaCodec.stop();
                try {
                    this.u.release();
                    this.u = null;
                    Gha<Kha> gha = this.s;
                    if (gha != null && this.t != gha) {
                        try {
                            this.k.a(gha);
                        } finally {
                            this.s = null;
                        }
                    }
                } catch (Throwable th) {
                    this.u = null;
                    Gha<Kha> gha2 = this.s;
                    if (!(gha2 == null || this.t == gha2)) {
                        this.k.a(gha2);
                    }
                    throw th;
                } finally {
                    this.s = null;
                }
            } catch (Throwable th2) {
                this.u = null;
                Gha<Kha> gha3 = this.s;
                if (!(gha3 == null || this.t == gha3)) {
                    try {
                        this.k.a(gha3);
                    } finally {
                        this.s = null;
                    }
                }
                throw th2;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Mga
    public boolean p() {
        if (this.r == null || this.S) {
            return false;
        }
        if (h() || this.J >= 0) {
            return true;
        }
        return this.H != -9223372036854775807L && SystemClock.elapsedRealtime() < this.H;
    }

    @Override // com.google.android.gms.internal.ads.Mga
    public boolean q() {
        return this.R;
    }
}
