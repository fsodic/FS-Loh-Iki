package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@TargetApi(14)
/* renamed from: com.google.android.gms.internal.ads.jla  reason: case insensitive filesystem */
public final class View$OnAttachStateChangeListenerC1559jla implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a  reason: collision with root package name */
    private static final long f4719a = ((Long) C2392voa.e().a(C2474x.bb)).longValue();

    /* renamed from: b  reason: collision with root package name */
    private final Context f4720b;

    /* renamed from: c  reason: collision with root package name */
    private Application f4721c;
    private final WindowManager d;
    private final PowerManager e;
    private final KeyguardManager f;
    private BroadcastReceiver g;
    private WeakReference<ViewTreeObserver> h;
    private WeakReference<View> i;
    private C2042qla j;
    private C0199Al k = new C0199Al(f4719a);
    private boolean l = false;
    private int m = -1;
    private final HashSet<AbstractC1835nla> n = new HashSet<>();
    private final DisplayMetrics o;
    private final Rect p;

    public View$OnAttachStateChangeListenerC1559jla(Context context, View view) {
        this.f4720b = context.getApplicationContext();
        this.d = (WindowManager) context.getSystemService("window");
        this.e = (PowerManager) this.f4720b.getSystemService("power");
        this.f = (KeyguardManager) context.getSystemService("keyguard");
        Context context2 = this.f4720b;
        if (context2 instanceof Application) {
            this.f4721c = (Application) context2;
            this.j = new C2042qla((Application) context2, this);
        }
        this.o = context.getResources().getDisplayMetrics();
        this.p = new Rect();
        this.p.right = this.d.getDefaultDisplay().getWidth();
        this.p.bottom = this.d.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.i;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            b(view2);
        }
        this.i = new WeakReference<>(view);
        if (view != null) {
            if (q.e().a(view)) {
                a(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final Rect a(Rect rect) {
        return new Rect(b(rect.left), b(rect.top), b(rect.right), b(rect.bottom));
    }

    /* access modifiers changed from: private */
    public final void a(int i2) {
        WeakReference<View> weakReference;
        boolean z;
        boolean z2;
        if (this.n.size() != 0 && (weakReference = this.i) != null) {
            View view = weakReference.get();
            boolean z3 = i2 == 1;
            boolean z4 = view == null;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect rect3 = new Rect();
            Rect rect4 = new Rect();
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            if (view != null) {
                boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
                boolean localVisibleRect = view.getLocalVisibleRect(rect3);
                view.getHitRect(rect4);
                try {
                    view.getLocationOnScreen(iArr);
                    view.getLocationInWindow(iArr2);
                } catch (Exception e2) {
                    C0745Vl.b("Failure getting view location.", e2);
                }
                rect.left = iArr[0];
                rect.top = iArr[1];
                rect.right = rect.left + view.getWidth();
                rect.bottom = rect.top + view.getHeight();
                z2 = globalVisibleRect;
                z = localVisibleRect;
            } else {
                z2 = false;
                z = false;
            }
            List<Rect> emptyList = (!((Boolean) C2392voa.e().a(C2474x.eb)).booleanValue() || view == null) ? Collections.emptyList() : c(view);
            int windowVisibility = view != null ? view.getWindowVisibility() : 8;
            int i3 = this.m;
            if (i3 != -1) {
                windowVisibility = i3;
            }
            boolean z5 = !z4 && q.c().a(view, this.e, this.f) && z2 && z && windowVisibility == 0;
            if (z3 && !this.k.a() && z5 == this.l) {
                return;
            }
            if (z5 || this.l || i2 != 1) {
                C1904ola ola = new C1904ola(q.j().b(), this.e.isScreenOn(), view != null && q.e().a(view), view != null ? view.getWindowVisibility() : 8, a(this.p), a(rect), a(rect2), z2, a(rect3), z, a(rect4), this.o.density, z5, emptyList);
                Iterator<AbstractC1835nla> it = this.n.iterator();
                while (it.hasNext()) {
                    it.next().a(ola);
                }
                this.l = z5;
            }
        }
    }

    private final void a(Activity activity, int i2) {
        Window window;
        if (this.i != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = this.i.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.m = i2;
            }
        }
    }

    private final void a(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.g = new C1697lla(this);
            q.x().a(this.f4720b, this.g, intentFilter);
        }
        Application application = this.f4721c;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.j);
            } catch (Exception e2) {
                C0745Vl.b("Error registering activity lifecycle callbacks.", e2);
            }
        }
    }

    private final int b(int i2) {
        return (int) (((float) i2) / this.o.density);
    }

    private final void b(View view) {
        try {
            if (this.h != null) {
                ViewTreeObserver viewTreeObserver = this.h.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.h = null;
            }
        } catch (Exception e2) {
            C0745Vl.b("Error while unregistering listeners from the last ViewTreeObserver.", e2);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e3) {
            C0745Vl.b("Error while unregistering listeners from the ViewTreeObserver.", e3);
        }
        if (this.g != null) {
            try {
                q.x().a(this.f4720b, this.g);
            } catch (IllegalStateException e4) {
                C0745Vl.b("Failed trying to unregister the receiver", e4);
            } catch (Exception e5) {
                q.g().a(e5, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.g = null;
        }
        Application application = this.f4721c;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.j);
            } catch (Exception e6) {
                C0745Vl.b("Error registering activity lifecycle callbacks.", e6);
            }
        }
    }

    private final List<Rect> c(View view) {
        try {
            ArrayList arrayList = new ArrayList();
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                View view2 = (View) parent;
                Rect rect = new Rect();
                if (view2.isScrollContainer() && view2.getGlobalVisibleRect(rect)) {
                    arrayList.add(a(rect));
                }
            }
            return arrayList;
        } catch (Exception e2) {
            q.g().a(e2, "PositionWatcher.getParentScrollViewRects");
            return Collections.emptyList();
        }
    }

    private final void c() {
        C2452wk.f5921a.post(new RunnableC1766mla(this));
    }

    public final void a() {
        this.k.a(f4719a);
    }

    public final void a(long j2) {
        this.k.a(j2);
    }

    public final void a(AbstractC1835nla nla) {
        this.n.add(nla);
        a(3);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        a(3);
    }

    public final void b(AbstractC1835nla nla) {
        this.n.remove(nla);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, 0);
        a(3);
        c();
    }

    public final void onActivityDestroyed(Activity activity) {
        a(3);
        c();
    }

    public final void onActivityPaused(Activity activity) {
        a(activity, 4);
        a(3);
        c();
    }

    public final void onActivityResumed(Activity activity) {
        a(activity, 0);
        a(3);
        c();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(3);
        c();
    }

    public final void onActivityStarted(Activity activity) {
        a(activity, 0);
        a(3);
        c();
    }

    public final void onActivityStopped(Activity activity) {
        a(3);
        c();
    }

    public final void onGlobalLayout() {
        a(2);
        c();
    }

    public final void onScrollChanged() {
        a(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.m = -1;
        a(view);
        a(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.m = -1;
        a(3);
        c();
        b(view);
    }
}
