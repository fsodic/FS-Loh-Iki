package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class KN implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final List f2394a;

    KN(List list) {
        this.f2394a = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List<SW> list = this.f2394a;
        JSONArray jSONArray = new JSONArray();
        for (SW sw : list) {
            if (((JSONObject) sw.get()) != null) {
                jSONArray.put(sw.get());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return new DN(jSONArray.toString());
    }
}
