package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.q;

/* renamed from: com.google.android.gms.internal.ads.rp  reason: case insensitive filesystem */
public class C2117rp extends C1773mp implements AbstractC2186sp {

    /* renamed from: a  reason: collision with root package name */
    private final C1980pp f5458a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f5459b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5460c;

    public C2117rp(Context context, C1980pp ppVar) {
        super(context);
        q.g().f();
        this.f5458a = ppVar;
        super.setWebViewClient(ppVar);
    }

    private final synchronized void O() {
        if (!this.f5460c) {
            this.f5460c = true;
            q.g().g();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2186sp
    public final synchronized void a(C1911op opVar) {
        C1763mk.f("Blank page loaded, 1...");
        o();
    }

    @Override // com.google.android.gms.internal.ads.C1773mp
    public /* bridge */ /* synthetic */ void a(String str) {
        super.a(str);
    }

    @Override // com.google.android.gms.internal.ads.C1773mp
    public /* bridge */ /* synthetic */ void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
    }

    public synchronized void destroy() {
        if (!this.f5459b) {
            this.f5459b = true;
            this.f5458a.a(this);
            g(false);
            C1763mk.f("Initiating WebView self destruct sequence in 3...");
            C1763mk.f("Loading blank page in WebView, 2...");
            try {
                super.loadUrl("about:blank");
            } catch (UnsatisfiedLinkError e) {
                q.g().a(e, "AdWebViewImpl.loadUrlUnsafe");
                C0745Vl.d("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        super.destroy();
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (isDestroyed()) {
            C0745Vl.d("#004 The webview is destroyed. Ignoring action.");
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        try {
            synchronized (this) {
                if (!isDestroyed()) {
                    g(true);
                }
                O();
            }
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: protected */
    public void g(boolean z) {
    }

    public final synchronized boolean isDestroyed() {
        return this.f5459b;
    }

    public synchronized void loadData(String str, String str2, String str3) {
        if (!isDestroyed()) {
            super.loadData(str, str2, str3);
        } else {
            C0745Vl.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!isDestroyed()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            C0745Vl.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.C1773mp
    public synchronized void loadUrl(String str) {
        if (!isDestroyed()) {
            super.loadUrl(str);
        } else {
            C0745Vl.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* access modifiers changed from: protected */
    public synchronized void o() {
        C1763mk.f("Destroying WebView!");
        O();
        C0875_l.e.execute(new RunnableC2049qp(this));
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public void onDraw(Canvas canvas) {
        if (!isDestroyed()) {
            super.onDraw(canvas);
        }
    }

    public void onPause() {
        if (!isDestroyed()) {
            super.onPause();
        }
    }

    public void onResume() {
        if (!isDestroyed()) {
            super.onResume();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !isDestroyed() && super.onTouchEvent(motionEvent);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
    }

    public void stopLoading() {
        if (!isDestroyed()) {
            super.stopLoading();
        }
    }
}
