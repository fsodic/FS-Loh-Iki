package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.ads.internal.q;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.nA  reason: case insensitive filesystem */
public final class ViewTreeObserver$OnGlobalLayoutListenerC1786nA extends AbstractBinderC0919ab implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, OA {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f5016a = {"2011", "1009", "3010"};

    /* renamed from: b  reason: collision with root package name */
    private final String f5017b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, WeakReference<View>> f5018c = new HashMap();
    private FrameLayout d;
    private FrameLayout e;
    private VW f;
    private View g;
    private final int h;
    private C0525Mz i;
    private View$OnAttachStateChangeListenerC1559jla j;
    private a k = null;
    private AbstractC0708Ua l;
    private boolean m;
    private boolean n = false;

    public ViewTreeObserver$OnGlobalLayoutListenerC1786nA(FrameLayout frameLayout, FrameLayout frameLayout2, int i2) {
        String str;
        this.d = frameLayout;
        this.e = frameLayout2;
        this.h = i2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f5017b = str;
        q.z();
        C1974pm.a((View) frameLayout, (ViewTreeObserver.OnGlobalLayoutListener) this);
        q.z();
        C1974pm.a((View) frameLayout, (ViewTreeObserver.OnScrollChangedListener) this);
        this.f = C0875_l.e;
        this.j = new View$OnAttachStateChangeListenerC1559jla(this.d.getContext(), this.d);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void Xb() {
        this.f.execute(new RunnableC1993qA(this));
    }

    @Override // com.google.android.gms.internal.ads.OA
    public final synchronized View E(String str) {
        if (this.n) {
            return null;
        }
        WeakReference<View> weakReference = this.f5018c.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.OA
    public final FrameLayout Jb() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.OA
    public final View$OnAttachStateChangeListenerC1559jla Kb() {
        return this.j;
    }

    @Override // com.google.android.gms.internal.ads.OA
    public final a Lb() {
        return this.k;
    }

    @Override // com.google.android.gms.internal.ads.OA
    public final synchronized Map<String, WeakReference<View>> Mb() {
        return this.f5018c;
    }

    @Override // com.google.android.gms.internal.ads.OA
    public final /* synthetic */ View Nb() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.OA
    public final synchronized Map<String, WeakReference<View>> Ob() {
        return this.f5018c;
    }

    @Override // com.google.android.gms.internal.ads.OA
    public final synchronized String Pb() {
        return this.f5017b;
    }

    @Override // com.google.android.gms.internal.ads.OA
    public final synchronized Map<String, WeakReference<View>> Qb() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void Wb() {
        if (this.g == null) {
            this.g = new View(this.d.getContext());
            this.g.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.d != this.g.getParent()) {
            this.d.addView(this.g);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0988bb
    public final synchronized void a(a aVar, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0988bb
    public final synchronized void a(AbstractC0708Ua ua) {
        if (!this.n) {
            this.m = true;
            this.l = ua;
            if (this.i != null) {
                this.i.m().a(ua);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.OA
    public final synchronized void a(String str, View view, boolean z) {
        if (!this.n) {
            if (view == null) {
                this.f5018c.remove(str);
                return;
            }
            this.f5018c.put(str, new WeakReference<>(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (C2592yl.a(this.h)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0988bb
    public final synchronized void a(String str, a aVar) {
        a(str, (View) b.Q(aVar), true);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0988bb
    public final synchronized void c(a aVar) {
        this.i.a((View) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0988bb
    public final synchronized void destroy() {
        if (!this.n) {
            if (this.i != null) {
                this.i.b(this);
                this.i = null;
            }
            this.f5018c.clear();
            this.d.removeAllViews();
            this.e.removeAllViews();
            this.f5018c = null;
            this.d = null;
            this.e = null;
            this.g = null;
            this.j = null;
            this.n = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0988bb
    public final synchronized void e(a aVar) {
        if (!this.n) {
            Object Q = b.Q(aVar);
            if (!(Q instanceof C0525Mz)) {
                C0745Vl.d("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            if (this.i != null) {
                this.i.b(this);
            }
            Xb();
            this.i = (C0525Mz) Q;
            this.i.a(this);
            this.i.b(this.d);
            this.i.c(this.e);
            if (this.m) {
                this.i.m().a(this.l);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0988bb
    public final void g(a aVar) {
        onTouch(this.d, (MotionEvent) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0988bb
    public final synchronized a l(String str) {
        return b.a(E(str));
    }

    public final synchronized void onClick(View view) {
        if (this.i != null) {
            this.i.g();
            this.i.a(view, this.d, Mb(), Ob(), false);
        }
    }

    public final synchronized void onGlobalLayout() {
        if (this.i != null) {
            this.i.a(this.d, Mb(), Ob(), C0525Mz.d(this.d));
        }
    }

    public final synchronized void onScrollChanged() {
        if (this.i != null) {
            this.i.a(this.d, Mb(), Ob(), C0525Mz.d(this.d));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.i != null) {
            this.i.a(view, motionEvent, this.d);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0988bb
    public final synchronized void t(a aVar) {
        if (!this.n) {
            this.k = aVar;
        }
    }
}
