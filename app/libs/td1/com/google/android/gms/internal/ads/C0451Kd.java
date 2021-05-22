package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Kd  reason: case insensitive filesystem */
public final /* synthetic */ class C0451Kd {
    public static void a(AbstractC0477Ld ld, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        ld.a(sb.toString());
    }

    public static void a(AbstractC0477Ld ld, String str, Map map) {
        try {
            ld.a(str, q.c().a(map));
        } catch (JSONException unused) {
            C0745Vl.d("Could not convert parameters to JSON.");
        }
    }

    public static void a(AbstractC0477Ld ld, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        ld.a(str, jSONObject.toString());
    }

    public static void b(AbstractC0477Ld ld, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        C0745Vl.a(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        ld.a(sb.toString());
    }
}
