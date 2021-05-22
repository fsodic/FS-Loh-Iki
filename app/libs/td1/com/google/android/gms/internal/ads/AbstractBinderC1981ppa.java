package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.ppa  reason: case insensitive filesystem */
public abstract class AbstractBinderC1981ppa extends BinderC1618kga implements AbstractC1705lpa {
    public static AbstractC1705lpa a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        return queryLocalInterface instanceof AbstractC1705lpa ? (AbstractC1705lpa) queryLocalInterface : new C1843npa(iBinder);
    }
}
