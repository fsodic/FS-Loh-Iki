package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import java.util.HashMap;
import java.util.Map;
import org.cocos2dx.lib.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Jc  reason: case insensitive filesystem */
public final class C0424Jc implements AbstractC0268Dc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f2325a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, AbstractC0476Lc> f2326b = new HashMap();

    public final <EngineT extends AbstractC0925ae> SW<JSONObject> a(EngineT enginet, String str, JSONObject jSONObject) {
        C1423hm hmVar = new C1423hm();
        q.c();
        String a2 = C2452wk.a();
        a(a2, new C0502Mc(this, hmVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", a2);
            jSONObject2.put("args", jSONObject);
            enginet.b(str, jSONObject2);
        } catch (Exception e) {
            hmVar.a(e);
        }
        return hmVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final void a(Object obj, Map<String, String> map) {
        String str;
        String str2 = map.get("id");
        String str3 = map.get("fail");
        String str4 = map.get("fail_reason");
        String str5 = map.get("fail_stack");
        String str6 = map.get("result");
        if (TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = BuildConfig.FLAVOR;
        } else {
            String valueOf = String.valueOf(str5);
            str = valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n");
        }
        synchronized (this.f2325a) {
            AbstractC0476Lc remove = this.f2326b.remove(str2);
            if (remove == null) {
                String valueOf2 = String.valueOf(str2);
                C0745Vl.d(valueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(valueOf2) : new String("Received result for unexpected method invocation: "));
            } else if (!TextUtils.isEmpty(str3)) {
                String valueOf3 = String.valueOf(str4);
                String valueOf4 = String.valueOf(str);
                remove.a(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else if (str6 == null) {
                remove.a((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (C1763mk.a()) {
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        C1763mk.f(valueOf5.length() != 0 ? "Result GMSG: ".concat(valueOf5) : new String("Result GMSG: "));
                    }
                    remove.a(jSONObject);
                } catch (JSONException e) {
                    remove.a(e.getMessage());
                }
            }
        }
    }

    public final void a(String str, AbstractC0476Lc lc) {
        synchronized (this.f2325a) {
            this.f2326b.put(str, lc);
        }
    }
}
