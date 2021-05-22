package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.q;

/* renamed from: com.google.android.gms.internal.ads.oO  reason: case insensitive filesystem */
public final class C1869oO implements AbstractC1180eO<C1662lO> {

    /* renamed from: a  reason: collision with root package name */
    private final VW f5119a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5120b;

    public C1869oO(VW vw, Context context) {
        this.f5119a = vw;
        this.f5120b = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<C1662lO> a() {
        return this.f5119a.a(new CallableC1800nO(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C1662lO b() {
        int i;
        boolean z;
        int i2;
        TelephonyManager telephonyManager = (TelephonyManager) this.f5120b.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int networkType = telephonyManager.getNetworkType();
        int phoneType = telephonyManager.getPhoneType();
        q.c();
        int i3 = -1;
        if (C2452wk.a(this.f5120b, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f5120b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i2 = type;
                i3 = ordinal;
            } else {
                i2 = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
            i = i3;
        } else {
            i2 = -2;
            z = false;
            i = -1;
        }
        return new C1662lO(networkOperator, i2, networkType, phoneType, z, i);
    }
}
