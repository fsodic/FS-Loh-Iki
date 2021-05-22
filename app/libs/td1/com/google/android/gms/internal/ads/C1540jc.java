package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import org.cocos2dx.lib.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.jc  reason: case insensitive filesystem */
public final class C1540jc implements AbstractC0268Dc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1472ic f4690a;

    public C1540jc(AbstractC1472ic icVar) {
        this.f4690a = icVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final void a(Object obj, Map<String, String> map) {
        if (this.f4690a != null) {
            String str = map.get("name");
            if (str == null) {
                C0745Vl.c("Ad metadata with no name parameter.");
                str = BuildConfig.FLAVOR;
            }
            Bundle bundle = null;
            if (map.containsKey("info")) {
                try {
                    bundle = C2041ql.a(new JSONObject(map.get("info")));
                } catch (JSONException e) {
                    C0745Vl.b("Failed to convert ad metadata to JSON.", e);
                }
            }
            if (bundle == null) {
                C0745Vl.b("Failed to convert ad metadata to Bundle.");
            } else {
                this.f4690a.a(str, bundle);
            }
        }
    }
}
