package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.hpa  reason: case insensitive filesystem */
public abstract class AbstractBinderC1430hpa extends BinderC1618kga implements AbstractC1223epa {
    public static AbstractC1223epa a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return queryLocalInterface instanceof AbstractC1223epa ? (AbstractC1223epa) queryLocalInterface : new C1361gpa(iBinder);
    }
}
