package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.ph  reason: case insensitive filesystem */
public abstract class AbstractBinderC1964ph extends BinderC1618kga implements AbstractC1688lh {
    public static AbstractC1688lh a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return queryLocalInterface instanceof AbstractC1688lh ? (AbstractC1688lh) queryLocalInterface : new C1895oh(iBinder);
    }
}
