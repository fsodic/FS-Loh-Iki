package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.ads.internal.g;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.AbstractBinderC0766Wg;
import com.google.android.gms.internal.ads.AbstractC1564jo;
import com.google.android.gms.internal.ads.C0224Bk;
import com.google.android.gms.internal.ads.C0662Sg;
import com.google.android.gms.internal.ads.C0745Vl;
import com.google.android.gms.internal.ads.C2392voa;
import com.google.android.gms.internal.ads.C2452wk;
import com.google.android.gms.internal.ads.C2474x;
import java.util.Collections;

public class c extends AbstractBinderC0766Wg implements y {

    /* renamed from: a  reason: collision with root package name */
    private static final int f1099a = Color.argb(0, 0, 0, 0);

    /* renamed from: b  reason: collision with root package name */
    protected final Activity f1100b;

    /* renamed from: c  reason: collision with root package name */
    AdOverlayInfoParcel f1101c;
    AbstractC1564jo d;
    private i e;
    private q f;
    private boolean g = false;
    private FrameLayout h;
    private WebChromeClient.CustomViewCallback i;
    private boolean j = false;
    private boolean k = false;
    private j l;
    private boolean m = false;
    int n = 0;
    private final Object o = new Object();
    private Runnable p;
    private boolean q;
    private boolean r;
    private boolean s = false;
    private boolean t = false;
    private boolean u = true;

    public c(Activity activity) {
        this.f1100b = activity;
    }

