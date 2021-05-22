package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Hn  reason: case insensitive filesystem */
public final class C0383Hn implements AbstractC0268Dc<AbstractC0798Xm> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2175a;

    private static int a(Context context, Map<String, String> map, String str, int i) {
        String str2 = map.get(str);
        if (str2 == null) {
            return i;
        }
        try {
            C2392voa.a();
            return C0459Kl.b(context, Integer.parseInt(str2));
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
            sb.append("Could not parse ");
            sb.append(str);
            sb.append(" in a video GMSG: ");
            sb.append(str2);
            C0745Vl.d(sb.toString());
            return i;
        }
    }

    private static void a(C0434Jm jm, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                jm.b(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                C0745Vl.d(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            jm.c(Integer.parseInt(str2));
        }
        if (str3 != null) {
            jm.d(Integer.parseInt(str3));
        }
        if (str4 != null) {
            jm.e(Integer.parseInt(str4));
        }
        if (str5 != null) {
            jm.f(Integer.parseInt(str5));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final /* synthetic */ void a(AbstractC0798Xm xm, Map map) {
        int i;
        AbstractC0798Xm xm2 = xm;
        String str = (String) map.get("action");
        if (str == null) {
            C0745Vl.d("Action missing from video GMSG.");
            return;
        }
        if (C0745Vl.a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            C0745Vl.a(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                C0745Vl.d("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                xm2.setBackgroundColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
                C0745Vl.d("Invalid color parameter in video GMSG.");
            }
        } else {
            if ("decoderProps".equals(str)) {
                String str3 = (String) map.get("mimeTypes");
                if (str3 == null) {
                    C0745Vl.d("No MIME types specified for decoder properties inspection.");
                    C0434Jm.a(xm2, "missingMimeTypes");
                    return;
                }
                HashMap hashMap = new HashMap();
                String[] split = str3.split(",");
                for (String str4 : split) {
                    hashMap.put(str4, C0407Il.a(str4.trim()));
                }
                C0434Jm.a(xm2, hashMap);
                return;
            }
            C0590Pm I = xm2.I();
            if (I == null) {
                C0745Vl.d("Could not get underlay container for a video GMSG.");
                return;
            }
            boolean equals = "new".equals(str);
            boolean equals2 = "position".equals(str);
            if (equals || equals2) {
                Context context = xm2.getContext();
                int a2 = a(context, map, "x", 0);
                int a3 = a(context, map, "y", 0);
                int a4 = a(context, map, "w", -1);
                int a5 = a(context, map, "h", -1);
                int min = Math.min(a4, xm2.L() - a2);
                int min2 = Math.min(a5, xm2.M() - a3);
                try {
                    i = Integer.parseInt((String) map.get("player"));
                } catch (NumberFormatException unused2) {
                    i = 0;
                }
                boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
                if (!equals || I.c() != null) {
                    I.a(a2, a3, min, min2);
                    return;
                }
                I.a(a2, a3, min, min2, i, parseBoolean, new C0824Ym((String) map.get("flags")));
                C0434Jm c2 = I.c();
                if (c2 != null) {
                    a(c2, (Map<String, String>) map);
                    return;
                }
                return;
            }
            BinderC0306Eo E = xm2.E();
            if (E != null) {
                if ("timeupdate".equals(str)) {
                    String str5 = (String) map.get("currentTime");
                    if (str5 == null) {
                        C0745Vl.d("currentTime parameter missing from timeupdate video GMSG.");
                        return;
                    }
                    try {
                        E.b(Float.parseFloat(str5));
                        return;
                    } catch (NumberFormatException unused3) {
                        String valueOf = String.valueOf(str5);
                        C0745Vl.d(valueOf.length() != 0 ? "Could not parse currentTime parameter from timeupdate video GMSG: ".concat(valueOf) : new String("Could not parse currentTime parameter from timeupdate video GMSG: "));
                        return;
                    }
                } else if ("skip".equals(str)) {
                    E.Wb();
                    return;
                }
            }
            C0434Jm c3 = I.c();
            if (c3 == null) {
                C0434Jm.a(xm2);
            } else if ("click".equals(str)) {
                Context context2 = xm2.getContext();
                int a6 = a(context2, map, "x", 0);
                int a7 = a(context2, map, "y", 0);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a6, (float) a7, 0);
                c3.a(obtain);
                obtain.recycle();
            } else if ("currentTime".equals(str)) {
                String str6 = (String) map.get("time");
                if (str6 == null) {
                    C0745Vl.d("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try {
                    c3.a((int) (Float.parseFloat(str6) * 1000.0f));
                } catch (NumberFormatException unused4) {
                    String valueOf2 = String.valueOf(str6);
                    C0745Vl.d(valueOf2.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(valueOf2) : new String("Could not parse time parameter from currentTime video GMSG: "));
                }
            } else if ("hide".equals(str)) {
                c3.setVisibility(4);
            } else if ("load".equals(str)) {
                c3.k();
            } else if ("loadControl".equals(str)) {
                a(c3, (Map<String, String>) map);
            } else if ("muted".equals(str)) {
                if (Boolean.parseBoolean((String) map.get("muted"))) {
                    c3.l();
                } else {
                    c3.m();
                }
            } else if ("pause".equals(str)) {
                c3.i();
            } else if ("play".equals(str)) {
                c3.j();
            } else if ("show".equals(str)) {
                c3.setVisibility(0);
            } else if ("src".equals(str)) {
                String str7 = (String) map.get("src");
                String[] strArr = {str7};
                String str8 = (String) map.get("demuxed");
                if (str8 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str8);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            strArr2[i2] = jSONArray.getString(i2);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused5) {
                        String valueOf3 = String.valueOf(str8);
                        C0745Vl.d(valueOf3.length() != 0 ? "Malformed demuxed URL list for playback: ".concat(valueOf3) : new String("Malformed demuxed URL list for playback: "));
                        strArr = new String[]{str7};
                    }
                }
                c3.a(str7, strArr);
            } else if ("touchMove".equals(str)) {
                Context context3 = xm2.getContext();
                c3.a((float) a(context3, map, "dx", 0), (float) a(context3, map, "dy", 0));
                if (!this.f2175a) {
                    xm2.K();
                    this.f2175a = true;
                }
            } else if ("volume".equals(str)) {
                String str9 = (String) map.get("volume");
                if (str9 == null) {
                    C0745Vl.d("Level parameter missing from volume video GMSG.");
                    return;
                }
                try {
                    c3.setVolume(Float.parseFloat(str9));
                } catch (NumberFormatException unused6) {
                    String valueOf4 = String.valueOf(str9);
                    C0745Vl.d(valueOf4.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(valueOf4) : new String("Could not parse volume parameter from volume video GMSG: "));
                }
            } else if ("watermark".equals(str)) {
                c3.n();
            } else {
                String valueOf5 = String.valueOf(str);
                C0745Vl.d(valueOf5.length() != 0 ? "Unknown video action: ".concat(valueOf5) : new String("Unknown video action: "));
            }
        }
    }
}
