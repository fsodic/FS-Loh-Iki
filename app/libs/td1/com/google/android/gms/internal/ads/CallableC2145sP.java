package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.sP  reason: case insensitive filesystem */
final /* synthetic */ class CallableC2145sP implements Callable {

    /* renamed from: a  reason: collision with root package name */
    static final Callable f5511a = new CallableC2145sP();

    private CallableC2145sP() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        HashMap hashMap = new HashMap();
        String str = (String) C2392voa.e().a(C2474x.D);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) C2392voa.e().a(C2474x.E)).intValue()) {
                String[] split = str.split(",", -1);
                for (String str2 : split) {
                    hashMap.put(str2, C0407Il.a(str2));
                }
            }
        }
        return new C2008qP(hashMap);
    }
}
