package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.d;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.cocos2dx.lib.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sz  reason: case insensitive filesystem */
public final class C2197sz implements AbstractC0891aA {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5571a;

    /* renamed from: b  reason: collision with root package name */
    private final C1098dA f5572b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f5573c;
    private final C1306gC d;
    private final C0707Tz e;
    private final C1955pca f;
    private final C1160dv g;
    private final C0494Lu h;
    private final C1941pR i;
    private final C0823Yl j;
    private final GR k;
    private final C2120rr l;
    private final View$OnClickListenerC2406wA m;
    private final d n;
    private final C0601Px o;
    private final LT p;
    private boolean q = false;
    private boolean r;
    private boolean s = false;
    private boolean t = false;
    private Point u = new Point();
    private Point v = new Point();
    private long w = 0;
    private long x = 0;
    private AbstractC1223epa y;

    public C2197sz(Context context, C1098dA dAVar, JSONObject jSONObject, C1306gC gCVar, C0707Tz tz, C1955pca pca, C1160dv dvVar, C0494Lu lu, C1941pR pRVar, C0823Yl yl, GR gr, C2120rr rrVar, View$OnClickListenerC2406wA wAVar, d dVar, C0601Px px, LT lt) {
        this.f5571a = context;
        this.f5572b = dAVar;
        this.f5573c = jSONObject;
        this.d = gCVar;
        this.e = tz;
        this.f = pca;
        this.g = dvVar;
        this.h = lu;
        this.i = pRVar;
        this.j = yl;
        this.k = gr;
        this.l = rrVar;
        this.m = wAVar;
        this.n = dVar;
        this.o = px;
        this.p = lt;
    }

