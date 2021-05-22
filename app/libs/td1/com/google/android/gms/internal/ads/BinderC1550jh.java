package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.jh  reason: case insensitive filesystem */
public final class BinderC1550jh extends BinderC1618kga implements AbstractC1619kh {
    public static AbstractC1619kh a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return queryLocalInterface instanceof AbstractC1619kh ? (AbstractC1619kh) queryLocalInterface : new C1826nh(iBinder);
    }
}
