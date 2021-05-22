package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.o;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(14)
public final class Ela extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private boolean f1899a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1900b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1901c;
    private final Object d;
    private final Bla e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final String n;
    private final boolean o;
    private final boolean p;
    private final boolean q;

    public Ela() {
        this(new Bla());
    }

    private Ela(Bla bla) {
        this.f1899a = false;
        this.f1900b = false;
        this.f1901c = false;
        this.e = bla;
        this.d = new Object();
        this.g = C1605ka.d.a().intValue();
        this.h = C1605ka.f4780a.a().intValue();
        this.i = C1605ka.e.a().intValue();
        this.j = C1605ka.f4782c.a().intValue();
        this.k = ((Integer) C2392voa.e().a(C2474x.L)).intValue();
        this.l = ((Integer) C2392voa.e().a(C2474x.M)).intValue();
        this.m = ((Integer) C2392voa.e().a(C2474x.N)).intValue();
        this.f = C1605ka.f.a().intValue();
        this.n = (String) C2392voa.e().a(C2474x.P);
        this.o = ((Boolean) C2392voa.e().a(C2474x.Q)).booleanValue();
        this.p = ((Boolean) C2392voa.e().a(C2474x.R)).booleanValue();
        this.q = ((Boolean) C2392voa.e().a(C2474x.S)).booleanValue();
        setName("ContentFetchTask");
    }

    private final Ila a(View view, C2593yla yla) {
        boolean z;
        if (view == null) {
            return new Ila(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new Ila(this, 0, 0);
            }
            yla.b(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new Ila(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof AbstractC1564jo)) {
            WebView webView = (WebView) view;
            if (!o.f()) {
                z = false;
            } else {
                yla.h();
                webView.post(new Gla(this, yla, webView, globalVisibleRect));
                z = true;
            }
            return z ? new Ila(this, 0, 1) : new Ila(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new Ila(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                Ila a2 = a(viewGroup.getChildAt(i4), yla);
                i2 += a2.f2270a;
                i3 += a2.f2271b;
            }
            return new Ila(this, i2, i3);
        }
    }

    private static boolean e() {
        try {
            Context b2 = q.f().b();
            if (b2 == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b2.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b2.getSystemService("keyguard");
            if (activityManager == null) {
                return false;
            }
            if (keyguardManager == null) {
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return false;
                    }
                    PowerManager powerManager = (PowerManager) b2.getSystemService("power");
                    return powerManager == null ? false : powerManager.isScreenOn();
                }
            }
            return false;
        } catch (Throwable th) {
            q.g().a(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    private final void f() {
        synchronized (this.d) {
            this.f1900b = true;
            boolean z = this.f1900b;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(z);
            C0745Vl.a(sb.toString());
        }
    }

    public final void a() {
        synchronized (this.d) {
            this.f1900b = false;
            this.d.notifyAll();
            C0745Vl.a("ContentFetchThread: wakeup");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        try {
            C2593yla yla = new C2593yla(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.p);
            Context b2 = q.f().b();
            if (b2 != null && !TextUtils.isEmpty(this.n)) {
                String str = (String) view.getTag(b2.getResources().getIdentifier((String) C2392voa.e().a(C2474x.O), "id", b2.getPackageName()));
                if (str != null && str.equals(this.n)) {
                    return;
                }
            }
            Ila a2 = a(view, yla);
            yla.j();
            if (a2.f2270a != 0 || a2.f2271b != 0) {
                if (a2.f2271b != 0 || yla.k() != 0) {
                    if (a2.f2271b != 0 || !this.e.a(yla)) {
                        this.e.c(yla);
                    }
                }
            }
        } catch (Exception e2) {
            C0745Vl.b("Exception in fetchContentOnUIThread", e2);
            q.g().a(e2, "ContentFetchTask.fetchContent");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(C2593yla yla, WebView webView, String str, boolean z) {
        yla.g();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.o || TextUtils.isEmpty(webView.getTitle())) {
                    yla.a(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    yla.a(sb.toString(), z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (yla.b()) {
                this.e.b(yla);
            }
        } catch (JSONException unused) {
            C0745Vl.a("Json string may be malformed.");
        } catch (Throwable th) {
            C0745Vl.a("Failed to get webview content.", th);
            q.g().a(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void b() {
        synchronized (this.d) {
            if (this.f1899a) {
                C0745Vl.a("Content hash thread already started, quiting...");
                return;
            }
            this.f1899a = true;
            start();
        }
    }

    public final C2593yla c() {
        return this.e.a(this.q);
    }

    public final boolean d() {
        return this.f1900b;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0082 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082 A[LOOP:1: B:29:0x0082->B:40:0x0082, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Ela.run():void");
    }
}
