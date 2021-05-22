package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import b.c.b.a.c.b;
import b.c.b.a.c.c;

public final class Tpa extends c<AbstractC1086cpa> {
    public Tpa() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // b.c.b.a.c.c
    public final /* synthetic */ AbstractC1086cpa a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof AbstractC1086cpa ? (AbstractC1086cpa) queryLocalInterface : new C1292fpa(iBinder);
    }

    public final AbstractC1017bpa b(Context context) {
        try {
            IBinder e = ((AbstractC1086cpa) a(context)).e(b.a(context), 201604000);
            if (e == null) {
                return null;
            }
            IInterface queryLocalInterface = e.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof AbstractC1017bpa ? (AbstractC1017bpa) queryLocalInterface : new C1154dpa(e);
        } catch (RemoteException | c.a e2) {
            C0745Vl.c("Could not get remote MobileAdsSettingManager.", e2);
            return null;
        }
    }
}
