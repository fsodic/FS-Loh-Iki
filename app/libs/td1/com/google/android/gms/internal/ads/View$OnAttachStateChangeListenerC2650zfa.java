package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.zfa  reason: case insensitive filesystem */
public final class View$OnAttachStateChangeListenerC2650zfa implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f6197a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private final Context f6198b;

    /* renamed from: c  reason: collision with root package name */
    private Application f6199c;
    private final PowerManager d;
    private final KeyguardManager e;
    private BroadcastReceiver f;
    private final C1685lfa g;
    private WeakReference<ViewTreeObserver> h;
    private WeakReference<View> i;
    private Pda j;
    private byte k = -1;
    private int l = -1;
    private long m = -3;

    public View$OnAttachStateChangeListenerC2650zfa(Context context, C1685lfa lfa) {
        this.f6198b = context.getApplicationContext();
        this.g = lfa;
        this.d = (PowerManager) this.f6198b.getSystemService("power");
        this.e = (KeyguardManager) this.f6198b.getSystemService("keyguard");
        Context context2 = this.f6198b;
        if (context2 instanceof Application) {
            this.f6199c = (Application) context2;
            this.j = new Pda((Application) context2, this);
        }
        a((View) null);
    }

    private final void a(Activity activity, int i2) {
        Window window;
        if (this.i != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View b2 = b();
            if (b2 != null && peekDecorView != null && b2.getRootView() == peekDecorView.getRootView()) {
                this.l = i2;
            }
        }
    }

    private final View b() {
        WeakReference<View> weakReference = this.i;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private final void b(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f = new Bfa(this);
            this.f6198b.registerReceiver(this.f, intentFilter);
        }
        Application application = this.f6199c;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.j);
            } catch (Exception unused) {
            }
        }
    }

    private final void c() {
        f6197a.post(new RunnableC2581yfa(this));
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[Catch:{ Exception -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[SYNTHETIC, Splitter:B:17:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003c A[SYNTHETIC, Splitter:B:23:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.h     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001d
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.h     // Catch:{ Exception -> 0x001d }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x001d }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001b
            boolean r2 = r1.isAlive()     // Catch:{ Exception -> 0x001d }
            if (r2 == 0) goto L_0x001b
            r1.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x001d }
            r1.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x001d }
        L_0x001b:
            r3.h = r0     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch:{ Exception -> 0x002d }
            boolean r1 = r4.isAlive()     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x002d
            r4.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x002d }
            r4.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x002d }
        L_0x002d:
            android.content.BroadcastReceiver r4 = r3.f
            if (r4 == 0) goto L_0x0038
            android.content.Context r1 = r3.f6198b     // Catch:{ Exception -> 0x0036 }
            r1.unregisterReceiver(r4)     // Catch:{ Exception -> 0x0036 }
        L_0x0036:
            r3.f = r0
        L_0x0038:
            android.app.Application r4 = r3.f6199c
            if (r4 == 0) goto L_0x0041
            com.google.android.gms.internal.ads.Pda r0 = r3.j     // Catch:{ Exception -> 0x0041 }
            r4.unregisterActivityLifecycleCallbacks(r0)     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.View$OnAttachStateChangeListenerC2650zfa.c(android.view.View):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0064, code lost:
        if (r7 == false) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.View$OnAttachStateChangeListenerC2650zfa.d():void");
    }

    public final long a() {
        if (this.m <= -2 && b() == null) {
            this.m = -3;
        }
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        long j2;
        View b2 = b();
        if (b2 != null) {
            b2.removeOnAttachStateChangeListener(this);
            c(b2);
        }
        this.i = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                b(view);
            }
            view.addOnAttachStateChangeListener(this);
            j2 = -2;
        } else {
            j2 = -3;
        }
        this.m = j2;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, 0);
        d();
    }

    public final void onActivityDestroyed(Activity activity) {
        d();
    }

    public final void onActivityPaused(Activity activity) {
        a(activity, 4);
        d();
    }

    public final void onActivityResumed(Activity activity) {
        a(activity, 0);
        d();
        c();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        d();
    }

    public final void onActivityStarted(Activity activity) {
        a(activity, 0);
        d();
    }

    public final void onActivityStopped(Activity activity) {
        d();
    }

    public final void onGlobalLayout() {
        d();
    }

    public final void onScrollChanged() {
        d();
    }

    public final void onViewAttachedToWindow(View view) {
        this.l = -1;
        b(view);
        d();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.l = -1;
        d();
        c();
        c(view);
    }
}
