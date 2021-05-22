package com.google.android.gms.ads.b;

import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.internal.ads.AbstractC0988bb;
import com.google.android.gms.internal.ads.C0745Vl;
import com.google.android.gms.internal.ads.C2392voa;
import com.google.android.gms.internal.ads.C2474x;
import com.google.android.gms.internal.ads.Rpa;

public final class l extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final FrameLayout f1040a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0988bb f1041b;

    private final View a(String str) {
        try {
            a l = this.f1041b.l(str);
            if (l != null) {
                return (View) b.Q(l);
            }
            return null;
        } catch (RemoteException e) {
            C0745Vl.b("Unable to call getAssetView on delegate", e);
            return null;
        }
    }

    private final void a(String str, View view) {
        try {
            this.f1041b.a(str, b.a(view));
        } catch (RemoteException e) {
            C0745Vl.b("Unable to call setAssetView on delegate", e);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(ImageView.ScaleType scaleType) {
        if (scaleType != null) {
            try {
                this.f1041b.t(b.a(scaleType));
            } catch (RemoteException e) {
                C0745Vl.b("Unable to call setMediaViewImageScaleType on delegate", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(com.google.android.gms.ads.l lVar) {
        try {
            if (lVar instanceof Rpa) {
                this.f1041b.a(((Rpa) lVar).a());
            } else if (lVar == null) {
                this.f1041b.a(null);
            } else {
                C0745Vl.a("Use MediaContent provided by UnifiedNativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            C0745Vl.b("Unable to call setMediaContent on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f1040a);
    }

    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f1040a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC0988bb bbVar;
        if (((Boolean) C2392voa.e().a(C2474x.Qb)).booleanValue() && (bbVar = this.f1041b) != null) {
            try {
                bbVar.g(b.a(motionEvent));
            } catch (RemoteException e) {
                C0745Vl.b("Unable to call handleTouchEvent on delegate", e);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final a getAdChoicesView() {
        View a2 = a("3011");
        if (a2 instanceof a) {
            return (a) a2;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final b getMediaView() {
        View a2 = a("3010");
        if (a2 instanceof b) {
            return (b) a2;
        }
        if (a2 == null) {
            return null;
        }
        C0745Vl.a("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        AbstractC0988bb bbVar = this.f1041b;
        if (bbVar != null) {
            try {
                bbVar.a(b.a(view), i);
            } catch (RemoteException e) {
                C0745Vl.b("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f1040a);
    }

    public final void removeView(View view) {
        if (this.f1040a != view) {
            super.removeView(view);
        }
    }

    public final void setAdChoicesView(a aVar) {
        a("3011", aVar);
    }

    public final void setAdvertiserView(View view) {
        a("3005", view);
    }

    public final void setBodyView(View view) {
        a("3004", view);
    }

    public final void setCallToActionView(View view) {
        a("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.f1041b.c(b.a(view));
        } catch (RemoteException e) {
            C0745Vl.b("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(View view) {
        a("3001", view);
    }

    public final void setIconView(View view) {
        a("3003", view);
    }

    public final void setImageView(View view) {
        a("3008", view);
    }

    public final void setMediaView(b bVar) {
        a("3010", bVar);
        if (bVar != null) {
            bVar.a(new p(this));
            bVar.a(new o(this));
        }
    }

    public final void setNativeAd(k kVar) {
        try {
            this.f1041b.e((a) kVar.k());
        } catch (RemoteException e) {
            C0745Vl.b("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(View view) {
        a("3007", view);
    }

    public final void setStarRatingView(View view) {
        a("3009", view);
    }

    public final void setStoreView(View view) {
        a("3006", view);
    }
}
