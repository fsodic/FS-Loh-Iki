package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.q;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.pr  reason: case insensitive filesystem */
public final class C1983pr implements AbstractC0374He<C2258tr> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5282a;

    /* renamed from: b  reason: collision with root package name */
    private final C1490ila f5283b;

    /* renamed from: c  reason: collision with root package name */
    private final PowerManager f5284c;

    public C1983pr(Context context, C1490ila ila) {
        this.f5282a = context;
        this.f5283b = ila;
        this.f5284c = (PowerManager) context.getSystemService("power");
    }

    public final JSONObject a(C2258tr trVar) {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        C1904ola ola = trVar.f;
        if (ola == null) {
            jSONObject = new JSONObject();
        } else if (this.f5283b.e() != null) {
            boolean z = ola.f5162c;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.f5283b.d()).put("activeViewJSON", this.f5283b.e()).put("timestamp", trVar.d).put("adFormat", this.f5283b.c()).put("hashCode", this.f5283b.a());
            C1490ila ila = this.f5283b;
            put.put("isMraid", false).put("isStopped", false).put("isPaused", trVar.f5667b).put("isNative", this.f5283b.b()).put("isScreenOn", Build.VERSION.SDK_INT >= 20 ? this.f5284c.isInteractive() : this.f5284c.isScreenOn()).put("appMuted", q.h().b()).put("appVolume", (double) q.h().a()).put("deviceVolume", (double) C0562Ok.a(this.f5282a.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f5282a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", ola.d).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", ola.e.top).put("bottom", ola.e.bottom).put("left", ola.e.left).put("right", ola.e.right)).put("adBox", new JSONObject().put("top", ola.f.top).put("bottom", ola.f.bottom).put("left", ola.f.left).put("right", ola.f.right)).put("globalVisibleBox", new JSONObject().put("top", ola.g.top).put("bottom", ola.g.bottom).put("left", ola.g.left).put("right", ola.g.right)).put("globalVisibleBoxVisible", ola.h).put("localVisibleBox", new JSONObject().put("top", ola.i.top).put("bottom", ola.i.bottom).put("left", ola.i.left).put("right", ola.i.right)).put("localVisibleBoxVisible", ola.j).put("hitBox", new JSONObject().put("top", ola.k.top).put("bottom", ola.k.bottom).put("left", ola.k.left).put("right", ola.k.right)).put("screenDensity", (double) this.f5282a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", trVar.f5666a);
            if (((Boolean) C2392voa.e().a(C2474x.eb)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = ola.n;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(trVar.e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
