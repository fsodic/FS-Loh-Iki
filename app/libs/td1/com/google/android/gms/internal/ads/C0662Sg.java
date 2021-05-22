package com.google.android.gms.internal.ads;

import org.cocos2dx.lib.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Sg  reason: case insensitive filesystem */
public class C0662Sg {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1564jo f3111a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3112b;

    public C0662Sg(AbstractC1564jo joVar) {
        this(joVar, BuildConfig.FLAVOR);
    }

    public C0662Sg(AbstractC1564jo joVar, String str) {
        this.f3111a = joVar;
        this.f3112b = str;
    }

    public final void a(int i, int i2, int i3, int i4) {
        try {
            this.f3111a.a("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            C0745Vl.b("Error occurred while dispatching size change.", e);
        }
    }

    public final void a(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f3111a.a("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (JSONException e) {
            C0745Vl.b("Error occurred while obtaining screen information.", e);
        }
    }

    public final void a(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.f3112b);
            if (this.f3111a != null) {
                this.f3111a.a("onError", put);
            }
        } catch (JSONException e) {
            C0745Vl.b("Error occurred while dispatching error event.", e);
        }
    }

    public final void b(int i, int i2, int i3, int i4) {
        try {
            this.f3111a.a("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            C0745Vl.b("Error occurred while dispatching default position.", e);
        }
    }

    public final void b(String str) {
        try {
            this.f3111a.a("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            C0745Vl.b("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void c(String str) {
        try {
            this.f3111a.a("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            C0745Vl.b("Error occurred while dispatching state change.", e);
        }
    }
}
