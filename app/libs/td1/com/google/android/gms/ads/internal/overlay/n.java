package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.o;
import com.google.android.gms.internal.ads.C2452wk;
import com.google.android.gms.internal.ads.Ona;

public final class n {
    public static void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.k == 4 && adOverlayInfoParcel.f1098c == null) {
            Ona ona = adOverlayInfoParcel.f1097b;
            if (ona != null) {
                ona.e();
            }
            q.a();
            b.a(context, adOverlayInfoParcel.f1096a, adOverlayInfoParcel.i);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.m.d);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.a(intent, adOverlayInfoParcel);
        if (!o.h()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        q.c();
        C2452wk.a(context, intent);
    }
}
