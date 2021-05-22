package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.q;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ec  reason: case insensitive filesystem */
final class C0294Ec implements AbstractC0268Dc<AbstractC1564jo> {
    C0294Ec() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final /* synthetic */ void a(AbstractC1564jo joVar, Map map) {
        AbstractC1564jo joVar2 = joVar;
        q.c();
        DisplayMetrics a2 = C2452wk.a((WindowManager) joVar2.getContext().getSystemService("window"));
        int i = a2.widthPixels;
        int i2 = a2.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) joVar2).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        joVar2.a("locationReady", hashMap);
        C0745Vl.d("GET LOCATION COMPILED");
    }
}
