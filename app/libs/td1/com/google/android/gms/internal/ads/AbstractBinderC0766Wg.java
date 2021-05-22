package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.Wg  reason: case insensitive filesystem */
public abstract class AbstractBinderC0766Wg extends BinderC1618kga implements AbstractC0792Xg {
    public AbstractBinderC0766Wg() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static AbstractC0792Xg a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof AbstractC0792Xg ? (AbstractC0792Xg) queryLocalInterface : new C0844Zg(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                j((Bundle) C1756mga.a(parcel, Bundle.CREATOR));
                break;
            case 2:
                rb();
                break;
            case 3:
                ia();
                break;
            case 4:
                onResume();
                break;
            case 5:
                onPause();
                break;
            case 6:
                Bundle bundle = (Bundle) C1756mga.a(parcel, Bundle.CREATOR);
                g(bundle);
                parcel2.writeNoException();
                C1756mga.b(parcel2, bundle);
                return true;
            case 7:
                jb();
                break;
            case 8:
                onDestroy();
                break;
            case 9:
                Oa();
                break;
            case 10:
                wb();
                break;
            case 11:
                boolean Fb = Fb();
                parcel2.writeNoException();
                C1756mga.a(parcel2, Fb);
                return true;
            case 12:
                onActivityResult(parcel.readInt(), parcel.readInt(), (Intent) C1756mga.a(parcel, Intent.CREATOR));
                break;
            case 13:
                G(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
