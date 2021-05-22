package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.q;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.cocos2dx.lib.BuildConfig;

@TargetApi(16)
/* renamed from: com.google.android.gms.internal.ads.dn  reason: case insensitive filesystem */
public final class TextureView$SurfaceTextureListenerC1150dn extends AbstractC0382Hm implements TextureView.SurfaceTextureListener, AbstractC0227Bn {

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC0798Xm f4144c;
    private final C0876_m d;
    private final boolean e;
    private final C0824Ym f;
    private AbstractC0304Em g;
    private Surface h;
    private C2251tn i;
    private String j;
    private String[] k;
    private boolean l;
    private int m = 1;
    private C0720Um n;
    private final boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private float v;

    public TextureView$SurfaceTextureListenerC1150dn(Context context, C0876_m _mVar, AbstractC0798Xm xm, boolean z, boolean z2, C0824Ym ym) {
        super(context);
        this.e = z2;
        this.f4144c = xm;
        this.d = _mVar;
        this.o = z;
        this.f = ym;
        setSurfaceTextureListener(this);
        this.d.a(this);
    }

    private final void a(float f2, boolean z) {
        C2251tn tnVar = this.i;
        if (tnVar != null) {
            tnVar.a(f2, z);
        } else {
            C0745Vl.d("Trying to set volume before player is initalized.");
        }
    }

    private final void a(Surface surface, boolean z) {
        C2251tn tnVar = this.i;
        if (tnVar != null) {
            tnVar.a(surface, z);
        } else {
            C0745Vl.d("Trying to set surface before player is initalized.");
        }
    }

    private final void c(int i2, int i3) {
        float f2 = i3 > 0 ? ((float) i2) / ((float) i3) : 1.0f;
        if (this.v != f2) {
            this.v = f2;
            requestLayout();
        }
    }

