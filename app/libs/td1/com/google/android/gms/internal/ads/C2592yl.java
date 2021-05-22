package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.gms.ads.internal.q;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.yl  reason: case insensitive filesystem */
public final class C2592yl {
    private static int a(Context context, int i) {
        return C2392voa.a().a(context, i);
    }

    public static Point a(MotionEvent motionEvent, View view) {
        int[] b2 = b(view);
        return new Point(((int) motionEvent.getRawX()) - b2[0], ((int) motionEvent.getRawY()) - b2[1]);
    }

    public static WindowManager.LayoutParams a() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) C2392voa.e().a(C2474x.Re)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        q.c();
        DisplayMetrics d = C2452wk.d(context);
        try {
            jSONObject.put("width", a(context, d.widthPixels));
            jSONObject.put("height", a(context, d.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private static JSONObject a(Context context, Point point, Point point2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(context, point2.x));
            jSONObject.put("y", a(context, point2.y));
            jSONObject.put("start_x", a(context, point.x));
            jSONObject.put("start_y", a(context, point.y));
            return jSONObject;
        } catch (JSONException e) {
            C0745Vl.b("Error occurred while putting signals into JSON object.", e);
            return null;
        }
    }

    private static JSONObject a(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", a(context, rect.right - rect.left));
        jSONObject.put("height", a(context, rect.bottom - rect.top));
        jSONObject.put("x", a(context, rect.left));
        jSONObject.put("y", a(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0125 A[Catch:{ JSONException -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0135 A[Catch:{ JSONException -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x014d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject a(android.content.Context r16, android.view.View r17) {
        /*
        // Method dump skipped, instructions count: 344
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2592yl.a(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static JSONObject a(Context context, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View view) {
        String str;
        String str2;
        JSONObject jSONObject;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject2 = new JSONObject();
        if (!(map == null || view == null)) {
            int[] b2 = b(view);
            Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, WeakReference<View>> next = it.next();
                View view2 = next.getValue().get();
                if (view2 != null) {
                    int[] b3 = b(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("width", a(context, view2.getMeasuredWidth()));
                        jSONObject4.put("height", a(context, view2.getMeasuredHeight()));
                        jSONObject4.put("x", a(context, b3[0] - b2[0]));
                        jSONObject4.put("y", a(context, b3[1] - b2[1]));
                        jSONObject4.put(str4, str3);
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = a(context, rect);
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject.put("width", 0);
                            jSONObject.put("height", 0);
                            jSONObject.put("x", a(context, b3[0] - b2[0]));
                            jSONObject.put("y", a(context, b3[1] - b2[1]));
                            jSONObject.put(str4, str3);
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            str2 = str3;
                            str = str4;
                            try {
                                jSONObject3.put("font_size", (double) textView.getTextSize());
                                jSONObject3.put("text", textView.getText());
                            } catch (JSONException unused) {
                                C0745Vl.d("Unable to get asset views information");
                                it = it;
                                str3 = str2;
                                str4 = str;
                            }
                        } else {
                            str2 = str3;
                            str = str4;
                        }
                        jSONObject3.put("is_clickable", map2 != null && map2.containsKey(next.getKey()) && view2.isClickable());
                        jSONObject2.put(next.getKey(), jSONObject3);
                    } catch (JSONException unused2) {
                        str2 = str3;
                        str = str4;
                        C0745Vl.d("Unable to get asset views information");
                        it = it;
                        str3 = str2;
                        str4 = str;
                    }
                    it = it;
                    str3 = str2;
                    str4 = str;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject a(View view) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            if (((Boolean) C2392voa.e().a(C2474x.Pe)).booleanValue()) {
                q.c();
                z = C2452wk.e(view);
            } else {
                q.c();
                z = C2452wk.d(view) != -1;
            }
            jSONObject.put("contained_in_scroll_view", z);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject a(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject;
        Exception e;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("click_point", a(context, point, point2));
                jSONObject.put("asset_id", str);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            jSONObject = null;
            C0745Vl.b("Error occurred while grabbing click signals.", e);
            return jSONObject;
        }
        return jSONObject;
    }

    public static boolean a(int i) {
        if (!((Boolean) C2392voa.e().a(C2474x.Qb)).booleanValue()) {
            return true;
        }
        return ((Boolean) C2392voa.e().a(C2474x.Rb)).booleanValue() || i <= 15299999;
    }

    public static boolean a(C1941pR pRVar) {
        if (!((Boolean) C2392voa.e().a(C2474x.Qe)).booleanValue() || !pRVar.F) {
            return false;
        }
        return ((Boolean) C2392voa.e().a(C2474x.Se)).booleanValue();
    }

    public static JSONObject b(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            q.c();
            jSONObject.put("can_show_on_lock_screen", C2452wk.c(view));
            q.c();
            jSONObject.put("is_keyguard_locked", C2452wk.j(context));
        } catch (JSONException unused) {
            C0745Vl.d("Unable to get lock screen information");
        }
        return jSONObject;
    }

    private static int[] b(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }
}
