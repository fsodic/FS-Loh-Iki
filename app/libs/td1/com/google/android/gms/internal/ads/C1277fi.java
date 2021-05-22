package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.fi  reason: case insensitive filesystem */
public final class C1277fi extends AbstractC1483ii {

    /* renamed from: a  reason: collision with root package name */
    private final Object f4320a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Context f4321b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f4322c;
    private final AbstractC0348Ge<JSONObject, JSONObject> d;

    public C1277fi(Context context, AbstractC0348Ge<JSONObject, JSONObject> ge) {
        this.f4321b = context.getApplicationContext();
        this.d = ge;
    }

    public static JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", C0823Yl.L().f3587a);
            jSONObject.put("mf", C2019qa.f5323a.a());
            jSONObject.put("cl", "312401170");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 20360);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.b(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451009);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1483ii
    public final SW<Void> a() {
        synchronized (this.f4320a) {
            if (this.f4322c == null) {
                this.f4322c = this.f4321b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (q.j().a() - this.f4322c.getLong("js_last_update", 0) < C2019qa.f5324b.a().longValue()) {
            return JW.a((Object) null);
        }
        return JW.a(this.d.a(a(this.f4321b)), new C1208ei(this), C0875_l.f);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(JSONObject jSONObject) {
        C2474x.a(this.f4321b, 1, jSONObject);
        this.f4322c.edit().putLong("js_last_update", q.j().a()).apply();
        return null;
    }
}
