package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.nga  reason: case insensitive filesystem */
public abstract class AbstractBinderC1825nga extends BinderC1618kga implements AbstractC1894oga {
    public static AbstractC1894oga a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return queryLocalInterface instanceof AbstractC1894oga ? (AbstractC1894oga) queryLocalInterface : new C1963pga(iBinder);
    }
}
