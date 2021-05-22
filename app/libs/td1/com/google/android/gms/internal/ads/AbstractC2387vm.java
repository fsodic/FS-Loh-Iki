package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.vm  reason: case insensitive filesystem */
public abstract class AbstractC2387vm {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<View> f5835a;

    public AbstractC2387vm(View view) {
        this.f5835a = new WeakReference<>(view);
    }

    private final ViewTreeObserver c() {
        ViewTreeObserver viewTreeObserver;
        View view = this.f5835a.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    public final void a() {
        ViewTreeObserver c2 = c();
        if (c2 != null) {
            a(c2);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(ViewTreeObserver viewTreeObserver);

    public final void b() {
        ViewTreeObserver c2 = c();
        if (c2 != null) {
            b(c2);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b(ViewTreeObserver viewTreeObserver);
}
