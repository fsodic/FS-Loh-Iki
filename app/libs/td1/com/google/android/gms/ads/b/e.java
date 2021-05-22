package com.google.android.gms.ads.b;

import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.internal.ads.AbstractC0988bb;
import com.google.android.gms.internal.ads.C0745Vl;
import com.google.android.gms.internal.ads.C2392voa;
import com.google.android.gms.internal.ads.C2474x;

@Deprecated
public class e extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final FrameLayout f1032a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0988bb f1033b;

    /* access modifiers changed from: protected */
    public final View a(String str) {
        try {
            a l = this.f1033b.l(str);
            if (l != null) {
                return (View) b.Q(l);
            }
            return null;
        } catch (RemoteException e) {
            C0745Vl.b("Unable to call getAssetView on delegate", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str, View view) {
        try {
            this.f1033b.a(str, b.a(view));
        } catch (RemoteException e) {
            C0745Vl.b("Unable to call setAssetView on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f1032a);
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f1032a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC0988bb bbVar;
        if (((Boolean) C2392voa.e().a(C2474x.Qb)).booleanValue() && (bbVar = this.f1033b) != null) {
            try {
                bbVar.g(b.a(motionEvent));
            } catch (RemoteException e) {
                C0745Vl.b("Unable to call handleTouchEvent on delegate", e);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getAdChoicesView() {
        View a2 = a("1098");
        if (a2 instanceof a) {
            return (a) a2;
        }
        return null;
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        AbstractC0988bb bbVar = this.f1033b;
        if (bbVar != null) {
            try {
                bbVar.a(b.a(view), i);
            } catch (RemoteException e) {
                C0745Vl.b("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f1032a);
    }

    public void removeView(View view) {
        if (this.f1032a != view) {
            super.removeView(view);
        }
    }

    public void setAdChoicesView(a aVar) {
        a("1098", aVar);
    }

    public void setNativeAd(c cVar) {
        try {
            this.f1033b.e((a) cVar.a());
        } catch (RemoteException e) {
            C0745Vl.b("Unable to call setNativeAd on delegate", e);
        }
    }
}
