package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ym  reason: case insensitive filesystem */
public final class C0824Ym {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3590a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3591b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3592c;
    public final int d;
    private final String e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;
    public final int k;

    public C0824Ym(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f3590a = a(jSONObject, "aggressive_media_codec_release", C2474x.B);
        this.f3591b = b(jSONObject, "byte_buffer_precache_limit", C2474x.j);
        this.f3592c = b(jSONObject, "exo_cache_buffer_size", C2474x.q);
        this.d = b(jSONObject, "exo_connect_timeout_millis", C2474x.f);
        this.e = c(jSONObject, "exo_player_version", C2474x.e);
        this.f = b(jSONObject, "exo_read_timeout_millis", C2474x.g);
        this.g = b(jSONObject, "load_check_interval_bytes", C2474x.h);
        this.h = b(jSONObject, "player_precache_limit", C2474x.i);
        this.i = b(jSONObject, "socket_receive_buffer_size", C2474x.k);
        this.j = a(jSONObject, "use_cache_data_source", C2474x.Cc);
        this.k = b(jSONObject, "min_retry_count", C2474x.m);
    }

    private static boolean a(JSONObject jSONObject, String str, AbstractC1441i<Boolean> iVar) {
        return a(jSONObject, str, ((Boolean) C2392voa.e().a(iVar)).booleanValue());
    }

    private static boolean a(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return z;
    }

    private static int b(JSONObject jSONObject, String str, AbstractC1441i<Integer> iVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) C2392voa.e().a(iVar)).intValue();
    }

    private static String c(JSONObject jSONObject, String str, AbstractC1441i<String> iVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException unused) {
            }
        }
        return (String) C2392voa.e().a(iVar);
    }
}
