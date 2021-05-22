package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.ads.internal.q;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class TA implements AbstractC0891aA {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC2580yf f3144a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0271Df f3145b;

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC0297Ef f3146c;
    private final C1160dv d;
    private final C0494Lu e;
    private final Context f;
    private final C1941pR g;
    private final C0823Yl h;
    private final GR i;
    private boolean j = false;
    private boolean k = false;

    public TA(AbstractC2580yf yfVar, AbstractC0271Df df, AbstractC0297Ef ef, C1160dv dvVar, C0494Lu lu, Context context, C1941pR pRVar, C0823Yl yl, GR gr) {
        this.f3144a = yfVar;
        this.f3145b = df;
        this.f3146c = ef;
        this.d = dvVar;
        this.e = lu;
        this.f = context;
        this.g = pRVar;
        this.h = yl;
        this.i = gr;
    }

    private static HashMap<String, View> a(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view = entry.getValue().get();
                if (view != null) {
                    hashMap.put(entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    private final void b(View view) {
        try {
            if (this.f3146c != null && !this.f3146c.T()) {
                this.f3146c.b(b.a(view));
                this.e.e();
            } else if (this.f3144a != null && !this.f3144a.T()) {
                this.f3144a.b(b.a(view));
                this.e.e();
            } else if (this.f3145b != null && !this.f3145b.T()) {
                this.f3145b.b(b.a(view));
                this.e.e();
            }
        } catch (RemoteException e2) {
            C0745Vl.c("Failed to call handleClick", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final boolean G() {
        return this.g.D;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(View view) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.k || !this.g.D) {
            b(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(View view, Map<String, WeakReference<View>> map) {
        try {
            a a2 = b.a(view);
            if (this.f3146c != null) {
                this.f3146c.a(a2);
            } else if (this.f3144a != null) {
                this.f3144a.a(a2);
            } else if (this.f3145b != null) {
                this.f3145b.a(a2);
            }
        } catch (RemoteException e2) {
            C0745Vl.c("Failed to call untrackView", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        try {
            if (!this.j && this.g.z != null) {
                this.j |= q.m().b(this.f, this.h.f3587a, this.g.z.toString(), this.i.f);
            }
            if (this.f3146c != null && !this.f3146c.L()) {
                this.f3146c.u();
                this.d.b();
            } else if (this.f3144a != null && !this.f3144a.L()) {
                this.f3144a.u();
                this.d.b();
            } else if (this.f3145b != null && !this.f3145b.L()) {
                this.f3145b.u();
                this.d.b();
            }
        } catch (RemoteException e2) {
            C0745Vl.c("Failed to call recordImpression", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        try {
            a a2 = b.a(view);
            HashMap<String, View> a3 = a(map);
            HashMap<String, View> a4 = a(map2);
            if (this.f3146c != null) {
                this.f3146c.a(a2, b.a(a3), b.a(a4));
            } else if (this.f3144a != null) {
                this.f3144a.a(a2, b.a(a3), b.a(a4));
                this.f3144a.d(a2);
            } else if (this.f3145b != null) {
                this.f3145b.a(a2, b.a(a3), b.a(a4));
                this.f3145b.d(a2);
            }
        } catch (RemoteException e2) {
            C0745Vl.c("Failed to call trackView", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        String str;
        if (!this.k) {
            str = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.";
        } else if (!this.g.D) {
            str = "Custom click reporting for 3p ads failed. Ad unit id not whitelisted.";
        } else {
            b(view);
            return;
        }
        C0745Vl.d(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(AbstractC0657Sb sb) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(AbstractC1223epa epa) {
        C0745Vl.d("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(AbstractC1498ipa ipa) {
        C0745Vl.d("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(String str) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void b(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void c() {
        C0745Vl.d("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final boolean c(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void destroy() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void v() {
        this.k = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void x() {
    }
}
