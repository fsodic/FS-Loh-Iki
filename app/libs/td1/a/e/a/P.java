package a.e.a;

import android.view.View;
import android.view.ViewTreeObserver;

/* access modifiers changed from: package-private */
public class P implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f97a;

    /* renamed from: b  reason: collision with root package name */
    private ViewTreeObserver f98b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f99c;

    private P(View view, Runnable runnable) {
        this.f97a = view;
        this.f98b = view.getViewTreeObserver();
        this.f99c = runnable;
    }

    public static P a(View view, Runnable runnable) {
        P p = new P(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(p);
        view.addOnAttachStateChangeListener(p);
        return p;
    }

    public void a() {
        (this.f98b.isAlive() ? this.f98b : this.f97a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f97a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        a();
        this.f99c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f98b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        a();
    }
}
