package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.ads.internal.q;

/* renamed from: com.google.android.gms.internal.ads.Hl  reason: case insensitive filesystem */
public final class C0381Hl {

    /* renamed from: a  reason: collision with root package name */
    private final View f2166a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f2167b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2168c;
    private boolean d;
    private boolean e;
    private ViewTreeObserver.OnGlobalLayoutListener f;
    private ViewTreeObserver.OnScrollChangedListener g = null;

    public C0381Hl(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f2167b = activity;
        this.f2166a = view;
        this.f = onGlobalLayoutListener;
    }

    private static ViewTreeObserver b(Activity activity) {
        Window window;
        View decorView;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    private final void e() {
        ViewTreeObserver b2;
        if (!this.f2168c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f;
            if (onGlobalLayoutListener != null) {
                Activity activity = this.f2167b;
                if (!(activity == null || (b2 = b(activity)) == null)) {
                    b2.addOnGlobalLayoutListener(onGlobalLayoutListener);
                }
                q.z();
                C1974pm.a(this.f2166a, this.f);
            }
            this.f2168c = true;
        }
    }

    private final void f() {
        ViewTreeObserver b2;
        Activity activity = this.f2167b;
        if (activity != null && this.f2168c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f;
            if (!(onGlobalLayoutListener == null || (b2 = b(activity)) == null)) {
                q.e();
                b2.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f2168c = false;
        }
    }

    public final void a() {
        this.d = true;
        if (this.e) {
            e();
        }
    }

    public final void a(Activity activity) {
        this.f2167b = activity;
    }

    public final void b() {
        this.d = false;
        f();
    }

    public final void c() {
        this.e = true;
        if (this.d) {
            e();
        }
    }

    public final void d() {
        this.e = false;
        f();
    }
}