    private final void a(Configuration configuration) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        g gVar;
        g gVar2;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f1101c;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel2 == null || (gVar2 = adOverlayInfoParcel2.o) == null || !gVar2.f1082b) ? false : true;
        boolean a2 = q.e().a(this.f1100b, configuration);
        if ((this.k && !z3) || a2) {
            z = false;
        } else if (Build.VERSION.SDK_INT >= 19 && (adOverlayInfoParcel = this.f1101c) != null && (gVar = adOverlayInfoParcel.o) != null && gVar.g) {
            z2 = true;
        }
        Window window = this.f1100b.getWindow();
        if (((Boolean) C2392voa.e().a(C2474x.Ea)).booleanValue() && Build.VERSION.SDK_INT >= 19) {
            View decorView = window.getDecorView();
            int i2 = 256;
            if (z) {
                i2 = 5380;
                if (z2) {
                    i2 = 5894;
                }
            }
            decorView.setSystemUiVisibility(i2);
        } else if (z) {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (Build.VERSION.SDK_INT >= 19 && z2) {
                window.getDecorView().setSystemUiVisibility(4098);
            }
        } else {
            window.addFlags(2048);
            window.clearFlags(1024);
        }
    }

    private static void a(a aVar, View view) {
        if (aVar != null && view != null) {
            q.r().a(aVar, view);
        }
    }

    private final void cc() {
        if (this.f1100b.isFinishing() && !this.s) {
            this.s = true;
            AbstractC1564jo joVar = this.d;
            if (joVar != null) {
                joVar.a(this.n);
                synchronized (this.o) {
                    if (!this.q && this.d.x()) {
                        this.p = new e(this);
                        C2452wk.f5921a.postDelayed(this.p, ((Long) C2392voa.e().a(C2474x.Ba)).longValue());
                        return;
                    }
                }
            }
            Zb();
        }
    }

    private final void dc() {
        this.d.j();
    }

    private final void h(boolean z) {
        int intValue = ((Integer) C2392voa.e().a(C2474x.Vc)).intValue();
        p pVar = new p();
        pVar.e = 50;
        pVar.f1114a = z ? intValue : 0;
        pVar.f1115b = z ? 0 : intValue;
        pVar.f1116c = 0;
        pVar.d = intValue;
        this.f = new q(this.f1100b, pVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        a(z, this.f1101c.g);
        this.l.addView(this.f, layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r19.f1100b.getResources().getConfiguration().orientation == 1) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (r19.f1100b.getResources().getConfiguration().orientation == 2) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void i(boolean r20) {
        /*
        // Method dump skipped, instructions count: 488
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.c.i(boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final boolean Fb() {
        this.n = 0;
        AbstractC1564jo joVar = this.d;
        if (joVar == null) {
            return true;
        }
        boolean t2 = joVar.t();
        if (!t2) {
            this.d.a("onbackblocked", Collections.emptyMap());
        }
        return t2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void G(a aVar) {
        a((Configuration) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void Oa() {
        this.r = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.y
    public final void Tb() {
        this.n = 1;
        this.f1100b.finish();
    }

    public final void Wb() {
        this.n = 2;
        this.f1100b.finish();
    }

    public final void Xb() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f1101c;
        if (adOverlayInfoParcel != null && this.g) {
            x(adOverlayInfoParcel.j);
        }
        if (this.h != null) {
            this.f1100b.setContentView(this.l);
            this.r = true;
            this.h.removeAllViews();
            this.h = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.i;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.i = null;
        }
        this.g = false;
    }

    public final void Yb() {
        this.l.removeView(this.f);
        h(true);
    }

    /* access modifiers changed from: package-private */
    public final void Zb() {
        AbstractC1564jo joVar;
        o oVar;
        if (!this.t) {
            this.t = true;
            AbstractC1564jo joVar2 = this.d;
            if (joVar2 != null) {
                this.l.removeView(joVar2.getView());
                i iVar = this.e;
                if (iVar != null) {
                    this.d.a(iVar.d);
                    this.d.d(false);
                    ViewGroup viewGroup = this.e.f1109c;
                    View view = this.d.getView();
                    i iVar2 = this.e;
                    viewGroup.addView(view, iVar2.f1107a, iVar2.f1108b);
                    this.e = null;
                } else if (this.f1100b.getApplicationContext() != null) {
                    this.d.a(this.f1100b.getApplicationContext());
                }
                this.d = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f1101c;
            if (!(adOverlayInfoParcel == null || (oVar = adOverlayInfoParcel.f1098c) == null)) {
                oVar.J();
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f1101c;
            if (adOverlayInfoParcel2 != null && (joVar = adOverlayInfoParcel2.d) != null) {
                a(joVar.h(), this.f1101c.d.getView());
            }
        }
    }

    public final void _b() {
        if (this.m) {
            this.m = false;
            dc();
        }
    }

    public final void a(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.h = new FrameLayout(this.f1100b);
        this.h.setBackgroundColor(-16777216);
        this.h.addView(view, -1, -1);
        this.f1100b.setContentView(this.h);
        this.r = true;
        this.i = customViewCallback;
        this.g = true;
    }

    public final void a(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        g gVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        g gVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) C2392voa.e().a(C2474x.Ca)).booleanValue() && (adOverlayInfoParcel2 = this.f1101c) != null && (gVar2 = adOverlayInfoParcel2.o) != null && gVar2.h;
        boolean z5 = ((Boolean) C2392voa.e().a(C2474x.Da)).booleanValue() && (adOverlayInfoParcel = this.f1101c) != null && (gVar = adOverlayInfoParcel.o) != null && gVar.i;
        if (z && z2 && z4 && !z5) {
            new C0662Sg(this.d, "useCustomClose").a("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        q qVar = this.f;
        if (qVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            qVar.a(z3);
        }
    }

    public final void ac() {
        this.l.f1111b = true;
    }

    public final void bc() {
        synchronized (this.o) {
            this.q = true;
            if (this.p != null) {
                C2452wk.f5921a.removeCallbacks(this.p);
                C2452wk.f5921a.post(this.p);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void g(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.j);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void ia() {
        if (((Boolean) C2392voa.e().a(C2474x.Tc)).booleanValue()) {
            AbstractC1564jo joVar = this.d;
            if (joVar == null || joVar.isDestroyed()) {
                C0745Vl.d("The webview does not exist. Ignoring action.");
                return;
            }
            q.e();
            C0224Bk.b(this.d);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public void j(Bundle bundle) {
        this.f1100b.requestWindowFeature(1);
        this.j = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            this.f1101c = AdOverlayInfoParcel.a(this.f1100b.getIntent());
            if (this.f1101c != null) {
                if (this.f1101c.m.f3589c > 7500000) {
                    this.n = 3;
                }
                if (this.f1100b.getIntent() != null) {
                    this.u = this.f1100b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                if (this.f1101c.o != null) {
                    this.k = this.f1101c.o.f1081a;
                } else {
                    this.k = false;
                }
                if (this.k && this.f1101c.o.f != -1) {
                    new l(this).b();
                }
                if (bundle == null) {
                    if (this.f1101c.f1098c != null && this.u) {
                        this.f1101c.f1098c.I();
                    }
                    if (!(this.f1101c.k == 1 || this.f1101c.f1097b == null)) {
                        this.f1101c.f1097b.e();
                    }
                }
                this.l = new j(this.f1100b, this.f1101c.n, this.f1101c.m.f3587a);
                this.l.setId(1000);
                q.e().a(this.f1100b);
                int i2 = this.f1101c.k;
                if (i2 == 1) {
                    i(false);
                } else if (i2 == 2) {
                    this.e = new i(this.f1101c.d);
                    i(false);
                } else if (i2 == 3) {
                    i(true);
                } else {
                    throw new g("Could not determine ad overlay type.");
                }
            } else {
                throw new g("Could not get info for ad overlay.");
            }
        } catch (g e2) {
            C0745Vl.d(e2.getMessage());
            this.n = 3;
            this.f1100b.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void jb() {
        if (((Boolean) C2392voa.e().a(C2474x.Tc)).booleanValue() && this.d != null && (!this.f1100b.isFinishing() || this.e == null)) {
            q.e();
            C0224Bk.a(this.d);
        }
        cc();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void onDestroy() {
        AbstractC1564jo joVar = this.d;
        if (joVar != null) {
            try {
                this.l.removeView(joVar.getView());
            } catch (NullPointerException unused) {
            }
        }
        cc();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void onPause() {
        Xb();
        o oVar = this.f1101c.f1098c;
        if (oVar != null) {
            oVar.onPause();
        }
        if (!((Boolean) C2392voa.e().a(C2474x.Tc)).booleanValue() && this.d != null && (!this.f1100b.isFinishing() || this.e == null)) {
            q.e();
            C0224Bk.a(this.d);
        }
        cc();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void onResume() {
        o oVar = this.f1101c.f1098c;
        if (oVar != null) {
            oVar.onResume();
        }
        a(this.f1100b.getResources().getConfiguration());
        if (!((Boolean) C2392voa.e().a(C2474x.Tc)).booleanValue()) {
            AbstractC1564jo joVar = this.d;
            if (joVar == null || joVar.isDestroyed()) {
                C0745Vl.d("The webview does not exist. Ignoring action.");
                return;
            }
            q.e();
            C0224Bk.b(this.d);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void rb() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void wb() {
        this.n = 0;
    }

    public final void x(int i2) {
        if (this.f1100b.getApplicationInfo().targetSdkVersion >= ((Integer) C2392voa.e().a(C2474x.Ud)).intValue()) {
            if (this.f1100b.getApplicationInfo().targetSdkVersion <= ((Integer) C2392voa.e().a(C2474x.Vd)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) C2392voa.e().a(C2474x.Wd)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) C2392voa.e().a(C2474x.Xd)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f1100b.setRequestedOrientation(i2);
        } catch (Throwable th) {
            q.g().b(th, "AdOverlay.setRequestedOrientation");
        }
    }
}
