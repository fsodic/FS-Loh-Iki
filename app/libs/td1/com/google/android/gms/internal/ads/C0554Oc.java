package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Oc  reason: case insensitive filesystem */
public final class C0554Oc implements AbstractC0268Dc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0528Nc f2755a;

    private C0554Oc(AbstractC0528Nc nc) {
        this.f2755a = nc;
    }

    public static void a(AbstractC1564jo joVar, AbstractC0528Nc nc) {
        joVar.a("/reward", new C0554Oc(nc));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("action");
        if ("grant".equals(str)) {
            C0456Ki ki = null;
            try {
                int parseInt = Integer.parseInt(map.get("amount"));
                String str2 = map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    ki = new C0456Ki(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                C0745Vl.c("Unable to parse reward amount.", e);
            }
            this.f2755a.a(ki);
        } else if ("video_start".equals(str)) {
            this.f2755a.N();
        } else if ("video_complete".equals(str)) {
            this.f2755a.M();
        }
    }
}
