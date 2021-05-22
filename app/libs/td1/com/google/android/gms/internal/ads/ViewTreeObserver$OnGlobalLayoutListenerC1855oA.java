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

/* renamed from: com.google.android.gms.internal.ads.oA  reason: case insensitive filesystem */
public final class ViewTreeObserver$OnGlobalLayoutListenerC1855oA extends AbstractBinderC1332gb implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, OA {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<View> f5097a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, WeakReference<View>> f5098b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, WeakReference<View>> f5099c = new HashMap();
    private final Map<String, WeakReference<View>> d = new HashMap();
    private C0525Mz e;
    private View$OnAttachStateChangeListenerC1559jla f;

    public ViewTreeObserver$OnGlobalLayoutListenerC1855oA(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        q.z();
        C1974pm.a(view, (ViewTreeObserver.OnGlobalLayoutListener) this);
        q.z();
        C1974pm.a(view, (ViewTreeObserver.OnScrollChangedListener) this);
        this.f5097a = new WeakReference<>(view);
        for (Map.Entry<String, View> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            View value = entry.getValue();
            if (value != null) {
                this.f5098b.put(key, new WeakReference<>(value));
                if (!"1098".equals(key) && !"3011".equals(key)) {
                    value.setOnTouchListener(this);
                    value.setClickable(true);
                    value.setOnClickListener(this);
                }
            }
        }
        this.d.putAll(this.f5098b);
        for (Map.Entry<String, View> entry2 : hashMap2.entrySet()) {
            View value2 = entry2.getValue();
            if (value2 != null) {
                this.f5099c.put(entry2.getKey(), new WeakReference<>(value2));
                value2.setOnTouchListener(this);
                value2.setClickable(false);
            }
        }
        this.d.putAll(this.f5099c);
        this.f = new View$OnAttachStateChangeListenerC1559jla(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.OA
    public final synchronized View E(String str) {
        WeakReference<View> weakReference = this.d.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.OA
    public final FrameLayout Jb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.OA
    public final View$OnAttachStateChangeListenerC1559jla Kb() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.OA
    public final synchronized a Lb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.OA
    public final synchronized Map<String, WeakReference<View>> Mb() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.OA
    public final View Nb() {
        return this.f5097a.get();
    }

    @Override // com.google.android.gms.internal.ads.OA
    public final synchronized Map<String, WeakReference<View>> Ob() {
        return this.f5098b;
    }

    @Override // com.google.android.gms.internal.ads.OA
    public final synchronized String Pb() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.OA
    public final synchronized Map<String, WeakReference<View>> Qb() {
        return this.f5099c;
    }

    @Override // com.google.android.gms.internal.ads.OA
    public final synchronized void a(String str, View view, boolean z) {
        if (view == null) {
            this.d.remove(str);
            this.f5098b.remove(str);
            this.f5099c.remove(str);
            return;
        }
        this.d.put(str, new WeakReference<>(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f5098b.put(str, new WeakReference<>(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1194eb
    public final synchronized void c(a aVar) {
        if (this.e != null) {
            Object Q = b.Q(aVar);
            if (!(Q instanceof View)) {
                C0745Vl.d("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.e.a((View) Q);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1194eb
    public final synchronized void e(a aVar) {
        Object Q = b.Q(aVar);
        if (!(Q instanceof C0525Mz)) {
            C0745Vl.d("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        if (this.e != null) {
            this.e.b(this);
        }
        if (((C0525Mz) Q).k()) {
            this.e = (C0525Mz) Q;
            this.e.a(this);
            this.e.b(Nb());
            return;
        }
        C0745Vl.b("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    public final synchronized void onClick(View view) {
        if (this.e != null) {
            this.e.a(view, Nb(), Mb(), Ob(), true);
        }
    }

    public final synchronized void onGlobalLayout() {
        if (this.e != null) {
            this.e.a(Nb(), Mb(), Ob(), C0525Mz.d(Nb()));
        }
    }

    public final synchronized void onScrollChanged() {
        if (this.e != null) {
            this.e.a(Nb(), Mb(), Ob(), C0525Mz.d(Nb()));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.e != null) {
            this.e.a(view, motionEvent, Nb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1194eb
    public final synchronized void tb() {
        if (this.e != null) {
            this.e.b(this);
            this.e = null;
        }
    }
}
