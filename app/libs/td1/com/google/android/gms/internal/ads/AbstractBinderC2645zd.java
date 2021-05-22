package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.zd  reason: case insensitive filesystem */
public abstract class AbstractBinderC2645zd extends BinderC1618kga implements AbstractC2438wd {
    public static AbstractC2438wd a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return queryLocalInterface instanceof AbstractC2438wd ? (AbstractC2438wd) queryLocalInterface : new C2576yd(iBinder);
    }
}
