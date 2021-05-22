package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.q;

@TargetApi(26)
/* renamed from: com.google.android.gms.internal.ads.Jk  reason: case insensitive filesystem */
public class C0432Jk extends C0458Kk {
    @Override // com.google.android.gms.internal.ads.C0224Bk
    public final Cna a(Context context, TelephonyManager telephonyManager) {
        q.c();
        return C2452wk.a(context, "android.permission.ACCESS_NETWORK_STATE") ? telephonyManager.isDataEnabled() ? Cna.ENUM_TRUE : Cna.ENUM_FALSE : Cna.ENUM_FALSE;
    }
}
