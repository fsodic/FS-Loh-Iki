package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Kh  reason: case insensitive filesystem */
public abstract class AbstractBinderC0455Kh extends BinderC1618kga implements AbstractC0351Gh {
    public AbstractBinderC0455Kh() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            AbstractC0507Mh mh = null;
            AbstractC0559Oh oh = null;
            AbstractC0559Oh oh2 = null;
            AbstractC0559Oh oh3 = null;
            AbstractC0559Oh oh4 = null;
            if (i == 2) {
                C0195Ah ah = (C0195Ah) C1756mga.a(parcel, C0195Ah.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    mh = queryLocalInterface instanceof AbstractC0507Mh ? (AbstractC0507Mh) queryLocalInterface : new C0481Lh(readStrongBinder);
                }
                a(ah, mh);
            } else if (i == 4) {
                C0715Uh uh = (C0715Uh) C1756mga.a(parcel, C0715Uh.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    oh4 = queryLocalInterface2 instanceof AbstractC0559Oh ? (AbstractC0559Oh) queryLocalInterface2 : new C0611Qh(readStrongBinder2);
                }
                c(uh, oh4);
            } else if (i == 5) {
                C0715Uh uh2 = (C0715Uh) C1756mga.a(parcel, C0715Uh.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    oh3 = queryLocalInterface3 instanceof AbstractC0559Oh ? (AbstractC0559Oh) queryLocalInterface3 : new C0611Qh(readStrongBinder3);
                }
                a(uh2, oh3);
            } else if (i == 6) {
                C0715Uh uh3 = (C0715Uh) C1756mga.a(parcel, C0715Uh.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    oh2 = queryLocalInterface4 instanceof AbstractC0559Oh ? (AbstractC0559Oh) queryLocalInterface4 : new C0611Qh(readStrongBinder4);
                }
                b(uh3, oh2);
            } else if (i != 7) {
                return false;
            } else {
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    oh = queryLocalInterface5 instanceof AbstractC0559Oh ? (AbstractC0559Oh) queryLocalInterface5 : new C0611Qh(readStrongBinder5);
                }
                a(readString, oh);
            }
            parcel2.writeNoException();
        } else {
            C0247Ch a2 = a((C0195Ah) C1756mga.a(parcel, C0195Ah.CREATOR));
            parcel2.writeNoException();
            C1756mga.b(parcel2, a2);
        }
        return true;
    }
}
