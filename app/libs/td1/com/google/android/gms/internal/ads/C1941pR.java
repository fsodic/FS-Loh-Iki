package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.q;
import java.util.Collections;
import java.util.List;
import org.cocos2dx.lib.BuildConfig;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.pR  reason: case insensitive filesystem */
public final class C1941pR {
    public final JSONObject A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final int I;
    public final int J;
    public final boolean K;
    public final String L;
    public final JSONObject M;
    public final boolean N;
    public final boolean O;
    public final int P;
    public final boolean Q;
    public final String R;
    public final int S;
    public final String T;
    public final boolean U;
    public final C1000bh V;
    public final boolean W;
    public final C1152doa X;
    public final String Y;
    public final String Z;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f5229a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5230b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f5231c;
    public final List<String> d;
    public final int e;
    public final List<String> f;
    public final List<String> g;
    public final List<String> h;
    public final List<String> i;
    public final String j;
    public final String k;
    public final C0456Ki l;
    public final List<String> m;
    public final List<String> n;
    public final List<C1872oR> o;
    public final C2216tR p;
    public final List<String> q;
    public final List<C1872oR> r;
    public final JSONObject s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final C1692lj x;
    public final String y;
    public final JSONObject z;

    C1941pR(JsonReader jsonReader) {
        List<String> list;
        char c2;
        C0456Ki ki;
        List<String> emptyList = Collections.emptyList();
        List<String> emptyList2 = Collections.emptyList();
        List<String> emptyList3 = Collections.emptyList();
        List<String> emptyList4 = Collections.emptyList();
        List<String> emptyList5 = Collections.emptyList();
        Collections.emptyList();
        List<String> emptyList6 = Collections.emptyList();
        List<String> emptyList7 = Collections.emptyList();
        List<String> emptyList8 = Collections.emptyList();
        List<String> emptyList9 = Collections.emptyList();
        List<C1872oR> emptyList10 = Collections.emptyList();
        List<String> emptyList11 = Collections.emptyList();
        List<C1872oR> emptyList12 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        jsonReader.beginObject();
        String str = BuildConfig.FLAVOR;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        List<String> list2 = emptyList9;
        List<C1872oR> list3 = emptyList10;
        List<String> list4 = emptyList11;
        List<C1872oR> list5 = emptyList12;
        JSONObject jSONObject5 = jSONObject;
        JSONObject jSONObject6 = jSONObject2;
        JSONObject jSONObject7 = jSONObject3;
        JSONObject jSONObject8 = jSONObject4;
        C0456Ki ki2 = null;
        C2216tR tRVar = null;
        C1692lj ljVar = null;
        C1000bh bhVar = null;
        C1152doa doa = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        int i2 = -1;
        int i3 = 0;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        int i4 = 0;
        boolean z12 = false;
        int i5 = -1;
        boolean z13 = false;
        boolean z14 = true;
        String str11 = str10;
        String str12 = str11;
        List<String> list6 = emptyList5;
        List<String> list7 = emptyList6;
        List<String> list8 = emptyList7;
        List<String> list9 = emptyList8;
        List<String> list10 = emptyList2;
        int i6 = 0;
        List<String> list11 = emptyList3;
        List<String> list12 = emptyList4;
        List<String> list13 = emptyList;
        int i7 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str13 = nextName == null ? BuildConfig.FLAVOR : nextName;
            switch (str13.hashCode()) {
                case -1980587809:
                    list = list9;
                    if (str13.equals("debug_signals")) {
                        c2 = 26;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1965512151:
                    list = list9;
                    if (str13.equals("omid_settings")) {
                        c2 = '\'';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1812055556:
                    list = list9;
                    if (str13.equals("play_prewarm_options")) {
                        c2 = '0';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1620470467:
                    list = list9;
                    if (str13.equals("backend_query_id")) {
                        c2 = '.';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1440104884:
                    list = list9;
                    if (str13.equals("is_custom_close_blocked")) {
                        c2 = '!';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1439500848:
                    list = list9;
                    if (str13.equals("orientation")) {
                        c2 = '#';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1428969291:
                    list = list9;
                    if (str13.equals("enable_omid")) {
                        c2 = '%';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1403779768:
                    list = list9;
                    if (str13.equals("showable_impression_type")) {
                        c2 = '*';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1360811658:
                    list = list9;
                    if (str13.equals("ad_sizes")) {
                        c2 = 17;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1306015996:
                    list = list9;
                    if (str13.equals("adapters")) {
                        c2 = 18;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1303332046:
                    list = list9;
                    if (str13.equals("test_mode_enabled")) {
                        c2 = ' ';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1289032093:
                    list = list9;
                    if (str13.equals("extras")) {
                        c2 = 27;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1240082064:
                    list = list9;
                    if (str13.equals("ad_event_value")) {
                        c2 = '2';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1234181075:
                    list = list9;
                    if (str13.equals("allow_pub_rendered_attribution")) {
                        c2 = 28;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1181000426:
                    list = list9;
                    if (str13.equals("is_augmented_reality_ad")) {
                        c2 = '+';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1152230954:
                    list = list9;
                    if (str13.equals("ad_type")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1146534047:
                    list = list9;
                    if (str13.equals("is_scroll_aware")) {
                        c2 = ')';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1115838944:
                    list = list9;
                    if (str13.equals("fill_urls")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1081936678:
                    list = list9;
                    if (str13.equals("allocation_id")) {
                        c2 = 19;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1078050970:
                    list = list9;
                    if (str13.equals("video_complete_urls")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1051269058:
                    list = list9;
                    if (str13.equals("active_view")) {
                        c2 = 23;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -982608540:
                    list = list9;
                    if (str13.equals("valid_from_timestamp")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -776859333:
                    list = list9;
                    if (str13.equals("click_urls")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -544216775:
                    list = list9;
                    if (str13.equals("safe_browsing")) {
                        c2 = 24;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -437057161:
                    list = list9;
                    if (str13.equals("imp_urls")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -404326515:
                    list = list9;
                    if (str13.equals("render_timeout_ms")) {
                        c2 = '$';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -397704715:
                    list = list9;
                    if (str13.equals("ad_close_time_ms")) {
                        c2 = ',';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -369773488:
                    list = list9;
                    if (str13.equals("is_close_button_enabled")) {
                        c2 = '1';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -213424028:
                    list = list9;
                    if (str13.equals("watermark")) {
                        c2 = '-';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -29338502:
                    list = list9;
                    if (str13.equals("allow_custom_click_gesture")) {
                        c2 = 30;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3107:
                    list = list9;
                    if (str13.equals("ad")) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3355:
                    list = list9;
                    if (str13.equals("id")) {
                        c2 = 21;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3076010:
                    list = list9;
                    if (str13.equals("data")) {
                        c2 = 20;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 63195984:
                    list = list9;
                    if (str13.equals("render_test_label")) {
                        c2 = 31;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 107433883:
                    list = list9;
                    if (str13.equals("qdata")) {
                        c2 = 22;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 230323073:
                    list = list9;
                    if (str13.equals("ad_load_urls")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 418392395:
                    list = list9;
                    if (str13.equals("is_closable_area_disabled")) {
                        c2 = '\"';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 597473788:
                    list = list9;
                    if (str13.equals("debug_dialog_string")) {
                        c2 = 25;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 673261304:
                    list = list9;
                    if (str13.equals("reward_granted_urls")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 754887508:
                    list = list9;
                    if (str13.equals("container_sizes")) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 791122864:
                    list = list9;
                    if (str13.equals("impression_type")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 942228154:
                    list = list9;
                    if (str13.equals("native_ad_policy_validator_overlay_url")) {
                        c2 = '4';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1010584092:
                    list = list9;
                    if (str13.equals("transaction_id")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1100650276:
                    list = list9;
                    if (str13.equals("rewards")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1321720943:
                    list = list9;
                    if (str13.equals("allow_pub_owned_ad_view")) {
                        c2 = 29;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1637553475:
                    list = list9;
                    if (str13.equals("bid_response")) {
                        c2 = '&';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1638957285:
                    list = list9;
                    if (str13.equals("video_start_urls")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1688341040:
                    list = list9;
                    if (str13.equals("video_reward_urls")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1799285870:
                    list = list9;
                    if (str13.equals("use_third_party_container_height")) {
                        c2 = '/';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1839650832:
                    list = list9;
                    if (str13.equals("renderers")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1875425491:
                    list = list9;
                    if (str13.equals("is_analytics_logging_enabled")) {
                        c2 = '(';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2068142375:
                    list = list9;
                    if (str13.equals("rule_line_external_id")) {
                        c2 = '3';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2072888499:
                    list = list9;
                    if (str13.equals("manual_tracking_urls")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    list = list9;
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    ki = ki2;
                    list13 = C2041ql.a(jsonReader);
                    ki2 = ki;
                    break;
                case 1:
                    ki = ki2;
                    String nextString = jsonReader.nextString();
                    i7 = "banner".equals(nextString) ? 1 : "interstitial".equals(nextString) ? 2 : "native_express".equals(nextString) ? 3 : "native".equals(nextString) ? 4 : "rewarded".equals(nextString) ? 5 : 0;
                    ki2 = ki;
                    break;
                case 2:
                    ki = ki2;
                    list10 = C2041ql.a(jsonReader);
                    ki2 = ki;
                    break;
                case 3:
                    ki = ki2;
                    list11 = C2041ql.a(jsonReader);
                    ki2 = ki;
                    break;
                case 4:
                    ki = ki2;
                    list12 = C2041ql.a(jsonReader);
                    ki2 = ki;
                    break;
                case 5:
                    ki = ki2;
                    int nextInt = jsonReader.nextInt();
                    if (nextInt != 0) {
                        if (nextInt != 1) {
                            i6 = 0;
                            ki2 = ki;
                            break;
                        }
                    }
                    i6 = nextInt;
                    ki2 = ki;
                case 6:
                    ki = ki2;
                    list6 = C2041ql.a(jsonReader);
                    ki2 = ki;
                    break;
                case 7:
                    ki = ki2;
                    C2041ql.a(jsonReader);
                    ki2 = ki;
                    break;
                case '\b':
                    ki = ki2;
                    list7 = C2041ql.a(jsonReader);
                    ki2 = ki;
                    break;
                case '\t':
                    ki = ki2;
                    list8 = C2041ql.a(jsonReader);
                    ki2 = ki;
                    break;
                case '\n':
                    ki = ki2;
                    str11 = jsonReader.nextString();
                    ki2 = ki;
                    break;
                case 11:
                    ki = ki2;
                    str12 = jsonReader.nextString();
                    ki2 = ki;
                    break;
                case '\f':
                    ki2 = C0456Ki.a(C2041ql.d(jsonReader));
                    break;
                case '\r':
                    list9 = C2041ql.a(jsonReader);
                    ki2 = ki2;
                    continue;
                case 14:
                    ki = ki2;
                    list2 = C2041ql.a(jsonReader);
                    ki2 = ki;
                    break;
                case 15:
                    ki = ki2;
                    list3 = C1872oR.a(jsonReader);
                    ki2 = ki;
                    break;
                case 16:
                    ki = ki2;
                    tRVar = new C2216tR(jsonReader);
                    ki2 = ki;
                    break;
                case 17:
                    list5 = C1872oR.a(jsonReader);
                    break;
                case 18:
                    list4 = C2041ql.a(jsonReader);
                    break;
                case 19:
                    str = jsonReader.nextString();
                    break;
                case 20:
                    jSONObject5 = C2041ql.c(jsonReader);
                    break;
                case 21:
                    str2 = jsonReader.nextString();
                    break;
                case 22:
                    str3 = jsonReader.nextString();
                    break;
                case 23:
                    str4 = C2041ql.c(jsonReader).toString();
                    break;
                case 24:
                    ljVar = C1692lj.a(C2041ql.c(jsonReader));
                    break;
                case 25:
                    str5 = jsonReader.nextString();
                    break;
                case 26:
                    jSONObject6 = C2041ql.c(jsonReader);
                    break;
                case 27:
                    jSONObject7 = C2041ql.c(jsonReader);
                    break;
                case 28:
                    z2 = jsonReader.nextBoolean();
                    break;
                case 29:
                    z3 = jsonReader.nextBoolean();
                    break;
                case 30:
                    z4 = jsonReader.nextBoolean();
                    break;
                case 31:
                    z5 = jsonReader.nextBoolean();
                    break;
                case ' ':
                    z6 = jsonReader.nextBoolean();
                    break;
                case '!':
                    z7 = jsonReader.nextBoolean();
                    break;
                case '\"':
                    z8 = jsonReader.nextBoolean();
                    break;
                case '#':
                    ki = ki2;
                    String nextString2 = jsonReader.nextString();
                    if ("landscape".equalsIgnoreCase(nextString2)) {
                        q.e();
                        i2 = 6;
                    } else if ("portrait".equalsIgnoreCase(nextString2)) {
                        q.e();
                        i2 = 7;
                    } else {
                        i2 = -1;
                    }
                    ki2 = ki;
                    break;
                case '$':
                    i3 = jsonReader.nextInt();
                    break;
                case '%':
                    z9 = jsonReader.nextBoolean();
                    break;
                case '&':
                    str6 = jsonReader.nextString();
                    break;
                case '\'':
                    jSONObject8 = C2041ql.c(jsonReader);
                    break;
                case '(':
                    z10 = jsonReader.nextBoolean();
                    break;
                case ')':
                    z11 = jsonReader.nextBoolean();
                    break;
                case '*':
                    i4 = jsonReader.nextInt();
                    break;
                case '+':
                    z12 = jsonReader.nextBoolean();
                    break;
                case ',':
                    i5 = jsonReader.nextInt();
                    break;
                case '-':
                    str7 = jsonReader.nextString();
                    break;
                case '.':
                    str8 = jsonReader.nextString();
                    break;
                case '/':
                    z13 = jsonReader.nextBoolean();
                    break;
                case '0':
                    JSONObject c3 = C2041ql.c(jsonReader);
                    if (c3 == null) {
                        ki = ki2;
                        bhVar = null;
                    } else {
                        ki = ki2;
                        bhVar = new C1000bh(c3.optBoolean("enable_prewarming", false), c3.optString("prefetch_url", BuildConfig.FLAVOR));
                    }
                    ki2 = ki;
                    break;
                case '1':
                    z14 = jsonReader.nextBoolean();
                    break;
                case '2':
                    doa = C1152doa.a(C2041ql.c(jsonReader));
                    break;
                case '3':
                    str9 = jsonReader.nextString();
                    break;
                case '4':
                    str10 = jsonReader.nextString();
                    break;
                default:
                    ki = ki2;
                    jsonReader.skipValue();
                    ki2 = ki;
                    break;
            }
            list9 = list;
        }
        jsonReader.endObject();
        this.f5229a = list13;
        this.f5230b = i7;
        this.f5231c = list10;
        this.d = list11;
        this.f = list12;
        this.e = i6;
        this.g = list6;
        this.h = list7;
        this.i = list8;
        this.j = str11;
        this.k = str12;
        this.l = ki2;
        this.m = list9;
        this.n = list2;
        this.o = list3;
        this.p = tRVar;
        this.q = list4;
        this.r = list5;
        this.t = str;
        this.s = jSONObject5;
        this.u = str2;
        this.v = str3;
        this.w = str4;
        this.x = ljVar;
        this.y = str5;
        this.z = jSONObject6;
        this.A = jSONObject7;
        this.B = z2;
        this.C = z3;
        this.D = z4;
        this.E = z5;
        this.F = z6;
        this.G = z7;
        this.H = z8;
        this.I = i2;
        this.J = i3;
        this.K = z9;
        this.L = str6;
        this.M = jSONObject8;
        this.N = z10;
        this.O = z11;
        this.P = i4;
        this.Q = z12;
        this.R = str7;
        this.S = i5;
        this.T = str8;
        this.U = z13;
        this.V = bhVar;
        this.W = z14;
        this.X = doa;
        this.Y = str9;
        this.Z = str10;
    }
}
