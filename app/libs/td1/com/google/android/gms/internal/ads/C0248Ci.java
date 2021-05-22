package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import b.c.b.a.c.b;
import b.c.b.a.c.c;

/* renamed from: com.google.android.gms.internal.ads.Ci  reason: case insensitive filesystem */
public final class C0248Ci extends c<AbstractC2448wi> {
    public C0248Ci() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    public final AbstractC2103ri a(Context context, AbstractC1891of ofVar) {
        try {
            IBinder b2 = ((AbstractC2448wi) a(context)).b(b.a(context), ofVar, 201604000);
            if (b2 == null) {
                return null;
            }
            IInterface queryLocalInterface = b2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            return queryLocalInterface instanceof AbstractC2103ri ? (AbstractC2103ri) queryLocalInterface : new C2241ti(b2);
        } catch (RemoteException | c.a e) {
            C0745Vl.c("Could not get remote RewardedVideoAd.", e);
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // b.c.b.a.c.c
    public final /* synthetic */ AbstractC2448wi a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        return queryLocalInterface instanceof AbstractC2448wi ? (AbstractC2448wi) queryLocalInterface : new C2379vi(iBinder);
    }
}
