package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Kb  reason: case insensitive filesystem */
public abstract class AbstractBinderC0449Kb extends BinderC1618kga implements AbstractC0475Lb {
    public static AbstractC0475Lb a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return queryLocalInterface instanceof AbstractC0475Lb ? (AbstractC0475Lb) queryLocalInterface : new C0527Nb(iBinder);
    }
}
