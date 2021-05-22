package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import b.c.b.a.c.b;
import b.c.b.a.c.c;

public final class Tna extends c<Joa> {
    public Tna() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final Eoa a(Context context, String str, AbstractC1891of ofVar) {
        try {
            IBinder a2 = ((Joa) a(context)).a(b.a(context), str, ofVar, 201604000);
            if (a2 == null) {
                return null;
            }
            IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof Eoa ? (Eoa) queryLocalInterface : new Goa(a2);
        } catch (RemoteException | c.a e) {
            C0745Vl.c("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // b.c.b.a.c.c
    public final /* synthetic */ Joa a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof Joa ? (Joa) queryLocalInterface : new Ioa(iBinder);
    }
}
