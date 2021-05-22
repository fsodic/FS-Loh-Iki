package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class VN implements AbstractC1180eO<AbstractC0905aO<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    private final VW f3331a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3332b;

    VN(VW vw, Context context) {
        this.f3331a = vw;
        this.f3332b = context;
    }

    public static Bundle a(Context context, JSONArray jSONArray) {
        Object obj;
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("bk");
            String optString2 = optJSONObject.optString("sk");
            int optInt = optJSONObject.optInt("type", -1);
            int i2 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : ZN.f3634c : ZN.f3633b : ZN.f3632a;
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i2 != 0) {
                String[] split = optString2.split("/");
                if (split.length > 2 || split.length == 0) {
                    obj = null;
                } else {
                    if (split.length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = split[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(split[0], 0);
                        str = split[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int i3 = _N.f3713a[i2 - 1];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3 && (obj instanceof Boolean)) {
                                bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(optString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(optString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(optString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(optString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<AbstractC0905aO<Bundle>> a() {
        return this.f3331a.a(new YN(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ AbstractC0905aO b() {
        String str = (String) C2392voa.e().a(C2474x.be);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new XN(a(this.f3332b, new JSONArray(str)));
        } catch (JSONException e) {
            C0745Vl.a("JSON parsing error", e);
            return null;
        }
    }
}
