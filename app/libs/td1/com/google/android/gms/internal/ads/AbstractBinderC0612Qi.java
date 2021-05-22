package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.Qi  reason: case insensitive filesystem */
public abstract class AbstractBinderC0612Qi extends BinderC1618kga implements AbstractC0638Ri {
    public AbstractBinderC0612Qi() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        AbstractC0716Ui ui = null;
        AbstractC0716Ui ui2 = null;
        AbstractC0742Vi vi = null;
        AbstractC0664Si si = null;
        switch (i) {
            case 1:
                Zna zna = (Zna) C1756mga.a(parcel, Zna.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    ui = queryLocalInterface instanceof AbstractC0716Ui ? (AbstractC0716Ui) queryLocalInterface : new C0768Wi(readStrongBinder);
                }
                a(zna, ui);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    si = queryLocalInterface2 instanceof AbstractC0664Si ? (AbstractC0664Si) queryLocalInterface2 : new C0690Ti(readStrongBinder2);
                }
                a(si);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean aa = aa();
                parcel2.writeNoException();
                C1756mga.a(parcel2, aa);
                return true;
            case 4:
                String k = k();
                parcel2.writeNoException();
                parcel2.writeString(k);
                return true;
            case 5:
                l(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    vi = queryLocalInterface3 instanceof AbstractC0742Vi ? (AbstractC0742Vi) queryLocalInterface3 : new C0794Xi(readStrongBinder3);
                }
                a(vi);
                parcel2.writeNoException();
                return true;
            case 7:
                a((C0846Zi) C1756mga.a(parcel, C0846Zi.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                a(AbstractBinderC1981ppa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle I = I();
                parcel2.writeNoException();
                C1756mga.b(parcel2, I);
                return true;
            case 10:
                a(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), C1756mga.a(parcel));
                parcel2.writeNoException();
                return true;
            case 11:
                iInterface = La();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 12:
                iInterface = C();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 13:
                a(AbstractBinderC2050qpa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 14:
                Zna zna2 = (Zna) C1756mga.a(parcel, Zna.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    ui2 = queryLocalInterface4 instanceof AbstractC0716Ui ? (AbstractC0716Ui) queryLocalInterface4 : new C0768Wi(readStrongBinder4);
                }
                b(zna2, ui2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
