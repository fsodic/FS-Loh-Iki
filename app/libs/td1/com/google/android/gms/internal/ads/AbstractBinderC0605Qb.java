package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Qb  reason: case insensitive filesystem */
public abstract class AbstractBinderC0605Qb extends BinderC1618kga implements AbstractC0631Rb {
    public static AbstractC0631Rb a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return queryLocalInterface instanceof AbstractC0631Rb ? (AbstractC0631Rb) queryLocalInterface : new C0683Tb(iBinder);
    }
}
