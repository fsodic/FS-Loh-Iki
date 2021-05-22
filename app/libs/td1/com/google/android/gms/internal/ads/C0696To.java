package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.To  reason: case insensitive filesystem */
public final class C0696To {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f3208a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f3209b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a() {
        String str = (String) C2392voa.e().a(C2474x.I);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            return "<script>" + "Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});" + "</script>";
        } catch (JSONException e) {
            C0745Vl.c("Unable to build MRAID_ENV", e);
            return null;
        }
    }

    public static String a(String str, String... strArr) {
        if (strArr.length == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f3208a.matcher(str);
        int i = 0;
        if (matcher.find()) {
            int end = matcher.end();
            sb.append(str.substring(0, end));
            int length = strArr.length;
            while (i < length) {
                String str2 = strArr[i];
                if (str2 != null) {
                    sb.append(str2);
                }
                i++;
            }
            str = str.substring(end);
        } else if (!f3209b.matcher(str).find()) {
            int length2 = strArr.length;
            while (i < length2) {
                String str3 = strArr[i];
                if (str3 != null) {
                    sb.append(str3);
                }
                i++;
            }
        }
        sb.append(str);
        return sb.toString();
    }
}
