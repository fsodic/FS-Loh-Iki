package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import b.c.b.a.c.b;
import b.c.b.a.c.c;

/* renamed from: com.google.android.gms.internal.ads.Vg  reason: case insensitive filesystem */
public final class C0740Vg extends c<AbstractC0818Yg> {
    public C0740Vg() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final AbstractC0792Xg a(Activity activity) {
        try {
            IBinder q = ((AbstractC0818Yg) a((Context) activity)).q(b.a(activity));
            if (q == null) {
                return null;
            }
            IInterface queryLocalInterface = q.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof AbstractC0792Xg ? (AbstractC0792Xg) queryLocalInterface : new C0844Zg(q);
        } catch (RemoteException e) {
            C0745Vl.c("Could not create remote AdOverlay.", e);
            return null;
        } catch (c.a e2) {
            C0745Vl.c("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // b.c.b.a.c.c
    public final /* synthetic */ AbstractC0818Yg a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof AbstractC0818Yg ? (AbstractC0818Yg) queryLocalInterface : new C0931ah(iBinder);
    }
}
