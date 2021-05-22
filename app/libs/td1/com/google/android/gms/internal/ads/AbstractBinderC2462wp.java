package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.wp  reason: case insensitive filesystem */
public abstract class AbstractBinderC2462wp extends BinderC1618kga implements AbstractC2600yp {
    public static AbstractC2600yp a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return queryLocalInterface instanceof AbstractC2600yp ? (AbstractC2600yp) queryLocalInterface : new C2669zp(iBinder);
    }
}
