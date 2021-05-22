package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.r;
import java.util.Collections;

public final class TB extends AbstractBinderC2231td implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, AbstractC0396Ia {

    /* renamed from: a  reason: collision with root package name */
    private View f3147a;

    /* renamed from: b  reason: collision with root package name */
    private AbstractC2532xpa f3148b;

    /* renamed from: c  reason: collision with root package name */
    private C0525Mz f3149c;
    private boolean d = false;
    private boolean e = false;

    public TB(C0525Mz mz, C0707Tz tz) {
        this.f3147a = tz.s();
        this.f3148b = tz.n();
        this.f3149c = mz;
        if (tz.t() != null) {
            tz.t().a(this);
        }
    }

    private final void Xb() {
        View view = this.f3147a;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f3147a);
            }
        }
    }

    private final void Yb() {
        View view;
        C0525Mz mz = this.f3149c;
        if (mz != null && (view = this.f3147a) != null) {
            mz.a(view, Collections.emptyMap(), Collections.emptyMap(), C0525Mz.d(this.f3147a));
        }
    }

    private static void a(AbstractC2369vd vdVar, int i) {
        try {
            vdVar.q(i);
        } catch (RemoteException e2) {
            C0745Vl.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2093rd
    public final void B(a aVar) {
        r.a("#008 Must be called on the main UI thread.");
        a(aVar, new VB(this));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0396Ia
    public final void Vb() {
        C2452wk.f5921a.post(new SB(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void Wb() {
        try {
            destroy();
        } catch (RemoteException e2) {
            C0745Vl.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2093rd
    public final void a(a aVar, AbstractC2369vd vdVar) {
        r.a("#008 Must be called on the main UI thread.");
        if (this.d) {
            C0745Vl.b("Instream ad can not be shown after destroy().");
            a(vdVar, 2);
        } else if (this.f3147a == null || this.f3148b == null) {
            String str = this.f3147a == null ? "can not get video view." : "can not get video controller.";
            C0745Vl.b(str.length() != 0 ? "Instream internal error: ".concat(str) : new String("Instream internal error: "));
            a(vdVar, 0);
        } else if (this.e) {
            C0745Vl.b("Instream ad should not be used again.");
            a(vdVar, 1);
        } else {
            this.e = true;
            Xb();
            ((ViewGroup) b.Q(aVar)).addView(this.f3147a, new ViewGroup.LayoutParams(-1, -1));
            q.z();
            C1974pm.a(this.f3147a, (ViewTreeObserver.OnGlobalLayoutListener) this);
            q.z();
            C1974pm.a(this.f3147a, (ViewTreeObserver.OnScrollChangedListener) this);
            Yb();
            try {
                vdVar.qa();
            } catch (RemoteException e2) {
                C0745Vl.d("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2093rd
    public final void destroy() {
        r.a("#008 Must be called on the main UI thread.");
        Xb();
        C0525Mz mz = this.f3149c;
        if (mz != null) {
            mz.a();
        }
        this.f3149c = null;
        this.f3147a = null;
        this.f3148b = null;
        this.d = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2093rd
    public final AbstractC2532xpa getVideoController() {
        r.a("#008 Must be called on the main UI thread.");
        if (!this.d) {
            return this.f3148b;
        }
        C0745Vl.b("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2093rd
    public final AbstractC0708Ua ha() {
        r.a("#008 Must be called on the main UI thread.");
        if (this.d) {
            C0745Vl.b("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        C0525Mz mz = this.f3149c;
        if (mz == null || mz.m() == null) {
            return null;
        }
        return this.f3149c.m().a();
    }

    public final void onGlobalLayout() {
        Yb();
    }

    public final void onScrollChanged() {
        Yb();
    }
}