    private final void a(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        r.a("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f5573c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z3 = false;
            jSONObject7.put("has_custom_click_handler", this.f5572b.b(this.e.e()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.e.o());
            jSONObject8.put("view_aware_api_used", z);
            jSONObject8.put("custom_mute_requested", this.k.i != null && this.k.i.g);
            jSONObject8.put("custom_mute_enabled", !this.e.j().isEmpty() && this.e.r() != null);
            if (this.m.b() != null && this.f5573c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.n.a());
            if (this.t && d()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.f5572b.b(this.e.e()) != null) {
                z3 = true;
            }
            jSONObject8.put("has_custom_click_handler", z3);
            jSONObject8.put("click_signals", b(view));
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long a2 = this.n.a();
            jSONObject9.put("time_from_last_touch_down", a2 - this.w);
            jSONObject9.put("time_from_last_touch", a2 - this.x);
            jSONObject7.put("touch_signal", jSONObject9);
            C1148dm.a(this.d.a("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            C0745Vl.b("Unable to create click JSON.", e2);
        }
    }

    private final boolean a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) {
        r.a("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f5573c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) C2392voa.e().a(C2474x.Sb)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            jSONObject6.put("screen", C2592yl.a(this.f5571a));
            this.d.a("/logScionEvent", new C2335uz(this));
            this.d.a("/nativeImpression", new C2542xz(this));
            C1148dm.a(this.d.a("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            boolean z2 = this.q;
            if (z2 || this.i.z == null) {
                return true;
            }
            this.q = z2 | q.m().b(this.f5571a, this.j.f3587a, this.i.z.toString(), this.k.f);
            return true;
        } catch (JSONException e2) {
            C0745Vl.b("Unable to create impression JSON.", e2);
            return false;
        }
    }

    private final String b(View view) {
        try {
            JSONObject optJSONObject = this.f5573c.optJSONObject("tracking_urls_and_actions");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            return this.f.a().a(this.f5571a, optJSONObject.optString("click_string"), view);
        } catch (Exception e2) {
            C0745Vl.b("Exception obtaining click signals", e2);
            return null;
        }
    }

    private final String b(View view, Map<String, WeakReference<View>> map) {
        if (!(map == null || view == null)) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                if (view.equals(entry.getValue().get())) {
                    return entry.getKey();
                }
            }
        }
        int o2 = this.e.o();
        if (o2 == 1) {
            return "1099";
        }
        if (o2 == 2) {
            return "2099";
        }
        if (o2 == 3 || o2 != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean b(String str) {
        JSONObject optJSONObject = this.f5573c.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    private final String c(View view) {
        if (!((Boolean) C2392voa.e().a(C2474x.Sb)).booleanValue()) {
            return null;
        }
        try {
            return this.f.a().a(this.f5571a, view, (Activity) null);
        } catch (Exception unused) {
            C0745Vl.b("Exception getting data.");
            return null;
        }
    }

    private final boolean d() {
        return this.f5573c.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final boolean G() {
        return d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a() {
        a(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(Bundle bundle) {
        if (bundle == null) {
            C0745Vl.a("Click data is null. No click is reported.");
        } else if (!b("click_reporting")) {
            C0745Vl.b("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            a(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, q.c().a(bundle, (JSONObject) null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(View view) {
        if (!this.f5573c.optBoolean("custom_one_point_five_click_enabled", false)) {
            C0745Vl.d("setClickConfirmingView: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            return;
        }
        View$OnClickListenerC2406wA wAVar = this.m;
        if (view != null) {
            view.setOnClickListener(wAVar);
            view.setClickable(true);
            wAVar.g = new WeakReference<>(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(View view, MotionEvent motionEvent, View view2) {
        this.u = C2592yl.a(motionEvent, view2);
        long a2 = this.n.a();
        this.x = a2;
        if (motionEvent.getAction() == 0) {
            this.w = a2;
            this.v = this.u;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.u;
        obtain.setLocation((float) point.x, (float) point.y);
        this.f.a(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        JSONObject a2 = C2592yl.a(this.f5571a, map, map2, view2);
        JSONObject a3 = C2592yl.a(this.f5571a, view2);
        JSONObject a4 = C2592yl.a(view2);
        JSONObject b2 = C2592yl.b(this.f5571a, view2);
        String b3 = b(view, map);
        a(view, a3, a2, a4, b2, b3, C2592yl.a(b3, this.f5571a, this.v, this.u), null, z, false);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(View view, Map<String, WeakReference<View>> map) {
        this.u = new Point();
        this.v = new Point();
        this.o.b(view);
        this.r = false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        a(C2592yl.a(this.f5571a, view), C2592yl.a(this.f5571a, map, map2, view), C2592yl.a(view), C2592yl.b(this.f5571a, view), c(view), null, C2592yl.a(this.i));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.u = new Point();
        this.v = new Point();
        if (!this.r) {
            this.o.a(view);
            this.r = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.l.a(this);
        boolean a2 = C2592yl.a(this.j.f3589c);
        if (map != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view2 = entry.getValue().get();
                if (view2 != null) {
                    if (a2) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry<String, WeakReference<View>> entry2 : map2.entrySet()) {
                View view3 = entry2.getValue().get();
                if (view3 != null) {
                    if (a2) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.t) {
            C0745Vl.a("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (!d()) {
            C0745Vl.a("Custom click reporting failed. Ad unit id not whitelisted.");
        } else {
            JSONObject a2 = C2592yl.a(this.f5571a, map, map2, view);
            JSONObject a3 = C2592yl.a(this.f5571a, view);
            JSONObject a4 = C2592yl.a(view);
            JSONObject b2 = C2592yl.b(this.f5571a, view);
            String b3 = b(null, map);
            a(view, a3, a2, a4, b2, b3, C2592yl.a(b3, this.f5571a, this.v, this.u), null, z, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(AbstractC0657Sb sb) {
        if (!this.f5573c.optBoolean("custom_one_point_five_click_enabled", false)) {
            C0745Vl.d("setUnconfirmedClickListener: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
        } else {
            this.m.a(sb);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(AbstractC1223epa epa) {
        this.y = epa;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(AbstractC1498ipa ipa) {
        try {
            if (!this.s) {
                if (ipa != null || this.e.r() == null) {
                    this.s = true;
                    this.p.a(ipa.ma());
                    c();
                    return;
                }
                this.s = true;
                this.p.a(this.e.r().ma());
                c();
            }
        } catch (RemoteException e2) {
            C0745Vl.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void a(String str) {
        a(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void b() {
        r.a("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f5573c);
            C1148dm.a(this.d.a("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void b(Bundle bundle) {
        if (bundle == null) {
            C0745Vl.a("Touch event data is null. No touch event is reported.");
        } else if (!b("touch_reporting")) {
            C0745Vl.b("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        } else {
            int i2 = bundle.getInt("duration_ms");
            this.f.a().a((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void c() {
        try {
            if (this.y != null) {
                this.y.ta();
            }
        } catch (RemoteException e2) {
            C0745Vl.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final boolean c(Bundle bundle) {
        if (b("impression_reporting")) {
            return a(null, null, null, null, null, q.c().a(bundle, (JSONObject) null), false);
        }
        C0745Vl.b("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void destroy() {
        this.d.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void v() {
        this.t = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0891aA
    public final void x() {
        if (this.f5573c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.m.a();
        }
    }
}
