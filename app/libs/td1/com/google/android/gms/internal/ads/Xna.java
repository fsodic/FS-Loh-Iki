package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import b.c.b.a.c.b;
import b.c.b.a.c.c;

public final class Xna extends c<Moa> {
    public Xna() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final Loa a(Context context, C1015boa boa, String str, AbstractC1891of ofVar, int i) {
        try {
            IBinder a2 = ((Moa) a(context)).a(b.a(context), boa, str, ofVar, 201604000, i);
            if (a2 == null) {
                return null;
            }
            IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface instanceof Loa ? (Loa) queryLocalInterface : new Noa(a2);
        } catch (RemoteException | c.a e) {
            C0745Vl.a("Could not create remote AdManager.", e);
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // b.c.b.a.c.c
    public final /* synthetic */ Moa a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof Moa ? (Moa) queryLocalInterface : new Qoa(iBinder);
    }
}
