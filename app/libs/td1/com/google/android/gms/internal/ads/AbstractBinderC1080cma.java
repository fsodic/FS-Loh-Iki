package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.cma  reason: case insensitive filesystem */
public abstract class AbstractBinderC1080cma extends BinderC1618kga implements AbstractC0942ama {
    public static AbstractC0942ama a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return queryLocalInterface instanceof AbstractC0942ama ? (AbstractC0942ama) queryLocalInterface : new C1011bma(iBinder);
    }
}
