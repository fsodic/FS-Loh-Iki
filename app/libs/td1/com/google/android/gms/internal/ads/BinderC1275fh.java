package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.fh  reason: case insensitive filesystem */
public final class BinderC1275fh extends BinderC1618kga implements AbstractC1344gh {
    public static AbstractC1344gh a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return queryLocalInterface instanceof AbstractC1344gh ? (AbstractC1344gh) queryLocalInterface : new C1481ih(iBinder);
    }
}
