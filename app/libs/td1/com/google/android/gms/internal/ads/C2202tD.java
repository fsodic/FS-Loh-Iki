package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.cocos2dx.lib.BuildConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.tD  reason: case insensitive filesystem */
public final class C2202tD {
    public static String a(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (!((Boolean) C2392voa.e().a(C2474x.kb)).booleanValue() || jSONObject == null || (optJSONArray = jSONObject.optJSONArray(str2)) == null) {
            return BuildConfig.FLAVOR;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("including");
                JSONArray optJSONArray3 = optJSONObject.optJSONArray("excluding");
                if (a(optJSONArray2, str) && !a(optJSONArray3, str)) {
                    return optJSONObject.optString("effective_ad_unit_id", BuildConfig.FLAVOR);
                }
            }
        }
        return BuildConfig.FLAVOR;
    }

    private static boolean a(JSONArray jSONArray, String str) {
        if (!(jSONArray == null || str == null)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    if (Pattern.compile(jSONArray.optString(i)).matcher(str).lookingAt()) {
                        return true;
                    }
                } catch (PatternSyntaxException e) {
                    q.g().a(e, "RtbAdapterMap.hasAtleastOneRegexMatch");
                }
            }
        }
        return false;
    }
}
