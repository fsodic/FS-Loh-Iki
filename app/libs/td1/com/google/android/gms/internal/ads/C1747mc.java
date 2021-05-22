package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.mc  reason: case insensitive filesystem */
public final class C1747mc {

    /* renamed from: a  reason: collision with root package name */
    public static final AbstractC0268Dc<AbstractC1564jo> f4963a = C1954pc.f5244a;

    /* renamed from: b  reason: collision with root package name */
    public static final AbstractC0268Dc<AbstractC1564jo> f4964b = C1885oc.f5142a;

    /* renamed from: c  reason: collision with root package name */
    public static final AbstractC0268Dc<AbstractC1564jo> f4965c = C2091rc.f5425a;
    public static final AbstractC0268Dc<AbstractC1564jo> d = C2023qc.f5329a;
    public static final AbstractC0268Dc<AbstractC1564jo> e = new C2367vc();
    public static final AbstractC0268Dc<AbstractC1564jo> f = new C2298uc();
    public static final AbstractC0268Dc<AbstractC1564jo> g = C2229tc.f5625a;
    public static final AbstractC0268Dc<Object> h = new C2505xc();
    public static final AbstractC0268Dc<AbstractC1564jo> i = new C2436wc();
    public static final AbstractC0268Dc<AbstractC1564jo> j = C2160sc.f5525a;
    public static final AbstractC0268Dc<AbstractC1564jo> k = new C2643zc();
    public static final AbstractC0268Dc<AbstractC1564jo> l = new C2574yc();
    public static final AbstractC0268Dc<AbstractC0798Xm> m = new C0383Hn();
    public static final AbstractC0268Dc<AbstractC0798Xm> n = new C0461Kn();
    public static final AbstractC0268Dc<AbstractC1564jo> o = new C1816nc();
    public static final C0424Jc p = new C0424Jc();
    public static final AbstractC0268Dc<AbstractC1564jo> q = new C0242Cc();
    public static final AbstractC0268Dc<AbstractC1564jo> r = new C0216Bc();
    public static final AbstractC0268Dc<AbstractC1564jo> s = new C0294Ec();

    static final /* synthetic */ void a(AbstractC0269Dd dd, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            C0745Vl.d("URL missing from click GMSG.");
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            C1955pca f2 = ((AbstractC0748Vo) dd).f();
            if (f2 != null && f2.a(parse)) {
                parse = f2.a(parse, ((AbstractC0540No) dd).getContext(), ((AbstractC0826Yo) dd).getView(), ((AbstractC0540No) dd).v());
            }
        } catch (Rba unused) {
            String valueOf = String.valueOf(str);
            C0745Vl.d(valueOf.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf) : new String("Unable to append parameter to URL: "));
        }
        AbstractC0540No no = (AbstractC0540No) dd;
        new C2523xl(no.getContext(), ((AbstractC0722Uo) dd).q().f3587a, C0431Jj.a(parse, no.getContext())).b();
    }

    static final /* synthetic */ void a(AbstractC0540No no, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            C0745Vl.d("URL missing from httpTrack GMSG.");
        } else {
            new C2523xl(no.getContext(), ((AbstractC0722Uo) no).q().f3587a, str).b();
        }
    }

    static final /* synthetic */ void a(AbstractC0748Vo vo, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            C1955pca f2 = vo.f();
            if (f2 != null) {
                f2.a().a(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            C0745Vl.d("Could not parse touch parameters from gmsg.");
        }
    }

    static final /* synthetic */ void b(AbstractC0540No no, Map map) {
        JSONException jSONException;
        String str;
        PackageManager packageManager = no.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString("p");
                        String optString6 = jSONObject2.optString("c");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e2) {
                                String valueOf = String.valueOf(optString7);
                                C0745Vl.b(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e2);
                            }
                        }
                        boolean z = true;
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        if (packageManager.resolveActivity(intent, 65536) == null) {
                            z = false;
                        }
                        try {
                            jSONObject.put(optString, z);
                        } catch (JSONException e3) {
                            jSONException = e3;
                            str = "Error constructing openable urls response.";
                        }
                    } catch (JSONException e4) {
                        jSONException = e4;
                        str = "Error parsing the intent data.";
                        C0745Vl.b(str, jSONException);
                    }
                }
                ((AbstractC0269Dd) no).a("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((AbstractC0269Dd) no).a("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((AbstractC0269Dd) no).a("openableIntents", new JSONObject());
        }
    }

    static final /* synthetic */ void c(AbstractC0540No no, Map map) {
        if (!((Boolean) C2392voa.e().a(C2474x.ff)).booleanValue()) {
            C0745Vl.d("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            C0745Vl.d("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str, Boolean.valueOf(no.getContext().getPackageManager().getLaunchIntentForPackage(str) != null));
        ((AbstractC0269Dd) no).a("openableApp", hashMap);
    }

    static final /* synthetic */ void d(AbstractC0540No no, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            C0745Vl.d("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = no.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((AbstractC0269Dd) no).a("openableURLs", hashMap);
    }
}
