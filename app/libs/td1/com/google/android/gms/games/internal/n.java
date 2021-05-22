package com.google.android.gms.games.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.util.o;
import java.lang.ref.WeakReference;

public final class n implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    private r f1466a;

    /* renamed from: b  reason: collision with root package name */
    private p f1467b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<View> f1468c;
    private boolean d = false;

    private n(r rVar, int i) {
        this.f1466a = rVar;
        this.f1467b = new p(i);
    }

    public static n a(r rVar, int i) {
        return new n(rVar, i);
    }

    @TargetApi(17)
    private final void b(View view) {
        Display display;
        int i = -1;
        if (o.d() && (display = view.getDisplay()) != null) {
            i = display.getDisplayId();
        }
        IBinder windowToken = view.getWindowToken();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = view.getWidth();
        int height = view.getHeight();
        p pVar = this.f1467b;
        pVar.f1471c = i;
        pVar.f1469a = windowToken;
        pVar.d = iArr[0];
        pVar.e = iArr[1];
        pVar.f = iArr[0] + width;
        pVar.g = iArr[1] + height;
        if (this.d) {
            d();
        }
    }

    public final Bundle a() {
        return this.f1467b.a();
    }

    @TargetApi(16)
    public final void a(View view) {
        this.f1466a.D();
        WeakReference<View> weakReference = this.f1468c;
        if (weakReference != null) {
            View view2 = weakReference.get();
            Context q = this.f1466a.q();
            if (view2 == null && (q instanceof Activity)) {
                view2 = ((Activity) q).getWindow().getDecorView();
            }
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(this);
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                if (o.c()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
        this.f1468c = null;
        Context q2 = this.f1466a.q();
        if (view == null && (q2 instanceof Activity)) {
            Activity activity = (Activity) q2;
            view = activity.findViewById(16908290);
            if (view == null) {
                view = activity.getWindow().getDecorView();
            }
            e.b("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
        }
        if (view != null) {
            b(view);
            this.f1468c = new WeakReference<>(view);
            view.addOnAttachStateChangeListener(this);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            return;
        }
        e.a("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
    }

    public final IBinder b() {
        return this.f1467b.f1469a;
    }

    public final p c() {
        return this.f1467b;
    }

    public final void d() {
        boolean z;
        p pVar = this.f1467b;
        IBinder iBinder = pVar.f1469a;
        if (iBinder != null) {
            this.f1466a.a(iBinder, pVar.a());
            z = false;
        } else {
            z = true;
        }
        this.d = z;
    }

    public final void onGlobalLayout() {
        View view;
        WeakReference<View> weakReference = this.f1468c;
        if (weakReference != null && (view = weakReference.get()) != null) {
            b(view);
        }
    }

    public final void onViewAttachedToWindow(View view) {
        b(view);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f1466a.D();
        view.removeOnAttachStateChangeListener(this);
    }
}
