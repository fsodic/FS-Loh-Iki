package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.r;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Jm  reason: case insensitive filesystem */
public final class C0434Jm extends FrameLayout implements AbstractC0304Em {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0798Xm f2351a;

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f2352b;

    /* renamed from: c  reason: collision with root package name */
    private final L f2353c;
    private final RunnableC0850Zm d;
    private final long e;
    private AbstractC0382Hm f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;
    private String m;
    private String[] n;
    private Bitmap o;
    private ImageView p;
    private boolean q;

    public C0434Jm(Context context, AbstractC0798Xm xm, int i2, boolean z, L l2, C0824Ym ym) {
        super(context);
        this.f2351a = xm;
        this.f2353c = l2;
        this.f2352b = new FrameLayout(context);
        addView(this.f2352b, new FrameLayout.LayoutParams(-1, -1));
        r.a(xm.r());
        this.f = xm.r().f1073b.a(context, xm, i2, z, l2, ym);
        AbstractC0382Hm hm = this.f;
        if (hm != null) {
            this.f2352b.addView(hm, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) C2392voa.e().a(C2474x.w)).booleanValue()) {
                n();
            }
        }
        this.p = new ImageView(context);
        this.e = ((Long) C2392voa.e().a(C2474x.A)).longValue();
        this.j = ((Boolean) C2392voa.e().a(C2474x.y)).booleanValue();
        L l3 = this.f2353c;
        if (l3 != null) {
            l3.a("spinner_used", this.j ? "1" : "0");
        }
        this.d = new RunnableC0850Zm(this);
        AbstractC0382Hm hm2 = this.f;
        if (hm2 != null) {
            hm2.a(this);
        }
        if (this.f == null) {
            a("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    public static void a(AbstractC0798Xm xm) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "no_video_view");
        xm.a("onVideoEvent", hashMap);
    }

    public static void a(AbstractC0798Xm xm, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("error", str);
        xm.a("onVideoEvent", hashMap);
    }

    public static void a(AbstractC0798Xm xm, Map<String, List<Map<String, Object>>> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("mimeTypes", map);
        xm.a("onVideoEvent", hashMap);
    }

    /* access modifiers changed from: private */
    public final void b(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f2351a.a("onVideoEvent", hashMap);
    }

    private final boolean p() {
        return this.p.getParent() != null;
    }

    private final void q() {
        if (this.f2351a.v() != null && this.h && !this.i) {
            this.f2351a.v().getWindow().clearFlags(128);
            this.h = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0304Em
    public final void a() {
        AbstractC0382Hm hm = this.f;
        if (hm != null && this.l == 0) {
            b("canplaythrough", "duration", String.valueOf(((float) hm.getDuration()) / 1000.0f), "videoWidth", String.valueOf(this.f.getVideoWidth()), "videoHeight", String.valueOf(this.f.getVideoHeight()));
        }
    }

    public final void a(float f2, float f3) {
        AbstractC0382Hm hm = this.f;
        if (hm != null) {
            hm.a(f2, f3);
        }
    }

    public final void a(int i2) {
        AbstractC0382Hm hm = this.f;
        if (hm != null) {
            hm.b(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0304Em
    public final void a(int i2, int i3) {
        if (this.j) {
            int max = Math.max(i2 / ((Integer) C2392voa.e().a(C2474x.z)).intValue(), 1);
            int max2 = Math.max(i3 / ((Integer) C2392voa.e().a(C2474x.z)).intValue(), 1);
            Bitmap bitmap = this.o;
            if (bitmap == null || bitmap.getWidth() != max || this.o.getHeight() != max2) {
                this.o = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.q = false;
            }
        }
    }

    public final void a(int i2, int i3, int i4, int i5) {
        if (i4 != 0 && i5 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
            layoutParams.setMargins(i2, i3, 0, 0);
            this.f2352b.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    @TargetApi(14)
    public final void a(MotionEvent motionEvent) {
        AbstractC0382Hm hm = this.f;
        if (hm != null) {
            hm.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0304Em
    public final void a(String str, String str2) {
        b("error", "what", str, "extra", str2);
    }

    public final void a(String str, String[] strArr) {
        this.m = str;
        this.n = strArr;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(boolean z) {
        b("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0304Em
    public final void b() {
        if (this.q && this.o != null && !p()) {
            this.p.setImageBitmap(this.o);
            this.p.invalidate();
            this.f2352b.addView(this.p, new FrameLayout.LayoutParams(-1, -1));
            this.f2352b.bringChildToFront(this.p);
        }
        this.d.a();
        this.l = this.k;
        C2452wk.f5921a.post(new RunnableC0538Nm(this));
    }

    public final void b(int i2) {
        this.f.c(i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0304Em
    public final void c() {
        b("ended", new String[0]);
        q();
    }

    public final void c(int i2) {
        this.f.d(i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0304Em
    public final void d() {
        b("pause", new String[0]);
        q();
        this.g = false;
    }

    public final void d(int i2) {
        this.f.e(i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0304Em
    public final void e() {
        if (this.f2351a.v() != null && !this.h) {
            this.i = (this.f2351a.v().getWindow().getAttributes().flags & 128) != 0;
            if (!this.i) {
                this.f2351a.v().getWindow().addFlags(128);
                this.h = true;
            }
        }
        this.g = true;
    }

    public final void e(int i2) {
        this.f.f(i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0304Em
    public final void f() {
        this.d.b();
        C2452wk.f5921a.post(new RunnableC0460Km(this));
    }

    public final void f(int i2) {
        this.f.g(i2);
    }

    @Override // java.lang.Object
    public final void finalize() {
        try {
            this.d.a();
            if (this.f != null) {
                AbstractC0382Hm hm = this.f;
                VW vw = C0875_l.e;
                hm.getClass();
                vw.execute(RunnableC0408Im.a(hm));
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0304Em
    public final void g() {
        if (this.g && p()) {
            this.f2352b.removeView(this.p);
        }
        if (this.o != null) {
            long b2 = q.j().b();
            if (this.f.getBitmap(this.o) != null) {
                this.q = true;
            }
            long b3 = q.j().b() - b2;
            if (C1763mk.a()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(b3);
                sb.append("ms");
                C1763mk.f(sb.toString());
            }
            if (b3 > this.e) {
                C0745Vl.d("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.j = false;
                this.o = null;
                L l2 = this.f2353c;
                if (l2 != null) {
                    l2.a("spinner_jank", Long.toString(b3));
                }
            }
        }
    }

    public final void h() {
        this.d.a();
        AbstractC0382Hm hm = this.f;
        if (hm != null) {
            hm.d();
        }
        q();
    }

    public final void i() {
        AbstractC0382Hm hm = this.f;
        if (hm != null) {
            hm.b();
        }
    }

    public final void j() {
        AbstractC0382Hm hm = this.f;
        if (hm != null) {
            hm.c();
        }
    }

    public final void k() {
        if (this.f != null) {
            if (!TextUtils.isEmpty(this.m)) {
                this.f.a(this.m, this.n);
            } else {
                b("no_src", new String[0]);
            }
        }
    }

    public final void l() {
        AbstractC0382Hm hm = this.f;
        if (hm != null) {
            hm.f2172b.a(true);
            hm.a();
        }
    }

    public final void m() {
        AbstractC0382Hm hm = this.f;
        if (hm != null) {
            hm.f2172b.a(false);
            hm.a();
        }
    }

    @TargetApi(14)
    public final void n() {
        AbstractC0382Hm hm = this.f;
        if (hm != null) {
            TextView textView = new TextView(hm.getContext());
            String valueOf = String.valueOf(this.f.e());
            textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.f2352b.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            this.f2352b.bringChildToFront(textView);
        }
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        AbstractC0382Hm hm = this.f;
        if (hm != null) {
            long currentPosition = (long) hm.getCurrentPosition();
            if (this.k != currentPosition && currentPosition > 0) {
                b("timeupdate", "time", String.valueOf(((float) currentPosition) / 1000.0f));
                this.k = currentPosition;
            }
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.d.b();
        } else {
            this.d.a();
            this.l = this.k;
        }
        C2452wk.f5921a.post(new RunnableC0486Lm(this, z));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0304Em
    public final void onWindowVisibilityChanged(int i2) {
        boolean z;
        super.onWindowVisibilityChanged(i2);
        if (i2 == 0) {
            this.d.b();
            z = true;
        } else {
            this.d.a();
            this.l = this.k;
            z = false;
        }
        C2452wk.f5921a.post(new RunnableC0512Mm(this, z));
    }

    public final void setVolume(float f2) {
        AbstractC0382Hm hm = this.f;
        if (hm != null) {
            hm.f2172b.a(f2);
            hm.a();
        }
    }
}
