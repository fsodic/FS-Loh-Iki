package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hB  reason: case insensitive filesystem */
public final class C1374hB {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4448a;

    /* renamed from: b  reason: collision with root package name */
    private final C1030cB f4449b;

    /* renamed from: c  reason: collision with root package name */
    private final C1955pca f4450c;
    private final C0823Yl d;
    private final a e;
    private final Dma f;
    private final Executor g;
    private final C0578Pa h;
    private final EB i;
    private final ScheduledExecutorService j;

    public C1374hB(Context context, C1030cB cBVar, C1955pca pca, C0823Yl yl, a aVar, Dma dma, Executor executor, GR gr, EB eb, ScheduledExecutorService scheduledExecutorService) {
        this.f4448a = context;
        this.f4449b = cBVar;
        this.f4450c = pca;
        this.d = yl;
        this.e = aVar;
        this.f = dma;
        this.g = executor;
        this.h = gr.i;
        this.i = eb;
        this.j = scheduledExecutorService;
    }

    private static <T> SW<T> a(SW<T> sw, T t) {
        return JW.a(sw, Exception.class, new C2200tB(null), C0875_l.f);
    }

    private final SW<List<BinderC0474La>> a(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return JW.a((Object) Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(a(jSONArray.optJSONObject(i2), z));
        }
        return JW.a(JW.a((Iterable) arrayList), C1994qB.f5294a, this.g);
    }

    private final SW<BinderC0474La> a(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return JW.a((Object) null);
        }
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return JW.a((Object) null);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        int optInt = jSONObject.optInt("width", -1);
        int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return JW.a(new BinderC0474La(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return a(jSONObject.optBoolean("require"), JW.a(this.f4449b.a(optString, optDouble, optBoolean), new C1925pB(optString, optDouble, optInt, optInt2), this.g), (Object) null);
    }

    private static <T> SW<T> a(boolean z, SW<T> sw, T t) {
        return z ? JW.a(sw, new C2407wB(sw), C0875_l.f) : a(sw, (Object) null);
    }

    public static List<Qpa> a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return Collections.emptyList();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            Qpa d2 = d(optJSONArray.optJSONObject(i2));
            if (d2 != null) {
                arrayList.add(d2);
            }
        }
        return arrayList;
    }

    public static Qpa b(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return d(optJSONObject);
    }

    private static Qpa d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new Qpa(optString, optString2);
    }

    private static Integer d(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ BinderC0344Ga a(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer d2 = d(jSONObject, "bg_color");
        Integer d3 = d(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", 4000);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new BinderC0344Ga(optString, list, d2, d3, num, optInt3 + optInt2, this.h.e, optBoolean);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(String str, Object obj) {
        q.d();
        AbstractC1564jo a2 = C2115ro.a(this.f4448a, C1153dp.b(), "native-omid", false, false, this.f4450c, this.d, null, null, this.e, this.f, null, false);
        C1491im c2 = C1491im.c(a2);
        a2.d().a(new C2338vB(c2));
        a2.loadData(str, "text/html", "UTF-8");
        return c2;
    }

    public final SW<BinderC0474La> a(JSONObject jSONObject, String str) {
        return a(jSONObject.optJSONObject(str), this.h.f2842b);
    }

    public final SW<List<BinderC0474La>> b(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        C0578Pa pa = this.h;
        return a(optJSONArray, pa.f2842b, pa.d);
    }

    public final SW<AbstractC1564jo> c(JSONObject jSONObject) {
        JSONObject a2 = C2041ql.a(jSONObject, "html_containers", "instream");
        if (a2 == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return JW.a((Object) null);
            }
            if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
                C0745Vl.d("Required field 'vast_xml' is missing");
                return JW.a((Object) null);
            }
            return a(JW.a(this.i.a(optJSONObject), (long) ((Integer) C2392voa.e().a(C2474x._b)).intValue(), TimeUnit.SECONDS, this.j), (Object) null);
        }
        SW<AbstractC1564jo> a3 = this.i.a(a2.optString("base_url"), a2.optString("html"));
        return JW.a(a3, new C2269uB(a3), C0875_l.f);
    }

    public final SW<BinderC0344Ga> c(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return JW.a((Object) null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return a(optJSONObject.optBoolean("require"), JW.a(a(optJSONArray, false, true), new C2131sB(this, optJSONObject), this.g), (Object) null);
    }
}
