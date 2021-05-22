package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
/* renamed from: com.google.android.gms.internal.ads.qha  reason: case insensitive filesystem */
public final class C2034qha extends Lia implements Aka {
    private final Zga V;
    private final C1414hha W;
    private boolean X;
    private boolean Y;
    private MediaFormat Z;
    private int aa;
    private int ba;
    private long ca;
    private boolean da;

    public C2034qha(Nia nia) {
        this(nia, null, true);
    }

    private C2034qha(Nia nia, Iha<Kha> iha, boolean z) {
        this(nia, null, true, null, null);
    }

    private C2034qha(Nia nia, Iha<Kha> iha, boolean z, Handler handler, _ga _ga) {
        this(nia, null, true, null, null, null, new Yga[0]);
    }

    private C2034qha(Nia nia, Iha<Kha> iha, boolean z, Handler handler, _ga _ga, Vga vga, Yga... ygaArr) {
        super(1, nia, iha, z);
        this.W = new C1414hha(null, ygaArr, new C2240tha(this));
        this.V = new Zga(null, null);
    }

    protected static void a(int i) {
    }

    protected static void a(int i, long j, long j2) {
    }

    private final boolean a(String str) {
        return this.W.a(str);
    }

    protected static void n() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia
    public final int a(Nia nia, Hga hga) {
        int i;
        int i2;
        String str = hga.f;
        if (!C2660zka.a(str)) {
            return 0;
        }
        int i3 = Jka.f2347a >= 21 ? 16 : 0;
        int i4 = 3;
        if (a(str) && nia.a() != null) {
            return i3 | 4 | 3;
        }
        Mia a2 = nia.a(str, false);
        boolean z = true;
        if (a2 == null) {
            return 1;
        }
        if (Jka.f2347a >= 21 && (((i = hga.s) != -1 && !a2.a(i)) || ((i2 = hga.r) != -1 && !a2.b(i2)))) {
            z = false;
        }
        if (!z) {
            i4 = 2;
        }
        return i3 | 4 | i4;
    }

    @Override // com.google.android.gms.internal.ads.Aka
    public final long a() {
        long a2 = this.W.a(q());
        if (a2 != Long.MIN_VALUE) {
            if (!this.da) {
                a2 = Math.max(this.ca, a2);
            }
            this.ca = a2;
            this.da = false;
        }
        return this.ca;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia
    public final Mia a(Nia nia, Hga hga, boolean z) {
        Mia a2;
        if (!a(hga.f) || (a2 = nia.a()) == null) {
            this.X = false;
            return super.a(nia, hga, z);
        }
        this.X = true;
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.Aka
    public final Nga a(Nga nga) {
        return this.W.a(nga);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2514xga, com.google.android.gms.internal.ads.AbstractC2100rga
    public final void a(int i, Object obj) {
        if (i == 2) {
            this.W.a(((Float) obj).floatValue());
        } else if (i != 3) {
            super.a(i, obj);
        } else {
            this.W.a(((Integer) obj).intValue());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia, com.google.android.gms.internal.ads.AbstractC2100rga
    public final void a(long j, boolean z) {
        super.a(j, z);
        this.W.d();
        this.ca = j;
        this.da = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int[] iArr;
        int i;
        boolean z = this.Z != null;
        String string = z ? this.Z.getString("mime") : "audio/raw";
        if (z) {
            mediaFormat = this.Z;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.Y || integer != 6 || (i = this.ba) >= 6) {
            iArr = null;
        } else {
            iArr = new int[i];
            for (int i2 = 0; i2 < this.ba; i2++) {
                iArr[i2] = i2;
            }
        }
        try {
            this.W.a(string, integer, integer2, this.aa, 0, iArr);
        } catch (C1689lha e) {
            throw C2169sga.a(e, c());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia
    public final void a(Mia mia, MediaCodec mediaCodec, Hga hga, MediaCrypto mediaCrypto) {
        this.Y = Jka.f2347a < 24 && "OMX.SEC.aac.dec".equals(mia.f2610a) && "samsung".equals(Jka.f2349c) && (Jka.f2348b.startsWith("zeroflte") || Jka.f2348b.startsWith("herolte") || Jka.f2348b.startsWith("heroqlte"));
        if (this.X) {
            this.Z = hga.K();
            this.Z.setString("mime", "audio/raw");
            mediaCodec.configure(this.Z, (Surface) null, (MediaCrypto) null, 0);
            this.Z.setString("mime", hga.f);
            return;
        }
        mediaCodec.configure(hga.K(), (Surface) null, (MediaCrypto) null, 0);
        this.Z = null;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia
    public final void a(String str, long j, long j2) {
        this.V.a(str, j, j2);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia, com.google.android.gms.internal.ads.AbstractC2100rga
    public final void a(boolean z) {
        super.a(z);
        this.V.a(this.U);
        int i = g().f2773b;
        if (i != 0) {
            this.W.b(i);
        } else {
            this.W.j();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia
    public final boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        if (this.X && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.U.e++;
            this.W.f();
            return true;
        } else {
            try {
                if (!this.W.a(byteBuffer, j3)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.U.d++;
                return true;
            } catch (C1620kha | C1965pha e) {
                throw C2169sga.a(e, c());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Aka
    public final Nga b() {
        return this.W.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia
    public final void b(Hga hga) {
        super.b(hga);
        this.V.a(hga);
        this.aa = "audio/raw".equals(hga.f) ? hga.t : 2;
        this.ba = hga.r;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia, com.google.android.gms.internal.ads.AbstractC2100rga
    public final void d() {
        super.d();
        this.W.b();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia, com.google.android.gms.internal.ads.AbstractC2100rga
    public final void e() {
        this.W.a();
        super.e();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia, com.google.android.gms.internal.ads.AbstractC2100rga
    public final void f() {
        try {
            this.W.c();
            try {
                super.f();
            } finally {
                this.U.a();
                this.V.b(this.U);
            }
        } catch (Throwable th) {
            super.f();
            throw th;
        } finally {
            this.U.a();
            this.V.b(this.U);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Lia
    public final void i() {
        try {
            this.W.g();
        } catch (C1965pha e) {
            throw C2169sga.a(e, c());
        }
    }

    @Override // com.google.android.gms.internal.ads.Mga, com.google.android.gms.internal.ads.Lia
    public final boolean p() {
        return this.W.h() || super.p();
    }

    @Override // com.google.android.gms.internal.ads.Mga, com.google.android.gms.internal.ads.Lia
    public final boolean q() {
        return super.q() && this.W.e();
    }

    @Override // com.google.android.gms.internal.ads.Mga, com.google.android.gms.internal.ads.AbstractC2100rga
    public final Aka w() {
        return this;
    }
}
