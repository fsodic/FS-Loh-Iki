package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.y  reason: case insensitive filesystem */
public final class C2543y {
    static List<String> a() {
        ArrayList arrayList = new ArrayList();
        a(arrayList, C0986ba.a("gad:dynamite_module:experiment_id", BuildConfig.FLAVOR));
        a(arrayList, C1881oa.f5139a);
        a(arrayList, C1881oa.f5140b);
        a(arrayList, C1881oa.f5141c);
        a(arrayList, C1881oa.d);
        a(arrayList, C1881oa.e);
        a(arrayList, C1881oa.k);
        a(arrayList, C1881oa.f);
        a(arrayList, C1881oa.g);
        a(arrayList, C1881oa.h);
        a(arrayList, C1881oa.i);
        a(arrayList, C1881oa.j);
        return arrayList;
    }

    private static void a(List<String> list, C0986ba<String> baVar) {
        String a2 = baVar.a();
        if (!TextUtils.isEmpty(a2)) {
            list.add(a2);
        }
    }

    static List<String> b() {
        ArrayList arrayList = new ArrayList();
        a(arrayList, C2501xa.f5992a);
        return arrayList;
    }
}