    private final void l() {
        String str;
        String str2;
        if (this.i == null && (str = this.j) != null && this.h != null) {
            if (str.startsWith("cache:")) {
                AbstractC0565On b2 = this.f4144c.b(this.j);
                if (b2 instanceof C0877_n) {
                    this.i = ((C0877_n) b2).c();
                    if (this.i.d() == null) {
                        str2 = "Precached video player has been released.";
                    }
                } else if (b2 instanceof C0945ao) {
                    C0945ao aoVar = (C0945ao) b2;
                    String r2 = r();
                    ByteBuffer c2 = aoVar.c();
                    boolean e2 = aoVar.e();
                    String d2 = aoVar.d();
                    if (d2 == null) {
                        str2 = "Stream cache URL is null.";
                    } else {
                        this.i = q();
                        this.i.a(new Uri[]{Uri.parse(d2)}, r2, c2, e2);
                    }
                } else {
                    String valueOf = String.valueOf(this.j);
                    C0745Vl.d(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                    return;
                }
                C0745Vl.d(str2);
                return;
            }
            this.i = q();
            String r3 = r();
            Uri[] uriArr = new Uri[this.k.length];
            int i2 = 0;
            while (true) {
                String[] strArr = this.k;
                if (i2 >= strArr.length) {
                    break;
                }
                uriArr[i2] = Uri.parse(strArr[i2]);
                i2++;
            }
            this.i.a(uriArr, r3);
            this.i.a((AbstractC0227Bn) this);
            a(this.h, false);
            if (this.i.d() != null) {
                this.m = this.i.d().P();
                if (this.m == 3) {
                    m();
                }
            }
        }
    }

    private final void m() {
        if (!this.p) {
            this.p = true;
            C2452wk.f5921a.post(new RunnableC1081cn(this));
            a();
            this.d.b();
            if (this.q) {
                c();
            }
        }
    }

    private final void n() {
        c(this.r, this.s);
    }

    private final void o() {
        C2251tn tnVar = this.i;
        if (tnVar != null) {
            tnVar.b(true);
        }
    }

    private final void p() {
        C2251tn tnVar = this.i;
        if (tnVar != null) {
            tnVar.b(false);
        }
    }

    private final C2251tn q() {
        return new C2251tn(this.f4144c.getContext(), this.f);
    }

    private final String r() {
        return q.c().b(this.f4144c.getContext(), this.f4144c.q().f3587a);
    }

    private final boolean s() {
        C2251tn tnVar = this.i;
        return (tnVar == null || tnVar.d() == null || this.l) ? false : true;
    }

    private final boolean t() {
        return s() && this.m != 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm, com.google.android.gms.internal.ads.AbstractC0943an
    public final void a() {
        a(this.f2172b.a(), false);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final void a(float f2, float f3) {
        C0720Um um = this.n;
        if (um != null) {
            um.a(f2, f3);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0227Bn
    public final void a(int i2) {
        if (this.m != i2) {
            this.m = i2;
            if (i2 == 3) {
                m();
            } else if (i2 == 4) {
                if (this.f.f3590a) {
                    p();
                }
                this.d.d();
                this.f2172b.c();
                C2452wk.f5921a.post(new RunnableC1287fn(this));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0227Bn
    public final void a(int i2, int i3) {
        this.r = i2;
        this.s = i3;
        n();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final void a(AbstractC0304Em em) {
        this.g = em;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str) {
        AbstractC0304Em em = this.g;
        if (em != null) {
            em.a("ExoPlayerAdapter error", str);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0227Bn
    public final void a(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        String sb2 = sb.toString();
        String valueOf = String.valueOf(sb2);
        C0745Vl.d(valueOf.length() != 0 ? "ExoPlayerAdapter error: ".concat(valueOf) : new String("ExoPlayerAdapter error: "));
        this.l = true;
        if (this.f.f3590a) {
            p();
        }
        C2452wk.f5921a.post(new RunnableC1218en(this, sb2));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final void a(String str, String[] strArr) {
        if (str != null) {
            if (strArr == null) {
                setVideoPath(str);
            }
            this.j = str;
            this.k = (String[]) Arrays.copyOf(strArr, strArr.length);
            l();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0227Bn
    public final void a(boolean z, long j2) {
        if (this.f4144c != null) {
            C0875_l.e.execute(new RunnableC1838nn(this, z, j2));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final void b() {
        if (t()) {
            if (this.f.f3590a) {
                p();
            }
            this.i.d().a(false);
            this.d.d();
            this.f2172b.c();
            C2452wk.f5921a.post(new RunnableC1356gn(this));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final void b(int i2) {
        if (t()) {
            this.i.d().a((long) i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(int i2, int i3) {
        AbstractC0304Em em = this.g;
        if (em != null) {
            em.a(i2, i3);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(boolean z, long j2) {
        this.f4144c.a(z, j2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final void c() {
        if (t()) {
            if (this.f.f3590a) {
                o();
            }
            this.i.d().a(true);
            this.d.c();
            this.f2172b.b();
            this.f2171a.a();
            C2452wk.f5921a.post(new RunnableC1425hn(this));
            return;
        }
        this.q = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final void c(int i2) {
        C2251tn tnVar = this.i;
        if (tnVar != null) {
            tnVar.g().c(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final void d() {
        if (s()) {
            this.i.d().stop();
            if (this.i != null) {
                a((Surface) null, true);
                C2251tn tnVar = this.i;
                if (tnVar != null) {
                    tnVar.a((AbstractC0227Bn) null);
                    this.i.c();
                    this.i = null;
                }
                this.m = 1;
                this.l = false;
                this.p = false;
                this.q = false;
            }
        }
        this.d.d();
        this.f2172b.c();
        this.d.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final void d(int i2) {
        C2251tn tnVar = this.i;
        if (tnVar != null) {
            tnVar.g().d(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final String e() {
        String str = this.o ? " spherical" : BuildConfig.FLAVOR;
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final void e(int i2) {
        C2251tn tnVar = this.i;
        if (tnVar != null) {
            tnVar.g().a(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        AbstractC0304Em em = this.g;
        if (em != null) {
            em.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final void f(int i2) {
        C2251tn tnVar = this.i;
        if (tnVar != null) {
            tnVar.g().b(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g() {
        AbstractC0304Em em = this.g;
        if (em != null) {
            em.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final void g(int i2) {
        C2251tn tnVar = this.i;
        if (tnVar != null) {
            tnVar.a(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final int getCurrentPosition() {
        if (t()) {
            return (int) this.i.d().T();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final int getDuration() {
        if (t()) {
            return (int) this.i.d().getDuration();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final int getVideoHeight() {
        return this.s;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final int getVideoWidth() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h() {
        AbstractC0304Em em = this.g;
        if (em != null) {
            em.d();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(int i2) {
        AbstractC0304Em em = this.g;
        if (em != null) {
            em.onWindowVisibilityChanged(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i() {
        AbstractC0304Em em = this.g;
        if (em != null) {
            em.e();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j() {
        AbstractC0304Em em = this.g;
        if (em != null) {
            em.c();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void k() {
        AbstractC0304Em em = this.g;
        if (em != null) {
            em.a();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.TextureView$SurfaceTextureListenerC1150dn.onMeasure(int, int):void");
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (this.o) {
            this.n = new C0720Um(getContext());
            this.n.a(surfaceTexture, i2, i3);
            this.n.start();
            SurfaceTexture c2 = this.n.c();
            if (c2 != null) {
                surfaceTexture = c2;
            } else {
                this.n.b();
                this.n = null;
            }
        }
        this.h = new Surface(surfaceTexture);
        if (this.i == null) {
            l();
        } else {
            a(this.h, true);
            if (!this.f.f3590a) {
                o();
            }
        }
        if (this.r == 0 || this.s == 0) {
            c(i2, i3);
        } else {
            n();
        }
        C2452wk.f5921a.post(new RunnableC1562jn(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        b();
        C0720Um um = this.n;
        if (um != null) {
            um.b();
            this.n = null;
        }
        if (this.i != null) {
            p();
            Surface surface = this.h;
            if (surface != null) {
                surface.release();
            }
            this.h = null;
            a((Surface) null, true);
        }
        C2452wk.f5921a.post(new RunnableC1700ln(this));
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        C0720Um um = this.n;
        if (um != null) {
            um.a(i2, i3);
        }
        C2452wk.f5921a.post(new RunnableC1493in(this, i2, i3));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.d.b(this);
        this.f2171a.a(surfaceTexture, this.g);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i2);
        C1763mk.f(sb.toString());
        C2452wk.f5921a.post(new RunnableC1631kn(this, i2));
        super.onWindowVisibilityChanged(i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final void setVideoPath(String str) {
        if (str != null) {
            this.j = str;
            this.k = new String[]{str};
            l();
        }
    }
}
