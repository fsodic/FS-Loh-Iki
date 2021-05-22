package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.q;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class FA {

    /* renamed from: a  reason: collision with root package name */
    private final MC f1929a;

    /* renamed from: b  reason: collision with root package name */
    private final C1306gC f1930b;

    /* renamed from: c  reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f1931c = null;
    private int d = ((Integer) C2392voa.e().a(C2474x.Ue)).intValue();
    private int e = ((Integer) C2392voa.e().a(C2474x.Ve)).intValue();
    private float f = ((Float) C2392voa.e().a(C2474x.We)).floatValue();

    public FA(MC mc, C1306gC gCVar) {
        this.f1929a = mc;
        this.f1930b = gCVar;
    }

    public final View a(C1941pR pRVar, View view, WindowManager windowManager) {
        AbstractC1564jo a2 = this.f1929a.a(C1015boa.L(), false);
        a2.getView().setVisibility(4);
        a2.getView().setContentDescription("policy_validator");
        a2.a("/sendMessageToSdk", new IA(this));
        a2.a("/hideValidatorOverlay", new HA(this, windowManager, view));
        a2.a("/open", new C0372Hc(null, null));
        this.f1930b.a(new WeakReference(a2), "/loadNativeAdPolicyViolations", new LA(this, view, windowManager, pRVar));
        this.f1930b.a(new WeakReference(a2), "/showValidatorOverlay", KA.f2372a);
        return a2.getView();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(View view, WindowManager windowManager, C1941pR pRVar, AbstractC1564jo joVar, Map map) {
        char c2;
        int i;
        joVar.d().a(new MA(this, map));
        Context context = view.getContext();
        if (!TextUtils.isEmpty((CharSequence) map.get("scale"))) {
            try {
                this.f = Float.parseFloat((String) map.get("scale"));
            } catch (NumberFormatException unused) {
            }
        }
        if (!TextUtils.isEmpty((CharSequence) map.get("overlay_width")) && !TextUtils.isEmpty((CharSequence) map.get("buffer"))) {
            try {
                C2392voa.a();
                this.d = Math.round(((float) C0459Kl.b(context, Integer.parseInt((String) map.get("overlay_width")) + Integer.parseInt((String) map.get("buffer")))) * this.f);
            } catch (NumberFormatException unused2) {
            }
        }
        if (!TextUtils.isEmpty((CharSequence) map.get("overlay_height")) && !TextUtils.isEmpty((CharSequence) map.get("buffer"))) {
            try {
                C2392voa.a();
                this.e = Math.round(((float) C0459Kl.b(context, Integer.parseInt((String) map.get("overlay_height")) + Integer.parseInt((String) map.get("buffer")))) * this.f);
            } catch (NumberFormatException unused3) {
            }
        }
        joVar.a(C1153dp.a(this.d, this.e));
        try {
            joVar.getWebView().getSettings().setUseWideViewPort(((Boolean) C2392voa.e().a(C2474x.Xe)).booleanValue());
            joVar.getWebView().getSettings().setLoadWithOverviewMode(((Boolean) C2392voa.e().a(C2474x.Ye)).booleanValue());
        } catch (NullPointerException unused4) {
        }
        String str = (String) map.get("orientation");
        q.c();
        DisplayMetrics d2 = C2452wk.d(context);
        int i2 = d2.widthPixels;
        int i3 = d2.heightPixels;
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            int intValue = ((Integer) C2392voa.e().a(C2474x.Te)).intValue();
            int max = Math.max(intValue, Math.min(rect.left, i2 - this.d));
            switch (str.hashCode()) {
                case 49:
                    if (str.equals("1")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 50:
                    if (str.equals("2")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 51:
                    if (str.equals("3")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 52:
                    if (str.equals("4")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 53:
                    if (str.equals("5")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 == 0 || c2 == 1) {
                int i4 = rect.bottom;
                C2392voa.a();
                i = i4 - C0459Kl.b(context, intValue);
            } else if (c2 == 2 || c2 == 3) {
                i = rect.top - this.e;
            } else if (c2 != 4) {
                i = 0;
            } else {
                int i5 = rect.bottom;
                int i6 = i3 - i5;
                int i7 = this.e;
                if (i6 > i7) {
                    C2392voa.a();
                    i = i5 - C0459Kl.b(context, intValue);
                } else {
                    i = (i3 - i7) / 2;
                }
            }
            WindowManager.LayoutParams a2 = C2592yl.a();
            a2.x = max;
            a2.y = i;
            windowManager.updateViewLayout(joVar.getView(), a2);
            this.f1931c = new NA(view, joVar, str, a2, (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - i, windowManager);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.f1931c);
            }
        }
        joVar.loadUrl(Uri.parse(pRVar.Z).buildUpon().appendQueryParameter("violations", (String) map.get("violations")).appendQueryParameter("orientation", (String) map.get("orientation")).appendQueryParameter("title", (String) map.get("title")).appendQueryParameter("scale", (String) map.get("scale")).build().toString());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(WindowManager windowManager, View view, AbstractC1564jo joVar, Map map) {
        C0745Vl.a("Hide native ad policy validator overlay.");
        joVar.getView().setVisibility(8);
        if (joVar.getView().getWindowToken() != null) {
            windowManager.removeView(joVar.getView());
        }
        joVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f1931c != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.f1931c);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(AbstractC1564jo joVar, Map map) {
        this.f1930b.a("sendMessageToNativeJs", map);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f1930b.a("sendMessageToNativeJs", hashMap);
    }
}
