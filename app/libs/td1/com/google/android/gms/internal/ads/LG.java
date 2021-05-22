package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.k;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.cocos2dx.lib.BuildConfig;
import org.json.JSONObject;

public final class LG implements AbstractC1461iT<KG, NG> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2466a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2467b;

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC1346gi f2468c;
    private final String d;
    private final ApplicationInfo e;

    public LG(Context context, String str, AbstractC1346gi giVar, String str2, ApplicationInfo applicationInfo) {
        this.f2466a = context;
        this.f2467b = str;
        this.f2468c = giVar;
        this.d = str2;
        this.e = applicationInfo;
    }

    private final NG a(String str, C0871_h _hVar, JSONObject jSONObject, String str2) {
        byte[] bArr;
        int responseCode;
        InputStreamReader inputStreamReader;
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        Throwable th2;
        String str3 = "doritos_v2";
        String str4 = "doritos";
        String str5 = BuildConfig.FLAVOR;
        try {
            if (_hVar.a() == -2) {
                NG ng = new NG();
                String valueOf = String.valueOf(this.f2467b);
                C0745Vl.c(valueOf.length() != 0 ? "SDK version: ".concat(valueOf) : new String("SDK version: "));
                String valueOf2 = String.valueOf(str);
                C0745Vl.a(valueOf2.length() != 0 ? "AdRequestServiceImpl: Sending request: ".concat(valueOf2) : new String("AdRequestServiceImpl: Sending request: "));
                URL url = new URL(str);
                HashMap hashMap = new HashMap();
                long b2 = q.j().b();
                boolean z = false;
                int i = 0;
                while (true) {
                    this.f2468c.a(this.e);
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    try {
                        q.c().a(this.f2466a, this.f2467b, z, httpURLConnection);
                        if (!TextUtils.isEmpty(str2)) {
                            httpURLConnection.addRequestProperty("Cookie", str2);
                        }
                        if (_hVar.f()) {
                            JSONObject optJSONObject = jSONObject.optJSONObject("pii");
                            if (optJSONObject != null) {
                                if (!TextUtils.isEmpty(optJSONObject.optString(str4, str5))) {
                                    httpURLConnection.addRequestProperty("x-afma-drt-cookie", optJSONObject.optString(str4, str5));
                                }
                                if (!TextUtils.isEmpty(optJSONObject.optString(str3, str5))) {
                                    httpURLConnection.addRequestProperty("x-afma-drt-v2-cookie", optJSONObject.optString(str3, str5));
                                }
                            } else {
                                C1763mk.f("DSID signal does not exist.");
                            }
                        }
                        if (_hVar == null || TextUtils.isEmpty(_hVar.e())) {
                            bArr = null;
                        } else {
                            httpURLConnection.setDoOutput(true);
                            bArr = _hVar.e().getBytes();
                            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream2.write(bArr);
                                    k.a(bufferedOutputStream2);
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    k.a(bufferedOutputStream);
                                    throw th2;
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                                bufferedOutputStream = null;
                                k.a(bufferedOutputStream);
                                throw th2;
                            }
                        }
                        C0563Ol ol = new C0563Ol();
                        ol.a(httpURLConnection, bArr);
                        responseCode = httpURLConnection.getResponseCode();
                        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
                            String key = entry.getKey();
                            List<String> value = entry.getValue();
                            if (hashMap.containsKey(key)) {
                                ((List) hashMap.get(key)).addAll(value);
                            } else {
                                hashMap.put(key, new ArrayList(value));
                                str5 = str5;
                            }
                            str4 = str4;
                            str3 = str3;
                        }
                        ol.a(httpURLConnection, responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            try {
                                InputStreamReader inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                                try {
                                    q.c();
                                    String a2 = C2452wk.a(inputStreamReader2);
                                    k.a(inputStreamReader2);
                                    ol.a(a2);
                                    ng.f2642a = responseCode;
                                    ng.f2644c = a2;
                                    ng.f2643b = hashMap;
                                    if (TextUtils.isEmpty(a2)) {
                                        if (!((Boolean) C2392voa.e().a(C2474x.ud)).booleanValue()) {
                                            throw new C0896aF(YR.f3562c);
                                        }
                                    }
                                    ng.d = q.j().b() - b2;
                                    return ng;
                                } catch (Throwable th5) {
                                    th = th5;
                                    inputStreamReader = inputStreamReader2;
                                    k.a(inputStreamReader);
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                inputStreamReader = null;
                                k.a(inputStreamReader);
                                throw th;
                            }
                        } else if (responseCode < 300 || responseCode >= 400) {
                            StringBuilder sb = new StringBuilder(46);
                            sb.append("Received error HTTP response code: ");
                            sb.append(responseCode);
                            C0745Vl.d(sb.toString());
                            int i2 = YR.f3560a;
                            StringBuilder sb2 = new StringBuilder(46);
                            sb2.append("Received error HTTP response code: ");
                            sb2.append(responseCode);
                        } else {
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (!TextUtils.isEmpty(headerField)) {
                                URL url2 = new URL(headerField);
                                i++;
                                if (i <= ((Integer) C2392voa.e().a(C2474x.ad)).intValue()) {
                                    httpURLConnection.disconnect();
                                    this.f2468c.a();
                                    url = url2;
                                    str5 = str5;
                                    str4 = str4;
                                    str3 = str3;
                                    z = false;
                                } else {
                                    C0745Vl.d("Too many redirects.");
                                    throw new C0896aF(YR.f3560a, "Too many redirects");
                                }
                            } else {
                                C0745Vl.d("No location header to follow redirect.");
                                throw new C0896aF(YR.f3560a, "No location header to follow redirect");
                            }
                        }
                    } finally {
                        httpURLConnection.disconnect();
                        this.f2468c.a();
                    }
                }
                StringBuilder sb3 = new StringBuilder(46);
                sb3.append("Received error HTTP response code: ");
                sb3.append(responseCode);
                C0745Vl.d(sb3.toString());
                int i22 = YR.f3560a;
                StringBuilder sb22 = new StringBuilder(46);
                sb22.append("Received error HTTP response code: ");
                sb22.append(responseCode);
                throw new C0896aF(i22, sb22.toString());
            } else if (_hVar.a() == 1) {
                if (_hVar.c() != null) {
                    C0745Vl.b(TextUtils.join(", ", _hVar.c()));
                }
                throw new C0896aF(YR.f3561b, "Error building request URL.");
            } else {
                throw new C0896aF(YR.f3560a);
            }
        } catch (IOException e2) {
            String valueOf3 = String.valueOf(e2.getMessage());
            String concat = valueOf3.length() != 0 ? "Error while connecting to ad server: ".concat(valueOf3) : new String("Error while connecting to ad server: ");
            C0745Vl.d(concat);
            throw new C0896aF(YR.f3560a, concat, e2);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC1461iT
    public final /* synthetic */ NG apply(KG kg) {
        KG kg2 = kg;
        return a(kg2.f2383b.b(), kg2.f2383b, kg2.f2382a, this.d);
    }
}
