package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.q;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.cocos2dx.lib.BuildConfig;

@TargetApi(14)
/* renamed from: com.google.android.gms.internal.ads.tm  reason: case insensitive filesystem */
public final class TextureView$SurfaceTextureListenerC2249tm extends AbstractC0382Hm implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Integer, String> f5651c = new HashMap();
    private final C0876_m d;
    private final boolean e;
    private int f = 0;
    private int g = 0;
    private MediaPlayer h;
    private Uri i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private C0720Um o;
    private boolean p;
    private int q;
    private AbstractC0304Em r;

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            f5651c.put(-1004, "MEDIA_ERROR_IO");
            f5651c.put(-1007, "MEDIA_ERROR_MALFORMED");
            f5651c.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            f5651c.put(-110, "MEDIA_ERROR_TIMED_OUT");
            f5651c.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        f5651c.put(100, "MEDIA_ERROR_SERVER_DIED");
        f5651c.put(1, "MEDIA_ERROR_UNKNOWN");
        f5651c.put(1, "MEDIA_INFO_UNKNOWN");
        f5651c.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        f5651c.put(701, "MEDIA_INFO_BUFFERING_START");
        f5651c.put(702, "MEDIA_INFO_BUFFERING_END");
        f5651c.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        f5651c.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        f5651c.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (Build.VERSION.SDK_INT >= 19) {
            f5651c.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            f5651c.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public TextureView$SurfaceTextureListenerC2249tm(Context context, boolean z, boolean z2, C0824Ym ym, C0876_m _mVar) {
        super(context);
        setSurfaceTextureListener(this);
        this.d = _mVar;
        this.p = z;
        this.e = z2;
        this.d.a(this);
    }

    private final void a(float f2) {
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f2, f2);
            } catch (IllegalStateException unused) {
            }
        } else {
            C0745Vl.d("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    private final void a(boolean z) {
        C1763mk.f("AdMediaPlayerView release");
        C0720Um um = this.o;
        if (um != null) {
            um.b();
            this.o = null;
        }
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.h.release();
            this.h = null;
            i(0);
            if (z) {
                this.g = 0;
                this.g = 0;
            }
        }
    }

    private final void f() {
        C1763mk.f("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.i != null && surfaceTexture != null) {
            a(false);
            try {
                q.s();
                this.h = new MediaPlayer();
                this.h.setOnBufferingUpdateListener(this);
                this.h.setOnCompletionListener(this);
                this.h.setOnErrorListener(this);
                this.h.setOnInfoListener(this);
                this.h.setOnPreparedListener(this);
                this.h.setOnVideoSizeChangedListener(this);
                this.l = 0;
                if (this.p) {
                    this.o = new C0720Um(getContext());
                    this.o.a(surfaceTexture, getWidth(), getHeight());
                    this.o.start();
                    SurfaceTexture c2 = this.o.c();
                    if (c2 != null) {
                        surfaceTexture = c2;
                    } else {
                        this.o.b();
                        this.o = null;
                    }
                }
                this.h.setDataSource(getContext(), this.i);
                q.t();
                this.h.setSurface(new Surface(surfaceTexture));
                this.h.setAudioStreamType(3);
                this.h.setScreenOnWhilePlaying(true);
                this.h.prepareAsync();
                i(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e2) {
                String valueOf = String.valueOf(this.i);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Failed to initialize MediaPlayer at ");
                sb.append(valueOf);
                C0745Vl.c(sb.toString(), e2);
                onError(this.h, 1, 0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void g() {
        /*
            r8 = this;
            boolean r0 = r8.e
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r8.h()
            if (r0 == 0) goto L_0x0059
            android.media.MediaPlayer r0 = r8.h
            int r0 = r0.getCurrentPosition()
            if (r0 <= 0) goto L_0x0059
            int r0 = r8.g
            r1 = 3
            if (r0 == r1) goto L_0x0059
            java.lang.String r0 = "AdMediaPlayerView nudging MediaPlayer"
            com.google.android.gms.internal.ads.C1763mk.f(r0)
            r0 = 0
            r8.a(r0)
            android.media.MediaPlayer r0 = r8.h
            r0.start()
            android.media.MediaPlayer r0 = r8.h
            int r0 = r0.getCurrentPosition()
            com.google.android.gms.common.util.d r1 = com.google.android.gms.ads.internal.q.j()
            long r1 = r1.a()
        L_0x0034:
            boolean r3 = r8.h()
            if (r3 == 0) goto L_0x0051
            android.media.MediaPlayer r3 = r8.h
            int r3 = r3.getCurrentPosition()
            if (r3 != r0) goto L_0x0051
            com.google.android.gms.common.util.d r3 = com.google.android.gms.ads.internal.q.j()
            long r3 = r3.a()
            long r3 = r3 - r1
            r5 = 250(0xfa, double:1.235E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0034
        L_0x0051:
            android.media.MediaPlayer r0 = r8.h
            r0.pause()
            r8.a()
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.TextureView$SurfaceTextureListenerC2249tm.g():void");
    }

    private final boolean h() {
        int i2;
        return (this.h == null || (i2 = this.f) == -1 || i2 == 0 || i2 == 1) ? false : true;
    }

    private final void i(int i2) {
        if (i2 == 3) {
            this.d.c();
            this.f2172b.b();
        } else if (this.f == 3) {
            this.d.d();
            this.f2172b.c();
        }
        this.f = i2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0943an, com.google.android.gms.internal.ads.AbstractC0382Hm
    public final void a() {
        a(this.f2172b.a());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final void a(float f2, float f3) {
        C0720Um um = this.o;
        if (um != null) {
            um.a(f2, f3);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final void a(AbstractC0304Em em) {
        this.r = em;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final void b() {
        C1763mk.f("AdMediaPlayerView pause");
        if (h() && this.h.isPlaying()) {
            this.h.pause();
            i(4);
            C2452wk.f5921a.post(new RunnableC0330Fm(this));
        }
        this.g = 4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final void b(int i2) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i2);
        C1763mk.f(sb.toString());
        if (h()) {
            this.h.seekTo(i2);
            this.q = 0;
            return;
        }
        this.q = i2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final void c() {
        C1763mk.f("AdMediaPlayerView play");
        if (h()) {
            this.h.start();
            i(3);
            this.f2171a.a();
            C2452wk.f5921a.post(new RunnableC0252Cm(this));
        }
        this.g = 3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final void d() {
        C1763mk.f("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.h.release();
            this.h = null;
            i(0);
            this.g = 0;
        }
        this.d.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final String e() {
        String str = this.p ? " spherical" : BuildConfig.FLAVOR;
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final int getCurrentPosition() {
        if (h()) {
            return this.h.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final int getDuration() {
        if (h()) {
            return this.h.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final int getVideoHeight() {
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final int getVideoWidth() {
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(int i2) {
        AbstractC0304Em em = this.r;
        if (em != null) {
            em.onWindowVisibilityChanged(i2);
        }
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
        this.l = i2;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        C1763mk.f("AdMediaPlayerView completion");
        i(5);
        this.g = 5;
        C2452wk.f5921a.post(new RunnableC2663zm(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        String str = f5651c.get(Integer.valueOf(i2));
        String str2 = f5651c.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        C0745Vl.d(sb.toString());
        i(-1);
        this.g = -1;
        C2452wk.f5921a.post(new RunnableC2594ym(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        String str = f5651c.get(Integer.valueOf(i2));
        String str2 = f5651c.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        C1763mk.f(sb.toString());
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.TextureView$SurfaceTextureListenerC2249tm.onMeasure(int, int):void");
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        C1763mk.f("AdMediaPlayerView prepared");
        i(2);
        this.d.b();
        C2452wk.f5921a.post(new RunnableC2456wm(this));
        this.j = mediaPlayer.getVideoWidth();
        this.k = mediaPlayer.getVideoHeight();
        int i2 = this.q;
        if (i2 != 0) {
            b(i2);
        }
        g();
        int i3 = this.j;
        int i4 = this.k;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i3);
        sb.append(" x ");
        sb.append(i4);
        C0745Vl.c(sb.toString());
        if (this.g == 3) {
            c();
        }
        a();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        C1763mk.f("AdMediaPlayerView surface created");
        f();
        C2452wk.f5921a.post(new RunnableC0226Bm(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C1763mk.f("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null && this.q == 0) {
            this.q = mediaPlayer.getCurrentPosition();
        }
        C0720Um um = this.o;
        if (um != null) {
            um.b();
        }
        C2452wk.f5921a.post(new RunnableC0278Dm(this));
        a(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        C1763mk.f("AdMediaPlayerView surface changed");
        boolean z = true;
        boolean z2 = this.g == 3;
        if (!(this.j == i2 && this.k == i3)) {
            z = false;
        }
        if (this.h != null && z2 && z) {
            int i4 = this.q;
            if (i4 != 0) {
                b(i4);
            }
            c();
        }
        C0720Um um = this.o;
        if (um != null) {
            um.a(i2, i3);
        }
        C2452wk.f5921a.post(new RunnableC0200Am(this, i2, i3));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.d.b(this);
        this.f2171a.a(surfaceTexture, this.r);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        C1763mk.f(sb.toString());
        this.j = mediaPlayer.getVideoWidth();
        this.k = mediaPlayer.getVideoHeight();
        if (this.j != 0 && this.k != 0) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i2) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i2);
        C1763mk.f(sb.toString());
        C2452wk.f5921a.post(new RunnableC2525xm(this, i2));
        super.onWindowVisibilityChanged(i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0382Hm
    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        C1906oma a2 = C1906oma.a(parse);
        if (a2 == null || a2.f5165a != null) {
            if (a2 != null) {
                parse = Uri.parse(a2.f5165a);
            }
            this.i = parse;
            this.q = 0;
            f();
            requestLayout();
            invalidate();
        }
    }

    public final String toString() {
        String name = TextureView$SurfaceTextureListenerC2249tm.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }
}
